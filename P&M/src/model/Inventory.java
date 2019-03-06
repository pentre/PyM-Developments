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
import java.util.List;

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
            PreparedStatement stmt = database.getStatement("SELECT * FROM inventory WHERE furniture_id = ? AND branch = ?");
            stmt.setInt(1, id);
            stmt.setString(2, branch);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
            
            id_ = rs.getInt("furniture_id");
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
    
    public String store(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("INSERT INTO inventory (furniture_id, quantity, branch) VALUES(?, ?, ?)");

            stmt.setInt(1, id_);
            stmt.setInt(2, quantity_);
            stmt.setString(3, branch_);
            if (stmt.executeUpdate() == 1) {
                return "El mueble fue adicionado exitosamente al inventario.";
            }

            return "Error: el mueble no pudo ser adicionado.";
        } catch (SQLException e) {
            return "Error: el mueble no pudo ser adicionado.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: el mueble no pudo ser adicionado.";
        }

    }
    
    public int increase(Database database, int quantity) {
        try {
            quantity_ += quantity;
            
            PreparedStatement stmt = database.getStatement("UPDATE inventory SET quantity = ? WHERE furniture_id = ? AND branch = ?;");
            stmt.setInt(1, quantity_);
            stmt.setInt(2, id_);
            stmt.setString(3, branch_);
            
            int result = stmt.executeUpdate();
            
            if(result == 0) {
                return -1;
            }
            
            return result;
        }
        catch(SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public int decrease(Database database, int quantity) {
        try {
            int missingQuantity = 0;
            PreparedStatement stmt = null;
            if (quantity >= quantity_) {
                missingQuantity = quantity - quantity_;
                stmt = database.getStatement("DELETE FROM inventory WHERE furniture_id = ? AND branch = ?;");
                stmt.setInt(1, id_);
                stmt.setString(2, branch_);
            } else {
                stmt = database.getStatement("UPDATE inventory SET quantity = ? WHERE furniture_id = ? AND branch = ?;");
                stmt.setInt(1, quantity_-quantity);
                stmt.setInt(2, id_);
                stmt.setString(3, branch_);
            }
            
            int result = stmt.executeUpdate();
            
            if(result == 0) {
                missingQuantity = -1;
            }
            
            return missingQuantity;
        }
        catch(SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public List<Inventory> list(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM inventory WHERE branch = ?");
            stmt.setString(1, branch_);
            
            List<Inventory> list = new ArrayList<>();
            
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Inventory inventory = new Inventory(0, 0, "");
                inventory.setId(rs.getInt("furniture_id"));
                inventory.setQuantity(rs.getInt("quantity"));
                inventory.setBranch(rs.getString("branch"));
                              
                list.add(inventory);
            }
           
            return list;
        } catch(SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        } catch(Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
