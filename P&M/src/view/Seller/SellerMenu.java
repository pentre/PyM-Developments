/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Seller;

import controller.*;
import view.Foreman.ListCatalog;
/**
 *
 * @author jose
 */
public class SellerMenu extends javax.swing.JFrame {
    private Controller controller_;
    
    public SellerMenu(Controller controller) {
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

        salesPanel = new javax.swing.JPanel();
        salesLabel = new javax.swing.JLabel();
        inventoryLabel = new javax.swing.JLabel();
        catalogLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        salesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesLabelMouseClicked(evt);
            }
        });
        salesPanel.add(salesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 540, 190));

        inventoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryLabelMouseClicked(evt);
            }
        });
        salesPanel.add(inventoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 270, 200));

        catalogLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogLabelMouseClicked(evt);
            }
        });
        salesPanel.add(catalogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 270, 200));
        salesPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 15, 50, 50));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Seller Menu.png"))); // NOI18N
        salesPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesLabelMouseClicked
        Sale sale = new Sale(controller_);
        sale.setLocationRelativeTo(null);
        sale.setVisible(true);
    }//GEN-LAST:event_salesLabelMouseClicked

    private void inventoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryLabelMouseClicked
        
    }//GEN-LAST:event_inventoryLabelMouseClicked

    private void catalogLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogLabelMouseClicked
       ListCatalog catalog = new ListCatalog(controller_);
       catalog.setLocationRelativeTo(null);
       catalog.setVisible(true);
    }//GEN-LAST:event_catalogLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel catalogLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JLabel salesLabel;
    private javax.swing.JPanel salesPanel;
    // End of variables declaration//GEN-END:variables
}
