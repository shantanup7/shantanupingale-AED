/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.SystemAdmin;

/**
 *
 * @author shant
 */
public class CommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminPanel
     */
    CardLayout cardLayoutmain;
    CardLayout cardLayoutCommunityAdmin;
    SystemAdmin sysAdmin;
    public CommunityAdminPanel(SystemAdmin sysAdmin) {
        initComponents();
        cardLayoutmain = (CardLayout)(this.getLayout());
        cardLayoutCommunityAdmin = (CardLayout)(viewPanelCommunityAdmin.getLayout());
        this.sysAdmin = sysAdmin;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        communityAdminLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCommunityAdminUsername = new javax.swing.JLabel();
        lblCommunityAdminPassword = new javax.swing.JLabel();
        txtCommunityAdminUsername = new javax.swing.JTextField();
        txtCommunityAdminPassword = new javax.swing.JTextField();
        btnCommunityAdminLogin = new javax.swing.JButton();
        jSplitPaneCommunityAdmin = new javax.swing.JSplitPane();
        controlPanelCommunityAdmin = new javax.swing.JPanel();
        btnCityDirectory = new javax.swing.JButton();
        btnCommunityDirectory = new javax.swing.JButton();
        btnHouseDirectory = new javax.swing.JButton();
        viewPanelCommunityAdmin = new javax.swing.JPanel();
        cityDirectoryPanel = new javax.swing.JPanel();
        splitPaneCityDirectory = new javax.swing.JSplitPane();
        controlPanelCityDirectory = new javax.swing.JPanel();
        btnCreateCity = new javax.swing.JButton();
        btnViewCity = new javax.swing.JButton();
        viewPanelCityDirectory = new javax.swing.JPanel();
        communityDirectoryPanel = new javax.swing.JPanel();
        splitPaneCommunityDirectory = new javax.swing.JSplitPane();
        controlPanelCommunityDirectroy = new javax.swing.JPanel();
        btnCreateCommunity = new javax.swing.JButton();
        btnViewCommunity = new javax.swing.JButton();
        ViewPanelCommunityDirectory = new javax.swing.JPanel();
        houseDirectoryPanel = new javax.swing.JPanel();
        splitPaneHouseDirectory = new javax.swing.JSplitPane();
        controlPanelHouseDirectory = new javax.swing.JPanel();
        btnCreateHouse = new javax.swing.JButton();
        btnViewHouse = new javax.swing.JButton();
        viewPanelHouseDirectory = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        communityAdminLoginPanel.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Community Login");

        lblCommunityAdminUsername.setText("Username");

        lblCommunityAdminPassword.setText("Password");

        btnCommunityAdminLogin.setText("Login");
        btnCommunityAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout communityAdminLoginPanelLayout = new javax.swing.GroupLayout(communityAdminLoginPanel);
        communityAdminLoginPanel.setLayout(communityAdminLoginPanelLayout);
        communityAdminLoginPanelLayout.setHorizontalGroup(
            communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityAdminLoginPanelLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(communityAdminLoginPanelLayout.createSequentialGroup()
                        .addGroup(communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunityAdminPassword)
                            .addComponent(lblCommunityAdminUsername))
                        .addGap(26, 26, 26)
                        .addGroup(communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommunityAdminUsername)
                            .addComponent(txtCommunityAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, communityAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCommunityAdminLogin)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        communityAdminLoginPanelLayout.setVerticalGroup(
            communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityAdminLoginPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityAdminUsername)
                    .addComponent(txtCommunityAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(communityAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityAdminPassword)
                    .addComponent(txtCommunityAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnCommunityAdminLogin)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        add(communityAdminLoginPanel, "communityAdminLoginPanel");

        jSplitPaneCommunityAdmin.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCityDirectory.setText("City Directory");
        btnCityDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityDirectoryActionPerformed(evt);
            }
        });

        btnCommunityDirectory.setText("Community Directory");
        btnCommunityDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityDirectoryActionPerformed(evt);
            }
        });

        btnHouseDirectory.setText("House Directory");
        btnHouseDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelCommunityAdminLayout = new javax.swing.GroupLayout(controlPanelCommunityAdmin);
        controlPanelCommunityAdmin.setLayout(controlPanelCommunityAdminLayout);
        controlPanelCommunityAdminLayout.setHorizontalGroup(
            controlPanelCommunityAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCommunityAdminLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnCityDirectory)
                .addGap(71, 71, 71)
                .addComponent(btnCommunityDirectory)
                .addGap(73, 73, 73)
                .addComponent(btnHouseDirectory)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        controlPanelCommunityAdminLayout.setVerticalGroup(
            controlPanelCommunityAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCommunityAdminLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(controlPanelCommunityAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCityDirectory)
                    .addComponent(btnCommunityDirectory)
                    .addComponent(btnHouseDirectory))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jSplitPaneCommunityAdmin.setTopComponent(controlPanelCommunityAdmin);

        viewPanelCommunityAdmin.setLayout(new java.awt.CardLayout());

        btnCreateCity.setText("Create City");
        btnCreateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCityActionPerformed(evt);
            }
        });

        btnViewCity.setText("View City");
        btnViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelCityDirectoryLayout = new javax.swing.GroupLayout(controlPanelCityDirectory);
        controlPanelCityDirectory.setLayout(controlPanelCityDirectoryLayout);
        controlPanelCityDirectoryLayout.setHorizontalGroup(
            controlPanelCityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCityDirectoryLayout.createSequentialGroup()
                .addGroup(controlPanelCityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelCityDirectoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCreateCity))
                    .addGroup(controlPanelCityDirectoryLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnViewCity)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelCityDirectoryLayout.setVerticalGroup(
            controlPanelCityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCityDirectoryLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnCreateCity)
                .addGap(69, 69, 69)
                .addComponent(btnViewCity)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        splitPaneCityDirectory.setLeftComponent(controlPanelCityDirectory);

        javax.swing.GroupLayout viewPanelCityDirectoryLayout = new javax.swing.GroupLayout(viewPanelCityDirectory);
        viewPanelCityDirectory.setLayout(viewPanelCityDirectoryLayout);
        viewPanelCityDirectoryLayout.setHorizontalGroup(
            viewPanelCityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        viewPanelCityDirectoryLayout.setVerticalGroup(
            viewPanelCityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        splitPaneCityDirectory.setRightComponent(viewPanelCityDirectory);

        javax.swing.GroupLayout cityDirectoryPanelLayout = new javax.swing.GroupLayout(cityDirectoryPanel);
        cityDirectoryPanel.setLayout(cityDirectoryPanelLayout);
        cityDirectoryPanelLayout.setHorizontalGroup(
            cityDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCityDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE))
        );
        cityDirectoryPanelLayout.setVerticalGroup(
            cityDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneCityDirectory)
        );

        viewPanelCommunityAdmin.add(cityDirectoryPanel, "cityDirectoryPanel");

        btnCreateCommunity.setText("Create Community");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });

        btnViewCommunity.setText("View Community");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelCommunityDirectroyLayout = new javax.swing.GroupLayout(controlPanelCommunityDirectroy);
        controlPanelCommunityDirectroy.setLayout(controlPanelCommunityDirectroyLayout);
        controlPanelCommunityDirectroyLayout.setHorizontalGroup(
            controlPanelCommunityDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCommunityDirectroyLayout.createSequentialGroup()
                .addGroup(controlPanelCommunityDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelCommunityDirectroyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCreateCommunity))
                    .addGroup(controlPanelCommunityDirectroyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnViewCommunity)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelCommunityDirectroyLayout.setVerticalGroup(
            controlPanelCommunityDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCommunityDirectroyLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnCreateCommunity)
                .addGap(52, 52, 52)
                .addComponent(btnViewCommunity)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        splitPaneCommunityDirectory.setLeftComponent(controlPanelCommunityDirectroy);

        javax.swing.GroupLayout ViewPanelCommunityDirectoryLayout = new javax.swing.GroupLayout(ViewPanelCommunityDirectory);
        ViewPanelCommunityDirectory.setLayout(ViewPanelCommunityDirectoryLayout);
        ViewPanelCommunityDirectoryLayout.setHorizontalGroup(
            ViewPanelCommunityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        ViewPanelCommunityDirectoryLayout.setVerticalGroup(
            ViewPanelCommunityDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        splitPaneCommunityDirectory.setRightComponent(ViewPanelCommunityDirectory);

        javax.swing.GroupLayout communityDirectoryPanelLayout = new javax.swing.GroupLayout(communityDirectoryPanel);
        communityDirectoryPanel.setLayout(communityDirectoryPanelLayout);
        communityDirectoryPanelLayout.setHorizontalGroup(
            communityDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneCommunityDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        communityDirectoryPanelLayout.setVerticalGroup(
            communityDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneCommunityDirectory)
        );

        viewPanelCommunityAdmin.add(communityDirectoryPanel, "communityDirectoryPanel");

        btnCreateHouse.setText("Create House");
        btnCreateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHouseActionPerformed(evt);
            }
        });

        btnViewHouse.setText("View House");
        btnViewHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelHouseDirectoryLayout = new javax.swing.GroupLayout(controlPanelHouseDirectory);
        controlPanelHouseDirectory.setLayout(controlPanelHouseDirectoryLayout);
        controlPanelHouseDirectoryLayout.setHorizontalGroup(
            controlPanelHouseDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHouseDirectoryLayout.createSequentialGroup()
                .addComponent(btnCreateHouse)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(controlPanelHouseDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewHouse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelHouseDirectoryLayout.setVerticalGroup(
            controlPanelHouseDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHouseDirectoryLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnCreateHouse)
                .addGap(61, 61, 61)
                .addComponent(btnViewHouse)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        splitPaneHouseDirectory.setLeftComponent(controlPanelHouseDirectory);

        javax.swing.GroupLayout viewPanelHouseDirectoryLayout = new javax.swing.GroupLayout(viewPanelHouseDirectory);
        viewPanelHouseDirectory.setLayout(viewPanelHouseDirectoryLayout);
        viewPanelHouseDirectoryLayout.setHorizontalGroup(
            viewPanelHouseDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        viewPanelHouseDirectoryLayout.setVerticalGroup(
            viewPanelHouseDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        splitPaneHouseDirectory.setRightComponent(viewPanelHouseDirectory);

        javax.swing.GroupLayout houseDirectoryPanelLayout = new javax.swing.GroupLayout(houseDirectoryPanel);
        houseDirectoryPanel.setLayout(houseDirectoryPanelLayout);
        houseDirectoryPanelLayout.setHorizontalGroup(
            houseDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(houseDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouseDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        houseDirectoryPanelLayout.setVerticalGroup(
            houseDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(houseDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouseDirectory))
        );

        viewPanelCommunityAdmin.add(houseDirectoryPanel, "houseDirectoryPanel");

        jSplitPaneCommunityAdmin.setRightComponent(viewPanelCommunityAdmin);

        add(jSplitPaneCommunityAdmin, "jSplitPaneCommunityAdmin");
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCityActionPerformed
        // TODO add your handling code here:
        ViewCityPanel viewCities = new ViewCityPanel(sysAdmin);
        splitPaneCityDirectory.setRightComponent(viewCities);
    }//GEN-LAST:event_btnViewCityActionPerformed

    private void btnCityDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutCommunityAdmin.show(viewPanelCommunityAdmin, "cityDirectoryPanel");
    }//GEN-LAST:event_btnCityDirectoryActionPerformed

    private void btnCommunityAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminLoginActionPerformed
        // TODO add your handling code here:
        String username = txtCommunityAdminUsername.getText();
        String password = txtCommunityAdminPassword.getText();
        if(username.equals("John") && password.equals("12345")){
            cardLayoutmain.show(this, "jSplitPaneCommunityAdmin");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Id");
            return;
        }
    }//GEN-LAST:event_btnCommunityAdminLoginActionPerformed

    private void btnCreateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCityActionPerformed
        // TODO add your handling code here:
        CreateCityPanel createCity = new CreateCityPanel(sysAdmin);
        splitPaneCityDirectory.setRightComponent(createCity);
        
    }//GEN-LAST:event_btnCreateCityActionPerformed

    private void btnCommunityDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutCommunityAdmin.show(viewPanelCommunityAdmin, "communityDirectoryPanel");
    }//GEN-LAST:event_btnCommunityDirectoryActionPerformed

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
        CreateCommunityPanel createCommunity = new CreateCommunityPanel(sysAdmin);
        splitPaneCommunityDirectory.setRightComponent(createCommunity);
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        ViewCommunityPanel viewCommunity = new ViewCommunityPanel(sysAdmin);
        splitPaneCommunityDirectory.setRightComponent(viewCommunity);
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnHouseDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutCommunityAdmin.show(viewPanelCommunityAdmin, "houseDirectoryPanel");
    }//GEN-LAST:event_btnHouseDirectoryActionPerformed

    private void btnCreateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHouseActionPerformed
        // TODO add your handling code here:
        CreateHousePanel house = new CreateHousePanel(sysAdmin);
        splitPaneHouseDirectory.setRightComponent(house);
    }//GEN-LAST:event_btnCreateHouseActionPerformed

    private void btnViewHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseActionPerformed
        // TODO add your handling code here:
        ViewHousePanel house = new ViewHousePanel(sysAdmin);
        splitPaneHouseDirectory.setRightComponent(house);
    }//GEN-LAST:event_btnViewHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ViewPanelCommunityDirectory;
    private javax.swing.JButton btnCityDirectory;
    private javax.swing.JButton btnCommunityAdminLogin;
    private javax.swing.JButton btnCommunityDirectory;
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnCreateHouse;
    private javax.swing.JButton btnHouseDirectory;
    private javax.swing.JButton btnViewCity;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JButton btnViewHouse;
    private javax.swing.JPanel cityDirectoryPanel;
    private javax.swing.JPanel communityAdminLoginPanel;
    private javax.swing.JPanel communityDirectoryPanel;
    private javax.swing.JPanel controlPanelCityDirectory;
    private javax.swing.JPanel controlPanelCommunityAdmin;
    private javax.swing.JPanel controlPanelCommunityDirectroy;
    private javax.swing.JPanel controlPanelHouseDirectory;
    private javax.swing.JPanel houseDirectoryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneCommunityAdmin;
    private javax.swing.JLabel lblCommunityAdminPassword;
    private javax.swing.JLabel lblCommunityAdminUsername;
    private javax.swing.JSplitPane splitPaneCityDirectory;
    private javax.swing.JSplitPane splitPaneCommunityDirectory;
    private javax.swing.JSplitPane splitPaneHouseDirectory;
    private javax.swing.JTextField txtCommunityAdminPassword;
    private javax.swing.JTextField txtCommunityAdminUsername;
    private javax.swing.JPanel viewPanelCityDirectory;
    private javax.swing.JPanel viewPanelCommunityAdmin;
    private javax.swing.JPanel viewPanelHouseDirectory;
    // End of variables declaration//GEN-END:variables

    
}
