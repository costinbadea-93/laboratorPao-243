package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(!username.equals("admin") && !password.equals("admin")){
            PrintWriter out = resp.getWriter();
            out.println("<h1>Invalid credentials, please try again!!! <a href='loginServlet'>Login Again</a></h1>");
        } else {
            RequestDispatcher rs = req.getRequestDispatcher("optionsSelection.jsp");
            rs.forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rs;

        if(req.getParameter("param") != null) {
            rs = req.getRequestDispatcher("optionsSelection.jsp");
        }else {
            rs = req.getRequestDispatcher("index.jsp");
        }

        rs.forward(req,resp);
    }
}
