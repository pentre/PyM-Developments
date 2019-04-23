/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Employee;

import controller.Controller;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.Styler;

/**
 *
 * @author sofia
 */
public class GeneralReportByDay extends javax.swing.JFrame {
    private Controller controller_;
    /**
     * Creates new form ReportByDay
     */
    public GeneralReportByDay(Controller controller) {
        initComponents();
        controller_ = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        startDatePicker = new org.jdesktop.swingx.JXDatePicker();
        endDatePicker = new org.jdesktop.swingx.JXDatePicker();
        ChartPanel = new javax.swing.JPanel();
        generateReport = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(startDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 123, 270, 40));
        getContentPane().add(endDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 123, 270, 40));

        ChartPanel.setLayout(new javax.swing.BoxLayout(ChartPanel, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(ChartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 970, 470));

        generateReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateReportMouseClicked(evt);
            }
        });
        getContentPane().add(generateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 230, 60));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 0, 90, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_resources/Report by Day.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateReportMouseClicked
        java.util.Date startDate = startDatePicker.getDate();
        java.util.Date endDate = endDatePicker.getDate();
        
        if(startDate == null || endDate == null){
            JOptionPane.showMessageDialog(null, "Debe escoger dos fechas", "Reporte", JOptionPane.INFORMATION_MESSAGE);            
            return;
        }
        if (startDate == null || endDate == null || startDate.compareTo(endDate) > 0) {
            JOptionPane.showMessageDialog(this, "Error: debe seleccionar un rango de fechas valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Instant startInstant = startDate.toInstant();
        LocalDate startLocalDate = startInstant.atZone(ZoneId.systemDefault()).toLocalDate();
        
        Instant endInstant = endDate.toInstant();
        LocalDate endLocalDate = endInstant.atZone(ZoneId.systemDefault()).toLocalDate();
        
        long daysBetween = ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
        if (daysBetween > 31) {
            JOptionPane.showMessageDialog(null, "El rango de fecha no puede ser superior a un mes", "Reporte", JOptionPane.INFORMATION_MESSAGE);            
            return;
        }
        
        List <String> xData = new ArrayList<> ();
        List <Integer> yData = new ArrayList<> ();
     
        Map <String, Integer> datesMap = controller_.getGeneralReportByDay(startLocalDate, endLocalDate);
        for (Map.Entry<String, Integer> entry : datesMap.entrySet()) {            
            xData.add(entry.getKey().split("-")[2]);            
            yData.add(entry.getValue());         
        }

        JPanel chartPanelArea = new XChartPanel(this.getChart(xData, yData));
        ChartPanel.removeAll();
        ChartPanel.revalidate();
        ChartPanel.repaint();
        ChartPanel.add(chartPanelArea);
        ChartPanel.validate();
    }//GEN-LAST:event_generateReportMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

   private CategoryChart getChart(List<String> xData, List<Integer> yData) {
        
        CategoryChart chart = new CategoryChartBuilder().title("Ventas diarias").xAxisTitle("Días").yAxisTitle("Ventas").yAxisTitle("Ventas").theme(Styler.ChartTheme.GGPlot2).build();

        chart.addSeries("N° de ventas", xData, yData);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setYAxisLabelAlignment(Styler.TextAlignment.Left);

        return chart;
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
            java.util.logging.Logger.getLogger(GeneralReportByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralReportByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralReportByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralReportByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralReportByDay(new Controller()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChartPanel;
    private javax.swing.JLabel background;
    private org.jdesktop.swingx.JXDatePicker endDatePicker;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel generateReport;
    private javax.swing.JComboBox<String> jComboBox1;
    private org.jdesktop.swingx.JXDatePicker startDatePicker;
    // End of variables declaration//GEN-END:variables
}
