package com.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        add(req, res);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        add(req, res);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        request.setAttribute("sum", sum);
        var dispatcher = request.getRequestDispatcher("square");
        dispatcher.forward(request, response);


    }
}