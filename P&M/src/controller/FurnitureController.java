/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Furniture;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface FurnitureController {
   
    default public String createFurniture(String name, float price, String material, float weight, String color){
        Furniture furniture = new Furniture(name, price, material, weight, color);
        
        return furniture.store(Controller.database);
    }
 
    default public List<String> listFurniture(){
        Furniture furniture = new Furniture("",0,"",0,"");
        return furniture.listFurniture(Controller.database);
    }
}
