/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jose
 */
public interface EmployeeController {
       default public String delete(String employeeType, String idTarget){
        Employee employee = new Employee("", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, idTarget);
    }
       
    default public List<Map<String, String>> searchEmployees(String id, String name, String charge) {
       Employee employee = new Employee(id, name, charge, 0, "");
       return employee.multipleSearch(Controller.database);
    }       
}
