/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
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
    
    default public String sale(Map<Integer, Integer> products) {
        Sale sale = new Sale(Controller.employee.getId(), Controller.employee.getBranch());
        String saleResult = sale.store(Controller.database);
        if (saleResult.contains("Error")) {
            return saleResult;
        }
        
        Inventory inventory = new Inventory(0, 0, "");
        Furniture furniture = new Furniture(0, "", 0, "", 0, "");
        for (Map.Entry<Integer, Integer> product : products.entrySet()) {
            boolean ok = inventory.search(Controller.database, product.getKey(), "Sede0");//Controller.employee.getBranch());
            if (!ok) {
                return "Error: no se pudo realizar la venta";
            }
            
            furniture.setId(product.getKey());
            ok = furniture.searchActive(Controller.database);
            if (!ok) {
                return "Error: no se pudo realizar la venta";
            }
            
            int missingQuantity = inventory.decrease(Controller.database, product.getValue());
            if (missingQuantity == -1) {
                return "Error: no se pudo realizar la venta";
            }
            
            FurnitureSold sold = new FurnitureSold(sale.getId(), product.getKey(), product.getValue() - missingQuantity, furniture.getPrice());
            sold.store(Controller.database);
            
            if (missingQuantity == 0) {
                continue;
            }
            Commission commission = new Commission(false, product.getKey(), missingQuantity, "Sede0");//Controller.employee.getBranch());
            String err = commission.store(Controller.database);
            if (err.contains("Error")) {
                return "Error: no se pudieron crear las órdenes de trabajo";
            }
        }
        
        return saleResult;
    }
    
    default public Map<String, Integer> getGeneralReportByDay(LocalDate startDate, LocalDate endDate) {
        Sale sale = new Sale("", "");
        return sale.getGeneralReportByDay(Controller.database, startDate, endDate);
    }

    default public List<Map<String, String>> getSellersReport(LocalDate initialDate, LocalDate endDate, String branch){
        Sale sale = new Sale("","");
        return sale.getSellersReport(Controller.database, initialDate, endDate, branch);
    }    
}
