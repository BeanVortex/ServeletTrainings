package com.example.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int sum = (Integer) req.getAttribute("sum");
        int square = sum * sum;
        PrintWriter out = resp.getWriter();
        out.println("square is: " + square);

    }
}
