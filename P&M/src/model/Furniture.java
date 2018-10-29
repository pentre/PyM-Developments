/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Furniture {

    private String id;
    private float price;
    private String material;
    private float weight;
    private String color;

    public Furniture(String id, float price, String material, float weight, String color) {
        this.id = id;
        this.price = price;
        this.material = material;
        this.weight = weight;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String store(Database database) {
        try {

            PreparedStatement stmt = database.getStatement("INSERT INTO furniture VALUES(?, ?, ?, ?, ?)");
            stmt.setString(1, this.id);
            stmt.setFloat(2, this.price);
            stmt.setString(3, this.material);
            stmt.setFloat(4, this.weight);
            stmt.setString(5, this.color);

            if (stmt.executeUpdate() == 1) {
                System.out.println("ingreso al if");
                return "El mueble ha sido agregado con exito";
            }

            System.out.println("No ingreso al if");
            return "Error: El mueble no pudo ser adicionado";

        } catch (SQLException e) {
            if (e.getSQLState().equals("23505")) {
                return "Error: ya existe un mueble con el ID ingresado";
            }
        }
        return "asda";
    }
}
