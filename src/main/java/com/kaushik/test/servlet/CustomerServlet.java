package com.kaushik.test.servlet;

import java.io.PrintWriter;

import com.kaushik.test.models.Customer;
import com.kaushik.test.respository.CustomerRepository;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getCustomers")
public class CustomerServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) {
        int i = Integer.parseInt(req.getParameter("age"));
        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.addMockCustomers(10);
        try {
            res.setContentType("text/html");
            PrintWriter w = res.getWriter();
            w.printf("<h1> Customers with age %d </h1>", i);
            for (Customer customer : customerRepository.getCustomersByAge(i)) {
                w.printf("<p> Name: %s, Age: %d </p>", customer.name, customer.age);
            }
            w.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
