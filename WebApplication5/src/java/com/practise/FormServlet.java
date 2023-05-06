
package com.practise;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class FormServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<h2>Welcome to Form Registration</h2>");
        out.print("<h2>This is That</h2>");
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond=request.getParameter("Condition");
        
        if(cond.equals("checked")){
            out.println("<h2>Name :"+ name +"</h2>");
            out.println("<h2>PAssword :"+ password +"</h2>");
            out.println("<h2>Email :"+ email +"</h2>");
            out.println("<h2>Gender :"+ gender +"</h2>");
            out.println("<h2>Course :"+ course +"</h2>");
            //JDBC
            //
        }
        else{
            out.println("<h2>Terms Not Accepted </h2>");
        }
    }
}
