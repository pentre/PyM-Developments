/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import model.Inventory
import java.util.List;
import java.util.Map;
import model.Furniture;

/**
 *
 * @author pentre
 */
public interface InventoryController {
    
    default public List<Map<String, Float>> getSaleInfo(int[] ids, String branch) {
        Inventory inventory = new Inventory(0, 0, "");
        Furniture furniture = new Furniture(0, "", 0, "", 0, "");
        List<Map<String, Float>> results = new ArrayList<>();  
        
        for (int id:ids) {
            boolean ok = inventory.search(Controller.database, id, branch);
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
}
