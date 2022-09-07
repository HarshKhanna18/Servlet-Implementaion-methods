
package com.Servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Date;

public class MyThirdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServerException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1 align="+"center"+">Servlet is Implenmented by HttpServlet</h1>");
        out.println(new Date().toString());
    }
}
