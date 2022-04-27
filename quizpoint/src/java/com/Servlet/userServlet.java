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
import org.omg.CORBA.Request;

/**
 *
 * @author kunal thakurani
 */
@WebServlet("/userServlet")
public class userServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException{
        
        String name  = request.getParameter("fname");
        String email  = request.getParameter("uemail");
        String Phone  = request.getParameter("Phone");
        String Iname  = request.getParameter("Iname");        
        String password  = request.getParameter("upassword");
        String designation  = request.getParameter("designation");
       
        
        userDetails us = new userDetails();
        us.setName(name);
        us.setEmail(email);
        us.setPassword(password);
        us.setPhone(Phone);
        us.setIname(Iname);
        us.setDesignation(designation);
        
        
        userDAO dao = new userDAO(DBConnection.getConn());
        boolean f = dao.adduser(us);
            HttpSession session;
         
        if(f){
            session = request.getSession();
            session.setAttribute("regsuccess","Login sucessfully...");
            response.sendRedirect("signup.jsp");
        }
        else{
            session = request.getSession();
            session.setAttribute("failedmsg","something went wrong");
            response.sendRedirect("signup.jsp");
        }
        
        
        
    }
}
