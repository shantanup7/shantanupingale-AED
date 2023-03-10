/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.SystemAdmin;

/**
 *
 * @author shant
 */
public class ViewCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityPanel
     */
    SystemAdmin sysAdmin;
    public ViewCommunityPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCities();
        populateTable();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        btnViewCommunity = new javax.swing.JButton();
        btnUpdateCommunity = new javax.swing.JButton();
        btnSaveCommunity = new javax.swing.JButton();
        jComboBoxCities = new javax.swing.JComboBox<>();
        lblCommunityName = new javax.swing.JLabel();
        lblCommunityCity = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        lblCommunityId = new javax.swing.JLabel();
        txtCommunityId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("View Community");

        tblCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Community Name", "Community City"
            }
        ));
        jScrollPane1.setViewportView(tblCommunities);

        btnViewCommunity.setText("View Community");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });

        btnUpdateCommunity.setText("Update Community");
        btnUpdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommunityActionPerformed(evt);
            }
        });

        btnSaveCommunity.setText("Save Community");
        btnSaveCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommunityActionPerformed(evt);
            }
        });

        lblCommunityName.setText("Community Name");

        lblCommunityCity.setText("Community City");

        lblCommunityId.setText("Community Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewCommunity)
                .addGap(51, 51, 51)
                .addComponent(btnUpdateCommunity)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCommunityName)
                                    .addComponent(lblCommunityCity)
                                    .addComponent(lblCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCommunityName)
                                    .addComponent(jComboBoxCities, 0, 150, Short.MAX_VALUE)
                                    .addComponent(txtCommunityId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(btnSaveCommunity)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCommunity)
                    .addComponent(btnUpdateCommunity))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCommunityId)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityName)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityCity)
                    .addComponent(jComboBoxCities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnSaveCommunity)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommunityActionPerformed
        // TODO add your handling code here:
        
        City c = (City)jComboBoxCities.getSelectedItem();
        if(txtCommunityName.getText().length()==0 || c==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Community community = c.getCommunity(txtCommunityId.getText());
        if(txtCommunityName.getText().length()==0 || jComboBoxCities.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        community.setCommunityId(String.valueOf(txtCommunityName.getText()));
        community.setCity((City)jComboBoxCities.getSelectedItem());
        
        JOptionPane.showMessageDialog(this, "Community Info Updated");
        
        txtCommunityId.setText("");
        txtCommunityName.setText("");
        jComboBoxCities.setSelectedItem(null);
        populateTable();
        

    }//GEN-LAST:event_btnSaveCommunityActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        Community c = (Community) model.getValueAt(selectedrowIndex, 1);
        txtCommunityId.setText(String.valueOf(c.getCommunityId()));
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtCommunityName.setEditable(false);
        jComboBoxCities.setSelectedItem(c.getCity());
        jComboBoxCities.setEditable(false);
        
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnUpdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommunityActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to update the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        Community c = (Community) model.getValueAt(selectedrowIndex, 1);
        txtCommunityId.setText(String.valueOf(c.getCommunityId()));
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtCommunityName.setEditable(true);
        jComboBoxCities.setSelectedItem(c.getCity());
        jComboBoxCities.setEditable(true);
    }//GEN-LAST:event_btnUpdateCommunityActionPerformed

    private void populateTable() {
       
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        model.setRowCount(0);
        for(City c : sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                Object[] row = new Object[3];
                row[0] = community.getCommunityId();
                row[1] = community;
                row[2] = c;
                model.addRow(row);
            }
        }
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JButton btnUpdateCommunity;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JComboBox<Object> jComboBoxCities;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunityCity;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables

    private void populateCities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxCities.removeAllItems();
        for(City c : cities){
            jComboBoxCities.addItem(c);
        }
    
    }
}
