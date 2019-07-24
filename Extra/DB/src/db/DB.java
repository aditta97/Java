/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    
    public static void main(String[] args) {
        
    Connection myconObj = null;
    Statement mystatobj = null;
    ResultSet myresObj = null;
    String query = "Select * from Aditta.Login WHERE `username`=? and `password`=? and `usertype`=?";
    
    try{
        //Class.forName("jdbc:derby://localhost:1527/MealManagement", "aditta", "Adittacse97@");
        myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/MealManagement", "aditta", "Adittacse97@");
    }
    catch(HeadlessException | SQLException e){
        e.printStackTrace();
    }
        
    }
    
    
}