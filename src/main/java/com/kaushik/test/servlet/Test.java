package com.kaushik.test.servlet;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Test extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) {
        int n1 = Integer.parseInt(req.getParameter("m1"));
        int n2 = Integer.parseInt(req.getParameter("m2"));
        int ans = n1 + n2;
        try {
            PrintWriter w = res.getWriter();
            w.printf("<h1> ans = %d </h1>", ans);
            w.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
