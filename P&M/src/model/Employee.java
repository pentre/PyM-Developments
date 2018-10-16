/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.HashMap;

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
            name_ = rs.getString("name");
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
    
    public HashMap<String,String>[] multiSearch(Database database) {
        try {
            String query = "Select * FROM employee WHERE active = true";
            
            // CAMBIAR INYECCION DE CODIGO
            if(!"".equals(id_)) {
                query += String.format("AND id = '%s'", id_);
            }
            if(!"".equals(name_)) {
                query += String.format("AND name = '%s'", name_);
            }
            if(!"".equals(charge_)) {
                query += String.format("AND charge = '%s'", charge_);
            }
            
            PreparedStatement stmt = database.getStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            if(!rs.last()) {
                return null;
            }
            
            HashMap<String,String>[] results = new HashMap<String,String>[rs.getRow()];
            rs.beforeFirst();
            
            for(int i = 0; rs.next(); i++) {
                HashMap<String,String> result = new HashMap<String,String>();
                result.put("id", rs.getString("id"));
                result.put("name", rs.getString("name"));
                result.put("charge", rs.getString("charge"));
                result.put("salary", rs.getString("salary"));
                result.put("phone_number", rs.getString("phone_number"));
                results[i] = result;
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
                return "Error: Usuario no encontrado";
            }
            
            return "Usuario eliminado correctamente";
            
        }  catch(SQLException e) {
            e.printStackTrace();
            return "Error: Error del servidor";
        } catch(Exception e) {
            e.printStackTrace();
            return "Error: Error al eliminar usuario";
        }
    }
    
}
