/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;

/**
 *
 * @author jose
 */
public interface EmployeeController {
       default public String delete(String employeeType, String idTarget){
        Employee employee = new Employee("", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, idTarget);
    }
       
       default public String[] getInfo(String id){
           Employee employee = new Employee("", "", "", 0, "");
           return employee.getInfoEmployee(Controller.database,id);
       }
       
       default public String update(String id, String name, String charge, Float salary, String phoneNumber){
           Employee employee = new Employee(id,name,charge,salary,phoneNumber);
           return employee.updateInfoEmployee(Controller.database);
       }
}
