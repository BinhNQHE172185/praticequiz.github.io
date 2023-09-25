/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author admin
 */
public class Subject {
    private int subjectID;
    private int expertID;
    private int subjectDimensionID;
    private String title;
    private String imageURL;
    private int questionCount;
    private int rate;
    private int rateCount;
    private int level;
    private float requirement;
    private String description;
    private Date createdDate;
    private Date modifyDate;
    private boolean status;
    private Time duration;

    public Subject() {
    }

    public Subject(int subjectID, int expertID, int subjectDimensionID, String title, String imageURL, int questionCount, int rate, int rateCount, int level, float requirement, String description, Date createdDate, Date modifyDate, boolean status, Time duration) {
        this.subjectID = subjectID;
        this.expertID = expertID;
        this.subjectDimensionID = subjectDimensionID;
        this.title = title;
        this.imageURL = imageURL;
        this.questionCount = questionCount;
        this.rate = rate;
        this.rateCount = rateCount;
        this.level = level;
        this.requirement = requirement;
        this.description = description;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.status = status;
        this.duration = duration;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getExpertID() {
        return expertID;
    }

    public void setExpertID(int expertID) {
        this.expertID = expertID;
    }

    public int getSubjectDimensionID() {
        return subjectDimensionID;
    }

    public void setSubjectDimensionID(int subjectDimensionID) {
        this.subjectDimensionID = subjectDimensionID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRateCount() {
        return rateCount;
    }

    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getRequirement() {
        return requirement;
    }

    public void setRequirement(float requirement) {
        this.requirement = requirement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
    
}
