package com.example.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {


    //sessions saved in servlet
    //cookie saved in user browser

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        var sum = (Integer) req.getAttribute("sum");
//        var sum = Integer.parseInt(req.getParameter("sum"));
//        var session = req.getSession();
//        var sum = (Integer) session.getAttribute("sum");
        var cookies = req.getCookies();
        var sum = 0;
        for (var cookie : cookies)
            if (cookie.getName().equals("sum")) sum = Integer.parseInt(cookie.getValue());


        var square = sum * sum;
        var out = resp.getWriter();
        out.println("square is: " + square);

    }
}
