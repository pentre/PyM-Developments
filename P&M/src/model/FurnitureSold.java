/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pentre
 */
public class FurnitureSold {
    
    private String saleID_;
    private int furnitureID_;
    private int quantity_;
    private float value_;
    
    public FurnitureSold(String saleID, int furnitureID, int quantity, float value) {
        saleID_ = saleID;
        furnitureID_ = furnitureID;
        quantity_ = quantity;
        value_ = value;
    }

    public String getSaleID() {
        return saleID_;
    }

    public int getFurnitureID() {
        return furnitureID_;
    }
    
    public int getQuantity() {
        return quantity_;
    }
    
    public float getValue() {
        return value_;
    }

    public void setSaleID(String saleID) {
        saleID_ = saleID;
    }

    public void setFurnitureID(int furnitureID) {
        furnitureID_ = furnitureID;
    }

    public void setQuantity(int quantity) {
        quantity_ = quantity;
    }
    
    public void setValue(float value) {
        value_ = value;
    }
    
    public String store(Database database) {
        try {            
            PreparedStatement stmt = database.getStatement("INSERT INTO furniture_sold (sale_id, furniture_id, quantity, value) VALUES(?, ?, ?, ?)");

            stmt.setString(1, saleID_);
            stmt.setInt(2, furnitureID_);
            stmt.setInt(3, quantity_);
            stmt.setFloat(4, value_);
            if (stmt.executeUpdate() == 1) {
                return "Venta de producto registrada.";
            }

            return "Error: no se pudo asociar el producto a la venta.";
        } catch (SQLException e) {
            return "Error: no se pudo asociar el producto a la venta.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: no se pudo asociar el producto a la venta.";
        }
    }
}
