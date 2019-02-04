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
            
            commissionInfo.put("order_id", commission.getId_());
            commissionInfo.put("status", Boolean.toString(commission.getStatus_()));
            commissionInfo.put("quantity", Integer.toString(commission.getQuantity_()));
            commissionInfo.put("furniture", Integer.toString(commission.getFurniture_()));
            commissionInfo.put("branch", commission.getBranch_());
            return commissionInfo;

        }
    }

    public default String updateCommission(String order_id, boolean status) {
        Commission commission = new Commission(status, 0, 0, "");
        commission.setId_(order_id);
        return commission.update(Controller.database);
    }
}
