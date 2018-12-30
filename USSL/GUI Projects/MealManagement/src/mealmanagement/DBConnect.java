
package mealmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    
    public static void main(String[] args) {
        
    Connection myconObj = null;
    Statement mystatobj = null;
    ResultSet myresObj = null;
    String query = "Select * from Aditta.Login WHERE `username`=? and `password`=? and `usertype`=?";
    
    try{
        myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/MealManagement", "aditta", "Adittacse97@");
    }
    catch(SQLException e){
        e.printStackTrace();
    }
        
    }
    
    
}
