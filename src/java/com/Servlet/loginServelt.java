/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlet;

import com.DAO.userDAO;
import com.DB.DBConnection;
import com.User.userDetails;
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
@WebServlet(name = "loginServelt", urlPatterns = {"/loginServelt"})
public class loginServelt extends HttpServlet {

   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");
        
        
        
        
        
        userDetails us = new userDetails();
        us.setEmail(email);
        us.setPassword(password);
        
        userDAO dao = new userDAO(DBConnection.getConn());
        userDetails user = dao.loginUser(us);
        
        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("userD", user);
            response.sendRedirect("home.jsp");
        }
        else{
//            response.sendRedirect("tp.html");
              HttpSession session = request.getSession();
              session.setAttribute("loginfailed", "Invalid Username and Password");
              response.sendRedirect("login.jsp");
              
                
        }
        
        
        
       
    }
    

   
   
}
