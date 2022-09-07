
package com.Servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MySecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("Generic Servelt service Running......");
        sr1.setContentType("text/html");
        PrintWriter out=sr1.getWriter();
        out.println("<h1 align="+"center"+">Servlet is Implenmented by GenericServlet</h1>");
        out.println("<h1>This is Second Way to create a Servlet in JAVA</h1>");
    } 
}
