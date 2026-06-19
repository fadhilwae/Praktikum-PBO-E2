/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.util.*;

/**
 *
 * @author FADHIL YAAFI WIDODO
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }
    
    public void add(Mahasiswa mhs) {
       String query = "INSERT INTO mahasiswa(id, nama) VALUES(" 
        + mhs.getId() + ", '" 
        + mhs.getNama() + "')";
       
        try (Statement statement = koneksi.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException sqle) {
            System.out.println("Gagal menambahkan: " + sqle.getMessage());
        }
    }
    
    public void update(Mahasiswa mhs) {
       String query = "UPDATE mahasiswa SET nama = '" 
        + mhs.getNama() 
        + "' WHERE id = " 
        + mhs.getId();
       
        try (Statement statement = koneksi.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException sqle) {
            System.out.println("Gagal mengupdate: " + sqle.getMessage());
        }
    }
    
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        
        try (Statement statement = koneksi.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException sqle) {
            System.out.println("Gagal menghapus: " + sqle.getMessage());
        }
    }
    
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id= " + id;
        
        try (Statement statement = koneksi.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            
            if (rs.next()) {
                return new Mahasiswa(
                        rs.getInt("id"), 
                        rs.getString("nama")
                );
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal menghapus: " + sqle.getMessage());
        }
        
        return null;
    }
    
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        
        try (Statement statement = koneksi.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                        rs.getInt("id"), 
                        rs.getString("nama")
                );
                
                listMhs.add(mhs);
            }
            
            return listMhs;
        } catch (SQLException sqle) {
            System.out.println("Gagal menghapus: " + sqle.getMessage());
        }
        
        return null;
    }

    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (Statement stmt = koneksi.createStatement()) {
            
            stmt.executeUpdate(query);
            System.out.println("Auto increment berhasil di-reset.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}