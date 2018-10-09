/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Database;

/**
 *
 * @author pentre
 */
public class Controller implements UserController {
    
    public static Database database;
    
    public Controller(){
        database = new Database();
    }
}
