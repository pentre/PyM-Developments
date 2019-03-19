/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Foreman;

import controller.Controller;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author sofia
 */
public class ModifyFurniture extends javax.swing.JFrame {
    private Controller controller_;
    /**
     * Creates new form ModifyFurniture
     */
    public ModifyFurniture(Controller controller) {
        controller_ = controller;
        initComponents();
        this.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void disable(){
        updateButton.setEnabled(false);
        nameTextField.setEnabled(false);
        colorTextField.setEnabled(false);
        weightTextField.setEnabled(false);
        priceTextField.setEnabled(false);
        materialTextField.setEnabled(false);
        idTextField.setEnabled(true);
        loadButton.setEnabled(true);
        idTextField.setText("");
        nameTextField.setText("");
        colorTextField.setText("");
        weightTextField.setText("");
        priceTextField.setText("");
        idTextField.setText("");  
        materialTextField.setText("");
    }
    
    public void enable(){
        updateButton.setEnabled(true);
        nameTextField.setEnabled(true);
        colorTextField.setEnabled(true);
        weightTextField.setEnabled(true);
        priceTextField.setEnabled(true);
        materialTextField.setEnabled(true);
        idTextField.setEnabled(false);
        loadButton.setEnabled(false);
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        loadButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        materialTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        colorTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("ID:");

        idTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                idTextFieldCaretPositionChanged(evt);
            }
        });
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

        loadButton.setText("Cargar");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        priceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Material:");

        jLabel5.setText("Peso:");

        weightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightTextFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("Color:");

        updateButton.setText("Actualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nameTextField))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(materialTextField)
                                .addComponent(weightTextField)
                                .addComponent(colorTextField)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(cancelButton)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(materialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(nameTextField.getText().trim().isEmpty() || colorTextField.getText().trim().isEmpty() || materialTextField.getText().trim().isEmpty() || priceTextField.getText().trim().isEmpty() || weightTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Asegurese de ingresar todos los campos", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String color = colorTextField.getText();
            String material = materialTextField.getText();        
            Float price = Float.valueOf(priceTextField.getText());
            Float weight = Float.valueOf(weightTextField.getText());
            
            String message = controller_.updateFurniture(id, name, price, material, weight, color);
            JOptionPane.showMessageDialog(this, message);
            disable();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Digite un valor numérico para el peso");              
        }     
    }//GEN-LAST:event_updateButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        if(idTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor insertar un ID");
            return;
        }
        int id = Integer.parseInt(idTextField.getText());
        
        Map <String, String>infoFurniture = controller_.getActiveFurnitureInfo(id);
        
        if (infoFurniture.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existe un mueble con esa id");  
            idTextField.setText("");
            return;
        }
        
        enable();
        
        nameTextField.setText(infoFurniture.get("name"));
        priceTextField.setText(infoFurniture.get("price"));  
        materialTextField.setText(infoFurniture.get("material"));
        weightTextField.setText(infoFurniture.get("weight"));
        colorTextField.setText(infoFurniture.get("color"));
    }//GEN-LAST:event_loadButtonActionPerformed

    private void idTextFieldCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_idTextFieldCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldCaretPositionChanged

    private void idTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyTyped
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_idTextFieldKeyTyped

    private void priceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextFieldKeyTyped
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))) {
            evt.consume();
        }
    }//GEN-LAST:event_priceTextFieldKeyTyped

    private void weightTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightTextFieldKeyTyped
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))  && (inputChar != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_weightTextFieldKeyTyped

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField materialTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
