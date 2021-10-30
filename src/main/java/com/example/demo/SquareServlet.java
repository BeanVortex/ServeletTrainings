package com.example.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        var sum = (Integer) req.getAttribute("sum");
        var square = sum * sum;
        var out = resp.getWriter();
        out.println("square is: " + square);

    }
}
