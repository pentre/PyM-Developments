/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Branch;
import model.Employee;
import java.util.HashMap;


/**
 *
 * @author pentre
 */
public interface BranchController {

    default public String createBranch(String name, String city, String address, String managerId) {
        
        Employee employee = new Employee("", "", "", 0, "");
        employee.search(Controller.database, managerId);
        if (!employee.getCharge().equals("Gerente") || !employee.isActive()) {
            return "No se encontró un gerente con esta id";
        }
        
        Branch branch = new Branch(name, city, address, managerId);
        return branch.store(Controller.database);
    }

    default public HashMap<String, String> getBranchInfo(String name) {
        Branch branch = new Branch("", "", "", "");

        HashMap<String, String> listBranch = new HashMap<>();

        if (branch.search(Controller.database, name)) {
            listBranch.put("city", branch.getCity());
            listBranch.put("address", branch.getAddress());
            listBranch.put("managerId", branch.getManagerId());
        }
        return listBranch;
    }

    default public String updateBranch(String name, String city, String address, String managerId) {
        Employee employee = new Employee("", "", "", 0, "");
        employee.search(Controller.database, managerId);
        if (!employee.getCharge().equals("Gerente") || !employee.isActive()) {
            return "No se encontró un gerente con esta id";
        }
        Branch branch = new Branch(name, city, address, managerId);
        return branch.updateInfo(Controller.database);
    }

}
