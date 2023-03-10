/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.SystemAdmin;

/**
 *
 * @author shant
 */
public class CreateCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCommunityPanel
     */
    SystemAdmin sysAdmin;
    public CreateCommunityPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaveCommunity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCommunityName = new javax.swing.JLabel();
        lblCommunityCity = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        jComboBoxCities = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));

        btnSaveCommunity.setText("Save Community");
        btnSaveCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommunityActionPerformed(evt);
            }
        });

        jLabel2.setText("Community Directory");

        lblCommunityName.setText("Community Name");

        lblCommunityCity.setText("Community City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunityName)
                            .addComponent(lblCommunityCity))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommunityName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jComboBoxCities, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveCommunity)
                            .addComponent(jLabel2))))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityName)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityCity)
                    .addComponent(jComboBoxCities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnSaveCommunity)
                .addContainerGap(353, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommunityActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxCities.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select City");
            return;
        }
        City c = (City)jComboBoxCities.getSelectedItem();
        Community community = c.addCommunity();
        
        String communityName = txtCommunityName.getText();
        if(communityName.length()==0){
            JOptionPane.showMessageDialog(this, "Enter Community Name");
            return;
        }
        String cid =  String.valueOf(c.getCommunityList().size() + Integer.parseInt("1000"));
        community.setCommunityId(cid);
        community.setCity(c);
        community.setCommunityName(communityName);
        
        txtCommunityName.setText("");
        
        JOptionPane.showMessageDialog(this, "Community Info Saved"); 
        
        
        
        
        
    }//GEN-LAST:event_btnSaveCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JComboBox<Object> jComboBoxCities;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCommunityCity;
    private javax.swing.JLabel lblCommunityName;
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
