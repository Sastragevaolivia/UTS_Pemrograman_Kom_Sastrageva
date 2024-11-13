 
package mysqltonetbeans;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Mysqltonetbeans {


    public static Connection connecmysqldb() {
        try {
            String username = "root"; // sesuaikan dengan username Anda
            String pass = ""; // sesuaikan dengan password Anda
            String sqlconn = "jdbc:mysql://localhost:3306/gia_store"; // pastikan nama database benar
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlconn, username, pass);
            System.out.println("Database connected successfully!");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
        }
        return null;
    }    
    
}
