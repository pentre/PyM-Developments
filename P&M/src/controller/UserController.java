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
        User user = new User(username, password, "", true);
        return user.login(Controller.database);
    }
    
    default public String createUser(String username, String password, String type){
        User user = new User(username,password,type,true);
        return user.store(Controller.database);
    }
}
