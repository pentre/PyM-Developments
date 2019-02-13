 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Database;
import model.Employee;

/**
 *
 * @author pentre
 */

public class Controller implements BranchController, UserController, EmployeeController, FurnitureController, CommissionController, InventoryController, SaleController {

    public static Database database;
    public static Employee employee;

    public Controller(){
        database = new Database();
    }
}
