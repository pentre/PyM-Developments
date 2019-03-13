/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import model.TotalSalesReport;

/**
 *
 * @author Luis
 */
public interface TotalSalesReportController {
    
    default public Map<String, List> getSalesInfo(LocalDate initialDate, LocalDate endDate){
        TotalSalesReport salesReport = new TotalSalesReport(initialDate, endDate);
        return salesReport.getSalesInfo(Controller.database);
    }
    
    default public List<Map<String, String>> getFurnitureSalesInfo(LocalDate initialDate, LocalDate endDate, String branch){
        TotalSalesReport salesReport = new TotalSalesReport(initialDate, endDate);
        return salesReport.getFurnitureSalesInfo(Controller.database, branch);
    }
    
}
