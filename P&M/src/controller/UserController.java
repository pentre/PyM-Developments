/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.User;
/**
 *
 * @author sofia
 */
public interface UserController {    
    default public String login(String username, String password){
        User user = new User(username, password, "");
        return user.login(Controller.database);
    }
}
