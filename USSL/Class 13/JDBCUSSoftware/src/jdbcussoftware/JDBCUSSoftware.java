
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
      try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      }
      catch(ClassNotFoundException e){
        javax.swing.JOptionPane.showMessageDialog(null, "Oracle Driver not found/Corrupted");
      }
      
      //Now we have establish the connection
       Connection con=null; 
       Statement ob=null;
      try {
         
          con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","mylab","mylab");
        System.out.println("Connection OK");  
          ob = con.createStatement();
          
          
      } catch (Exception e) {
          javax.swing.JOptionPane.showMessageDialog(null,"Connection could not be establised");
        }
        
        String query="select id as \"MYID\" from US";
        System.out.println(query);
        ResultSet rs=ob.executeQuery(query);
     rs.next();
        
  Table tb=new Table();
  tb.changeTable(rs);
  tb.setVisible(true);
        
        
        
       
    }
    
}
