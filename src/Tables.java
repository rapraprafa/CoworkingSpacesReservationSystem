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
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tables extends javax.swing.JFrame {

    /**
     * Creates new form Tables
     */
    public Tables() {
        initComponents();
        showTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButtonGroupT = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        refreshRoomTable = new javax.swing.JButton();
        deleteRoomTable = new javax.swing.JButton();
        editRoomTable = new javax.swing.JButton();
        addRoomTable = new javax.swing.JButton();
        tableID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tableName = new javax.swing.JTextField();
        tableMaterial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tableSize = new javax.swing.JTextField();
        tablePrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchTableQuery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backgroundBlue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tables");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TABLES DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 0, 100, 30);

        refreshRoomTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        refreshRoomTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-refresh-50.png"))); // NOI18N
        refreshRoomTable.setText("Refresh");
        refreshRoomTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshRoomTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshRoomTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshRoomTableActionPerformed(evt);
            }
        });
        getContentPane().add(refreshRoomTable);
        refreshRoomTable.setBounds(560, 30, 130, 80);

        deleteRoomTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        deleteRoomTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-delete-bin-50.png"))); // NOI18N
        deleteRoomTable.setText("Archive Selected");
        deleteRoomTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteRoomTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteRoomTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomTableActionPerformed(evt);
            }
        });
        getContentPane().add(deleteRoomTable);
        deleteRoomTable.setBounds(260, 30, 130, 80);

        editRoomTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        editRoomTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-edit-50.png"))); // NOI18N
        editRoomTable.setText("Edit Info");
        editRoomTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editRoomTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editRoomTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRoomTableActionPerformed(evt);
            }
        });
        getContentPane().add(editRoomTable);
        editRoomTable.setBounds(410, 30, 130, 80);

        addRoomTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        addRoomTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-add-50.png"))); // NOI18N
        addRoomTable.setText("Add an Item");
        addRoomTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addRoomTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addRoomTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomTableActionPerformed(evt);
            }
        });
        getContentPane().add(addRoomTable);
        addRoomTable.setBounds(110, 30, 130, 80);

        tableID.setEditable(false);
        tableID.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tableID);
        tableID.setBounds(150, 130, 140, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/icons8-back-arrow-40.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 30, 40, 50);

        tableName.setEditable(false);
        tableName.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tableName);
        tableName.setBounds(150, 180, 140, 30);

        tableMaterial.setEditable(false);
        tableMaterial.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tableMaterial);
        tableMaterial.setBounds(150, 230, 140, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Material");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 230, 70, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Table Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 180, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Table ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 130, 70, 30);

        tableSize.setEditable(false);
        tableSize.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tableSize);
        tableSize.setBounds(480, 130, 140, 30);

        tablePrice.setEditable(false);
        tablePrice.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tablePrice);
        tablePrice.setBounds(480, 180, 140, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Size");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(430, 130, 50, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 180, 50, 30);

        searchTableQuery.setMinimumSize(new java.awt.Dimension(2, 20));
        searchTableQuery.setPreferredSize(new java.awt.Dimension(2, 20));
        searchTableQuery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTableQueryKeyReleased(evt);
            }
        });
        getContentPane().add(searchTableQuery);
        searchTableQuery.setBounds(480, 270, 210, 30);

        tablesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table ID", "Table Name", "Material", "Size", "Price", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablesTable);
        if (tablesTable.getColumnModel().getColumnCount() > 0) {
            tablesTable.getColumnModel().getColumn(0).setResizable(false);
            tablesTable.getColumnModel().getColumn(1).setResizable(false);
            tablesTable.getColumnModel().getColumn(2).setResizable(false);
            tablesTable.getColumnModel().getColumn(3).setResizable(false);
            tablesTable.getColumnModel().getColumn(4).setResizable(false);
            tablesTable.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 680, 160);

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 280, 40, 14);

        backgroundBlue.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/coworkingspacesreservation/adminb.jpg")).getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH)));
        getContentPane().add(backgroundBlue);
        backgroundBlue.setBounds(0, 0, 700, 500);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Minimize");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Shortcuts");

        jMenu3.setText("Rooms Details");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Add Room");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu2.add(jMenu3);

        jMenu4.setText("Tables Details");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Add Table");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu2.add(jMenu4);

        jMenu6.setText("Reservations");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Add Reservation");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<TableData> tablesList(){
        ArrayList<TableData> tablesList = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coworkingspacesreservation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "15264859");
            String query1 = "select * from tables";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            TableData tabledata;
            while (rs.next()){
                tabledata = new TableData(rs.getInt("table_id"), rs.getString("table_name"), rs.getString("table_material"), rs.getString("table_size"), rs.getString("table_price"), rs.getBoolean("available"));
                tablesList.add(tabledata);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return tablesList;
    }
    
    public void showTables(){
        ArrayList<TableData> list = tablesList();
        DefaultTableModel tablesTableModel = (DefaultTableModel)tablesTable.getModel();
        tablesTableModel.setRowCount(0);
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getTableID();
            row[1] = list.get(i).getTableName();
            row[2] = list.get(i).getTableMaterial();
            row[3] = list.get(i).getTableSize();
            row[4] = list.get(i).getTablePrice();
            row[5] = list.get(i).getavailable();
            tablesTableModel.addRow(row);
        }
    }
    
    
    private void refreshRoomTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshRoomTableActionPerformed
        showTables();
    }//GEN-LAST:event_refreshRoomTableActionPerformed

    private void editRoomTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRoomTableActionPerformed
        try{
            EditTableDetails edittabledetails = new EditTableDetails();
            int index = tablesTable.getSelectedRow();
            TableModel tablesTableModel = tablesTable.getModel();
            String tableID = tablesTableModel.getValueAt(index, 0).toString();
            String tableName = tablesTableModel.getValueAt(index, 1).toString();
            String tableMaterial = tablesTableModel.getValueAt(index, 2).toString();
            String tableSize = tablesTableModel.getValueAt(index, 3).toString();
            String tablePrice = tablesTableModel.getValueAt(index, 4).toString();
            edittabledetails.setVisible(true);
            edittabledetails.updateTableID.setText(tableID);
            edittabledetails.updateTableName.setText(tableName);
            edittabledetails.updateTableMaterial.setText(tableMaterial);
            edittabledetails.updateTableSize.setText(tableSize);
            edittabledetails.updateTablePrice.setText(tablePrice);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row to update first!");
        }
    }//GEN-LAST:event_editRoomTableActionPerformed

    private void addRoomTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomTableActionPerformed
        AddTable addtable = new AddTable();
        addtable.setVisible(true);
    }//GEN-LAST:event_addRoomTableActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        CloseMe();
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        showTables();
    }//GEN-LAST:event_formWindowGainedFocus

    private void tablesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesTableMouseClicked
        int i = tablesTable.getSelectedRow();
        TableModel tablesTableModel = tablesTable.getModel();
        tableID.setText(tablesTableModel.getValueAt(i,0).toString());
        tableName.setText(tablesTableModel.getValueAt(i,1).toString());
        tableMaterial.setText(tablesTableModel.getValueAt(i,2).toString());
        tableSize.setText(tablesTableModel.getValueAt(i,3).toString());
        tablePrice.setText(tablesTableModel.getValueAt(i,4).toString());
    }//GEN-LAST:event_tablesTableMouseClicked

    private void deleteRoomTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomTableActionPerformed
        try{
            if (!("".equals(tableID.getText()))){
            int confirm = JOptionPane.showConfirmDialog(tablesTable, "Are you sure you want to delete table " + tableName.getText() + " from your database?", "Delete Table", JOptionPane.OK_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION){
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coworkingspacesreservation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "15264859");
                    String idTable = tableID.getText();
                    String query2 = "delete from tables where table_id = '"+idTable+"'";
                    PreparedStatement pst = con.prepareStatement(query2);
                    pst.execute();
                    showTables();
                }
            }
            else{
                System.out.println("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row to delete first!");
        }
    }//GEN-LAST:event_deleteRoomTableActionPerformed

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setIcon(new javax.swing.ImageIcon("icons8-close-window-30-ConvertImage.png"));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        CloseMe();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new javax.swing.ImageIcon("icons8-close-window-30.png"));
    }//GEN-LAST:event_jLabel9MouseExited

    private void searchTableQueryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTableQueryKeyReleased

        ArrayList<TableData> list = new ArrayList<TableData>();
        String searchQuery = searchTableQuery.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coworkingspacesreservation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "15264859");
                String searchCommand = "select * from tables where table_id like '%"+searchQuery+"%' or table_name like '%"+searchQuery+"%' or table_material like '%"+searchQuery+"%' or table_size like '%"+searchQuery+"%' or table_price like '%"+searchQuery+"%'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(searchCommand);
                TableData tabledata;
                while (rs.next()){
                    tabledata = new TableData(rs.getInt("table_id"), rs.getString("table_name"), rs.getString("table_material"), rs.getString("table_size"), rs.getString("table_price"), rs.getBoolean("available"));
                    list.add(tabledata);
                }
        }
        catch(Exception e){
            System.out.println("Type in search textfield to search");
        }
        
        DefaultTableModel tablesTableModel = (DefaultTableModel)tablesTable.getModel();
        tablesTableModel.setRowCount(0);
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getTableID();
            row[1] = list.get(i).getTableName();
            row[2] = list.get(i).getTableMaterial();
            row[3] = list.get(i).getTableSize();
            row[4] = list.get(i).getTablePrice();
            row[5] = list.get(i).getavailable();
            tablesTableModel.addRow(row);
        }
    }//GEN-LAST:event_searchTableQueryKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CloseMe();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AddRoom addroom = new AddRoom();
        addroom.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AddTable addtable = new AddTable();
        addtable.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AddReservation addreservation = new AddReservation();
        addreservation.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tables().setVisible(true);
            }
        });
    }
    
    private void CloseMe(){
        WindowEvent meClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomTable;
    private javax.swing.JLabel backgroundBlue;
    private javax.swing.JButton deleteRoomTable;
    private javax.swing.JButton editRoomTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshRoomTable;
    private javax.swing.ButtonGroup searchButtonGroupT;
    private javax.swing.JTextField searchTableQuery;
    private javax.swing.JTextField tableID;
    private javax.swing.JTextField tableMaterial;
    private javax.swing.JTextField tableName;
    private javax.swing.JTextField tablePrice;
    private javax.swing.JTextField tableSize;
    private javax.swing.JTable tablesTable;
    // End of variables declaration//GEN-END:variables
}
