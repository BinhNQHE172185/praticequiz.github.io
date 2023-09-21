package DAO;

import Model.Answer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kimdi
 */
public class AnswerDAO extends BaseDAO{
    public List<Answer> getAnswersByQuizId(int quizId) {
    String sql = "SELECT * FROM Answer WHERE Quiz_id = ?";
    List<Answer> answers = new ArrayList<>();

    try {
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, quizId);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int answerId = resultSet.getInt("Answer_id");
            boolean isCorrect = resultSet.getBoolean("isCorrect");
            String content = resultSet.getString("content");

            Answer answer = new Answer(answerId, quizId, isCorrect, content);

            answers.add(answer);
        }
    } catch (SQLException ex) {
        System.err.println("An error occurred while executing the query: " + ex.getMessage());
        ex.printStackTrace();
    }
    return answers;
}
}
