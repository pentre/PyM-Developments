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
    private boolean active_;
    
    public User(String username, String password, String type, boolean active){
        username_ = username;
        password_ = password;
        type_ = type;            
        active_ = active;
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

    public boolean isActive() {
        return active_;
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

    public void setActive(boolean active) {
        active_ = active;
    }    
    
    public String login(Database conn) {              
        try{
            String query = "SELECT type FROM login WHERE username = ? AND pass = ? AND active = true";
            PreparedStatement statement = conn.getStatement(query);
            statement.setString(1, username_);
            statement.setString(2, password_);
            
            ResultSet result = statement.executeQuery();
            if (result.next()){                
                return result.getString("type");                
            }
            return "Error: Usuario o contraseña incorrecta";        
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "Error: Error interno del servidor";
        }          

    }  
    
    public String update(Database database){
        try{             
            PreparedStatement stmt = database.getStatement("UPDATE login SET type = ? WHERE username = ?");
            stmt.setString(1, type_);
            stmt.setString(2, username_);
            
            int result = stmt.executeUpdate();
            
            if(result == 0) {
                return "Error: usuario no encontrado";
            }
            return "Empleado modificado correctamente";            
        }catch(SQLException e) {
            e.printStackTrace();
            return "Error: error al modificar usuario";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: error al modificar usuario";

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
            type_ = rs.getString("type");
            active_ = rs.getBoolean("active");
            
            return true;
        }catch(Exception e){
             e.printStackTrace();
             return false;
        }
    }
    
    
    public String store(Database database){
        try{
            PreparedStatement stmt = database.getStatement("INSERT INTO login VALUES(?, ?, ?, ?)");
            
            stmt.setString(1,username_);
            stmt.setString(2,password_);
            stmt.setString(3,type_);
            stmt.setBoolean(4,active_);     

            if(stmt.executeUpdate()==1){
                return " El usuario es su cedula.";
            }
            
            return "Error: error al crear usuario.";
            
        }catch(SQLException e){
            if (e.getSQLState().equals("23505")){
                return "Ya existe un usuario con esta cédula. ";
            }
            return "Error: error al crear el usuario.";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: error al crear el usuario.";
        }
    }
}
