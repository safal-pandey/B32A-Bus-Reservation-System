/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author gamer
 */
public class DashboardAdmin extends javax.swing.JFrame {

        /**
         * Creates new form DashboardAdmin
         */
        public DashboardAdmin() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jToggleButton6 = new javax.swing.JToggleButton();
                jToggleButton2 = new javax.swing.JToggleButton();
                jToggleButton7 = new javax.swing.JToggleButton();
                jToggleButton4 = new javax.swing.JToggleButton();
                jToggleButton5 = new javax.swing.JToggleButton();
                jToggleButton1 = new javax.swing.JToggleButton();
                jToggleButton3 = new javax.swing.JToggleButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(0, 204, 153));

                jToggleButton6.setText("Home");

                jToggleButton2.setText("Add Bus");

                jToggleButton7.setText("View Bus");
                jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton7ActionPerformed(evt);
                        }
                });

                jToggleButton4.setText("Add Ticket");
                jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton4ActionPerformed(evt);
                        }
                });

                jToggleButton5.setText("Tickets");

                jToggleButton1.setText("My profile");

                jToggleButton3.setText("Log Out");

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Bus Ticketing System");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel2.setText("Welcome to Bus Ticketing System Admin. From here, you will be");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel4.setText("able to perform actions like adding buses, updating buses, viewing");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel3.setText("buses, adding tickets, viewing tickets and updating tickets.");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(66, 66, 66)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(77, 77, 77)
                                                                                                                                .addComponent(jLabel2))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jToggleButton6)
                                                                                                                                                                .addGap(46, 46, 46)
                                                                                                                                                                .addComponent(jToggleButton2)
                                                                                                                                                                .addGap(46, 46, 46)
                                                                                                                                                                .addComponent(jToggleButton7)
                                                                                                                                                                .addGap(39, 39, 39)
                                                                                                                                                                .addComponent(jToggleButton4)
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addComponent(jToggleButton5)
                                                                                                                                                                .addGap(47, 47, 47)
                                                                                                                                                                .addComponent(jToggleButton1)
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addComponent(jToggleButton3))
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                742,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel4))))
                                                                                                .addGap(0, 8, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                39,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jToggleButton6)
                                                                                .addComponent(jToggleButton2)
                                                                                .addComponent(jToggleButton1)
                                                                                .addComponent(jToggleButton5)
                                                                                .addComponent(jToggleButton7)
                                                                                .addComponent(jToggleButton3)
                                                                                .addComponent(jToggleButton4))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                88,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addGap(133, 133, 133)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton7ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jToggleButton7ActionPerformed

        private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton4ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jToggleButton4ActionPerformed

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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new DashboardAdmin().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JToggleButton jToggleButton1;
        private javax.swing.JToggleButton jToggleButton2;
        private javax.swing.JToggleButton jToggleButton3;
        private javax.swing.JToggleButton jToggleButton4;
        private javax.swing.JToggleButton jToggleButton5;
        private javax.swing.JToggleButton jToggleButton6;
        private javax.swing.JToggleButton jToggleButton7;
        // End of variables declaration//GEN-END:variables
}
