/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcussoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUSSoftware {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //we have loaded the driver which is ojdbc.jar
      //Now registering the driver
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      //Now we have establish the connection
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mylab","mylab");
        System.out.println("Connection OK");  
      Statement ob=con.createStatement();
        String query="select id as \"MYID\" from US";
        System.out.println(query);
        ResultSet rs=ob.executeQuery(query);
     rs.next();
        
  Table tb=new Table();
  tb.changeTable(rs);
  tb.setVisible(true);
        
        
        
       
    }
    
}
