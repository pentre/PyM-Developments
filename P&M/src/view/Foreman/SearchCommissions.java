/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Foreman;

import controller.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaime
 */
public class SearchCommissions extends javax.swing.JFrame {

    
    private Controller controller_;
    /**
     * Creates new form SearchCommisions
     */
    public SearchCommissions(Controller controller) {
        controller_ = controller;
        initComponents();
        
        buttonGroupStatus.add(pendingCommission);
        buttonGroupStatus.add(finishedCommission);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        finishedCommission = new javax.swing.JRadioButton();
        pendingCommission = new javax.swing.JRadioButton();
        dataScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefe de taller");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finishedCommission.setBackground(new java.awt.Color(255, 255, 255, 0));
        finishedCommission.setSelected(true);
        getContentPane().add(finishedCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        pendingCommission.setBackground(new java.awt.Color(255, 255, 255, 0));
        getContentPane().add(pendingCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 30));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de la orden", "Nombre del mueble", "Id del mueble", "Cantidad", "Sede"
            }
        ));
        dataTable.setEnabled(false);
        dataScrollPane.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setResizable(false);
            dataTable.getColumnModel().getColumn(1).setResizable(false);
            dataTable.getColumnModel().getColumn(2).setResizable(false);
            dataTable.getColumnModel().getColumn(3).setResizable(false);
            dataTable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(dataScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 760, 250));

        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });
        getContentPane().add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 170, 360, 50));

        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 80, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Search Orden.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        List<Map<String, String>> results = new ArrayList<>();
        if(finishedCommission.isSelected()){
            results = controller_.searchCommissions(true);
        }
        else{
            results = controller_.searchCommissions(false);
        }
        
        Object[] columnNames = { "Id de la orden", "Nombre del mueble", "Id del mueble", "Cantidad", "Sede"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        
        if(results.isEmpty()) {
            dataTable.setModel(model);
            JOptionPane.showMessageDialog(null, "No se encontraron resultados", "Jefe de taller", JOptionPane.INFORMATION_MESSAGE);            
            return;
        }        
        
        for(int i=0; i<results.size(); i++) {
            Object[] row = {
                results.get(i).get("order_id"),
                results.get(i).get("name"),
                results.get(i).get("furniture_id"),
                results.get(i).get("quantity"),
                results.get(i).get("branch")
            };
            model.addRow(row);
        }
        dataTable.setModel(model);
    }//GEN-LAST:event_searchLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
       this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JScrollPane dataScrollPane;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JRadioButton finishedCommission;
    private javax.swing.JRadioButton pendingCommission;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
