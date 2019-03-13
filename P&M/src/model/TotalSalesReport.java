/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class TotalSalesReport {
    private LocalDate initialDate_;
    private LocalDate endDate_;

    public TotalSalesReport(LocalDate initialDate, LocalDate endDate) {
        initialDate_ = initialDate;
        endDate_ = endDate;
    }
    
    
    public Map<String, List> getSalesInfo(Database database){
        try {
            Date initialDate= Date.valueOf(initialDate_);
            Date endDate= Date.valueOf(endDate_);
            PreparedStatement stmt = database.getStatement("SELECT sum(value), branch FROM sale WHERE date BETWEEN ? AND ? GROUP BY branch ORDER BY branch ASC;");
            stmt.setDate(1, initialDate);
            stmt.setDate(2, endDate);
            ResultSet rs = stmt.executeQuery();
            
            return getDataArray(rs);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TotalSalesReport.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Map<String, String>> getFurnitureSalesInfo(Database database, String branch){
        try {
            Date initialDate= Date.valueOf(initialDate_);
            Date endDate= Date.valueOf(endDate_);
            
            PreparedStatement stmt;
            if(branch.compareTo("Todas las sedes") == 0){
                stmt = database.getStatement(
                        "SELECT (sum_quantity.furniture_id || ' ' || catalog.name) AS id_name_furniture, sum_quantity.total_quantity " +
                        "FROM catalog INNER JOIN (" +
                            "SELECT furniture_sold.furniture_id, SUM(furniture_sold.quantity) AS total_quantity " +
                            "FROM furniture_sold INNER JOIN sale ON furniture_sold.sale_id = sale.sale_id " +
                            "WHERE sale.date BETWEEN ? AND ? " +
                            "GROUP BY furniture_sold.furniture_id) AS sum_quantity ON catalog.furniture_id = sum_quantity.furniture_id");
                stmt.setDate(1, initialDate);
                stmt.setDate(2, endDate);
            }
            else{ stmt = database.getStatement(
                    "SELECT (sum_quantity.furniture_id || ' ' || catalog.name) AS id_name_furniture, sum_quantity.total_quantity " +
                    "FROM catalog INNER JOIN ( " +
                        "SELECT furniture_sold.furniture_id, SUM(furniture_sold.quantity) AS total_quantity " +
                        "FROM furniture_sold INNER JOIN sale ON furniture_sold.sale_id = sale.sale_id " +
                        "WHERE sale.branch = ? AND sale.date BETWEEN ? AND ? " +
                        "GROUP BY furniture_sold.furniture_id) AS sum_quantity ON catalog.furniture_id = sum_quantity.furniture_id");
                stmt.setString(1, branch);
                stmt.setDate(2, initialDate);
                stmt.setDate(3, endDate);
            }
            
            
            ResultSet rs = stmt.executeQuery();
            
            List<Map<String, String>> results = new ArrayList<>();  
            
            while(rs.next()) {
                Map<String,String> result = new HashMap<>();
                result.put("id_name_furniture", rs.getString("id_name_furniture"));
                result.put("total_quantity", rs.getString("total_quantity"));
                
                results.add(result);
            }
            
            return results;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TotalSalesReport.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private Map<String, List> getDataArray(ResultSet rs) throws SQLException{
        List<String> branches = new ArrayList<String>();
        List<Double> values = new ArrayList<Double>();
        Map<String, List> data = new HashMap();
       
        while(rs.next()){
            String branch = rs.getString("branch");
            double value = rs.getDouble("sum");
            values.add(value);
            branches.add(branch);
        }
        
        data.put("branches",branches);
        data.put("values", values);
        return data;
    }
}
