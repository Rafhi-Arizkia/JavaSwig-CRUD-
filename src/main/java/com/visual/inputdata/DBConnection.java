/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visual.inputdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafhi
 */
public class DBConnection {
    private static Connection conn;
    
    /**
     *  DBConnection dibuat sebagai singleton class agar hanya satu koneksi yang dibuat dan digunakan di seluruh aplikasi. 
     *  Karena itu, constructor-nya harus private
     */
    private DBConnection(){
        
    }
       public static Connection getConnection(){
           if (conn == null) {
            try {
                // Url database
                String url = "jdbc:mysql://localhost:3306/data_emas";
                // Database Username
                String user = "root";
                // Database Password
                String password = "";
                // mengkoneksikan ke database
                conn = DriverManager.getConnection(url, user, password);
                // menampilkan pesan kesalahan
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage(), 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return conn;
    }

}    
  
