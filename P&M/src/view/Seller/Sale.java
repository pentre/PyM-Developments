/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Seller;

import controller.Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pentre
 */
public class Sale extends javax.swing.JFrame {

    private Controller controller_;
    private Map<Integer, Integer> currentIDs_;
    
    /**
     * Creates new form Sale
     */
    public Sale(Controller controller) {
        controller_ = controller;
        currentIDs_ = new HashMap();
        initComponents();
        idComboBox.setModel(new javax.swing.DefaultComboBoxModel(controller_.listInventory()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idComboBox = new javax.swing.JComboBox<>();
        quantityTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        totalTextField = new javax.swing.JTextField();
        exitLabel = new javax.swing.JLabel();
        AddLabel = new javax.swing.JLabel();
        okLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 30));

        quantityTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        quantityTextField.setToolTipText("");
        quantityTextField.setBorder(null);
        quantityTextField.setPreferredSize(new java.awt.Dimension(73, 23));
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
        getContentPane().add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 150, 30));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mueble", "Cantidad", "Disponibles", "Valor individual"
            }
        ));
        dataTable.setEnabled(false);
        dataTable.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 202, 780, 250));

        totalTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        totalTextField.setEnabled(false);
        totalTextField.setPreferredSize(new java.awt.Dimension(150, 23));
        totalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 0, 80, 40));

        AddLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLabelMouseClicked(evt);
            }
        });
        getContentPane().add(AddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 110, 180, 50));

        okLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okLabelMouseClicked(evt);
            }
        });
        getContentPane().add(okLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 465, 170, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Sales.png"))); // NOI18N
        background.setText("jLabel2");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextFieldActionPerformed

    private void saleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleButtonActionPerformed
        int ok = JOptionPane.showConfirmDialog(this, "Desea realizar la venta", "Venta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        List<Integer> results = new ArrayList<>();
        System.out.println(ok);
        if (ok == 0) {
            results = controller_.sale(currentIDs_);
        }
        
        if (results == null) {
            JOptionPane.showMessageDialog(null, "Error", "Venta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        updateTable(new ArrayList<>());
        
        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Venta exitosa", "Venta", JOptionPane.INFORMATION_MESSAGE);
        }
        
        String result = "";
        for (int id : results) {
            if (result.isEmpty()) {
                result = result.concat(", ");
            }
            result = result.concat(Integer.toString(id));
        }
        JOptionPane.showMessageDialog(null, "Venta exitosa, se crearon ordenas para: " + result, "Venta", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_saleButtonActionPerformed
    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void quantityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyTyped
        // TODO add your handling code here:
        validateNumber(evt);
    }//GEN-LAST:event_quantityTextFieldKeyTyped

    private void AddLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLabelMouseClicked
        try {
            int quantity = Integer.parseInt(quantityTextField.getText());
            int id = Integer.parseInt(idComboBox.getSelectedItem().toString());

            if (quantity == 0) {
                currentIDs_.remove(id);
                return;
            }

            currentIDs_.put(id, quantity);
            Set<Integer> idSet = currentIDs_.keySet();
            Integer[] ids = idSet.toArray(new Integer[idSet.size()]);

            List<Map<String, Float>> results = controller_.getSaleInfo(ids);

            updateTable(results);
        }
        catch(NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddLabelMouseClicked

    private void okLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okLabelMouseClicked
        if (currentIDs_.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos seleccionados", "Venta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int ok = JOptionPane.showConfirmDialog(this, "Desea realizar la venta", "Venta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        List<Integer> results = new ArrayList<>();
        
        if (ok == 0) {
            results = controller_.sale(currentIDs_);
        } else {
            return;
        }
        
        if (results == null) {
            JOptionPane.showMessageDialog(null, "Error", "Venta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        updateTable(new ArrayList<>());
        
        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Venta exitosa", "Venta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String result = "";
        String m = "Venta exitosa";
        for (int id : results) {
            if (result.isEmpty()) {
                result = result.concat(", ");
            }
            result = result.concat(Integer.toString(id));
        }
        if (!result.isEmpty()) {
            m += ", ordenes creadas";
        }
        
        
        JOptionPane.showMessageDialog(null, m, "Venta", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_okLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked
    
    private void updateTable(List<Map<String, Float>> results) {
        Object[] columnNames = { "Mueble", "Cantidad", "Disponibles", "Valor individual" };
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        float totalPrice = 0;
        
        for(int i=0; i<results.size(); i++) {
            int id = Math.round(results.get(i).get("id"));
            totalPrice += results.get(i).get("price") * currentIDs_.get(id);
            Object[] row = {
                id,
                currentIDs_.get(id),
                results.get(i).get("quantity"),
                results.get(i).get("price"),              
            };
            model.addRow(row);
        }
        dataTable.setModel(model);
        totalTextField.setText(Float.toString(totalPrice));
        //dataTable.setDefaultRenderer(columnClass, renderer);
    }
    
    private void validateNumber(java.awt.event.KeyEvent evt) {
        char inputChar = evt.getKeyChar();
        if (!(Character.isDigit(inputChar))) {
            evt.consume();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLabel;
    private javax.swing.JLabel background;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel okLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
