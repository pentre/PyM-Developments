/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;

/**
 *
 * @author pentre
 */
public class Database {
    
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";  
    static final String DB_URL = "jdbc:postgresql://localhost:5432/P&M";

    //  Database credential
    static final String USER = "postgres";
    static final String PASS = "root";
   
    private Connection conn_ = null;
    
    public Database() {
        try{
            Class.forName(JDBC_DRIVER);

            conn_ = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(SQLException e){
            //Handle errors for JDBC
            e.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public PreparedStatement getStatement(String query) {
        try {
            return conn_.prepareStatement(query);
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
