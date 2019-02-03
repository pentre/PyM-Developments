/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Furniture {

    private int id_;
    private String name_;
    private float price_;
    private String material_;
    private float weight_;
    private String color_;
    private boolean active_;

    public Furniture(int id, String name, float price, String material, float weight, String color) {
        id_ = id;
        name_ = name;
        price_ = price;
        material_ = material;
        weight_ = weight;
        color_ = color;
        active_ = true;

    }

    public int getId() {
        return id_;
    }

    public String getName() {
        return name_;
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

    public boolean isActive() {
        return active_;
    }

    public void setId(int id_) {
        this.id_ = id_;
    }

    public void setName(String name_) {
        this.name_ = name_;
    }

    public void setPrice(float price_) {
        this.price_ = price_;
    }

    public void setMaterial(String material_) {
        this.material_ = material_;
    }

    public void setWeight(float weight_) {
        this.weight_ = weight_;
    }

    public void setColor(String color_) {
        this.color_ = color_;
    }

    public void setActive(boolean active_) {
        this.active_ = active_;
    }

    public String store(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("INSERT INTO catalog VALUES(nextval('catalog_furniture_id_seq'), ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, name_);
            stmt.setFloat(2, price_);
            stmt.setString(3, material_);
            stmt.setFloat(4, weight_);
            stmt.setString(5, color_);
            stmt.setBoolean(6, active_);
            
            if(stmt.executeUpdate()==1){
                return "El mueble fue adicionado correctamente";
            }
            
            return "Error: el mueble no pudo ser adicionado";
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Error: el mueble no pudo ser adicionado";
        }
    }
    
    public List<String> listFurniture(Database database){
        try{
            PreparedStatement stmt = database.getStatement("SELECT * FROM catalog WHERE active = true");
            ResultSet rs = stmt.executeQuery();
            List<String> results = new ArrayList<>(); 
            while(rs.next()) {
                String result = rs.getString("name") + "-" + rs.getInt("furniture_id");
                results.add(result);
            }
            return results;
        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean search(Database database) {
        try {            
            PreparedStatement stmt = database.getStatement("SELECT * FROM catalog WHERE furniture_id = ? AND active = true");
            stmt.setInt(1, id_);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
                      
            name_ = rs.getString("name");
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
    
    public String update(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("UPDATE catalog SET name = ? , price = ? , material = ? , weight = ? , color = ? WHERE furniture_id = ? AND active = true");

            stmt.setString(1, name_);
            stmt.setFloat(2, price_);
            stmt.setString(3, material_);
            stmt.setFloat(4, weight_);
            stmt.setString(5, color_);           
            stmt.setInt(6, id_);
            
            int result = stmt.executeUpdate();

            if (result == 0) {
                return "Error: mueble no encontrado";
            }

            return "Catálogo actualizado exitosamente";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: no fue posible actualizar el catálogo";
        }
    }

}
