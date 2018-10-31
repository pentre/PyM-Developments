/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author lalil
 */
public class Quote {
    private String id_;
   private String idFurniture_;
   private int quantity_;
   private String idClient_;
   private String phoneNumberClient_;
   private String branch_;
   private java.util.Date date_;
   
    public Quote(String idFurniture, int quantity, String idClient, String phoneNumberClient, String branch, java.util.Date date){
       id_ = "0";
       idFurniture_ = idFurniture;
       quantity_ = quantity;
       idClient_ = idClient;
       phoneNumberClient_ = phoneNumberClient;
       branch_ = branch;
       date_ = date;
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

    public String getIdClient_() {
        return idClient_;
    }

    public void setIdClient_(String idClient_) {
        this.idClient_ = idClient_;
    }

    public String getPhoneNumberClient_() {
        return phoneNumberClient_;
    }

    public void setPhoneNumberClient_(String phoneNumberClient_) {
        this.phoneNumberClient_ = phoneNumberClient_;
    }

    public String getBranch_() {
        return branch_;
    }

    public void setBranch_(String branch_) {
        this.branch_ = branch_;
    }

    public Date getDate_() {
        return date_;
    }

    public void setDate_(Date date_) {
        this.date_ = date_;
    }
    
    public String store(Database database){
        try{
            PreparedStatement stmt = database.getStatement("INSERT INTO quote (furniture_id,quantity,client_id,client_phone,date,branch) VALUES(?, ?, ?, ?, ?, ?)");
            java.sql.Date sqlDate = new java.sql.Date(date_.getTime());
            stmt.setString(1,idFurniture_);
            stmt.setInt(2,quantity_);
            stmt.setString(3, idClient_);
            stmt.setString(4,phoneNumberClient_);
            stmt.setDate(5,sqlDate);
            stmt.setString(6,branch_);
            
            if(stmt.executeUpdate()==1){
                return "La cotización fue adicionada exitosamente. ";
            }
            
            return "Error: la cotización no pudo ser adicionado";
        }catch(SQLException e){
            if (e.getSQLState().equals("23505")){
                return "Ya existe una cotización con esta id.";
            }
            return "Error: la cotización no pudo ser adicionado";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: la cotización no pudo ser adicionado";
        }
    }
    
}
