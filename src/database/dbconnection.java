/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnection {
    Connection cn;
    public dbconnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_spp", "root", "");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Connection getConnection(){
        return cn;
    }
}
