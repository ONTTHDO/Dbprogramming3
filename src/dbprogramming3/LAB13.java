package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB13 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "update student set email = ? where studentID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "zzzz@gmail.com");
            preparedStatement.setString(2, "650103");
            preparedStatement.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
