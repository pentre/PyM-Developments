/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.events.KeyEvent;
import controller.Controller;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Luis
 */
public class AddEmployee extends javax.swing.JFrame {

    private Controller controller_;
    /**
     * Creates new form AddManagerFrame
     */
    public AddEmployee(Controller controller, String userType) {
        controller_ = controller;
        initComponents();
        
        if ("Administrador".equals(userType)){
            this.chargeCombo.addItem("Gerente");
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

        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        salaryLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        branchLabel = new javax.swing.JLabel();
        branchTextField = new javax.swing.JTextField();
        chargeLabel = new javax.swing.JLabel();
        chargeCombo = new javax.swing.JComboBox<>();
        addManagerButton = new javax.swing.JButton();
        MessageLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setText("ID:");
        idLabel.setToolTipText("");

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

        nameLabel.setText("Nombre:");

        salaryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTextFieldActionPerformed(evt);
            }
        });
        salaryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryTextFieldKeyTyped(evt);
            }
        });

        salaryLabel.setText("Salario:");
        salaryLabel.setToolTipText("");

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

        phoneNumberLabel.setText("Teléfono:");

        passwordLabel.setText("Contraseña");

        branchLabel.setText("Sede:");

        branchTextField.setToolTipText("");
        branchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                branchTextFieldKeyTyped(evt);
            }
        });

        chargeLabel.setText("Cargo:");

        chargeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Vendedor", "Jefe de Taller" }));

        addManagerButton.setText("Agregar");
        addManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(idTextField)
                    .addComponent(nameTextField)
                    .addComponent(nameLabel)
                    .addComponent(salaryTextField)
                    .addComponent(salaryLabel)
                    .addComponent(phoneNumberTextField)
                    .addComponent(phoneNumberLabel)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(branchLabel)
                    .addComponent(branchTextField)
                    .addComponent(chargeLabel)
                    .addComponent(chargeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MessageLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addManagerButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel)
                .addGap(10, 10, 10)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chargeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(chargeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(branchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addManagerButton)
                    .addComponent(cancelButton))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void salaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextFieldActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void addManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerButtonActionPerformed

        if(idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || branchTextField.getText().isEmpty() || salaryTextField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty() ||  new String(passwordField.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos.");
            return;
        }

        String id = idTextField.getText();
        String name = nameTextField.getText();
        String charge = (String) this.chargeCombo.getSelectedItem();
        String branch = branchTextField.getText();
        float salary = Float.parseFloat(salaryTextField.getText());
        String phoneNumber = phoneNumberTextField.getText();
        String password = new String(passwordField.getPassword());

        String message = controller_.createEmployee(id, name, branch, charge, salary, phoneNumber);
        message += controller_.createUser(id,password);

        JOptionPane.showMessageDialog(this, message, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_addManagerButtonActionPerformed

    private void idTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyTyped
        validateNumber(evt);
    }//GEN-LAST:event_idTextFieldKeyTyped

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        validateCharacters(evt);
     }//GEN-LAST:event_nameTextFieldKeyTyped

    private void salaryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTextFieldKeyTyped
        validateNumber(evt);
    }//GEN-LAST:event_salaryTextFieldKeyTyped

    private void phoneNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldKeyTyped
        validateNumber(evt);
    }//GEN-LAST:event_phoneNumberTextFieldKeyTyped

    private void branchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumbersAndCharacters(evt);
    }//GEN-LAST:event_branchTextFieldKeyTyped

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    //This function validates that all typed keys are numbers
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
    
    private void validateNumbersAndCharacters(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c) && !Character.isDigit(c)) {
            evt.consume();
        }
    }
    
    private void clearFields(){
        this.idTextField.setText("");
        this.nameTextField.setText("");
        this.branchTextField.setText("");
        this.phoneNumberTextField.setText("");
        this.salaryTextField.setText("");
        this.passwordField.setText("");
        this.chargeCombo.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JButton addManagerButton;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JTextField branchTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> chargeCombo;
    private javax.swing.JLabel chargeLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
