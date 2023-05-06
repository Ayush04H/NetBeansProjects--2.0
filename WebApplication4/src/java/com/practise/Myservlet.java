package com.practise;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Myservlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
            {
                System.out.println("This is Get method");
                response.setContentType("text/html");
                PrintWriter out=response.getWriter();
                out.print("<h1>This is that .This belongs to do get method of http servlet</h1>");
            }
}
