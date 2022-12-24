
package UI.CustRole;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Organization.OrgFarmer;
import Model.Organization.Organization;
import Model.Organization.OrgManagement;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.YieldRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shardul
 */
public class ReqYieldJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestProduceJPanel
     */
    public ReqYieldJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valLBL.setText(enterprise.getName());
    }
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reqBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        msgTextFld = new javax.swing.JTextField();
        bkBtn = new javax.swing.JButton();
        valLBL = new javax.swing.JLabel();
        entLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qtyJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reqBtn.setBackground(new java.awt.Color(255, 102, 102));
        reqBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMcrop.jpg"))); // NOI18N
        reqBtn.setText("Request Produce");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 230, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Crop Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 110, -1));

        msgTextFld.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(msgTextFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 229, -1));

        bkBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMback.png"))); // NOI18N
        bkBtn.setText("Back");
        bkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkBtnActionPerformed(evt);
            }
        });
        add(bkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        valLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(valLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 30));

        entLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        entLbl.setText("Enterprise :");
        add(entLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Crop Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        qtyJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        qtyJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyJTextFieldActionPerformed(evt);
            }
        });
        qtyJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyJTextFieldKeyTyped(evt);
            }
        });
        add(qtyJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 229, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMcrop.jpg"))); // NOI18N
        jLabel3.setText("Request Yield");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 320, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UICustRole.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 950, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        if (msgTextFld.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kindly enter product name");
        }
        else{
           
            String message = msgTextFld.getText();
        
        YieldRequest request = new YieldRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        
        request.setStatus("Forwarded to the office staff");
       if (Integer.parseInt(qtyJTextField.getText())<1)
       {
           JOptionPane.showMessageDialog(null,"Kindly enter a value greater than 0" );
       }
       else{
            request.setHarvestQty(Integer.parseInt(qtyJTextField.getText()));
           
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgManagement){
                org = organization;
                break;
            }
        }
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null,"Request has been forwarded to supplier");
        }
        }
        msgTextFld.setText("");
        qtyJTextField.setText("");
       
    }//GEN-LAST:event_reqBtnActionPerformed

    private void bkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkBtnActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustWorkAreaJPanel cwjp = (CustWorkAreaJPanel) component;
        cwjp.populateRequestTable();
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_bkBtnActionPerformed

    private void qtyJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyJTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyJTextFieldKeyPressed

    private void qtyJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyJTextFieldKeyTyped
        // Digits, back space and delete keys can be pressed:
        char varchar12 = evt.getKeyChar();
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        if(!(Character.isDigit(varchar12)) || (varchar12 == KeyEvent.VK_BACK_SPACE) || (varchar12 == KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
    } 
    }//GEN-LAST:event_qtyJTextFieldKeyTyped

    private void qtyJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkBtn;
    private javax.swing.JLabel entLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField msgTextFld;
    private javax.swing.JTextField qtyJTextField;
    private javax.swing.JButton reqBtn;
    private javax.swing.JLabel valLBL;
    // End of variables declaration//GEN-END:variables
}