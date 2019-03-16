/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByKey;
import java.util.UUID;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toMap;
import java.util.stream.IntStream;

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
    
    public Map<String, Integer> getGeneralReportByDay(Database database, LocalDate startDate, LocalDate endDate) {         
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate); 
        Map<String, Integer> dates = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toMap(f -> f.toString(), f -> 0, (e1, e2) -> e1, LinkedHashMap::new)); 
        
        try {            
            PreparedStatement stmt = database.getStatement("SELECT date, count(*) FROM sale WHERE date BETWEEN ? AND ? GROUP BY date");
            stmt.setDate(1, java.sql.Date.valueOf(startDate));
            stmt.setDate(2, java.sql.Date.valueOf(endDate));
            
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {                
                dates.put(rs.getDate("date").toString(), rs.getInt("count"));                
            }
            
            return dates;
            
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }    
    }
    
    public Map<String, Integer> getBranchReportByDay(Database database, LocalDate startDate, LocalDate endDate, String branch) {         
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate); 
        Map<String, Integer> dates = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toMap(f -> f.toString(), f -> 0, (e1, e2) -> e1, LinkedHashMap::new)); 
        
        try {            
            PreparedStatement stmt = database.getStatement("SELECT date, count(*) FROM sale WHERE date BETWEEN ? AND ? GROUP BY date");
            stmt.setDate(1, java.sql.Date.valueOf(startDate));
            stmt.setDate(2, java.sql.Date.valueOf(endDate));
            
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {                
                dates.put(rs.getDate("date").toString(), rs.getInt("count"));                
            }
            
            return dates;
            
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }    
    }
}
