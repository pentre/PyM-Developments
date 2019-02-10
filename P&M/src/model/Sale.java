/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author pentre
 */
public class Sale {
    
    private String id_;
    private String branch_;
    private String employee_;
    private String date_;
    
    public Sale(String branch, String employee) {
        branch_ = branch;
        employee_ = employee;
    }

    public String getId() {
        return id_;
    }
    
    public String getBranch() {
        return branch_;
    }
    
    public String getEmployee() {
        return employee_;
    }

    public String getDate() {
        return date_;
    }
    
    public void setId(String id) {
        id_ = id;
    }
    
    public void setBranch(String branch) {
        branch_ = branch;
    }

    public void setEmployee(String employee) {
        employee_ = employee;
    }

    public void setDate(String date) {
        date_ = date;
    }
    
    public void generateID() {
        id_ = UUID.randomUUID().toString();
    }
    
    public String store(Database database) {
        try {
            if (id_ == null || id_.equals("")) {
                this.generateID();
            }
            Date date = Date.valueOf(LocalDate.now());
            
            PreparedStatement stmt = database.getStatement("INSERT INTO sale (sale_id, branch, employee, date) VALUES(?, ?, ?, ?)");

            stmt.setString(1, id_);
            stmt.setString(2, branch_);
            stmt.setString(3, employee_);
            stmt.setDate(4, date);
            if (stmt.executeUpdate() == 1) {
                return "Venta registrada.";
            }

            return "Error: no se pudo registrar la venta";
        } catch (SQLException e) {
            return "Error: no se pudo registrar la venta";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: no se pudo registrar la venta";
        }
    }
}
