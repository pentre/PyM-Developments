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
public class SearchFurniture extends javax.swing.JFrame {
    private Controller controller_;
    /**
     * Creates new form SearchFurniture
     */
    public SearchFurniture(Controller controller) {
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

        idTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        searchLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        idTextField.setBorder(null);
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 360, 20));

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setForeground(new java.awt.Color(255, 255, 255));
        infoTextArea.setRows(5);
        infoTextArea.setBorder(null);
        jScrollPane1.setViewportView(infoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 760, 250));

        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });
        getContentPane().add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 320, 40));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 0, 70, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Search Furniture.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyTyped
        char inputChar = evt.getKeyChar();
        if(!(Character.isDigit(inputChar))){
            evt.consume();
        }
    }//GEN-LAST:event_idTextFieldKeyTyped

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        if(idTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor digite la referencia del mueble");
            return;
        }
        int id = Integer.parseInt(idTextField.getText());
        
        String info = controller_.getFurnitureInfo(id);
        
        if (info == ""){
            JOptionPane.showMessageDialog(this,"No existe un mueble con esa referencia");  
            idTextField.setText("");
            return;
        }
        
        infoTextArea.setText(info);  
    }//GEN-LAST:event_searchLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
