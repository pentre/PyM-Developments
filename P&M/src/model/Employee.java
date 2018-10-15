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
    private boolean active_;
    
    public Employee(String id, String name, String charge, float salary, String phoneNumber) {
        id_ = id;
        name_ = name;
        charge_ = charge;
        salary_ = salary;
        phoneNumber_ = phoneNumber;
        active_ = true;
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
    
    public boolean isActive() {
        return active_;
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
    
    public void setActive(boolean active) {
        active_ = active;
    }
    
    public boolean search(Database database, String id) {
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
            active_ = rs.getBoolean("active");
            
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public String createEmployee(Database database, String password){
        try{
            PreparedStatement stmtEmployee = database.getStatement("INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?)");
            PreparedStatement stmtUser = database.getStatement("INSERT INTO login VALUES(?, ?, ?, ?)");
            
            stmtEmployee.setString(1,id_);
            stmtEmployee.setString(2,name_);
            stmtEmployee.setString(3,charge_);
            stmtEmployee.setFloat(4,salary_);
            stmtEmployee.setString(5,phoneNumber_);
            stmtEmployee.setBoolean(6, active_);
            
            stmtUser.setString(1,id_);
            stmtUser.setString(2,password);
            stmtUser.setString(3,charge_);
            stmtUser.setBoolean(4,active_);

            if((stmtEmployee.executeUpdate()==1) && (stmtUser.executeUpdate()==1)){
                return "El empleado fue adicionado exitosamente,\nEl usuario es su cedula.";
            }
            
            return "error!";
            
            
        }catch(SQLException e){
            e.printStackTrace();
            return "Error: error al crear el gerente.";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: error al crear el gerente.";
        }
    }
    
}
