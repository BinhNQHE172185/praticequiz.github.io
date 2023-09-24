/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Account;
import DAL.DBContext;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEMONLORD
 */
public class AccountDAO extends DBContext {

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
}
