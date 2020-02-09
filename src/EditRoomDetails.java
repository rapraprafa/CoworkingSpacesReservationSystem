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
 
public class EditRoomDetails extends javax.swing.JFrame {

    /**
     * Creates new form EditRoomDetails
     */
    public EditRoomDetails() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateRoomID = new javax.swing.JTextField();
        updateRoomName = new javax.swing.JTextField();
        updateRoomLocation = new javax.swing.JTextField();
        updateRoomPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        updateRoomSize = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        backgroundBlue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Room Details");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EDIT ROOM DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 0, 110, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 110, 70, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 160, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 210, 70, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 310, 60, 30);

        updateRoomID.setEditable(false);
        updateRoomID.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(updateRoomID);
        updateRoomID.setBounds(270, 110, 210, 30);
        getContentPane().add(updateRoomName);
        updateRoomName.setBounds(270, 160, 210, 30);
        getContentPane().add(updateRoomLocation);
        updateRoomLocation.setBounds(270, 210, 210, 30);
        getContentPane().add(updateRoomPrice);
        updateRoomPrice.setBounds(270, 310, 210, 30);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 370, 110, 23);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 420, 110, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Size");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 260, 50, 30);
        getContentPane().add(updateRoomSize);
        updateRoomSize.setBounds(270, 260, 210, 30);

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

        backgroundBlue.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/adminb.jpg")).getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH)));
        getContentPane().add(backgroundBlue);
        backgroundBlue.setBounds(0, 0, 700, 500);

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
            String roomIDupdate = updateRoomID.getText();
            String roomNameupdate = updateRoomName.getText();
            String roomLocationupdate = updateRoomLocation.getText();
            String roomSizeupdate = updateRoomSize.getText();
            String roomPriceupdate = updateRoomPrice.getText();
            String cmd = "update rooms set room_name = '"+roomNameupdate+"', room_location = '"+roomLocationupdate+"', room_size = '"+roomSizeupdate+"', room_price = '"+roomPriceupdate+"' WHERE room_id = '"+roomIDupdate+"'";
            PreparedStatement pst = con.prepareStatement(cmd);
            if ("".equals(updateRoomName.getText()) || "".equals(updateRoomLocation.getText()) || "".equals(updateRoomSize.getText()) || (!updateRoomPrice.getText().matches("[0-9]+"))){
                JOptionPane.showMessageDialog(null, "Error updating. Please make sure you entered valid credentials.");
            }
            else{
                pst.execute();
                CloseMe();
            }
        }
        catch(Exception e){
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(EditRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRoomDetails().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField updateRoomID;
    public javax.swing.JTextField updateRoomLocation;
    public javax.swing.JTextField updateRoomName;
    public javax.swing.JTextField updateRoomPrice;
    public javax.swing.JTextField updateRoomSize;
    // End of variables declaration//GEN-END:variables
}
