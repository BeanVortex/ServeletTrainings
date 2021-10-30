package com.example.demo;

import java.io.*;

import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        add(req, res);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        add(req, res);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        PrintWriter out = response.getWriter();
        out.println(sum);
    }
}