/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Question;
import Model.QuestionDetail;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kimdi
 */
public class QuestionDAO extends BaseDAO {

    public Question getQuestionById(int questionId) {
        String sql = "SELECT * FROM Question WHERE Question_id = ?";
        Question question = null;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int subjectId = resultSet.getInt("Subject_id");
                int accountId = resultSet.getInt("Account_id");
                String title = resultSet.getString("title");
                String imageURL = resultSet.getString("imageURL");
                int level = resultSet.getInt("level");
                float duration = resultSet.getFloat("duration");
                Date startTime = resultSet.getDate("Start_time");
                Date endTime = resultSet.getDate("End_time");
                int status = resultSet.getInt("Status");
                int rate = resultSet.getInt("Rate");
                int hasJoin = resultSet.getInt("hasJoin");
                Date createdDate = resultSet.getDate("createdDate");
                Date modifyDate = resultSet.getDate("modifyDate");
                String description = resultSet.getString("discription");

                question = new Question(questionId, subjectId, accountId, title, imageURL, level, duration, startTime, endTime, status, rate, hasJoin, createdDate, modifyDate, description);
            }
        } catch (SQLException ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return question;
    }

    public List<Question> getQuestionsBySubjectId(int subjectId) {
        String sql = "SELECT * FROM Question WHERE Subject_id = ?";
        List<Question> questions = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, subjectId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int questionId = resultSet.getInt("Question_id");
                int accountId = resultSet.getInt("Account_id");
                String title = resultSet.getString("title");
                String imageURL = resultSet.getString("imageURL");
                int level = resultSet.getInt("level");
                float duration = resultSet.getFloat("duration");
                Date startTime = resultSet.getDate("Start_time");
                Date endTime = resultSet.getDate("End_time");
                int status = resultSet.getInt("Status");
                int rate = resultSet.getInt("Rate");
                int hasJoin = resultSet.getInt("hasJoin");
                Date createdDate = resultSet.getDate("createdDate");
                Date modifyDate = resultSet.getDate("modifyDate");
                String description = resultSet.getString("discription");

                Question question = new Question(questionId, subjectId, accountId, title, imageURL, level, duration, startTime, endTime, status, rate, hasJoin, createdDate, modifyDate, description);

                questions.add(question);
            }
        } catch (SQLException ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return questions;
    }

    public List<QuestionDetail> getQuestionDetailsByQuestionId(int questionId) {
        String sql = "SELECT * FROM QuestionDetail WHERE Question_id = ?";
        List<QuestionDetail> questionDetails = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int questionDetailId = resultSet.getInt("QuestionDetail_id");
                String description = resultSet.getString("description");
                String imageURL = resultSet.getString("imageUrl");

                QuestionDetail questionDetail = new QuestionDetail(questionDetailId, questionId, description, imageURL);

                questionDetails.add(questionDetail);
            }
        } catch (SQLException ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return questionDetails;
    }
    public QuestionDetail getQuestionDetailByQuestionId(int questionId) {
        String sql = "SELECT * FROM QuestionDetail WHERE Question_id = ?";
        QuestionDetail questionDetail = null;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int questionDetailId = resultSet.getInt("QuestionDetail_id");
                String description = resultSet.getString("description");
                String imageURL = resultSet.getString("imageUrl");

                questionDetail = new QuestionDetail(questionDetailId, questionId, description, imageURL);
            }
        } catch (SQLException ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return questionDetail;
    }
}
