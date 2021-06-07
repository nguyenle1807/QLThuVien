/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.*;

/**
 *
 * @author Nguyen
 */
public class Connect 
{ 
    public  static Connection con;
    
    public static Connection getConnect(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "jdbc:sqlserver://localhost:1433;databaseName = QLThuVien; integratedSecurity = true;";
            con = DriverManager.getConnection(sql,"sa","sa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con ;
    }   
}
