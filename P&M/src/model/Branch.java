/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author pentre
 */
public class Branch {

    private String name_;
    private String city_;
    private String address_;
    private boolean active_;

    public Branch(String name, String city, String address) {
        name_ = name;
        city_ = city;
        address_ = address;
        active_ = true;
    }

    public String getName() {
        return name_;
    }

    public String getCity() {
        return city_;
    }

    public String getAddress() {
        return address_;
    }

    public boolean isActive() {
        return active_;
    }

    public void setName(String name) {
        name_ = name;
    }

    public void setCity(String city) {
        city_ = city;
    }

    public void setAddress(String address) {
        address_ = address;
    }

    public void setActive(boolean active) {
        active_ = active;
    }

    public String store(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("INSERT INTO branch VALUES (?, ?, ?, ?)");
            stmt.setString(1, name_);
            stmt.setString(2, city_);
            stmt.setString(3, address_);
            stmt.setBoolean(5, active_);

            if (stmt.executeUpdate() == 1) {
                return "Sede adicionada exitosamente";
            }

            return "Error: la sede no pudo ser adicionada";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: la sede no pudo ser adicionada";
        }
    }

    public boolean search(Database database, String name) {
        try {
            PreparedStatement stmt = database.getStatement("SELECT * FROM branch WHERE name = ? AND active = true");
            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return false;
            }

            name_ = rs.getString("name");
            city_ = rs.getString("city");
            address_ = rs.getString("address");
            active_ = rs.getBoolean("active");

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String updateInfo(Database database) {
        try {
            PreparedStatement stmt = database.getStatement("UPDATE branch SET city = ? , address = ? WHERE name = ? AND active = true");

            stmt.setString(1, city_);
            stmt.setString(2, address_);
            stmt.setString(4, name_);

            int result = stmt.executeUpdate();

            if (result == 0) {
                return "Error: sede no encontrada";
            }

            return "La sede fue modifcada correctamente";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: no fue posible modificar la sede";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: no fue posible modificar la sede";
        }
    }
}
