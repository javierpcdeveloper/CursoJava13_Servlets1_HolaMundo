package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ServletSaludo")
public class ServletHolaMundo extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{//ServletException
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out=res.getWriter();
        out.println("Hola mundo de servlets");
    } 
}
