/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author lalil
 */

public interface EmployeeController {
  
    default public String deleteEmployee(String employeeType, String targetID){
        Employee employee = new Employee("", "", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, targetID);
    }
       
    default public Map <String, String> getEmployeeInfo (String id){
        Employee employee = new Employee("", "", "", "", 0, "");
        Map <String, String>listEmployee = new HashMap<>();
        
        if(!employee.search(Controller.database, id)){
            return listEmployee;
        }
  
        listEmployee.put("name", employee.getName());
        listEmployee.put("branch", employee.getBranch());
        listEmployee.put("charge", employee.getCharge());
        listEmployee.put("phoneNumber", employee.getPhoneNumber());  
        String salary = Float.toString(employee.getSalary());
        listEmployee.put("salary", salary);      
        return listEmployee;
    }
       
    default public String updateEmployee(String id, String name, String branch, String charge, Float salary, String phoneNumber, String userType){
        Employee employee = new Employee(id, name, branch, charge, salary, phoneNumber);
        
        if(charge.equals("Gerente") && employee.isInBranch(Controller.database)) {
            return "Error: esta sede ya tiene un gerente";
        }
        
        Map <String, String>listEmployee = getEmployeeInfo (id);
        
        if (userType.equals("Gerente") && listEmployee.get("charge").equals("Gerente")){
                return "Error: un gerente no puede modificar un gerente.";
        }
        
        return employee.update(Controller.database);
    }
  
    default public String createEmployee(String id, String name, String branch, String charge, float salary, String phoneNumber){
        Employee employee = new Employee(id, name, branch, charge, salary, phoneNumber);
        
        if(charge.equals("Gerente") && employee.isInBranch(Controller.database)) {
            return "Error: esta sede ya tiene un gerente";
        }
        
        return employee.store(Controller.database);
    }
       
    default public List<Map<String, String>> searchEmployees(String id, String name, String branch, String charge, String active) {
       Employee employee = new Employee(id, name, branch, charge, 0, "");
       return employee.multipleSearch(Controller.database, active);
    }       
}
