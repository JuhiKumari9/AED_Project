/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RationingFacilitatorWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rtspi
 */
public class RationingFacilitatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RationingFacilitatorWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Ecosystem system;
    Organization organization;
    UserAccount userAcc;
    public RationingFacilitatorWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system,Enterprise enterprise, UserAccount userAcc, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        this.userAcc = userAcc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rationingFacilitatorJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnManageRequests = new javax.swing.JButton();
        btnRequestsUnits = new javax.swing.JButton();
        rightFacilitatorJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        rationingFacilitatorJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rationing Facilitator");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnManageRequests.setBackground(new java.awt.Color(0, 255, 204));
        btnManageRequests.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRequests.setText("Manage Requests");
        btnManageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestsActionPerformed(evt);
            }
        });

        btnRequestsUnits.setBackground(new java.awt.Color(0, 255, 204));
        btnRequestsUnits.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRequestsUnits.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestsUnits.setText("Request Units");
        btnRequestsUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsUnitsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rationingFacilitatorJPanelLayout = new javax.swing.GroupLayout(rationingFacilitatorJPanel);
        rationingFacilitatorJPanel.setLayout(rationingFacilitatorJPanelLayout);
        rationingFacilitatorJPanelLayout.setHorizontalGroup(
            rationingFacilitatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rationingFacilitatorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rationingFacilitatorJPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rationingFacilitatorJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rationingFacilitatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRequestsUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRequests))
                .addGap(69, 69, 69))
        );
        rationingFacilitatorJPanelLayout.setVerticalGroup(
            rationingFacilitatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rationingFacilitatorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnManageRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRequestsUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );

        rightFacilitatorJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightFacilitatorJPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rationingFacilitatorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightFacilitatorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rationingFacilitatorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightFacilitatorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestsActionPerformed
        // TODO add your handling code here:
        RationingFacilitatorRequestsJPanel manageRequestsJPanel = new RationingFacilitatorRequestsJPanel(rightFacilitatorJPanel, enterprise, userAcc, enterprise.getOrganizationDirectory(),organization);
        rightFacilitatorJPanel.add("manageRequestsJPanel", manageRequestsJPanel);
        CardLayout layout = (CardLayout) rightFacilitatorJPanel.getLayout();
        layout.next(rightFacilitatorJPanel);
    }//GEN-LAST:event_btnManageRequestsActionPerformed

    private void btnRequestsUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsUnitsActionPerformed
        // TODO add your handling code here:
          RationingFacilitatorUnitRequestsJPanel manageUnitRequestsJPanel = new RationingFacilitatorUnitRequestsJPanel(rightFacilitatorJPanel, enterprise, userAcc, enterprise.getOrganizationDirectory(), system);
        rightFacilitatorJPanel.add("manageUnitRequestsJPanel", manageUnitRequestsJPanel);
        CardLayout layout = (CardLayout) rightFacilitatorJPanel.getLayout();
        layout.next(rightFacilitatorJPanel);
    }//GEN-LAST:event_btnRequestsUnitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnRequestsUnits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel rationingFacilitatorJPanel;
    private javax.swing.JPanel rightFacilitatorJPanel;
    // End of variables declaration//GEN-END:variables
}
