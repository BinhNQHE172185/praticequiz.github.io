/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;

/**
 *
 * @author kimdi
 */

public class Question {
    private int questionId;
    private int subjectId;
    private int accountId;
    private String title;
    private String imageURL;
    private int level;
    private float duration;
    private Date startTime;
    private Date endTime;
    private int status;
    private int rate;
    private int hasJoin;
    private Date createdDate;
    private Date modifyDate;
    private String description;

    public Question() {
    }

    public Question(int questionId, int subjectId, int accountId, String title, String imageURL, int level, float duration, Date startTime, Date endTime, int status, int rate, int hasJoin, Date createdDate, Date modifyDate, String description) {
        this.questionId = questionId;
        this.subjectId = subjectId;
        this.accountId = accountId;
        this.title = title;
        this.imageURL = imageURL;
        this.level = level;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.rate = rate;
        this.hasJoin = hasJoin;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.description = description;
    }
    

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHasJoin() {
        return hasJoin;
    }

    public void setHasJoin(int hasJoin) {
        this.hasJoin = hasJoin;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
