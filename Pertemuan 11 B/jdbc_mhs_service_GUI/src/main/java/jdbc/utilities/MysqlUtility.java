/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.jdbc.utilities;

import java.sql.*;

/**
 *
 * @author FARHAN DWIYAN AKBAR
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                // sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/pbo_modularisasi";
                
                // sesuaikan username dan password
                String user = "root";
                String password = "farhan137";
                koneksi = DriverManager.getConnection(url, user, password);            
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi: " + sqle.getMessage());
            }
        }
        
        return koneksi;
    }
}