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
 * @author mily
 */
//alias orden de trabajo 
public class Commission {
    private String id_;

    public String getId_() {
        return id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }
    private Boolean status_;
    private int furniture_;
    private int quantity_;
    private String branch_;
    
    public Commission(Boolean status, int furniture, int quantity, String branch){
        status_ = status;
        furniture_ = furniture;
        quantity_ = quantity;
        branch_ = branch;
    }

    public int getQuantity_() {
        return quantity_;
    }

    public void setQuantity_(int quantity_) {
        this.quantity_ = quantity_;
    }

    public String getBranch_() {
        return branch_;
    }

    public void setBranch_(String branch_) {
        this.branch_ = branch_;
    }

    public Boolean getStatus_() {
        return status_;
    }

    public void setStatus_(Boolean status_) {
        this.status_ = status_;
    }

    public int getFurniture_() {
        return furniture_;
    }

    public void setFurniture_(int furniture_) {
        this.furniture_ = furniture_;
    }
    
    public String store(Database database){
        try{   
            PreparedStatement stmt = database.getStatement("INSERT INTO commission (status, furniture_id, quantity, branch) VALUES(?, ?, ?, ?)");
            
            stmt.setBoolean(1,status_);
            stmt.setInt(2, furniture_);
            stmt.setInt(3, quantity_);
            stmt.setString(4, branch_);
            if(stmt.executeUpdate()==1){
                return "La orden de trabajo fue adicionada exitosamente.";
            }
            
            return "Error: la orden de trabajo no pudo ser adicionada.";
        }catch(SQLException e){
            return "Error: la orden de trabajo no pudo ser adicionada";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: la orden de trabajo no pudo ser adicionada";
        }
    }
    
}
