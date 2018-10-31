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
 * @author lalil
 */
public class Commission {
    private String id_;
    private String idFurniture_;
    private int quantity_;
    private boolean status_;
    
    public Commission(String idFurniture, int quantity, boolean status){
        id_ = "0";
        idFurniture_ = idFurniture;
        quantity_ = quantity;
        status_ = status;
    }

    public String getId_() {
        return id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getIdFurniture_() {
        return idFurniture_;
    }

    public void setIdFurniture_(String idFurniture_) {
        this.idFurniture_ = idFurniture_;
    }

    public int getQuantity_() {
        return quantity_;
    }

    public void setQuantity_(int quantity_) {
        this.quantity_ = quantity_;
    }

    public boolean isStatus_() {
        return status_;
    }

    public void setStatus_(boolean status_) {
        this.status_ = status_;
    }
    
    public String store(Database database){
        try{
            PreparedStatement stmt = database.getStatement("INSERT INTO commission (furniture_id,quantity,status) VALUES(?, ?, ?)");
            stmt.setString(1,idFurniture_);
            stmt.setInt(2,quantity_);
            stmt.setBoolean(3, status_);
            
            if(stmt.executeUpdate()==1){
                return "\nLa orden de trabajo fue adicionada exitosamente.";
            }
            
            return "Error: la orden de trabajo no pudo ser adicionada1";
        }catch(SQLException e){
            if (e.getSQLState().equals("23505")){
                return "Ya existe una cotización con esta id.";
            }
            return "Error: la orden de trabajo no pudo ser adicionada2";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: la orden de trabajo no pudo ser adicionada3";
        }
    }
}
