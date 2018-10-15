/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Employee;

import java.util.HashMap;

/**
 *
 * @author jose
 */
public interface EmployeeController {
       default public String delete(String employeeType, String idTarget){
        Employee employee = new Employee("", "", employeeType, 0, "");
        return employee.deleteEmployee(Controller.database, idTarget);
    }
       
       default public HashMap <String, String> getInfo(String id){
           Employee employee = new Employee("0", "0", "0", 0, "0");
           employee.search(Controller.database, id);
           
           HashMap <String, String>listEmployee = new HashMap <> ();
           
           listEmployee.put("name", employee.getName());
           listEmployee.put("charge", employee.getCharge());
           listEmployee.put("phoneNumber", employee.getPhoneNumber());
           
           String salary = Float.toString(employee.getSalary());
           listEmployee.put("salary", salary);
           
           return listEmployee;
       }
       
       default public String update(String id, String name, String charge, Float salary, String phoneNumber){
           Employee employee = new Employee(id,name,charge,salary,phoneNumber);
           return employee.updateInfoEmployee(Controller.database);
       }
}
