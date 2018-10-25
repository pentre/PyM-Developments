/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Branch;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author pentre
 */
public interface BranchController {

    default public String createBranch(String name, String city, String address) {
        Branch branch = new Branch(name, city, address);
        return branch.store(Controller.database);
    }

    default public Map<String, String> getBranchInfo(String name) {
        Branch branch = new Branch("", "", "");

        Map<String, String> listBranch = new HashMap<>();

        if (branch.search(Controller.database, name)) {
            listBranch.put("city", branch.getCity());
            listBranch.put("address", branch.getAddress());
        }
        return listBranch;
    }

    default public String updateBranch(String name, String city, String address) {
        Branch branch = new Branch(name, city, address);
        return branch.updateInfo(Controller.database);
    }

}
