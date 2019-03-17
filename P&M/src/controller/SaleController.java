/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Commission;
import model.Inventory;
import model.Sale;
import model.FurnitureSold;
import model.Furniture;

/**
 *
 * @author pentre
 */
public interface SaleController {
    
    default public List<Integer> sale(Map<Integer, Integer> products) {
        Sale sale = new Sale(Controller.employee.getId(), Controller.employee.getBranch());
        String saleResult = sale.store(Controller.database);
        if (saleResult.contains("Error")) {
            return null;
        }
        
        Inventory inventory = new Inventory(0, 0, "");
        Furniture furniture = new Furniture(0, "", 0, "", 0, "");
        List<Integer> results = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> product : products.entrySet()) {
            boolean ok = inventory.search(Controller.database, product.getKey(), Controller.employee.getBranch());
            if (!ok) {
                return null;
            }
            
            furniture.setId(product.getKey());
            ok = furniture.search(Controller.database, product.getKey());
            if (!ok) {
                return null;
            }
            
            int missingQuantity = inventory.decrease(Controller.database, product.getValue());
            if (missingQuantity == -1) {
                return null;
            }
            
            FurnitureSold sold = new FurnitureSold(sale.getId(), product.getKey(), product.getValue() - missingQuantity, furniture.getPrice());
            sold.store(Controller.database);
            
            if (!furniture.isActive() || missingQuantity == 0) {
                continue;
            }
            Commission commission = new Commission(false, product.getKey(), missingQuantity, Controller.employee.getBranch());
            String err = commission.store(Controller.database);
            if (err.contains("Error")) {
                return null;
            }
            
            results.add(product.getKey());
        }
        
        return results;
    }
    
    default public Map<String, Integer> getGeneralReportByDay(LocalDate startDate, LocalDate endDate) {
        Sale sale = new Sale("", "");
        return sale.getGeneralReportByDay(Controller.database, startDate, endDate);
    }
}
