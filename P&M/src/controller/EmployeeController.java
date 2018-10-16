/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;

/**
 *
 * @author lalil
 */
public interface EmployeeController {
    default public String storeEmployee(String id, String name,String charge, float salary, String phoneNumber){
        Employee employee = new Employee(id,name,charge,salary,phoneNumber);
        return employee.store(Controller.database);
    }
    default public String delete(String employeeType, String idTarget){
        Employee employee = new Employee("", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, idTarget);
    }
}
