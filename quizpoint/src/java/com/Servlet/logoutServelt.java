/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kunal thakurani
 */
@WebServlet(name = "logoutServelt", urlPatterns = {"/logoutServelt"})
public class logoutServelt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();
            session.removeAttribute("userD");
            session.removeValue("userD");

            HttpSession session2 = request.getSession();
            session.setAttribute("logoutMSG", "Logout successfully");
            
            
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
