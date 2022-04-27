/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kunal thakurani
 */
public class DBConnection {
    private static Connection conn;
    public static Connection getConn(){
    try{
    if(conn == null){//  con=DriverManager.getConnection(url,un,pw);  Class.forName(Driver);
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizpoint","root","");
        
    }
//    }String Driver = "com.mysql.jdbc.Driver";
//    String url = "jdbc:mysql://localhost:3306/resumemaker";
//    String un = "root";
//    String pw = "";
}
    catch(Exception e){
    e.printStackTrace();
}
    return conn;
    
    }
    
}
