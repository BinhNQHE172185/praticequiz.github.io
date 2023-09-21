/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import Model.Quiz;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kimdi
 */
public class QuizDAO extends DBContext{
    public List<Quiz> getQuizzesByQuestionId(int questionId) {
    String sql = "SELECT * FROM Quiz WHERE Question_id = ?";
    List<Quiz> quizzes = new ArrayList<>();

    try {
        PreparedStatement statement = getConnection().prepareStatement(sql);
        statement.setInt(1, questionId);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int quizId = resultSet.getInt("Quiz_id");
            String content = resultSet.getString("content");
            float duration = resultSet.getFloat("duration");
            String description = resultSet.getString("discription");

            Quiz quiz = new Quiz(quizId, questionId, content, duration, description);

            quizzes.add(quiz);
        }
    } catch (Exception ex) {
        System.err.println("An error occurred while executing the query: " + ex.getMessage());
        ex.printStackTrace();
    }
    return quizzes;
}
}
