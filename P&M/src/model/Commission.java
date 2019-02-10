/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mily
 */
//alias orden de trabajo 
public class Commission {

    private String id_;
    private Boolean status_;
    private int furniture_;
    private int quantity_;
    private String branch_;

    public Commission(Boolean status, int furniture, int quantity, String branch) {
        status_ = status;
        furniture_ = furniture;
        quantity_ = quantity;
        branch_ = branch;
    }
    
    public String getId() {
        return id_;
    }

    public void setId(String id) {
        id_ = id;
    }

    public int getQuantity() {
        return quantity_;
    }

    public void setQuantity(int quantity) {
        quantity_ = quantity;
    }

    public String getBranch() {
        return branch_;
    }

    public void setBranch(String branch) {
        branch_ = branch;
    }

    public Boolean getStatus() {
        return status_;
    }

    public void setStatus(Boolean status) {
        status_ = status;
    }

    public int getFurniture() {
        return furniture_;
    }

    public void setFurniture(int furniture) {
        furniture_ = furniture;
    }

    public String store(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("INSERT INTO commission (status, furniture_id, quantity, branch) VALUES(?, ?, ?, ?)");

            stmt.setBoolean(1, status_);
            stmt.setInt(2, furniture_);
            stmt.setInt(3, quantity_);
            stmt.setString(4, branch_);
            if (stmt.executeUpdate() == 1) {
                return "La orden de trabajo fue adicionada exitosamente.";
            }

            return "Error: la orden de trabajo no pudo ser adicionada.";
        } catch (SQLException e) {
            return "Error: la orden de trabajo no pudo ser adicionada";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: la orden de trabajo no pudo ser adicionada";
        }

    }

    public boolean search(Database database, String orderNumber) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM commission WHERE order_id = ? AND status = false;");
            stmt.setInt(1, Integer.parseInt(orderNumber));

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return false;
            }

            id_ = Integer.toString(rs.getInt("order_id"));
            quantity_ = rs.getInt("quantity");
            branch_ = rs.getString("branch");
            status_ = rs.getBoolean("status");
            furniture_ = rs.getInt("furniture_id");

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public String update(Database database){
        try {
            PreparedStatement stmt = database.getStatement("UPDATE commission SET status = ? WHERE order_id = ?");
            stmt.setBoolean(1, status_);
            stmt.setInt(2, Integer.parseInt(id_));
            
            int result = stmt.executeUpdate();
            
            if(result == 0){
                return "Error: no fue posible actualizar la orden";
            }
            
            return "Orden actualizada correctamente";
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Error: no fue posible actualizar la orden";
        }
    }

    public List<Map<String, String>> listCommissions(Database database, boolean completed) {
        try {

            PreparedStatement stmt = database.getStatement("SELECT * FROM commission WHERE status=" + String.valueOf(completed));

            ResultSet rs = stmt.executeQuery();

            List<Map<String, String>> results = new ArrayList<>();
            while (rs.next()) {
                Map<String, String> result = new HashMap<>();
                result.put("order_id", String.valueOf(rs.getInt("order_id")));
                result.put("furniture_id", rs.getString("furniture_id"));
                result.put("quantity", rs.getString("quantity"));
                result.put("branch", rs.getString("branch"));

                PreparedStatement stmtFurnitureName = database.getStatement("SELECT * FROM catalog WHERE furniture_id=" + rs.getString("furniture_id"));

                ResultSet rsFurnitureName = stmtFurnitureName.executeQuery();

                if (!rsFurnitureName.next()) {
                    return results;
                }
                result.put("name", rsFurnitureName.getString("name"));

                results.add(result);
            }

            return results;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
