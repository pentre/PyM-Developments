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
 * @author pentre
 */
public class Inventory {
    private int id_;
    private int quantity_;
    private String branch_;

    public Inventory(int id, int quantity, String branch) {
        id_ = id;
        quantity_ = quantity;
        branch_ = branch;
    }

    public int getId() {
        return id_;
    }

    public int getQuantity() {
        return quantity_;
    }

    public String getBranch() {
        return branch_;
    }

    public void setId(int id) {
        id_ = id;
    }

    public void setQuantity(int quantity) {
        quantity_ = quantity;
    }

    public void setBranch(String branch) {
        branch_ = branch;
    }

    public boolean search(Database database, int id, String branch) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM inventory WHERE id = ? AND bramch = ?");
            stmt.setString(1, Integer.toString(id));
            stmt.setString(2, branch);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
            
            id_ = rs.getInt("id");
            quantity_ = rs.getInt("quantity");
            branch_ = rs.getString("branch");
           
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
