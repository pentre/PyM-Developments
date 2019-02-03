/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.Furniture;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Luis
 */
public interface FurnitureController {
   
    default public String createFurniture(String name, float price, String material, float weight, String color){
        Furniture furniture = new Furniture(0, name, price, material, weight, color);
        
        return furniture.store(Controller.database);
    }
 
    default public List<String> listFurniture(){
        Furniture furniture = new Furniture(0, "",0,"",0,"");
        return furniture.listFurniture(Controller.database);
    }
    
    default public Map <String, String> getActiveFurnitureInfo (int id){
        Furniture furniture = new Furniture(id, "", 0, "", 0, "");
        Map <String, String>listFurniture = new HashMap<>();
        
        if(!furniture.searchActive(Controller.database)){
            return listFurniture;
        }
  
        listFurniture.put("name", furniture.getName());
        listFurniture.put("price", Float.toString(furniture.getPrice()));
        listFurniture.put("material", furniture.getMaterial());
        listFurniture.put("color", furniture.getColor());  
        listFurniture.put("weight", Float.toString(furniture.getWeight()));      
        return listFurniture;
    }
    
    default public String getFurnitureInfo (int id){
        Furniture furniture = new Furniture(id, "", 0, "", 0, "");
                
        if(!furniture.searchAll(Controller.database)){
            return "";
        }
        
        String message = "Referencia: " + Integer.toString(furniture.getId()) + 
                "\nNombre: " + furniture.getName() + "\nPrecio: " + 
                Float.toString(furniture.getPrice()) + "\nMaterial: " + furniture.getMaterial() +
                "\nColor: " + furniture.getColor() + "\nPeso: " + Float.toString(furniture.getWeight())
                + "\nEstado: ";

        if(furniture.isActive()) {
            message += "Modelo disponible";
        } else {
            message += "Modelo descontinuado";
        }
        
        return message;
    }
    
    default public String updateFurniture(int id, String name, float price, String material, float weight, String color){
        Furniture furniture = new Furniture(id, name, price, material, weight, color);
        
        return furniture.update(Controller.database);
    }
    
    default public List<Map<String, String>> listCatalog(boolean active){
        Furniture furniture = new Furniture(0, "", 0, "", 0, "");
        furniture.setActive(active);
        return furniture.listCatalog(Controller.database);
    }
}
