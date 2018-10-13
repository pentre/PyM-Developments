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
    
    public Branch(String name, String city, String address, String managerId) {
        name_ = name;
        city_ = city;
        address_ = address;
        managerId_ = managerId;
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
    
    public String Store(Database database) {
        try {
            Employee employee = new Employee("","","",0,"");
            if(employee.getCharge() != "Gerente") {
                return "No existe este empleado";
            }
            
            PreparedStatement stmt = database.getStatement("INSERT INTO branch VALUES (?, ?, ?, ?)");
            stmt.setString(1, name_);
            stmt.setString(2, city_);
            stmt.setString(3, address_);
            stmt.setString(4, managerId_);
            
            if(stmt.executeUpdate()==1){
                return "Sede adicionada exitosamente";
            }
            
            return "Error: Error al adicionar sede";
        } catch(SQLException e) {
            e.printStackTrace();
            return "Error: Esta sede ya existe";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: Error al adicionar sede";
        }
    }
}
