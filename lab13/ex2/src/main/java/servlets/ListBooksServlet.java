package servlets;

import repository.BookRepository;
import sun.security.jgss.HttpCaller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listBooksServlet")
public class ListBooksServlet extends HttpServlet {

    private BookRepository bookRepository = BookRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("books", bookRepository.getBooks());
        resp.setContentType("text/html");
        RequestDispatcher rs = req.getRequestDispatcher("listBooks.jsp");
        rs.forward(req,resp);
    }
}
