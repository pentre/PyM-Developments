package controller;

import model.Furniture;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalil
 */
public interface FurnitureController {
    default String FurniturePrice(String id, int quantity){
        Furniture furniture = new Furniture("",0,"",0,"");
        if (!furniture.search(Controller.database,id)){
            return "Error: el mueble ingresado no existe.";
        }
        furniture.getInfo(Controller.database, id);
        
        Float result = furniture.getPrice()*quantity;
        return String.valueOf(result);
    }
    
}
