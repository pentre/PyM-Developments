/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pentre
 */
public class Employee {
    private String id_;
    private String name_;
    private String branch_;
    private String charge_;
    private float salary_;
    private String phoneNumber_;
    private boolean active_;
    
    public Employee(String id, String name, String branch, String charge, float salary, String phoneNumber) {
        id_ = id;
        name_ = name;
        branch_ = branch;
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
    
    public String getBranch() {
        return branch_;
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
    
    public void setBranch(String branch) {
        branch_ = branch;
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
            PreparedStatement stmt = database.getStatement("SELECT * FROM employee WHERE id = ? AND active=true");
            stmt.setString(1, id);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
                return false;
            }
            
            id_ = rs.getString("id");
            name_ = rs.getString("name");
            branch_ = rs.getString("branch");
            charge_ = rs.getString("charge");
            salary_ = rs.getFloat("salary");
            phoneNumber_ = rs.getString("phone_number");
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
    

    public List<Map<String, String>> multipleSearch(Database database, String active) {
        try {            
            String query = "SELECT * FROM employee WHERE";
                      
            if(!"".equals(id_)) {
                query += String.format(" id = '%s' AND", id_);
            }
            if(!"".equals(name_)) {
                query += String.format(" name = '%s' AND", name_);
            }
            if(!"".equals(branch_)) {
                query += String.format(" branch = '%s' AND", branch_);
            }
            if("".equals(charge_)) {
                query += String.format(" charge != 'admin' AND");
            }else{                
                query += String.format(" charge = '%s' AND", charge_);
            }
            
            switch (active) {
                case "Activo":
                    query += String.format(" active = true");
                    break;
                case "Inactivo":
                    query += String.format(" active = false");
                    break;
                default:
                    query += String.format(" (active = true OR active = false)");
                    break;
            }
            
            PreparedStatement stmt = database.getStatement(query.replace(";",""));
            
            ResultSet rs = stmt.executeQuery();
            
            List<Map<String, String>> results = new ArrayList<>();  
         
            while(rs.next()) {
                Map<String,String> result = new HashMap<>();
                result.put("id", rs.getString("id"));
                result.put("name", rs.getString("name"));
                result.put("branch", rs.getString("branch"));
                result.put("charge", rs.getString("charge"));
                result.put("salary", rs.getString("salary"));
                result.put("phone_number", rs.getString("phone_number"));
                if (rs.getBoolean("active")){
                    result.put("active", "Activo");
                } else{
                    result.put("active", "Inactivo");
                }
                results.add(result);
            }
            return results;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String update(Database database){
        try{
            PreparedStatement stmt = database.getStatement("UPDATE employee SET name = ?, branch = ?,charge = ?, salary = ? , phone_number = ? WHERE id = ? AND active = true");

            stmt.setString(1,name_);
            stmt.setString(2, branch_);
            stmt.setString(3,charge_);
            stmt.setFloat(4,salary_);
            stmt.setString(5,phoneNumber_);
            stmt.setString(6, id_);
            
            int result = stmt.executeUpdate();
            
            if(result == 0) {
                return "Error: empleado no encontrado";
            } 
            return "Empleado modificado correctamente";
        }catch(SQLException e) {
            e.printStackTrace();
            return "Error: no fue posible modificar el empleado";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: no fue posible modificar el empleado";
        }
    }

    public String store(Database database){
        try{   
            PreparedStatement stmt = database.getStatement("INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1,id_);
            stmt.setString(2,name_);
            stmt.setString(3, branch_);
            stmt.setString(4,charge_);
            stmt.setFloat(5,salary_);
            stmt.setString(6,phoneNumber_);
            stmt.setBoolean(7, active_);
            
            if(stmt.executeUpdate()==1){
                return "El empleado fue adicionado exitosamente. ";
            }
            
            return "Error: el empleado no pudo ser adicionado";
        }catch(SQLException e){
            if (e.getSQLState().equals("23505")){
                return "Ya existe un empleado con esta cédula.";
            }
            return "Error: el empleado no pudo ser adicionado";
        }catch(Exception e){
            e.printStackTrace();
            return "Error: el empleado no pudo ser adicionado";
        }
    }
    
    public String deleteEmployee(Database database, String id){
        PreparedStatement stmt;
        try {
            if ("Gerente".equals(charge_)){
                stmt = database.getStatement("UPDATE employee SET active = false WHERE id = ? AND active != false AND charge != 'Gerente'");
                stmt.setString(1, id);
            }else{
                stmt = database.getStatement("UPDATE employee SET active = false WHERE id = ? AND active != false");
                stmt.setString(1, id);
            }
            
            int result = stmt.executeUpdate();
            
            if(result == 0) {
                return "Error: usuario no encontrado";
            }
            
            return "Usuario eliminado correctamente";
        }  catch(SQLException e) {
            e.printStackTrace();
            return "Error: un problema en el servidor impidió el proceso";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: el empleado no pudo ser eliminado";
        }
    }
    
    public boolean isInBranch(Database database) {
        try{   
            PreparedStatement stmt = database.getStatement("SELECT  COUNT(*) FROM employee WHERE id != ? branch = ? AND charge = ? AND active = true");
            
            stmt.setString(1, id_);
            stmt.setString(2, branch_);
            stmt.setString(3, charge_);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.getInt(1) == 0) {
                return false;
            }
            
            return true;
        }catch(SQLException e){
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
