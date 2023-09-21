/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kimdi
 */
import java.util.Date;

public class SubjectDimension {
    private int subjectDimensionId;
    private int parentSdId;
    private int level;
    private String imageURL;
    private String description;
    private float duration;
    private Date startTime;
    private Date endTime;
    private int hasRegistered;

    public SubjectDimension() {
    }

    public SubjectDimension(int subjectDimensionId, int parentSdId, int level, String imageURL, String description, float duration, Date startTime, Date endTime, int hasRegistered) {
        this.subjectDimensionId = subjectDimensionId;
        this.parentSdId = parentSdId;
        this.level = level;
        this.imageURL = imageURL;
        this.description = description;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hasRegistered = hasRegistered;
    }

    public int getSubjectDimensionId() {
        return subjectDimensionId;
    }

    public void setSubjectDimensionId(int subjectDimensionId) {
        this.subjectDimensionId = subjectDimensionId;
    }

    public int getParentSdId() {
        return parentSdId;
    }

    public void setParentSdId(int parentSdId) {
        this.parentSdId = parentSdId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getHasRegistered() {
        return hasRegistered;
    }

    public void setHasRegistered(int hasRegistered) {
        this.hasRegistered = hasRegistered;
    }
}
