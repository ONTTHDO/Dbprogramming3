package dbprogramming3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Dbprogramming3 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con= DriverManager.getConnection(URL, username, password);
            System.out.println("Driver Connected");
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet result= statement.executeQuery(sql);
            
            while(result.next()){
                System.out.println(result.getString(1) + "  " + result.getString(2) 
                        + " " + result.getString(3) + "  " + result.getString(4));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
