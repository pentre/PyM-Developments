/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Foreman;

import controller.*;
import view.Employee.SearchInventory;
import view.Login;

/**
 *
 * @author jose
 */
public class ForemanMenu extends javax.swing.JFrame {
    private Controller controller_;
    
    public ForemanMenu(Controller controller) {
        controller_ = controller;
        initComponents();
        
        this.commissionOptionPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        furnitureOptionPanel = new javax.swing.JPanel();
        catalogLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        modifyLabel = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        commissionLabel = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        inventoryButton = new javax.swing.JLabel();
        furnitureLabel = new javax.swing.JLabel();
        commissionOptionPanel = new javax.swing.JPanel();
        furnitureCommissionLabel = new javax.swing.JLabel();
        addCommissionLabel = new javax.swing.JLabel();
        searchCommissionLabel = new javax.swing.JLabel();
        modifyCommissionLabel = new javax.swing.JLabel();
        closeCommission = new javax.swing.JLabel();
        commissionBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        furnitureOptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catalogLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(catalogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 150, 200));

        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 190));

        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 260, 190));

        modifyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(modifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 260, 190));

        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(deleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 260, 190));

        commissionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commissionLabelMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(commissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 70, 60));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 15, 50, 60));

        inventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseClicked(evt);
            }
        });
        furnitureOptionPanel.add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, 190));

        furnitureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Foreman Menu - Furniture.png"))); // NOI18N
        furnitureOptionPanel.add(furnitureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        getContentPane().add(furnitureOptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        commissionOptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        furnitureCommissionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                furnitureCommissionLabelMouseClicked(evt);
            }
        });
        commissionOptionPanel.add(furnitureCommissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 70, 40));

        addCommissionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCommissionLabelMouseClicked(evt);
            }
        });
        commissionOptionPanel.add(addCommissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, 190));

        searchCommissionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCommissionLabelMouseClicked(evt);
            }
        });
        commissionOptionPanel.add(searchCommissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 270, 190));

        modifyCommissionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyCommissionLabelMouseClicked(evt);
            }
        });
        commissionOptionPanel.add(modifyCommissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 270, 200));

        closeCommission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeCommissionMouseClicked(evt);
            }
        });
        commissionOptionPanel.add(closeCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 60));

        commissionBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Foreman Menu - Commissions.png"))); // NOI18N
        commissionOptionPanel.add(commissionBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        getContentPane().add(commissionOptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void furnitureCommissionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_furnitureCommissionLabelMouseClicked
        this.furnitureOptionPanel.setVisible(true);
        this.commissionOptionPanel.setVisible(false);
    }//GEN-LAST:event_furnitureCommissionLabelMouseClicked

    private void addCommissionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCommissionLabelMouseClicked
        CreateCommission addMenu = new CreateCommission(controller_);
        addMenu.setLocationRelativeTo(null);
        addMenu.setVisible(true);
    }//GEN-LAST:event_addCommissionLabelMouseClicked

    private void searchCommissionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCommissionLabelMouseClicked
        SearchCommissions searchMenu = new SearchCommissions(controller_);
        searchMenu.setLocationRelativeTo(null);
        searchMenu.setVisible(true);
    }//GEN-LAST:event_searchCommissionLabelMouseClicked

    private void modifyCommissionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCommissionLabelMouseClicked
        ModifyCommission modifyMenu = new ModifyCommission(controller_);
        modifyMenu.setLocationRelativeTo(null);
        modifyMenu.setVisible(true);
    }//GEN-LAST:event_modifyCommissionLabelMouseClicked

    private void closeCommissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeCommissionMouseClicked
       this.dispose();      
       Login login = new Login();                
       login.setVisible(true);
    }//GEN-LAST:event_closeCommissionMouseClicked

    private void commissionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commissionLabelMouseClicked
        this.commissionOptionPanel.setVisible(true);
        this.furnitureOptionPanel.setVisible(false);
    }//GEN-LAST:event_commissionLabelMouseClicked

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        DeleteFurniture deleteMenu = new DeleteFurniture(controller_);
        deleteMenu.setLocationRelativeTo(null);
        deleteMenu.setVisible(true);
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void modifyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLabelMouseClicked
        ModifyFurniture modifyMenu = new ModifyFurniture(controller_);
        modifyMenu.setLocationRelativeTo(null);
        modifyMenu.setVisible(true);
    }//GEN-LAST:event_modifyLabelMouseClicked

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        SearchFurniture searchMenu = new SearchFurniture(controller_);
        searchMenu.setLocationRelativeTo(null);
        searchMenu.setVisible(true);
    }//GEN-LAST:event_searchLabelMouseClicked

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        AddFurniture addMenu = new AddFurniture(controller_);
        addMenu.setLocationRelativeTo(null);
        addMenu.setVisible(true);
    }//GEN-LAST:event_addLabelMouseClicked

    private void catalogLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogLabelMouseClicked
        ListCatalog catalog = new ListCatalog(controller_);
        catalog.setLocationRelativeTo(null);
        catalog.setVisible(true);
    }//GEN-LAST:event_catalogLabelMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();   
        Login login = new Login();                
        login.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void inventoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseClicked
        SearchInventory inventory = new SearchInventory(controller_);
        inventory.setLocationRelativeTo(null);
        inventory.setVisible(true);
    }//GEN-LAST:event_inventoryButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCommissionLabel;
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel catalogLabel;
    private javax.swing.JLabel closeCommission;
    private javax.swing.JLabel commissionBackground;
    private javax.swing.JLabel commissionLabel;
    private javax.swing.JPanel commissionOptionPanel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel furnitureCommissionLabel;
    private javax.swing.JLabel furnitureLabel;
    private javax.swing.JPanel furnitureOptionPanel;
    private javax.swing.JLabel inventoryButton;
    private javax.swing.JLabel modifyCommissionLabel;
    private javax.swing.JLabel modifyLabel;
    private javax.swing.JLabel searchCommissionLabel;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
