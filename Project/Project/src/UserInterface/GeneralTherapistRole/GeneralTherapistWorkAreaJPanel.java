/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GeneralTherapistRole;

import UserInterface.User.*;
import UserInterface.SystemAdminWorkArea.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OnlineReceptionistRole.ManagePersonalDetailsJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author juhip
 */
public class GeneralTherapistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
   JPanel userProcessContainer;
   Ecosystem ecosystem;
   private UserAccount userAccount;
   private Enterprise enterprise;
   private Organization organization;
    public GeneralTherapistWorkAreaJPanel(JPanel userProcessContainer,UserAccount useraccount,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        this.organization = organization;
    }

      void setColor(JPanel panel){
        panel.setBackground(new Color(130,175,203));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(18,102,153));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnterPriseAdmin_JPanel1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnEnterPriseAdmin_JPanel = new javax.swing.JPanel();
        btnRequest = new javax.swing.JButton();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        btnEnterPriseAdmin_JPanel1.setBackground(new java.awt.Color(153, 255, 153));
        btnEnterPriseAdmin_JPanel1.setToolTipText("");

        btnDashboard.setText("Personal Details");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnEnterPriseAdmin_JPanel.setBackground(new java.awt.Color(153, 255, 153));
        btnEnterPriseAdmin_JPanel.setToolTipText("");

        btnRequest.setText("Manage Requests");
        btnRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRequestMousePressed(evt);
            }
        });
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnEnterPriseAdmin_JPanelLayout = new javax.swing.GroupLayout(btnEnterPriseAdmin_JPanel);
        btnEnterPriseAdmin_JPanel.setLayout(btnEnterPriseAdmin_JPanelLayout);
        btnEnterPriseAdmin_JPanelLayout.setHorizontalGroup(
            btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEnterPriseAdmin_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnEnterPriseAdmin_JPanelLayout.setVerticalGroup(
            btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEnterPriseAdmin_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout btnEnterPriseAdmin_JPanel1Layout = new javax.swing.GroupLayout(btnEnterPriseAdmin_JPanel1);
        btnEnterPriseAdmin_JPanel1.setLayout(btnEnterPriseAdmin_JPanel1Layout);
        btnEnterPriseAdmin_JPanel1Layout.setHorizontalGroup(
            btnEnterPriseAdmin_JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnterPriseAdmin_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnEnterPriseAdmin_JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEnterPriseAdmin_JPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnEnterPriseAdmin_JPanel1Layout.setVerticalGroup(
            btnEnterPriseAdmin_JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnterPriseAdmin_JPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(btnEnterPriseAdmin_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(btnEnterPriseAdmin_JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEnterPriseAdmin_JPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEnterPriseAdmin_JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEnterPriseAdmin_JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1170, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
       ManageAllGeneralRequestsJPanel requestDetailsJPanel=new ManageAllGeneralRequestsJPanel(workAreaJPanel,ecosystem, userAccount, organization, enterprise);
        workAreaJPanel.add("userRegistrationJPanel", requestDetailsJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        ManagePersonalDetailsGTJPanel userDetails=new ManagePersonalDetailsGTJPanel(workAreaJPanel,ecosystem, organization,enterprise,userAccount);
        workAreaJPanel.add("userDetails", userDetails);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestMousePressed
        // TODO add your handling code here:
//        RequestDetailsJPanel requestDetailsJPanel=new RequestDetailsJPanel(workAreaJPanel,ecosystem, userAccount);
//        workAreaJPanel.add("userRegistrationJPanel", requestDetailsJPanel);
//        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
//        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnRequestMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JPanel btnEnterPriseAdmin_JPanel;
    private javax.swing.JPanel btnEnterPriseAdmin_JPanel1;
    private javax.swing.JButton btnRequest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
