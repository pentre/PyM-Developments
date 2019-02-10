/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Commission;
import model.Inventory;

/**
 *
 * @author mily
 */
public interface CommissionController {

    default public String createComission(boolean status, int furniture, int quantity, String branch) {
        Commission commission = new Commission(status, furniture, quantity, branch);
        return commission.store(Controller.database);
    }

    default public List<Map<String, String>> searchCommissions(boolean completed) {
        Commission commission = new Commission(true, 0, 0, "");
        return commission.listCommissions(Controller.database, completed);
    }

    default public Map<String, String> getCommissionInfo(String order_id) {
        Commission commission = new Commission(true, 0, 0, "");
        Map<String, String> commissionInfo = new HashMap<>();
        if (!commission.search(Controller.database, order_id)) {
            
            return null;

        } else {
            
            commissionInfo.put("order_id", commission.getId());
            commissionInfo.put("status", Boolean.toString(commission.getStatus()));
            commissionInfo.put("quantity", Integer.toString(commission.getQuantity()));
            commissionInfo.put("furniture_id", Integer.toString(commission.getFurniture()));
            commissionInfo.put("branch", commission.getBranch());
            return commissionInfo;

        }
    }

    public default String updateCommission(String order_id, boolean status) {
        Commission commission = new Commission(status, 0, 0, "");
        boolean ok = commission.search(Controller.database, order_id);
        if (!ok) {
            return "Error: no fue posible actualizar la orden";
        }
        commission.setStatus(status);
        
        String updateResult = commission.update(Controller.database);
        if (!status || updateResult.contains("Error")) {
            return updateResult;
        }
        
        Inventory inventory = new Inventory(0, 0, "");
        inventory.search(Controller.database, commission.getFurniture(), commission.getBranch());
        ok = inventory.search(Controller.database, commission.getFurniture(), commission.getBranch());
        if (ok) {
            inventory.increase(Controller.database, commission.getQuantity());
            return updateResult;
        }
        
        inventory.setId(commission.getFurniture());
        inventory.setBranch(commission.getBranch());
        inventory.setQuantity(commission.getQuantity());
        inventory.store(Controller.database);
        return updateResult;
    }
}
