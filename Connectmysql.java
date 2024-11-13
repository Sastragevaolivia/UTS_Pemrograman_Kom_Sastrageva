package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connectmysql {

    public static Connection connectmysqldb() {
        try {
            String username = "root";
            String pass = "";
            String sqlconn = "jdbc:mysql://localhost:3306/gia_store";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlconn, username, pass);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = connectmysqldb();
        
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Connected Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Connection Failed");
        }
    }
}
