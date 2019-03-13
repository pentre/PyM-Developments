/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_resources;

import javax.swing.ImageIcon;

/**
 *
 * @author jose
 */
public class Utils {
    
    public ImageIcon CreateImageIcon(String path) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.out.println("Couldn't find file: " + path);
        return null;
    }
}
    
    
    
}
