
package com.Servlets;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyFirstServlet implements Servlet {
    //Servlet Life Cycle Methods 
    ServletConfig conf;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("Servelt Object Creating......");
        this.conf=sc;
    }
    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("Service Running........");
        //we can set response for web page 
        sr1.setContentType("text/html");
        PrintWriter out=sr1.getWriter();
        out.println("<h1 align="+"center"+">Servlet is Implenmented by Servlet Interface</h1>");
        out.println("<h1>Today Date and Time is: "+new Date().toString()+"</h1>");
    }
     @Override
    public void destroy() {
         System.out.println("Destroying object.......");
    }
    @Override
    public ServletConfig getServletConfig() {
        return conf;
    }

    
    @Override
    public String getServletInfo() {
        return conf.toString();
    }

   
    
}
