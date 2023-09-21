/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kimdi
 */
public class QuestionDetail {
    private int questionDetailId;
    private int questionId;
    private String description;
    private String imageUrl;

    public QuestionDetail() {
    }

    public QuestionDetail(int questionDetailId, int questionId, String description, String imageUrl) {
        this.questionDetailId = questionDetailId;
        this.questionId = questionId;
        this.description = description;
        this.imageUrl = imageUrl;
    }
    

    public int getQuestionDetailId() {
        return questionDetailId;
    }

    public void setQuestionDetailId(int questionDetailId) {
        this.questionDetailId = questionDetailId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}