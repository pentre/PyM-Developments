/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Commission;

/**
 *
 * @author mily
 */
public interface CommissionController {
    default public String createComission(boolean status, int furniture, int quantity, String branch){
        Commission commission = new Commission(status,furniture,quantity,branch);
        return commission.store(Controller.database);
    }
}