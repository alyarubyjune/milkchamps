package com.example.myapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alya
 */
public class Koneksi {
    private static Connection conn;
    public static Connection getKoneksi() {
        String host = "jdbc:mysql://localhost/cimory",
                user = "root",
                pass = "123";
        try {
            conn = (Connection)DriverManager.getConnection(host, user, pass);
        }
        
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        
        return conn;
    }
    
    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
