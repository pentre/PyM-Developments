/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Employee;

import controller.Controller;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

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
        this.setLocationRelativeTo(null);

        if ("Administrador".equals(userType)) {
            this.chargeCombo.addItem("Gerente");
        }

        this.getBranches();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        chargeCombo = new javax.swing.JComboBox<>();
        salaryTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        addButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        BranchComboBox = new javax.swing.JComboBox<>();
        UI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        idTextField.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 30));

        nameTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setBorder(null);
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
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, 30));

        chargeCombo.setForeground(new java.awt.Color(44, 47, 51));
        chargeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Vendedor", "Jefe de Taller" }));
        chargeCombo.setBorder(null);
        getContentPane().add(chargeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 30));

        salaryTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        salaryTextField.setForeground(new java.awt.Color(255, 255, 255));
        salaryTextField.setBorder(null);
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
        getContentPane().add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, 30));

        phoneNumberTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        phoneNumberTextField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberTextField.setBorder(null);
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
        getContentPane().add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 240, 30));

        passwordField.setBackground(new java.awt.Color(255, 255, 255, 0));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 240, 30));

        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 475, 200, 50));

        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 50, 40));

        getContentPane().add(BranchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 130, 30));

        UI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Add Employee Menu.png"))); // NOI18N
        getContentPane().add(UI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked

        if (idTextField.getText().trim().isEmpty() || nameTextField.getText().trim().isEmpty() || salaryTextField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty() || chargeCombo.getSelectedItem() == "-" || new String(passwordField.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos.");
            return;
        }

        String id = idTextField.getText();
        String name = nameTextField.getText();
        String charge = (String) this.chargeCombo.getSelectedItem();
        String branch = BranchComboBox.getSelectedItem().toString();
        float salary = Float.parseFloat(salaryTextField.getText());
        String phoneNumber = phoneNumberTextField.getText();
        String password = new String(passwordField.getPassword());

        controller_.createEmployee(id, name, branch, charge, salary, phoneNumber);
        String message = controller_.createUser(id, password);

        JOptionPane.showMessageDialog(this, message, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_addButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    //This function validates that all typed keys are numbers
    private void validateNumber(java.awt.event.KeyEvent evt) {
        char inputChar = evt.getKeyChar();
        if (!(Character.isDigit(inputChar))) {
            evt.consume();
        }
    }

    //This function validates that all type kets are characters
    private void validateCharacters(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }

    private void clearFields() {
        this.idTextField.setText("");
        this.nameTextField.setText("");
        this.phoneNumberTextField.setText("");
        this.salaryTextField.setText("");
        this.passwordField.setText("");
        this.chargeCombo.setSelectedIndex(0);
    }

    private void getBranches() {
        List<String> branches = controller_.listBranches();
        for (String branch : branches) {
            this.BranchComboBox.addItem(branch);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BranchComboBox;
    private javax.swing.JLabel UI;
    private javax.swing.JLabel addButton;
    private javax.swing.JComboBox<String> chargeCombo;
    private javax.swing.JLabel exitButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
