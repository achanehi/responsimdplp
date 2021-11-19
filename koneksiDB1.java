/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_app_mdpl_01;

//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class koneksiDB1 {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if(koneksi==null) {
            
            try {
                String url ="jdbc:mysql://localhost:3306/MDPL_Praktik_Database";
                String username ="root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 
                koneksi =(Connection) DriverManager.getConnection(url, username, password);
            }
            
            catch(SQLException e) {
                System.out.println(e.getMessage());
            }
                
        }
        return koneksi;
        
    } 
    
    
}
