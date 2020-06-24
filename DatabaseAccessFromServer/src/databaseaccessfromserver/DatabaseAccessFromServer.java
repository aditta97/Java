/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseaccessfromserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Aditta Chakraborty
 */
public class DatabaseAccessFromServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        
        //64.188.12.42 - IP Address of my website
        //https://www.aditta.org
        String url = "jdbc:mysql://aditta.org:3306/veoyankg_LMSdb"; 
        String user = "veoyankg_aec";
        String password = "KCtN&e@h}XYD";

        try {
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Connected to the database test1");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
