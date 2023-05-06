
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class FirstServlet implements Servlet{
    ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config=config;
        System.out.println("Creating Objects:....");
    }

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       System.out.println("Creating Objects:....");
       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
       out.println("<h1>This is My First Servlet Program Using This is That lets go!!</h1>");
    }
    
    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig(){
        return this.config;
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "This servlet is created by ayush";
    }

    /**
     *
     */
    @Override
    public void destroy() {
         System.out.println("Destroy servlet ");
    }
    
    
}
