/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import model.SaleVsBranchReport;

/**
 *
 * @author Luis
 */
public interface SaleVsBranchReportController {
    
    default public Map<String, List> getSalesInfo(LocalDate initialDate, LocalDate endDate){
        SaleVsBranchReport salesReport = new SaleVsBranchReport(initialDate, endDate);
        return salesReport.getSalesInfo(Controller.database);
    }
}
