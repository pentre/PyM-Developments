/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import javax.swing.JOptionPane;
import java.util.Map;

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

        topPanel = new javax.swing.JPanel();
        branchNameLabel = new javax.swing.JLabel();
        branchNameInputField = new javax.swing.JTextField();
        loadBranchInfoButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        cityLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        onChargeManagerIdLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        addressTextField = new javax.swing.JTextField();
        cityInputField = new javax.swing.JTextField();
        onChargeManagerInputField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        branchNameLabel.setText("Nombre de la sede:");

        branchNameInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                branchNameInputFieldKeyTyped(evt);
            }
        });

        loadBranchInfoButton.setText("Cargar datos");
        loadBranchInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBranchInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(branchNameInputField)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadBranchInfoButton)
                            .addComponent(branchNameLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(branchNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadBranchInfoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cityLabel.setText("Ciudad:");

        addressLabel.setText("Dirección:");

        onChargeManagerIdLabel.setText("Id del gerente responsable:");

        updateButton.setText("Actualizar");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addressTextField.setEnabled(false);

        cityInputField.setEnabled(false);
        cityInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityInputFieldKeyTyped(evt);
            }
        });

        onChargeManagerInputField.setEnabled(false);
        onChargeManagerInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onChargeManagerInputFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cityLabel)
                        .addComponent(addressLabel)
                        .addComponent(onChargeManagerIdLabel)
                        .addComponent(addressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(cityInputField)
                        .addComponent(onChargeManagerInputField))
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cityLabel)
                .addGap(3, 3, 3)
                .addComponent(cityInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onChargeManagerIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onChargeManagerInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enabled() {
        this.cityInputField.setEnabled(true);
        this.addressTextField.setEnabled(true);
        this.onChargeManagerInputField.setEnabled(true);
        this.updateButton.setEnabled(true);

        //These components are disabled to prevent changes on the branch name once the branch info is loaded
        this.branchNameInputField.setEnabled(false);
        this.loadBranchInfoButton.setEnabled(false);
    }

    private void disabled() {
        this.cityInputField.setEnabled(false);
        this.cityInputField.setText("");
        this.addressTextField.setEnabled(false);
        this.addressTextField.setText("");
        this.onChargeManagerInputField.setEnabled(false);
        this.onChargeManagerInputField.setText("");
        this.updateButton.setEnabled(false);

        //These components are activated again once the update is succesful in order to make another operation
        this.branchNameInputField.setEnabled(true);
        this.loadBranchInfoButton.setEnabled(true);
    }

    private void loadBranchInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBranchInfoButtonActionPerformed
        // TODO add your handling code here:
        if (this.branchNameInputField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor insertar un nombre de sede", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;

        }

        String branchName = this.branchNameInputField.getText();

        Map<String, String> branchInfo = controller_.getBranchInfo(branchName);

        if (branchInfo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No existe una sede con ese nombre");
            disabled();
            return;
        }

        enabled();
        this.cityInputField.setText(branchInfo.get("city"));
        this.addressTextField.setText(branchInfo.get("address"));
        this.onChargeManagerInputField.setText(branchInfo.get("managerId"));

    }//GEN-LAST:event_loadBranchInfoButtonActionPerformed

    private void cityInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityInputFieldKeyTyped
        validateCharacters(evt);
    }//GEN-LAST:event_cityInputFieldKeyTyped

    private void onChargeManagerInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onChargeManagerInputFieldKeyTyped
        validateNumbers(evt);
    }//GEN-LAST:event_onChargeManagerInputFieldKeyTyped

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String name = this.branchNameInputField.getText();
        String city = this.cityInputField.getText();
        String address = this.addressTextField.getText();
        String managerId = this.onChargeManagerInputField.getText();

        String message = controller_.updateBranch(name, city, address, managerId);

        JOptionPane.showMessageDialog(this, message);

        disabled();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void branchNameInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchNameInputFieldKeyTyped
        validateCharactersAndNumbers(evt);
    }//GEN-LAST:event_branchNameInputFieldKeyTyped

    private void validateNumbers(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    private void validateCharacters(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((!Character.isLetter(c)) && (!Character.isWhitespace(c))) {
            evt.consume();
        }
    }
    
    private void validateCharactersAndNumbers(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((!Character.isLetter(c)) && (!Character.isDigit(c)) && (!Character.isWhitespace(c))) {
            evt.consume();
        }
    }

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
                new ModifyBranch(new Controller()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JTextField branchNameInputField;
    private javax.swing.JLabel branchNameLabel;
    private javax.swing.JTextField cityInputField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton loadBranchInfoButton;
    private javax.swing.JLabel onChargeManagerIdLabel;
    private javax.swing.JTextField onChargeManagerInputField;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
