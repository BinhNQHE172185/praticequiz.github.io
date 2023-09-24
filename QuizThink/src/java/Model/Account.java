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
    private String fullname;
    private Date DOB;
    private String gender;
    private String selfIntroduction;
    private String avatar;
    private Date createdDate;
    private Date modifyDate;
    private String passwordToken;
    private int role_id;
    private boolean status;

    public Account() {
    }

    public Account(int account_id, String username, String password, String email, String fullname, Date DOB, String gender, String selfIntroduction, String avatar, Date createdDate, Date modifyDate, String passwordToken, int role_id, boolean status) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.DOB = DOB;
        this.gender = gender;
        this.selfIntroduction = selfIntroduction;
        this.avatar = avatar;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.passwordToken = passwordToken;
        this.role_id = role_id;
        this.status = status;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    
    
    
    
}

