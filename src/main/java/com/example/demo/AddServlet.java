package com.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(urlPatterns = "/add",
//        initParams = {
//                @WebInitParam(name = "name2", value = "darkdeveloper2")
//        }
//)
public class AddServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        var out = res.getWriter();
        var context = this.getServletContext();
        out.println("Hi " + context.getInitParameter("name"));

    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        var out = response.getWriter();
        out.println(sum);

        request.setAttribute("sum", sum);
        var dispatcher = request.getRequestDispatcher("square");
        dispatcher.forward(request, response);


    }
}