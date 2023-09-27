/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import Model.Subject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.*;

/**
 *
 * @author kimdi
 */
public class SubjectDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;
    private List<Subject> list;  
    
    public Subject getSubjectById(int subjectId) {
        String sql = "SELECT * FROM Subject WHERE subject_Id = ?";
        Subject subject = null;

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, subjectId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int expertId = resultSet.getInt("Expert_id");
                int subjectDimensionId = resultSet.getInt("SubjectDimension_id");
                String title = resultSet.getString("title");
                String imageURL = resultSet.getString("imageURL");
                int questionCount = resultSet.getInt("question_count");
                int rate = resultSet.getInt("rate");
                int rateCount = resultSet.getInt("rate_count");
                int level = resultSet.getInt("level");
                float requirement = resultSet.getFloat("requirement");
                String description = resultSet.getString("description");
                Date createdDate = resultSet.getDate("createdDate");
                Date modifyDate = resultSet.getDate("modifyDate");
                boolean status = resultSet.getBoolean("status");
                Time duration = resultSet.getTime("duration");

                subject = new Subject(subjectId, expertId, subjectDimensionId, title, imageURL, questionCount, rate, rateCount, level, requirement, description, createdDate, modifyDate, status, duration);
            }
        } catch (Exception ex) {
            System.err.println("An error occurred while executing the query: " + ex.getMessage());
            ex.printStackTrace();
        }

        return subject;
    }
    
    public List<Subject> getRegistedSubject(int accountID) {
        Expert expert = null;
        SubjectDimension subjectDimension = null;
        Account account = null;
        try {
            String query = "Select * from Subject where account_id = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();
            while(rs.next()){
                Subject subject= new Subject(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getInt(8),
                        expert,
                        subjectDimension,
                        account);
                list.add(subject);
            }
        } catch (Exception e) {

        }
        return null;
    }
}
