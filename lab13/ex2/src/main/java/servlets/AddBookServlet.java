package servlets;

import model.Book;
import repository.BookRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addBookServlet")
public class AddBookServlet extends HttpServlet {
    private BookRepository bookRepository = BookRepository.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String bookName = req.getParameter("bookName");
         String bookAuthor = req.getParameter("bookAuthor");

        Book book = new Book(bookName,bookAuthor);
        bookRepository.addBook(book);
        req.setAttribute("books", bookRepository.getBooks());
        RequestDispatcher rs = req.getRequestDispatcher("listBooks.jsp");
        rs.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rs = req.getRequestDispatcher("addBook.jsp");
        rs.forward(req,resp);
    }
}
