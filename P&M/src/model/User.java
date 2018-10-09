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
    private String type_;
    
    public User(String username, String password, String type){
        username_ = username;
        password_ = password;
        type_ = type;            
    }

    public String getUsername() {
        return username_;
    }

    public String getPassword() {
        return password_;
    }

    public String getType() {
        return type_;
    }

    public void setUsername(String username) {
        username_ = username;
    }

    public void setPassword(String password) {
        password_ = password;
    }

    public void setType(String type) {
        type_ = type;
    }    
    
    public String login(Database conn) {              
        try{
            String query = "SELECT user_type FROM login WHERE username = ? AND pass = ?";
            PreparedStatement statement = conn.getStatement(query);
            statement.setString(1, username_);
            statement.setString(2, password_);
            
            ResultSet result = statement.executeQuery();
            if (result.next()){                
                return result.getString("user_type");                
            }
            return "Error: Usuario o contraseña incorrecta";
        } catch (SQLException e){   
            System.out.println(e.getMessage());
            return "Error: Internal Server Error";
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "Error: Internal Server Error";
        }          
    }    
}
