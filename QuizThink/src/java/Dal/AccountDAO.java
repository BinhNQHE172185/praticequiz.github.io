/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.Account;
import Model.Role;
import DAO.BaseDAO;

/**
 *
 * @author admin
 */
public class AccountDAO extends BaseDAO {
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Account getAccountByID(int accountID){
        try{
            String query = "Select * from Account where account_id = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getDate(10),
                        rs.getDate(11),
                        rs.getString(12),
                        rs.getInt(13),
                        rs.getBoolean(14));
            }
        }catch(Exception e){
            
        }
        return null;
    }
}
