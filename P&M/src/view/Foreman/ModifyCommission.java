/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Foreman;

import controller.Controller;
import java.util.Map;
import javax.swing.JOptionPane;
import view.Foreman.ListCatalog;

/**
 *
 * @author Luis
 */
public class ModifyCommission extends javax.swing.JFrame {

    Controller controller_;

    /**
     * Creates new form ModifyCommission
     */
    public ModifyCommission(Controller controller) {
        controller_ = controller;
        initComponents();
        this.StatusComboBox.setEnabled(false);
        this.loadLabel.setEnabled(false);
        this.BranchTextField.setEditable(false);
        this.QuantityTextField.setEditable(false);
        this.FurnitureIdTextField.setEditable(false);
        this.StatusComboBox.setSelectedIndex(1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderIdTextField = new javax.swing.JTextField();
        FurnitureIdTextField = new javax.swing.JTextField();
        QuantityTextField = new javax.swing.JTextField();
        BranchTextField = new javax.swing.JTextField();
        StatusComboBox = new javax.swing.JComboBox<>();
        modifyLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        loadLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderIdTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        OrderIdTextField.setBorder(null);
        OrderIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OrderIdTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(OrderIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 103, 190, 30));

        FurnitureIdTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        FurnitureIdTextField.setBorder(null);
        FurnitureIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FurnitureIdTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FurnitureIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 250, 20));

        QuantityTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        QuantityTextField.setBorder(null);
        getContentPane().add(QuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 20));

        BranchTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        BranchTextField.setBorder(null);
        getContentPane().add(BranchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 250, 20));

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terminado", "En proceso" }));
        StatusComboBox.setBorder(null);
        getContentPane().add(StatusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 270, -1));

        modifyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(modifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 450, 200, 40));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 40));

        loadLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadLabelMouseClicked(evt);
            }
        });
        getContentPane().add(loadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Modify Orden.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderIdTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrderIdTextFieldKeyTyped
        validateNumber(evt);
    }//GEN-LAST:event_OrderIdTextFieldKeyTyped

    private void FurnitureIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FurnitureIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FurnitureIdTextFieldActionPerformed

    private void modifyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLabelMouseClicked
        String status = (String) this.StatusComboBox.getSelectedItem();
        String order_id = this.OrderIdTextField.getText();

        if (status.equals("Terminado")) {
            String mensaje = controller_.updateCommission(order_id, true);
            JOptionPane.showMessageDialog(this, mensaje, "Atención", JOptionPane.INFORMATION_MESSAGE);
            
            

            this.StatusComboBox.setEnabled(false);
            this.modifyLabel.setEnabled(false);
            this.loadLabel.setEnabled(true);
            this.OrderIdTextField.setEnabled(true);
            this.BranchTextField.setText("");
            this.QuantityTextField.setText("");
            this.FurnitureIdTextField.setText("");
            

        } 
    }//GEN-LAST:event_modifyLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    private void loadLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadLabelMouseClicked
        if (OrderIdTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: ingrese el numero de orden sin modificar que desea modificar", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String order_id = OrderIdTextField.getText();
            Map<String, String> commissionInfo = controller_.getCommissionInfo(order_id);
            if (commissionInfo == null) {
                JOptionPane.showMessageDialog(this, "Error: el numero de orden sin terminar ingresado es incorrecto", "Error", JOptionPane.WARNING_MESSAGE);

            } else {
                this.StatusComboBox.setEnabled(true);
                this.modifyLabel.setEnabled(true);
                this.loadLabel.setEnabled(false);
                this.OrderIdTextField.setEnabled(false);

                this.FurnitureIdTextField.setText(commissionInfo.get("furniture_id"));
                this.BranchTextField.setText(commissionInfo.get("branch"));
                this.QuantityTextField.setText(commissionInfo.get("quantity"));
                
               
            }
        }

    }//GEN-LAST:event_loadLabelMouseClicked

    //This function validates that all typed keys are numbers
    private void validateNumber(java.awt.event.KeyEvent evt) {
        char inputChar = evt.getKeyChar();
        if (!(Character.isDigit(inputChar))) {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BranchTextField;
    private javax.swing.JTextField FurnitureIdTextField;
    private javax.swing.JTextField OrderIdTextField;
    private javax.swing.JTextField QuantityTextField;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel background;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel loadLabel;
    private javax.swing.JLabel modifyLabel;
    // End of variables declaration//GEN-END:variables
}
