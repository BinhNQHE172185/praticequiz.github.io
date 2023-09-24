/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
/**
 *
 * @author minhk
 */
public class SubjectStatus {
    private int SubjectStatus_id;
    private int Subject_id;
    private int Account_id;
    private boolean status;
    private Date createdDate;
    private Date modifyDate;
    private Date passDate;
    
    public SubjectStatus(){
    
}

    public int getSubjectStatus_id() {
        return SubjectStatus_id;
    }

    public void setSubjectStatus_id(int SubjectStatus_id) {
        this.SubjectStatus_id = SubjectStatus_id;
    }

    public int getSubject_id() {
        return Subject_id;
    }

    public void setSubject_id(int Subject_id) {
        this.Subject_id = Subject_id;
    }

    public int getAccount_id() {
        return Account_id;
    }

    public void setAccount_id(int Account_id) {
        this.Account_id = Account_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }
    
}
