/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafamus
 */

import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.sql.*;

public class AddRoom extends javax.swing.JFrame {

    /**
     * Creates new form AddRoomTable
     */
    public AddRoom() {
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

        titleLabel = new javax.swing.JLabel();
        nameRoomTable1 = new javax.swing.JLabel();
        locationRoomTable1 = new javax.swing.JLabel();
        priceRoomTable1 = new javax.swing.JLabel();
        nameRoom = new javax.swing.JTextField();
        locationRoom = new javax.swing.JTextField();
        priceRoom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sizeRoom = new javax.swing.JTextField();
        backgroundBlue = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Room/Table");
        setResizable(false);
        getContentPane().setLayout(null);

        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("ADD ROOM");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(90, 0, 110, 30);

        nameRoomTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nameRoomTable1.setForeground(new java.awt.Color(255, 255, 255));
        nameRoomTable1.setText("Room Name");
        getContentPane().add(nameRoomTable1);
        nameRoomTable1.setBounds(210, 120, 90, 30);

        locationRoomTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locationRoomTable1.setForeground(new java.awt.Color(255, 255, 255));
        locationRoomTable1.setText("Location");
        getContentPane().add(locationRoomTable1);
        locationRoomTable1.setBounds(230, 180, 60, 30);

        priceRoomTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        priceRoomTable1.setForeground(new java.awt.Color(255, 255, 255));
        priceRoomTable1.setText("Price");
        getContentPane().add(priceRoomTable1);
        priceRoomTable1.setBounds(250, 300, 40, 30);
        getContentPane().add(nameRoom);
        nameRoom.setBounds(300, 120, 210, 30);
        getContentPane().add(locationRoom);
        locationRoom.setBounds(300, 180, 210, 30);
        getContentPane().add(priceRoom);
        priceRoom.setBounds(300, 300, 210, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 380, 130, 23);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 430, 130, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Size");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 240, 40, 30);
        getContentPane().add(sizeRoom);
        sizeRoom.setBounds(300, 240, 210, 30);

        backgroundBlue.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/adminb.jpg")).getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH)));
        getContentPane().add(backgroundBlue);
        backgroundBlue.setBounds(0, 0, 700, 500);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-close-window-30.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(670, 0, 30, 30);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CloseMe();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coworkingspacesreservation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "15264859");
            String query = "insert into rooms (room_name,room_location,room_size,room_price) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nameRoom.getText());
            pst.setString(2, locationRoom.getText());
            pst.setString(3, sizeRoom.getText());
            pst.setString(4, priceRoom.getText());
            if ("".equals(nameRoom.getText()) || "".equals(locationRoom.getText()) || "".equals(sizeRoom.getText()) || (!priceRoom.getText().matches("[0-9]+"))){
                JOptionPane.showMessageDialog(null, "Error adding. Please make sure you entered valid credentials.");
            }
            else{
                pst.execute();
                CloseMe();
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error adding.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setIcon(new javax.swing.ImageIcon("icons8-close-window-30-ConvertImage.png"));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        CloseMe();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new javax.swing.ImageIcon("icons8-close-window-30.png"));
    }//GEN-LAST:event_jLabel9MouseExited

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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
            }
        });
    }
    
    private void CloseMe(){
        WindowEvent meClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBlue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField locationRoom;
    private javax.swing.JLabel locationRoomTable1;
    private javax.swing.JTextField nameRoom;
    private javax.swing.JLabel nameRoomTable1;
    private javax.swing.JTextField priceRoom;
    private javax.swing.JLabel priceRoomTable1;
    private javax.swing.JTextField sizeRoom;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
