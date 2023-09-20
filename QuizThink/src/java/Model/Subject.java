/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Subject {
    private int subjectID;
    private int level;
    private String image;
    private String discription;
    private float duration;
    private Date startTime;
    private Date endTime;
    private int hasRegisted;
    private Expert expert;
    private SubjectDimension subjectDimension;
    private Account account;

    public Subject() {
    }

    public Subject(int subjectID, int level, String image, String discription, float duration, Date startTime, Date endTime, int hasRegisted, Expert expert, SubjectDimension subjectDimension, Account account) {
        this.subjectID = subjectID;
        this.level = level;
        this.image = image;
        this.discription = discription;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hasRegisted = hasRegisted;
        this.expert = expert;
        this.subjectDimension = subjectDimension;
        this.account = account;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getHasRegisted() {
        return hasRegisted;
    }

    public void setHasRegisted(int hasRegisted) {
        this.hasRegisted = hasRegisted;
    }

    public Expert getExpert() {
        return expert;
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public SubjectDimension getSubjectDimension() {
        return subjectDimension;
    }

    public void setSubjectDimension(SubjectDimension subjectDimension) {
        this.subjectDimension = subjectDimension;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
