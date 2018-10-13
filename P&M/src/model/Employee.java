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
public class Employee {
    private String id_;
    private String name_;
    private String charge_;
    private float salary_;
    private String phoneNumber_;
    
    public Employee(String id, String name, String charge, float salary, String phoneNumber) {
        id_ = id;
        name_ = name;
        charge_ = charge;
        salary_ = salary;
        phoneNumber_ = phoneNumber;
    }

    public String getId() {
        return id_;
    }

    public String getName() {
        return name_;
    }

    public String getCharge() {
        return charge_;
    }

    public float getSalary() {
        return salary_;
    }

    public String getPhoneNumber() {
        return phoneNumber_;
    }

    public void setId(String id) {
        id_ = id;
    }

    public void setName(String name) {
        name_ = name;
    }

    public void setCharge(String charge) {
        charge_ = charge;
    }

    public void setSalary(float salary) {
        salary_ = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber_ = phoneNumber;
    }
    
    public boolean Search(Database database, String id) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM employee WHERE id = ?");
            stmt.setString(1, id);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                return false;
            }
            
            id_ = rs.getString("id");
            name_ = rs.getString("name");;
            charge_ = rs.getString("charge");;
            salary_ = rs.getFloat("salary");
            phoneNumber_ = rs.getString("phone_number");;
            
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