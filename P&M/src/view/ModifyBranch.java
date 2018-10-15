/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Granada
 */
public class ModifyBranch extends javax.swing.JFrame {
    private Controller controller_;
    /**
     * Creates new form ModifyBranch
     */
    public ModifyBranch(Controller controller) {
        controller_ = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameBranchLabel = new javax.swing.JLabel();
        nameBranchTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        idManagerLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        idManagerTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameBranchLabel.setText("Nombre de la sede:");

        cityLabel.setText("Ciudad:");

        addressLabel.setText("Dirección:");

        idManagerLabel.setText("Id del gerente responsable:");

        updateButton.setText("Actualizar");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        modifyButton.setText("Modificar");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        addressTextField.setEnabled(false);

        cityTextField.setEnabled(false);
        cityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityTextFieldKeyTyped(evt);
            }
        });

        idManagerTextField.setEnabled(false);
        idManagerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idManagerTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idManagerLabel)
                        .addGap(18, 18, 18)
                        .addComponent(idManagerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameBranchLabel)
                            .addComponent(addressLabel)
                            .addComponent(cityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameBranchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(addressTextField)
                            .addComponent(cityTextField))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton)
                    .addComponent(modifyButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameBranchLabel)
                    .addComponent(nameBranchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyButton))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idManagerLabel)
                    .addComponent(idManagerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enabled(){
        this.cityTextField.setEnabled(true);
        this.addressTextField.setEnabled(true);
        this.idManagerTextField.setEnabled(true);
        this.updateButton.setEnabled(true);
    }
    
    private void disabled(){
        this.cityTextField.setEnabled(false);
        this.cityTextField.setText("");
        this.addressTextField.setEnabled(false);
        this.addressTextField.setText("");
        this.idManagerTextField.setEnabled(false);
        this.idManagerTextField.setText("");
        this.updateButton.setEnabled(false);
    }
    
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        if(this.nameBranchLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor insertar un nombre de sede");
            return;
        }
        
        String nameBranch = this.nameBranchTextField.getText();
        
        HashMap <String, String>infoBranch = new HashMap <> ();
        
        infoBranch = controller_.getBranchInfo(nameBranch);
        
        if (infoBranch.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existe una sede con ese nombre");
            disabled();
            return;
        }
        
        enabled();
        this.cityTextField.setText(infoBranch.get("name"));
        this.addressTextField.setText(infoBranch.get("address"));
        this.idManagerTextField.setText(infoBranch.get("managerId"));
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void cityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityTextFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if (!Character.isLetter(inputChar) && !Character.isWhitespace(inputChar)) {
            evt.consume();
        }
    }//GEN-LAST:event_cityTextFieldKeyTyped

    private void idManagerTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idManagerTextFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_idManagerTextFieldKeyTyped

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String name = this.nameBranchTextField.getText();
        String city = this.cityTextField.getText();
        String address = this.addressTextField.getText();
        String managerId = this.idManagerTextField.getText();
        
        String message = controller_.updateBranch(name, city, address, managerId);
        
        JOptionPane.showMessageDialog(this, message);
        
        disabled();
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ModifyBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBranch(new Controller()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel idManagerLabel;
    private javax.swing.JTextField idManagerTextField;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameBranchLabel;
    private javax.swing.JTextField nameBranchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
