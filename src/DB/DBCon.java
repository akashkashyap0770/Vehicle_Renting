/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

public class DBCon {

    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;

    //@SuppressWarnings("empty-statement")
    public DBCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle", "root", "ak@5743");
        } 
        catch(Exception e)
            {
            e.printStackTrace();
            }
        }
    }
