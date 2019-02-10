/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;
import model.Employee;
/**
 *
 * @author sofia
 */
public interface UserController {    
    default public String login(String username, String password){
        User user = new User(username, password);
        if (!user.validate(Controller.database)){            
            return "Error: usuario o contraseña incorrecta";
        }
        
        Employee employee = new Employee(username, "", "", "", 0, "");
        if (!employee.search(Controller.database, username)){
            return "Error: usuario inactivo en el sistema";
        }
        Controller.employee = employee;
        return employee.getCharge();
    }
  
    default public String createUser(String username, String password){
        User user = new User(username,password);
        return user.store(Controller.database);
    }
}
