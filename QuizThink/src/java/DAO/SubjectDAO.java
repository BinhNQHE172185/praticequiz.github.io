/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Subject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kimdi
 */
public class SubjectDAO extends BaseDAO {

    public Subject getSubjectById(int subjectId) {
        String sql = "SELECT * FROM Subject WHERE subject_Id = ?";
        Subject subject = null;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, subjectId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int expertId = resultSet.getInt("Expert_id");
                int subjectDimensionId = resultSet.getInt("SubjectDimension_id");
                int accountId = resultSet.getInt("Account_id");
                int level = resultSet.getInt("level");
                String imageURL = resultSet.getString("imageURL");
                String description = resultSet.getString("discription");
                float duration = resultSet.getFloat("duration");
                Date startTime = resultSet.getDate("Start_time");
                Date endTime = resultSet.getDate("End_time");
                int hasRegistered = resultSet.getInt("hasRegisted");

                subject = new Subject(subjectId, expertId, subjectDimensionId, accountId, level, imageURL, description, duration, startTime, endTime, hasRegistered);
            }
        } catch (SQLException ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }
        return subject;
    }
}
