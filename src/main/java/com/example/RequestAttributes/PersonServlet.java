package com.example.RequestAttributes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Person;

import java.io.IOException;

@WebServlet(name = "PersonServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        var error = new StringBuilder();
        if (firstName == null) {
            error.append("A first name was not provided.");
        } else if (lastName == null) {
            error.append("A last name was not provided.");
        } else if (age == null) {
            error.append("An age was not provided.");
        }

        if (error.length() > 0) {
            request.setAttribute("error", error.toString());
            request.setAttribute("person", new Person());
        } else {
            request.setAttribute("person", new Person(firstName,lastName,Integer.parseInt(age)));
        }
        getServletContext().getRequestDispatcher("/person.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
