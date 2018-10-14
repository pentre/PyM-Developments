/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author pentre
 */
public class Branch {
    private String name_;
    private String city_;
    private String address_;
    private String managerId_;
    private boolean active_;
    
    public Branch(String name, String city, String address, String managerId) {
        name_ = name;
        city_ = city;
        address_ = address;
        managerId_ = managerId;
        active_ = true;
    }

    public String getName() {
        return name_;
    }

    public String getCity() {
        return city_;
    }

    public String getAddress() {
        return address_;
    }

    public String getManagerId() {
        return managerId_;
    }
    
    public boolean isActive() {
        return active_;
    }

    public void setName(String name) {
        name_ = name;
    }

    public void setCity(String city) {
        city_ = city;
    }

    public void setAddress(String address) {
        address_ = address;
    }

    public void setManagerId(String managerId) {
        managerId_ = managerId;
    }
    
    public void setActive(boolean active) {
        active_ = active;
    }
    
    public String store(Database database) {
        try {
            Employee employee = new Employee("","","",0,"");
            employee.search(database, managerId_);
            if(!employee.getCharge().equals("Gerente") || !employee.isActive()) {
                return "No se encontró un gerente con esta id";
            }
            
            PreparedStatement stmt = database.getStatement("INSERT INTO branch VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, name_);
            stmt.setString(2, city_);
            stmt.setString(3, address_);
            stmt.setString(4, managerId_);
            stmt.setBoolean(5, active_);
            
            if(stmt.executeUpdate()==1){
                return "Sede adicionada exitosamente";
            }
            
            return "Error: Error al adicionar sede";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: Error al adicionar sede";
        }
    }
}
