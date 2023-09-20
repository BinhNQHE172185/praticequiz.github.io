/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import Model.Account;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

/**
 *
 * @author LEMONLORD
 */
public class AccountDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    // Create new Account which could be expert marketing sale, customer, membership
    public void createAnyAccount(String username, String password, String email, String status, String gender, String avatar, String fullname, String DOB, String address, String phonenumber, int roleId){
        String query ="INSERT INTO [Account] ([username], [password], [email], [status], [gender], [avatar], [fullname], [DOB], [address], [phonenumber], [createdDate], [modifyDate], [passwordToken], [role_id])\n" +
"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, NULL, ?);";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, status);
            ps.setString(5, gender);
            ps.setString(6, avatar);
            ps.setString(7, fullname);
            ps.setString(8, DOB);
            ps.setString(9, address);
            ps.setString(10, phonenumber);
            
            LocalDateTime currentTime = LocalDateTime.now();
            Date createdDate = Date.valueOf(currentTime.toLocalDate());
            ps.setDate(11, createdDate);
            ps.setInt(12, roleId);
            ps.executeUpdate(); // no result ==> no need result set
        } catch (Exception e) {
            // Handle exceptions here
        } finally {
            // Close database connections and resources in a real application
            // For simplicity, it's omitted here.
        }
    }
    
    // Get  Account by ID
    public Account getAccountByID(String Account_ID){
        String query = "select * from Account where account_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Account_ID);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getDate(12),
                        rs.getDate(13),
                        rs.getString(14),
                        rs.getInt(15)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
    public static void main(String[] args) {
        AccountDAO DAO = new AccountDAO();
        DAO.createAnyAccount("ABCD", "ABCD", "ABCD", "ABCD", "Female", "ABCD", "ABCD", "03-02-2003", "ABCD", "02036547", 3);
        
    }
}
