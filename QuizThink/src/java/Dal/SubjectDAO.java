/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import Model.Account;
import Model.Expert;
import Model.Subject;
import Model.SubjectDimension;
import DAO.BaseDAO;

/**
 *
 * @author admin
 */
public class SubjectDAO extends BaseDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private List<Subject> list;  

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
    
    private PreparedStatement ps;
    private ResultSet rs;
    private List<Subject> list;  

    public List<Subject> getaLLSubject() {
        Expert expert = null;
        SubjectDimension subjectDimension = null;
        Account account = null;
        try {
            String query = "Select * from Subject";
            ps = connection.prepareStatement(query);
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
