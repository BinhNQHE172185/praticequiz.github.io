/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;

/**
 *
 * @author Dell
 */
@WebServlet(name="CreateAccount", urlPatterns={"/createaccount"})
public class CreateAccount extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //
        
//        private int account_id;
//    private String username;
//    private String password;
//    private String email;
//    private String status;
//    private String gender;
//    private String avatar;
//    private String fullname;
//    private Date DOB;
//    private String address;
//    private String phonenumber;
//    private Date createDate;
//    private Date modifyDate;
//    private String passwordToken;
//    private int role;

        // get parameter to create new account
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("password");
        String status = request.getParameter("password");
        String gender = request.getParameter("password");
        String avatar = request.getParameter("password");
        String fullname = request.getParameter("password");
        String DOB = request.getParameter("DOB");
        String address = request.getParameter("password");
        String phonenumber = request.getParameter("password");
        String createDate = request.getParameter("password");
        String modifyDate = request.getParameter("password");
        
        String role = request.getParameter("password");
        int role_id = Integer.parseInt(role);
        
        
        
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
