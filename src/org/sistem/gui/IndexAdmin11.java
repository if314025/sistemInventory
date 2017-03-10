/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistem.gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;

/**
 *
 * @author Okta
 */
public class IndexAdmin11 extends javax.swing.JFrame {

    private PreparedStatement preparedStatement = null;
    private JChannel channel = null;
    private String nama = null, jenis = null, jumlah = null;
    private DefaultTableModel tabelModel = null;
    private ResultSet resultSet = null;
    private int idBarang ;

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }
    
    
    private Login lgn = Login.getInstanceData();
    private Connection myConnection = lgn.getKoneksi();
    public String myGroup = lgn.getGroup();
    
    public IndexAdmin11() {
        initComponents();
        jLabel3.setText(lgn.getUsername() + " sedang aktif....");
        
        tabelModel = new DefaultTableModel();
        jTable1.setModel(tabelModel);
        tabelModel.addColumn("id_menu");
        tabelModel.addColumn("Nama_Menu");
        tabelModel.addColumn("Keterangan_Menu");
        tabelModel.addColumn("harga_menu");
        loadTabelBarang();
    }
    
    private void loadTabelBarang()
    {
        tabelModel.getDataVector().removeAllElements();
        tabelModel.fireTableDataChanged();
        
        try
        {
            String query = "SELECT * FROM menu ORDER BY id_menu";
            preparedStatement = myConnection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Object[] ob = new Object[4];
                
                ob[0] = resultSet.getString("id_menu");
                ob[1] = resultSet.getString("nama_menu");
                ob[2] = resultSet.getString("ket_menu");
                ob[3] = resultSet.getString("harga_menu");
                
                
                tabelModel.addRow(ob);
            }
            
            resultSet.close();
            preparedStatement.close();
        }
        catch(SQLException e)
        { }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Menu");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("Del's Cafe");

        jLabel3.setText("jLabel3");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Menu");

        jLabel5.setText("Keterangan Menu");

        jLabel6.setText("Harga");

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(218, 218, 218)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(35, 35, 35))
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 34, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(218, 218, 218))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new pegawaiui().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nama = jTextField1.getText();
        jenis = jTextField2.getText();
        jumlah = jTextField3.getText();
        
        clearField();
        if(validation(nama, jenis, jumlah) == false)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Error.");
            defaultValue();
        }
        else
        {
             try {
                 updateDataBarang(nama, jenis, jumlah);
             } catch (SQLException ex) {
                 Logger.getLogger(IndexAdmin11.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            try
            { sendMessageUpdate(); }
            catch (Exception ex)
            { }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int row = jTable1.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null, "Pilih data.....");
        }
        else
        {
             int test = Integer.valueOf(tabelModel.getValueAt(row, 0)+"") ;
            setIdBarang(test);
            jTextField1.setText(tabelModel.getValueAt(row, 1)+"");
            jTextField2.setText(tabelModel.getValueAt(row, 2)+"");
            jTextField3.setText(tabelModel.getValueAt(row, 3)+"");
            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_jTable1MouseReleased

    private void jScrollPane3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseReleased
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_jScrollPane3MouseReleased

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        // TODO add your handling code here:
                

        
    }//GEN-LAST:event_jTable1MouseExited
    
    private boolean validation(String nama, String jenis, String jumlah)
    {
        if(nama.equalsIgnoreCase(""))
        {
            return false;
        }
        else if(jenis.equalsIgnoreCase(""))
        {
            return false;
        }
        else if(jumlah.equalsIgnoreCase(""))
        {
            return false;
        }
        
        return true;
    }
    
    private void clearField()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
    }
    
    
    
    private void tambahDataBarang(String nama, String jenis, String jumlah)
    {
        try
        {
            String query = "INSERT INTO daftar_barang (Nama_Barang, Jenis_barang, Jumlah_Barang) VALUES (?,?,?)";
            preparedStatement = myConnection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, jenis);
            preparedStatement.setString(3, jumlah);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Barang berhasil ditambahkan.");
            
            preparedStatement.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "ERROR SQL Mahasiswa");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    private void defaultValue()
    {
        this.nama = null;
        this.jenis = null;
        this.jumlah = null;
    }
    
    public void runJGroup() throws Exception
    {
        channel = new JChannel();
        channel.connect(myGroup);
        doReceive();
    }
    
    public void doReceive()
    {
        channel.setReceiver(new ReceiverAdapter()
        {
            public void receive(Message msg)
            {
                loadTabelBarang();
               
            }
        });
    }
    
    public void sendMessage() throws Exception
    {
        
        channel.send(new Message(null, "Barang dengan data :"
                + "\nNama Barang\t: " + nama
                + "\nJenis Barang\t: " + jenis
                + "\nJumlah Barang\t: " + jumlah
                + "\nBerhasil ditambahkan\n"));
        defaultValue();
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void updateDataBarang(String nama, String jenis, String jumlah) throws SQLException {
        
        
        String query1 = "SELECT * FROM menu WHERE id_menu = ?";
        preparedStatement = myConnection.prepareStatement(query1);
        preparedStatement.setInt(1,getIdBarang());
        resultSet = preparedStatement.executeQuery();
        String query = "UPDATE menu "
                + "SET nama_menu=?, ket_menu=?, harga_menu=? "
                + "WHERE id_menu = ?";
                
                
        preparedStatement = myConnection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenis);
        preparedStatement.setString(3, jumlah);
        preparedStatement.setInt(4, getIdBarang());
        preparedStatement.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Data berhasil diupdate......");
        
        preparedStatement.close();    }

    private void HapusDataBarang() throws SQLException {
    String query1 = "SELECT * FROM daftar_barang WHERE id_barang = ?";
        preparedStatement = myConnection.prepareStatement(query1);
        preparedStatement.setInt(1,getIdBarang());
        resultSet = preparedStatement.executeQuery();
        String query = "DELETE from daftar_barang "
                
                + "WHERE id_barang = ?";
                
                
        preparedStatement = myConnection.prepareStatement(query);
        
        preparedStatement.setInt(1, getIdBarang());
        preparedStatement.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Data berhasil diupdate......");
        
        preparedStatement.close(); 
    }

    private void sendMessageHapus() throws Exception {
    channel.send(new Message(null, "Barang dengan data :"
                + "\nNama Barang\t: " + nama
                + "\nJenis Barang\t: " + jenis
                + "\nJumlah Barang\t: " + jumlah
                + "\nBerhasil diHapus\n"));
        defaultValue();   
    }

    private void sendMessageUpdate() throws Exception {
channel.send(new Message(null, "Barang dengan data :"
                + "\nNama Barang\t: " + nama
                + "\nJenis Barang\t: " + jenis
                + "\nJumlah Barang\t: " + jumlah
                + "\nBerhasil diUpdate\n"));
        defaultValue();    }
}
