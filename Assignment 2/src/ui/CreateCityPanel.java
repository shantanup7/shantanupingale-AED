/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.SystemAdmin;

/**
 *
 * @author shant
 */
public class CreateCityPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCityPanel
     */
    SystemAdmin sysAdmin;
    public CreateCityPanel(SystemAdmin sysAdmin) {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        lblCityState = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCityState = new javax.swing.JTextField();
        btnSaveCity = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Create City");

        lblCityName.setText("City Name");

        lblCityState.setText("City State");

        btnSaveCity.setText("Save City");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCityState)
                                    .addComponent(lblCityName))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCityName)
                                    .addComponent(txtCityState, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnSaveCity)))))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(lblCityName))
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCityState)
                    .addComponent(txtCityState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSaveCity)
                .addContainerGap(452, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
        List<City> cities = sysAdmin.getCities();
        City c = sysAdmin.addCity();
        String cid =  String.valueOf(cities.size() + Integer.parseInt("100"));
        String name = String.valueOf(txtCityName.getText());
        String state = String.valueOf(txtCityState.getText());
        if(name.length()==0 || state.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        c.setId(cid);
        c.setState(state);
        c.setName(name);
        
        txtCityName.setText("");
        txtCityState.setText("");
        
        JOptionPane.showMessageDialog(this, "City Info Saved"); 
    }//GEN-LAST:event_btnSaveCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCityState;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCityState;
    // End of variables declaration//GEN-END:variables
}
