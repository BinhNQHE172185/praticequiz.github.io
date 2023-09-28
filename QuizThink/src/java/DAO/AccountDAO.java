/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Account;
import DAL.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author LEMONLORD
 */
public class AccountDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account getAccount(String username, String password) {
        Account account = null;
        int accountId;
        String email;
        String status;
        String gender;
        String avatar;
        String fullname;
        Date dob;
        String address;
        String phonenumber;
        Date createDate;
        Date modifyDate;
        String passwordToken;
        int roleId;
        String sql = "SELECT * FROM Account WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                accountId = rs.getInt("Account_id");
                email = rs.getString("email");
                status = rs.getString("status");
                avatar = rs.getString("avatar");
                gender = rs.getString("gender");
                fullname = rs.getString("fullname");
                dob = rs.getDate("DOB");
                address = rs.getString("address");
                phonenumber = rs.getString("phonenumber");
                createDate = rs.getDate("createdDate");
                modifyDate = rs.getDate("modifyDate");
                passwordToken = rs.getString("passwordToken");
                roleId = rs.getInt("role_id");
                boolean accountStatus = rs.getBoolean("status");
                account = new Account(accountId, username, password, email, fullname, dob, gender, null, avatar, createDate, modifyDate, passwordToken, roleId, accountStatus);
            }
            rs.close();
            ps.close();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    // Create new Account which could be expert marketing sale, customer, membership
    public void createAnyAccount(String username, String password, String email, String status, String gender, String avatar, String fullname, String DOB, String address, String phonenumber, int roleId) {
        String query = "INSERT INTO [Account] ([username], [password], [email], [status], [gender], [avatar], [fullname], [DOB], [address], [phonenumber], [createdDate], [modifyDate], [passwordToken], [role_id])\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, NULL, ?);";
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

    // Get number of account
    public int getNumOfAccount() {
        String query = "select COUNT(*) from Account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    //Get all account
    public List<Account> getAllAccount(int page) {
        List<Account> list = new ArrayList<>();
        String query = "SELECT * FROM Account\n"
                + "ORDER BY Account_id\n"
                + "OFFSET ? ROWS FETCH NEXT 15 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (page - 1) * 15); // page 1 starts at index 0
            rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account(
                        rs.getInt("Account_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getDate("DOB"),
                        rs.getString("gender"),
                        rs.getString("self-introduction"),
                        rs.getString("avatar"),
                        rs.getDate("createdDate"),
                        rs.getDate("modifyDate"),
                        rs.getString("passwordToken"),
                        rs.getInt("role_id"),
                        rs.getBoolean("status")
                );
                list.add(account);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    // Get  Account by ID

    public Account getAccountByID(int accountID) {
        String query = "SELECT * FROM Account WHERE Account_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getInt("Account_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getDate("DOB"),
                        rs.getString("gender"),
                        rs.getString("self-introduction"),
                        rs.getString("avatar"),
                        rs.getDate("createdDate"),
                        rs.getDate("modifyDate"),
                        rs.getString("passwordToken"),
                        rs.getInt("role_id"),
                        rs.getBoolean("status")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Get  Account by ID
    public Account getAccountByID(String Account_ID) {
        String query = "select * from Account where account_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Account_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt("accountId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getDate("dob"),
                        rs.getString("gender"),
                        rs.getString("selfIntroduction"),
                        rs.getString("avatar"),
                        rs.getDate("createdDate"),
                        rs.getDate("modifyDate"),
                        rs.getString("passwordToken"),
                        rs.getInt("roleId"),
                        rs.getBoolean("status")
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
}
