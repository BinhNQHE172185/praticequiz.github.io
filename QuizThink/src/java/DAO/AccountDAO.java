/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Account;
import java.util.ArrayList;
import java.util.List;
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
        Account x = null;
        String sql = "select * from Account\n"
                + "where username= '" + username + "' and password = '" + password + "'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int account_id;
            String email;
            String status;
            String gender;
            String avatar;
            String fullname;
            Date DOB;
            String address;
            String phonenumber;
            Date createDate;
            Date modifyDate;
            String passwordToken;
            int role;

            while (rs.next()) {
                account_id = rs.getInt("Account_id");
                email = rs.getString("email");
                status = rs.getString("status");
                avatar = rs.getString("avatar");
                gender = rs.getString("gender");
                fullname = rs.getString("fullname");
                DOB = rs.getDate("DOB");
                address = rs.getString("address");
                phonenumber = rs.getString("phonenumber");
                createDate = rs.getDate("createDate");
                modifyDate = rs.getDate("modifyDate");
                passwordToken = rs.getString("passwordToken");
                role = rs.getInt("role_id");
                x = new Account(account_id, email, status, gender, avatar, fullname, DOB, address, phonenumber, createDate, modifyDate, passwordToken, role);
            }
            rs.close();
            ps.close();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
}
