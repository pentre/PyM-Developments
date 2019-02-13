/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Inventory;
import model.Commission;
import model.Furniture;

/**
 *
 * @author pentre
 */
public interface InventoryController {
    
    default public List<Map<String, Float>> getSaleInfo(Integer[] ids) {
        Inventory inventory = new Inventory(0, 0, "");
        Furniture furniture = new Furniture(0, "", 0, "", 0, "");
        List<Map<String, Float>> results = new ArrayList<>();  
        
        for (int id:ids) {
            boolean ok = inventory.search(Controller.database, id, "Sede0");//Controller.employee.getBranch());
            if (!ok) {
                continue;
            }
            
            furniture.setId(id);
            ok = furniture.searchActive(Controller.database);
            if (!ok) {
                continue;
            }
            
            Map<String, Float> result = new HashMap<>();
            result.put("id", (float)inventory.getId());
            result.put("quantity", (float)inventory.getQuantity());
            result.put("price", furniture.getPrice());
            results.add(result);
        }
        return results;
    }
       
    default public String[] listInventory() {
        Inventory inventory = new Inventory(0, 0, "Sede0");//Controller.employee.getBranch());
        List<Inventory> list = inventory.list(Controller.database);
        
        String [] results = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            results[i] = Integer.toString(list.get(i).getId());
        }
        return results;
    }
}
