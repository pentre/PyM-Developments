/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Employee;

import controller.*;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class DeleteEmployee extends javax.swing.JFrame {
    private Controller controller_;
    private String user_;
    /**
     * Creates new form AdminDeleteMenu
     */
    public DeleteEmployee(Controller controller, String userType) {
        controller_ = controller;
        user_ = userType;
        initComponents();
        this.setNonEditable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void setNonEditable(){
        this.nameTextField.setEditable(false);
        this.chargeCombo.setEditable(false);
        this.salaryTextField.setEditable(false);
        this.branchTextField.setEditable(false);
        this.phoneNumberTextField.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();
        deleteButton = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        chargeCombo = new javax.swing.JComboBox<>();
        salaryTextField = new javax.swing.JTextField();
        branchTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        exitButton = new javax.swing.JLabel();
        UI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setText("ID:");
        backgroundPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        idTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        idTextField.setBorder(null);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextFieldKeyTyped(evt);
            }
        });
        backgroundPanel.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 103, 190, 30));

        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        backgroundPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 95, 60, 40));

        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        backgroundPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 475, 200, 50));

        nameTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setBorder(null);
        nameTextField.setEnabled(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });
        backgroundPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 240, 30));

        chargeCombo.setForeground(new java.awt.Color(255, 255, 255));
        chargeCombo.setEnabled(false);
        chargeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeComboActionPerformed(evt);
            }
        });
        backgroundPanel.add(chargeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 255, 250, 30));

        salaryTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        salaryTextField.setForeground(new java.awt.Color(255, 255, 255));
        salaryTextField.setBorder(null);
        salaryTextField.setEnabled(false);
        salaryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryTextFieldKeyTyped(evt);
            }
        });
        backgroundPanel.add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, 80, 20));

        branchTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        branchTextField.setForeground(new java.awt.Color(255, 255, 255));
        branchTextField.setBorder(null);
        branchTextField.setEnabled(false);
        branchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                branchTextFieldKeyTyped(evt);
            }
        });
        backgroundPanel.add(branchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 325, 123, 20));

        phoneNumberTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        phoneNumberTextField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberTextField.setBorder(null);
        phoneNumberTextField.setEnabled(false);
        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });
        phoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberTextFieldKeyTyped(evt);
            }
        });
        backgroundPanel.add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 230, 20));

        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        backgroundPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 40));

        UI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Delete Employee Menu.png"))); // NOI18N
        backgroundPanel.add(UI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyTyped
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_idTextFieldKeyTyped

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        if(idTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor insertar un ID");
            return;
        }
        String id = idTextField.getText();

        Map <String, String>infoEmployee = controller_.getEmployeeInfo(id);

        if (infoEmployee.isEmpty()){
            JOptionPane.showMessageDialog(this, "No existe empleado con esa id", "Atencion", JOptionPane.WARNING_MESSAGE);
            return;
        }

        nameTextField.setText(infoEmployee.get("name"));
        chargeCombo.addItem(infoEmployee.get("charge"));
        salaryTextField.setText(infoEmployee.get("salary"));
        phoneNumberTextField.setText(infoEmployee.get("phoneNumber"));
        branchTextField.setText(infoEmployee.get("branch"));
    }//GEN-LAST:event_searchButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if (this.idTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor insertar un ID");
            return;
        }
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el usuario ingresado?", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
        
        if (selectedOption == 0){
            String id = this.idTextField.getText();

            //user_ is sent to verify the user's charge that is going to delete an employee
            String message = this.controller_.deleteEmployee(user_, id);
        
            JOptionPane.showMessageDialog(this, message);
            clearFields();
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameTextFieldKeyTyped

    private void salaryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTextFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_salaryTextFieldKeyTyped

    private void branchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c) && !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_branchTextFieldKeyTyped

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void phoneNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberTextFieldKeyTyped

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    private void chargeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeComboActionPerformed

    private void clearFields(){
        this.idTextField.setEditable(true);
        this.idTextField.setText("");
        this.nameTextField.setText("");
        this.branchTextField.setText("");
        this.phoneNumberTextField.setText("");
        this.salaryTextField.setText("");
        this.chargeCombo.removeAllItems();
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UI;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField branchTextField;
    private javax.swing.JComboBox<String> chargeCombo;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JLabel searchButton;
    // End of variables declaration//GEN-END:variables
}
