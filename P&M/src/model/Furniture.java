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
 * @author Luis
 */
public class Furniture {

    private String id_;
    private float price_;
    private String material_;
    private float weight_;
    private String color_;

    public Furniture(float price, String material, float weight, String color) {
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

    public String store(Database database) {
        try {

            PreparedStatement stmt = database.getStatement("INSERT INTO furniture(price, material, weight, color) VALUES(?, ?, ?, ?)");
            stmt.setFloat(1, price_);
            stmt.setString(2, material_);
            stmt.setFloat(3, weight_);
            stmt.setString(4, color_);

            if (stmt.executeUpdate() == 1) {
                return "El mueble ha sido agregado con exito";
            }

            return "Error: el mueble no pudo ser adicionado";

        } catch (SQLException e) {
            return "Error: el mueble no pudo ser adicionado";

        }

    }
}
