/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Branch;

import controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author pentre
 */
public class AddBranch extends javax.swing.JFrame {
    
    private Controller controller_;

    /**
     * Creates new form createBranch
     */
    public AddBranch(Controller controller) {
        controller_ = controller;
        initComponents();
    }
    
    private void clearFields(){
        this.cityField.setText("");
        this.addressField.setText("");
        this.nameField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cityField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        exitLabel = new javax.swing.JLabel();
        okLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 186));

        cityField.setBackground(new java.awt.Color(255, 255, 255, 0));
        cityField.setColumns(6);
        cityField.setForeground(new java.awt.Color(255, 255, 255));
        cityField.setBorder(null);
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldKeyTyped(evt);
            }
        });
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 90, 30));

        addressField.setBackground(new java.awt.Color(255, 255, 255, 0));
        addressField.setColumns(6);
        addressField.setForeground(new java.awt.Color(255, 255, 255));
        addressField.setBorder(null);
        getContentPane().add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        nameField.setBackground(new java.awt.Color(255, 255, 255, 0));
        nameField.setColumns(6);
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setBorder(null);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 30));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 50, 40));

        okLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okLabelMouseClicked(evt);
            }
        });
        getContentPane().add(okLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 200, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Add Branch.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameFieldKeyTyped

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cityFieldKeyTyped

    private void okLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okLabelMouseClicked
        String name = nameField.getText().trim();
        String city = cityField.getText().trim();
        String address = addressField.getText().trim();
        
        if(name.equals("") || city.equals("") || address.equals("")) {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Sede", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String message = controller_.createBranch(name, city, address);
        JOptionPane.showMessageDialog(this, message, "Branch", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_okLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel background;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel okLabel;
    // End of variables declaration//GEN-END:variables
}
