/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author LEMONLORD
 */
public class Account {
    private int account_id;
    private String username;
    private String password;
    private String email;
    private String status;
    private String gender;
    private String avatar;
    private String fullname;
    private Date DOB;
    private String address;
    private String phonenumber;
    private Date createDate;
    private Date modifyDate;
    private String passwordToken;
    private int role_id;

    public Account() {
    }

    public Account(int account_id, String username, String password, String email, String status, String gender, String avatar, String fullname, Date DOB, String address, String phonenumber, Date createDate, Date modifyDate, String passwordToken, int role) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.gender = gender;
        this.avatar = avatar;
        this.fullname = fullname;
        this.DOB = DOB;
        this.address = address;
        this.phonenumber = phonenumber;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.passwordToken = passwordToken;
        this.role_id = role;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getPasswordToken() {
        return passwordToken;
    }

    public void setPasswordToken(String passwordToken) {
        this.passwordToken = passwordToken;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Account{" + "account_id=" + account_id + ", username=" + username + ", password=" + password + ", email=" + email + ", status=" + status + ", gender=" + gender + ", avatar=" + avatar + ", fullname=" + fullname + ", DOB=" + DOB + ", address=" + address + ", phonenumber=" + phonenumber + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", passwordToken=" + passwordToken + ", role=" + role_id + '}';
    }
    
    
}
