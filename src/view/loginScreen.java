package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;

import controller.UserController;
import database.DbConnection;
import models.User;

/**
 *
 * @author ACER
 */
public class loginScreen extends javax.swing.JFrame {

        /**
         * Creates new form loginScreen
         */
        public loginScreen() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                role = new javax.swing.ButtonGroup();
                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                Username = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                Password = new javax.swing.JPasswordField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                loginbtn = new javax.swing.JButton();
                jLabel9 = new javax.swing.JLabel();
                Admin = new javax.swing.JRadioButton();
                User = new javax.swing.JRadioButton();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(1920, 1080));

                jPanel2.setLayout(null);

                jLabel1.setBackground(java.awt.Color.black);
                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setText("Bus Ticketing System");
                jPanel2.add(jLabel1);
                jLabel1.setBounds(30, 30, 550, 50);

                jPanel3.setBackground(new java.awt.Color(102, 204, 255));

                jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("LOGIN");

                jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                jLabel5.setBackground(new java.awt.Color(0, 0, 0));
                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel5.setText("Email Address");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel6.setText("Password");

                jButton1.setBackground(new java.awt.Color(102, 204, 255));
                jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                jButton1.setText("Don't have an account? Sign Up");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(102, 204, 255));
                jButton2.setForeground(new java.awt.Color(153, 51, 255));
                jButton2.setText("Forgot Password ?");

                loginbtn.setBackground(new java.awt.Color(102, 102, 255));
                loginbtn.setText("LOG IN");
                loginbtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginbtnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(55, 55, 55)
                                                                                                .addComponent(jButton1)
                                                                                                .addGap(55, 55, 55)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(70, 70, 70)
                                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                215,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(Username)
                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(Password)
                                                                                                                                                .addComponent(jButton2,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(233, 233,
                                                                                                                                                233)
                                                                                                                                .addComponent(jLabel3))
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(115, 115,
                                                                                                                                                115)
                                                                                                                                .addComponent(loginbtn,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                128,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(94, 94, 94)
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                191,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(88, 88, 88)
                                                                                                .addComponent(jLabel4))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jButton1)))
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Username,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Password,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(loginbtn)
                                                                .addContainerGap(22, Short.MAX_VALUE)));

                jPanel2.add(jPanel3);
                jPanel3.setBounds(890, 180, 370, 383);
                jPanel2.add(jLabel9);
                jLabel9.setBounds(2005, 56, 192, 26);

                role.add(Admin);
                Admin.setText("Admin");
                jPanel2.add(Admin);
                Admin.setBounds(750, 220, 98, 21);

                role.add(User);
                User.setText("User");
                User.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                UserActionPerformed(evt);
                        }
                });
                jPanel2.add(User);
                User.setBounds(750, 250, 98, 21);

                jLabel8.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/view/MicrosoftTeams-image (1).png"))); // NOI18N
                jLabel8.setPreferredSize(new java.awt.Dimension(1920, 1080));
                jPanel2.add(jLabel8);
                jLabel8.setBounds(0, 0, 1360, 750);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                1280,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void UserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UserActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_UserActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton1ActionPerformed

        private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginbtnActionPerformed
                String uname = Username.getText();
                String password = new String(Password.getPassword());
                String role = null;
                if (Admin.isSelected()) {
                        role = "Admin";
                } else if (User.isSelected()) {
                        role = "User";
                } else {
                        JOptionPane.showMessageDialog(this, "Select a role");
                }
                // DbConnection db = new DbConnection();
                try {
                        User u1 = new User(null, uname, password, null, null, null, null);
                        UserController uc = new UserController();
                        ResultSet rs = uc.login(u1);
                        if (rs.next()) {
                                // rs.change
                                JOptionPane.showMessageDialog(this, "Login Success");
                                uc.changestatus(u1);
                                uc.updatestatus(u1);
                                if (role == "Admin") {
                                        dispose();
                                        new adminDashboard().setVisible(true);
                                }

                                else if (role == "User") {
                                        dispose();
                                        new UserDashboard().setVisible(true);
                                }
                        }
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }
        // onPerformed

        public static void main(String[] args) {
                new loginScreen().setVisible(true);
        }

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JRadioButton Admin;
        private javax.swing.JPasswordField Password;
        private javax.swing.JRadioButton User;
        private javax.swing.JTextField Username;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JButton loginbtn;
        private javax.swing.ButtonGroup role;
        // End of variables declaration//GEN-END:variables
}
