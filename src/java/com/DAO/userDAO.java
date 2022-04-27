/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.User.userDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




/**
 *
 * @author kunal thakurani
 */
public class userDAO {

    public Connection conn; 

    public userDAO(Connection conn) {
        super();
        this.conn = conn;
    }
    
    public boolean adduser(userDetails us){
        boolean f=false;
        try {
            String query = "insert into user(name,email,phone,Iname,password,designation) values(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhone());
            ps.setString(4, us.getIname());
            ps.setString(5, us.getPassword());
            ps.setString(6, us.getDesignation());
            
            
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
                         
            
        } 
        catch (Exception e) {
            e.printStackTrace();
            
        }
        return f;
        
    }
    
    public userDetails loginUser(userDetails us){
        userDetails user=null;
        try{
            String query = "select * from user where email=? and password=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, us.getEmail());
            ps.setString(2, us.getPassword());
            
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                user = new userDetails();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setIname(rs.getString("Iname"));
                user.setPhone(rs.getString("phone"));
                user.setDesignation(rs.getString("designation"));
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return user;
        
        
    }
    
    

}
