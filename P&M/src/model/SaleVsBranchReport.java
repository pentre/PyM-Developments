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
public class SaleVsBranchReport {
    private LocalDate initialDate_;
    private LocalDate endDate_;

    public SaleVsBranchReport(LocalDate initialDate, LocalDate endDate) {
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
            Logger.getLogger(SaleVsBranchReport.class.getName()).log(Level.SEVERE, null, ex);
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
