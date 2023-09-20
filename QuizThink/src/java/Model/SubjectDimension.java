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
public class SubjectDimension {
    private int subjectDimensionID;
    private int level;
    private String imageURL;
    private String discription;
    private float duration;
    private Date startTime;
    private Date endTime;
    private int hasRegisted;
    private SubjectDimension parentSDID;

    public SubjectDimension() {
    }

    public SubjectDimension(int subjectDimensionID, int level, String imageURL, String discription, float duration, Date startTime, Date endTime, int hasRegisted, SubjectDimension parentSDID) {
        this.subjectDimensionID = subjectDimensionID;
        this.level = level;
        this.imageURL = imageURL;
        this.discription = discription;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hasRegisted = hasRegisted;
        this.parentSDID = parentSDID;
    }

    public int getSubjectDimensionID() {
        return subjectDimensionID;
    }

    public void setSubjectDimensionID(int subjectDimensionID) {
        this.subjectDimensionID = subjectDimensionID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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

    public SubjectDimension getParentSDID() {
        return parentSDID;
    }

    public void setParentSDID(SubjectDimension parentSDID) {
        this.parentSDID = parentSDID;
    }
    
    
}
