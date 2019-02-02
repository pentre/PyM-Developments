/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofia
 */
public class User {
    private String username_;
    private String password_;
    
    public User(String username, String password){
        username_ = username;
        password_ = password;
    }

    public String getUsername() {
        return username_;
    }

    public String getPassword() {
        return password_;
    } 

    public void setUsername(String username) {
        username_ = username;
    }

    public void setPassword(String password) {
        password_ = password;
    } 
    
    public boolean validate(Database conn) {              
        try{            
            String query = "SELECT EXISTS (SELECT * FROM login WHERE username = ? AND pass = ?)";
            PreparedStatement statement = conn.getStatement(query);
            statement.setString(1, username_);
            statement.setString(2, password_);
            
            ResultSet result = statement.executeQuery();             
            result.next();         
            
            return result.getBoolean("exists");
        } catch (Exception e){            
            System.out.println(e.getMessage());            
            return false;
        }          

    }

    public boolean search(Database database){
        try{
            PreparedStatement stmt = database.getStatement("SELECT * FROM login WHERE username = ?");
            stmt.setString(1, username_);
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
            
            username_ = rs.getString("username");
            password_ = rs.getString("pass");
            
            return true;
        }catch(Exception e){
             e.printStackTrace();
             return false;
        }
    }
    
    
    public String store(Database database){
        try{
            PreparedStatement stmt = database.getStatement("INSERT INTO login VALUES(?, ?)");
            
            stmt.setString(1,username_);
            stmt.setString(2,password_);  

            if(stmt.executeUpdate()==1){
                return "El usuario es el número de cédula";
            }
            
            return "Error: el usuario no pudo ser adicionado";
        }catch(SQLException e){
            if (e.getSQLState().equals("23505")){
                return "Error: ya existe un usuario con esta cédula";
            }            
        }catch(Exception e){
            e.printStackTrace();            
        }
        return "Error: el usuario no pudo ser adicionado";
    }
}
