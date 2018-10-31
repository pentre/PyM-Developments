/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lalil
 */
public class Furniture {
    
    private String id_;
    private float price_;
    private String material_;
    private float weight_;
    private String color_;
    
    public Furniture(String id, float price, String material, float weight, String color) {
        id_ = id;
        price_ = price;
        material_ = material;
        weight_ = weight;
        color_ = color;
    }
    
    public String getId() {
        return id_;
    }
    
    public float getPrice() {
        return price_;
    }
    
    public String getMaterial() {
        return material_;
    }
    
    public float getWeight() {
        return weight_;
    }
    
    public String getColor() {
        return color_;
    }
    public void setId(String id) {
        id_ = id;
    }
    
    public void setPrice(float price) {
        price_ = price;
    }
    public void setMaterial(String material) {
        material_ = material;
    }
    
    public void setWeight(float weight) {
        weight_ = weight;
    }
    
    public void setColor(String color) {
        color_ = color;
    }    
    
    public boolean search(Database database, String id) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM catalog WHERE furniture_id = ?");
            stmt.setString(1, id);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
            
            id_ = rs.getString("furniture_id");
            price_ = rs.getFloat("price");
            material_ = rs.getString("material");
            weight_ = rs.getFloat("weight");
            color_ = rs.getString("color");
            
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
        public void getInfo(Database database, String id) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM catalog WHERE furniture_id = ?");
            stmt.setString(1, id);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return;
            }
            
            id_ = rs.getString("furniture_id");
            price_ = rs.getFloat("price");
            material_ = rs.getString("material");
            weight_ = rs.getFloat("weight");
            color_ = rs.getString("color");
            
            return;
        } catch(SQLException e) {
            e.printStackTrace();
            return;
        } catch(Exception e) {
            e.printStackTrace();
            return;
        }
    }   
}
