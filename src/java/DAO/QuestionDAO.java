/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import Model.Question;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kimdi
 */
public class QuestionDAO extends DBContext {

    public Question getQuestionById(int questionId) {
        String sql = "SELECT * FROM Question WHERE Question_id = ?";
        Question question = null;

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int subjectId = resultSet.getInt("Subject_id");
                int expertId = resultSet.getInt("Expert_id");
                String title = resultSet.getString("title");
                String imageURL = resultSet.getString("imageURL");
                int quizCount = resultSet.getInt("quiz_count");
                String description = resultSet.getString("description");
                float requirement = resultSet.getFloat("requirement");
                Date createdDate = resultSet.getDate("createdDate");
                Date modifyDate = resultSet.getDate("modifyDate");
                boolean status = resultSet.getBoolean("status");
                Time duration = resultSet.getTime("duration");

                question = new Question(questionId, subjectId, expertId, title, imageURL, quizCount, description, requirement, createdDate, modifyDate, status, duration);
            }
            resultSet.close();
            statement.close();
        } catch (Exception ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return question;
    }

    public List<Question> getQuestionsBySubjectId(int subjectId) {
        String sql = "SELECT * FROM Question WHERE Subject_id = ?";
        List<Question> questions = new ArrayList<>();

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, subjectId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int questionId = resultSet.getInt("Question_id");
                int expertId = resultSet.getInt("Expert_id");
                String title = resultSet.getString("title");
                String imageURL = resultSet.getString("imageURL");
                int quizCount = resultSet.getInt("quiz_count");
                String description = resultSet.getString("description");
                float requirement = resultSet.getFloat("requirement");
                Date createdDate = resultSet.getDate("createdDate");
                Date modifyDate = resultSet.getDate("modifyDate");
                boolean status = resultSet.getBoolean("status");
                Time duration = resultSet.getTime("duration");

                Question question = new Question(questionId, subjectId, expertId, title, imageURL, quizCount, description, requirement, createdDate, modifyDate, status, duration);

                questions.add(question);
            }
            resultSet.close();
            statement.close();
        } catch (Exception ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return questions;
    }
}
