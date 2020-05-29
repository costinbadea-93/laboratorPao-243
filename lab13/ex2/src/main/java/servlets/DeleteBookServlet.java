package servlets;

import repository.BookRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    private BookRepository bookRepository = BookRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookName = req.getParameter("bookName");
        bookRepository.deleteBookByName(bookName);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Book " + bookName + " was deleted, <a href='listBooksServlet'>Go back to list</a></h1>");
    }
}
