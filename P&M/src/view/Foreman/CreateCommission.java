/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Foreman;

import controller.Controller;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author mily
 */
public class CreateCommission extends javax.swing.JFrame {

    private Controller controller_;
    /**
     * Creates new form createCommission
     */
    public CreateCommission(Controller controller) {
        controller_ = controller;
        initComponents();
        List<String> furnitures = controller_.listFurniture();
        List<String> branches = controller_.listBranches();
        for (String aux : furnitures){
            furnitureComboBox.addItem(aux);
        }
        for (String aux: branches){
            branchComboBox.addItem(aux);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        furnitureComboBox = new javax.swing.JComboBox<>();
        quantityTextField = new javax.swing.JTextField();
        branchComboBox = new javax.swing.JComboBox<>();
        addCommission = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        furnitureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        furnitureComboBox.setBorder(null);
        getContentPane().add(furnitureComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 40));

        quantityTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        quantityTextField.setForeground(new java.awt.Color(255, 255, 255));
        quantityTextField.setBorder(null);
        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });
        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, 20));

        branchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        branchComboBox.setBorder(null);
        getContentPane().add(branchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, 150, 30));

        addCommission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCommissionMouseClicked(evt);
            }
        });
        getContentPane().add(addCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 240, 200, 40));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 50, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Create Orden.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_quantityTextFieldKeyTyped

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void addCommissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCommissionMouseClicked
        if (quantityTextField.getText().isEmpty() || (quantityTextField.getText().equals("0")) || furnitureComboBox.getSelectedItem().toString().trim().equals("-") || branchComboBox.getSelectedItem().toString().trim().equals("-")){
            JOptionPane.showMessageDialog(this, "Asegurese de ingresar los campos correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String furniture = furnitureComboBox.getSelectedItem().toString();
        String branch = branchComboBox.getSelectedItem().toString();
        int quantity = Integer.parseInt(quantityTextField.getText());
        boolean status = false; //en proceso
        int furnitureInt = Integer.parseInt(furniture.split("-")[1]);
        String message = controller_.createComission(status, furnitureInt, quantity, branch);
        
        JOptionPane.showMessageDialog(this, message, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        clearFields();
    }//GEN-LAST:event_addCommissionMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    private void validateNumber(java.awt.event.KeyEvent evt) {
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }
    
    private void clearFields() {
        this.branchComboBox.setSelectedIndex(0);
        this.furnitureComboBox.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCommission;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JComboBox<String> furnitureComboBox;
    private javax.swing.JTextField quantityTextField;
    // End of variables declaration//GEN-END:variables
}
