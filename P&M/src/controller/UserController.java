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
        User user = new User(username, password, "", true);
        return user.login(Controller.database);
    }
    
    default public String createManager(String id, String name, float salary, String phoneNumber, String password){
        Employee employee = new Employee(id,name,"manager",salary,phoneNumber);
        return employee.createManager(Controller.database, password);
    }
}
