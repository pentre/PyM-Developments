/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import controller.Controller;
/**
 *
 * @author lalil
 */
public class CreateQuote extends javax.swing.JFrame {
    private Controller controller_;
    /**
     * Creates new form CreateQuote
     */
    public CreateQuote(Controller controller) {
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

        idClientLabel = new javax.swing.JLabel();
        idClientTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        idFurnitureLabel = new javax.swing.JLabel();
        idFurnitureTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        branchLabel = new javax.swing.JLabel();
        branchTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idClientLabel.setText("ID Cliente: ");

        idClientTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClientTextFieldActionPerformed(evt);
            }
        });
        idClientTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idClientTextFieldKeyTyped(evt);
            }
        });

        phoneNumberLabel.setText("Telefono: ");

        phoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberTextFieldKeyTyped(evt);
            }
        });

        idFurnitureLabel.setText("ID Mueble: ");

        idFurnitureTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idFurnitureTextFieldKeyTyped(evt);
            }
        });

        quantityLabel.setText("Cantidad:");

        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyTyped(evt);
            }
        });

        branchLabel.setText("Sede:");

        branchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchTextFieldActionPerformed(evt);
            }
        });
        branchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                branchTextFieldKeyTyped(evt);
            }
        });

        totalLabel.setText("Total:");

        createButton.setText("Crear Cotización");
        createButton.setEnabled(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.setEnabled(false);

        calculateButton.setText("Calcular");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calculateButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idClientLabel)
                                .addComponent(idFurnitureLabel)
                                .addComponent(branchLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idClientTextField)
                                .addComponent(idFurnitureTextField)
                                .addComponent(branchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(phoneNumberLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(quantityLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(totalLabel)
                                            .addGap(34, 34, 34)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(quantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(totalValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createButton)
                            .addGap(18, 18, 18)
                            .addComponent(cancelButton))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClientLabel)
                    .addComponent(idClientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFurnitureLabel)
                    .addComponent(idFurnitureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(branchLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(branchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalLabel)
                        .addComponent(totalValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateButton)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(createButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idClientTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClientTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClientTextFieldActionPerformed

    private void idClientTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClientTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_idClientTextFieldKeyTyped

    private void idFurnitureTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFurnitureTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_idFurnitureTextFieldKeyTyped

    private void quantityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_quantityTextFieldKeyTyped

    private void phoneNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_phoneNumberTextFieldKeyTyped

    private void branchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_branchTextFieldActionPerformed

    private void branchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchTextFieldKeyTyped
        // TODO add your handling code here:
        validateCharacters(evt);
    }//GEN-LAST:event_branchTextFieldKeyTyped

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        if( idClientTextField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty() || idFurnitureTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || branchTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos.");
            return;
        }
        String idClient = idClientTextField.getText();
        String phoneClient = phoneNumberTextField.getText();
        String idFurniture = idFurnitureTextField.getText();
        int quantity = Integer.parseInt(quantityTextField.getText());
        String branch = branchTextField.getText();
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        if( idClientTextField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty() || idFurnitureTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || branchTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos.");
            return;
        }
        String idFurniture = idFurnitureTextField.getText();
        int quantity = Integer.parseInt(quantityTextField.getText());
        String message = controller_.calculateQuote(idFurniture,quantity);
        if (message.equals("Error: el mueble ingresado no existe.")){
            JOptionPane.showMessageDialog(this, message);
            return;            
        }
        totalValueLabel.setText(message);
        createButton.setEnabled(true);
        cancelButton.setEnabled(true);
    }//GEN-LAST:event_calculateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateQuote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateQuote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateQuote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateQuote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateQuote(new Controller()).setVisible(true);
            }
        });
    }
    
    private void validateNumber(java.awt.event.KeyEvent evt) {
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }
    
    //This function validates that all type kets are characters
    private void validateCharacters(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel branchLabel;
    private javax.swing.JTextField branchTextField;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel idClientLabel;
    private javax.swing.JTextField idClientTextField;
    private javax.swing.JLabel idFurnitureLabel;
    private javax.swing.JTextField idFurnitureTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    // End of variables declaration//GEN-END:variables
}
