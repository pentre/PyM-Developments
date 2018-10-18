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
  
    default public String deleteEmployee(String employeeType, String TargetID){
        Employee employee = new Employee("", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, TargetID);
    }
       
    default public Map <String, String> getEmployeeInfo (String id){
        Employee employee = new Employee("", "", "", 0, "");
        Map <String, String>listEmployee = new HashMap<>();
        
        if(!employee.search(Controller.database, id)){
            return listEmployee;
        }
  
        listEmployee.put("name", employee.getName());
        listEmployee.put("charge", employee.getCharge());
        listEmployee.put("phoneNumber", employee.getPhoneNumber());  
        String salary = Float.toString(employee.getSalary());
        listEmployee.put("salary", salary);      
        return listEmployee;
    }
       
    default public String updateEmployee(String id, String name, String charge, Float salary, String phoneNumber, String userType){
        Employee employee = new Employee(id,name,charge,salary,phoneNumber);
        Map <String, String>listEmployee = getEmployeeInfo (id);
        
        if (userType.equals("Gerente") && listEmployee.get("charge").equals("Gerente")){
                return "Error: Un gerente no puede modificar un gerente.";
        }
        
        return employee.update(Controller.database);
    }
  
    default public String createEmployee(String id, String name,String charge, float salary, String phoneNumber){
        Employee employee = new Employee(id,name,charge,salary,phoneNumber);
        return employee.store(Controller.database);
    }
       
    default public List<Map<String, String>> searchEmployees(String id, String name, String charge, String active) {
       Employee employee = new Employee(id, name, charge, 0, "");
       return employee.multipleSearch(Controller.database, active);
    }       
}
