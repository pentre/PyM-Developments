/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import javax.swing.JOptionPane;
import java.util.HashMap;
/**
 *
 * @author lalil
 */
public class ModifyManager extends javax.swing.JFrame {
    private Controller controller_;
    private String userType_;
    /**
     * Creates new form ModifyManager
     */
    public ModifyManager(Controller controller,String userType) {
        controller_ = controller;
        userType_ = userType;
        
        initComponents();
        if(userType_.equals("Administrador")){
            this.chargeComboBox.addItem("Gerente");
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

        idLabel = new javax.swing.JLabel();
        idInputField = new javax.swing.JTextField();
        modifyButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        chargeLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        nameInputField = new javax.swing.JTextField();
        salaryInputField = new javax.swing.JTextField();
        phoneNumberInputField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        chargeComboBox = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setText("Id:");

        idInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputFieldActionPerformed(evt);
            }
        });
        idInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idInputFieldKeyTyped(evt);
            }
        });

        modifyButton.setText("Modificar");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Nombre:");

        chargeLabel.setText("Cargo:");

        salaryLabel.setText("Salario:");

        phoneNumberLabel.setText("Telefono:");

        nameInputField.setEnabled(false);
        nameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputFieldActionPerformed(evt);
            }
        });
        nameInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameInputFieldKeyTyped(evt);
            }
        });

        salaryInputField.setEnabled(false);
        salaryInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryInputFieldKeyTyped(evt);
            }
        });

        phoneNumberInputField.setEnabled(false);
        phoneNumberInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberInputFieldActionPerformed(evt);
            }
        });
        phoneNumberInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberInputFieldKeyTyped(evt);
            }
        });

        updateButton.setText("Actualizar");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        chargeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe de Taller", "Vendedor" }));
        chargeComboBox.setEnabled(false);
        chargeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeComboBoxActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(salaryLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                            .addComponent(salaryInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel)
                                .addComponent(chargeLabel)
                                .addComponent(idLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(idInputField)
                                .addComponent(chargeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(19, 19, 19)
                .addComponent(modifyButton)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(updateButton))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chargeLabel)
                    .addComponent(chargeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(13, 13, 13)
                .addComponent(cancelButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void disable(){
        this.updateButton.setEnabled(false);
        this.cancelButton.setEnabled(false);
        this.idInputField.setEnabled(false);
        this.nameInputField.setEnabled(false);
        this.chargeComboBox.setEnabled(false);
        this.salaryInputField.setEnabled(false);
        this.phoneNumberInputField.setEnabled(false);
        this.nameInputField.setText("");
        this.salaryInputField.setText("");
        this.phoneNumberInputField.setText("");
        this.idInputField.setText("");
        this.idInputField.setEnabled(true);
        this.modifyButton.setEnabled(true);
    }
    
    public void enable(){
        this.nameInputField.setEnabled(true);
        this.chargeComboBox.setEnabled(true);
        this.salaryInputField.setEnabled(true);
        this.phoneNumberInputField.setEnabled(true);
        this.updateButton.setEnabled(true);
        this.cancelButton.setEnabled(true);
        this.idInputField.setEnabled(false);
        this.modifyButton.setEnabled(false);
    }
    
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        if(this.idInputField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor insertar un ID");
            return;
        }
        String id = this.idInputField.getText();
        
        HashMap <String, String>infoEmployee = controller_.getEmployeeInfo(id);
        
        
        if (infoEmployee.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existe empleado con esa id");
            disable();
            return;
        }
        enable();
        this.idInputField.setEditable(false);
        this.nameInputField.setText(infoEmployee.get("name"));
        this.chargeComboBox.setSelectedItem(infoEmployee.get("charge"));
        this.salaryInputField.setText(infoEmployee.get("salary"));  
        this.phoneNumberInputField.setText(infoEmployee.get("phoneNumber"));
        
        
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String id = this.idInputField.getText();
        String name = this.nameInputField.getText();
        String charge =  this.chargeComboBox.getSelectedItem().toString();
        Float salary = Float.valueOf(this.salaryInputField.getText());
        String phoneNumber = this.phoneNumberInputField.getText();
        String message = controller_.updateEmployeeUser(id, name, charge, salary, phoneNumber, userType_);
        JOptionPane.showMessageDialog(this, message);
        disable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void idInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idInputFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_idInputFieldKeyTyped

    private void salaryInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryInputFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_salaryInputFieldKeyTyped

    private void nameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputFieldActionPerformed

    private void nameInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameInputFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameInputFieldKeyTyped

    private void phoneNumberInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberInputFieldActionPerformed

    private void phoneNumberInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberInputFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberInputFieldKeyTyped

    private void idInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputFieldActionPerformed

    private void chargeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_cancelButtonActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyManager(new Controller(),"Administrador").setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> chargeComboBox;
    private javax.swing.JLabel chargeLabel;
    private javax.swing.JTextField idInputField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameInputField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneNumberInputField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField salaryInputField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
