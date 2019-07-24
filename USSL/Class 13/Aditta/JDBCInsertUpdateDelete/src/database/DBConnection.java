
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    
    public static Connection con = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    
    public static void getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/JDBCInsertUpdateDelete", "root", "123");
            st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void Insert(String query){
        
    }
    
    public static void Update(String query){
        try {
            st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void Select(String query){
        rs = null;
        try {
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
