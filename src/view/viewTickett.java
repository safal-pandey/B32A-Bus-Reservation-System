/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.TicketController;
import models.Ticket;
import star.rating.*;
/**
 *
 * @author Suyogya
 */
public class viewTickett extends javax.swing.JFrame {

    private int rate;
    /**
     * Creates new form viewTickett
     */
    public viewTickett() {
        initComponents();
        view();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form EditorS.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rateFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        starRating2 = new star.rating.StarRating();
        Submit = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        rateBtn = new javax.swing.JButton();

        rateFrame.setMinimumSize(new java.awt.Dimension(370, 400));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        starRating2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(starRating2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 80));

        Submit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 290, 180, 60));

        idText.setEditable(false);
        jPanel2.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 240, 50));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rate Ticket");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 50));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel3.setText("Ticket Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 50));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Your Rating");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, 50));

        javax.swing.GroupLayout rateFrameLayout = new javax.swing.GroupLayout(rateFrame.getContentPane());
        rateFrame.getContentPane().setLayout(rateFrameLayout);
        rateFrameLayout.setHorizontalGroup(
            rateFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        rateFrameLayout.setVerticalGroup(
            rateFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Home");

        jButton2.setText("Search Tickets");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Book Tickets");

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setText("My Tickets");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("My Profile");

        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("BUS TICKETING SYSTEM");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ticket No.", "Bus No.", "From City", "To City", "Seat No.", "Ticket Price", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(viewTable);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        rateBtn.setText("Rate");
        rateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addGap(27, 27, 27)
                        .addComponent(rateBtn)
                        .addGap(29, 29, 29)
                        .addComponent(updateBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(99, 99, 99)
                                        .addComponent(jButton2)
                                        .addGap(132, 132, 132)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                        .addComponent(jButton4)))
                                .addGap(131, 131, 131)
                                .addComponent(jButton5)
                                .addGap(122, 122, 122)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane1))
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(updateBtn)
                    .addComponent(rateBtn))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        TableModel model = viewTable.getModel();
        int i = viewTable.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(i, 0).toString());
        Ticket t1 = new Ticket(id,0,null,null,null,0,null,null,null,null,null,null);
        TicketController tc=  new TicketController();
        int result = tc.cancelTicket(t1);
        if(result>0){
            JOptionPane.showMessageDialog(this, "Canceled Ticket", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void rateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateBtnActionPerformed
        TableModel model = viewTable.getModel();
        int i = viewTable.getSelectedRow();
        String id = model.getValueAt(i, 0).toString();
        idText.setText(id);
        rateFrame.setVisible(true);
        starRating2.addEventStarRating(new EventStarRating() {
            @Override
            public void selected(int star) {
                rate= star;
            }
        });
    }//GEN-LAST:event_rateBtnActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        if(rate==0){
            JOptionPane.showMessageDialog(this, "No rating Selected","Error", JOptionPane.ERROR_MESSAGE, null);;
        }else{
            Ticket t1 = new Ticket(Integer.parseInt(idText.getText()),0,null,null,null,0,null,null,null,null,null,Integer.toString(rate));
            TicketController tc = new TicketController();
            int result = tc.Rate(t1);
            view();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_updateBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton9ActionPerformed

    public void view() {

        try {
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);
            Ticket t1 = new Ticket(0, 0, null, null, null, 0, null, null, null,null,null,null);
            TicketController tc = new TicketController();
            ResultSet result = tc.viewTicket(t1);
            while (result.next()) {
                String ticket = result.getString(1);
                String bus = result.getString(2);
                String from = result.getString(3);
                String to = result.getString(4);
                String seat_no = result.getString(5);
                String ticket_price = result.getString(6);
                String time = result.getString(7);

                // JOptionPane.showMessageDialog(null, ticket + " " + bus + " " + seat_no + " "
                // + ticket_price);
                Object[] row = { ticket, bus,from,to, seat_no, ticket_price, time };
                model.addRow(row);

                // JOptionPane.showMessageDialog(null, ticket + " " + bus + " " + seat_no + " "
                // + ticket_price + " " + email);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewTickett.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTickett.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTickett.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTickett.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTickett().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rateBtn;
    private javax.swing.JFrame rateFrame;
    private star.rating.StarRating starRating2;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
