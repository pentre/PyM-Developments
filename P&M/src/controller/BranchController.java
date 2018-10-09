/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Branch;

/**
 *
 * @author pentre
 */
public interface BranchController {
    default public String createBranch(String name, String city, String address, String managerId) {
        Branch branch = new Branch(name, city, address, managerId);
        
        return branch.Store(Controller.database);
    }
}
