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

public class Controller implements BranchController, UserController, EmployeeController{
    public static Database database;
    
    public Controller(){
        database = new Database();
    }
    
    public String updateEmployeeUser(String id, String name, String charge, Float salary, String phoneNumber, String userType){
      String messageEmployee = updateEmployee(id,name,charge,salary,phoneNumber,userType); 
      String messageUser = updateUser(id,charge);
      if (messageEmployee.equals("Empleado modificado correctamente") && messageUser.equals("Empleado modificado correctamente")){
          return "Modificacion exitosa.";
      }
      return "Error: error al actualizar empleado y usuario.";
    }
    
}
