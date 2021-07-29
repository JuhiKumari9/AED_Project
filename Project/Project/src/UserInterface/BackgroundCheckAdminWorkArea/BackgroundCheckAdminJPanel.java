/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BackgroundCheckAdminWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author juhip
 */
public class BackgroundCheckAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BackgroundCheckJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Ecosystem system;
    Organization organization;
    
    public BackgroundCheckAdminJPanel(JPanel userProcessContainer, Ecosystem system) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
    }
    
    
    private void manageBGRequests(){
        lblManageRequests.setBackground(new Color(236,113,107));
        lblCreateRequests.setBackground(new Color(215,81,81));
        lblHistory.setBackground(new Color(215,81,81));
        ManageBGRequestsJPanel manageBGRequestsJPanel = new ManageBGRequestsJPanel(rightBackgroundCheckJPanel, enterprise);
        rightBackgroundCheckJPanel.add("manageBGRequestsJPanel", manageBGRequestsJPanel);
        CardLayout layout = (CardLayout) rightBackgroundCheckJPanel.getLayout();
        layout.next(rightBackgroundCheckJPanel);
        
    }
    
    private void createBGRequests(){
        lblCreateRequests.setBackground(new Color(236,113,107));
        lblManageRequests.setBackground(new Color(215,81,81));
        lblHistory.setBackground(new Color(215,81,81));
        CreateBGRequestJPanel createBGRequestsJPanel = new CreateBGRequestJPanel(rightBackgroundCheckJPanel, enterprise);
        rightBackgroundCheckJPanel.add("createBGRequestsJPanel",createBGRequestsJPanel);
        CardLayout layout = (CardLayout) rightBackgroundCheckJPanel.getLayout();
        layout.next(rightBackgroundCheckJPanel);
    }
    
    private void bgHistory(){
        lblHistory.setBackground(new Color(236,113,107));
        lblCreateRequests.setBackground(new Color(215,81,81));
        lblManageRequests.setBackground(new Color(215,81,81));
        BGHistoryJPanel bgHistoryJPanel = new BGHistoryJPanel(rightBackgroundCheckJPanel, enterprise);
        rightBackgroundCheckJPanel.add("BGHistoryJPanel", bgHistoryJPanel);
        CardLayout layout = (CardLayout) rightBackgroundCheckJPanel.getLayout();
        layout.next(rightBackgroundCheckJPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCheckJPanel = new javax.swing.JPanel();
        lblHistory = new javax.swing.JLabel();
        lblManageRequests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCreateRequests = new javax.swing.JLabel();
        rightBackgroundCheckJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        backgroundCheckJPanel.setBackground(new java.awt.Color(0, 204, 204));
        backgroundCheckJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHistory.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistory.setText("History");
        lblHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHistoryMousePressed(evt);
            }
        });

        lblManageRequests.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblManageRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageRequests.setText("Manage Requests");
        lblManageRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageRequestsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageRequestsMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Background Check Admin");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblCreateRequests.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCreateRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateRequests.setText("Create Request");
        lblCreateRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateRequestsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCreateRequestsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundCheckJPanelLayout = new javax.swing.GroupLayout(backgroundCheckJPanel);
        backgroundCheckJPanel.setLayout(backgroundCheckJPanelLayout);
        backgroundCheckJPanelLayout.setHorizontalGroup(
            backgroundCheckJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblManageRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundCheckJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(lblCreateRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundCheckJPanelLayout.setVerticalGroup(
            backgroundCheckJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCheckJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblManageRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreateRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        rightBackgroundCheckJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightBackgroundCheckJPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundCheckJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightBackgroundCheckJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCheckJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightBackgroundCheckJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageRequestsMousePressed
        // TODO add your handling code here:
        manageBGRequests();
    }//GEN-LAST:event_lblManageRequestsMousePressed

    private void lblHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoryMousePressed
        // TODO add your handling code here:
        
        bgHistory();
    }//GEN-LAST:event_lblHistoryMousePressed

    private void lblCreateRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateRequestsMousePressed
        // TODO add your handling code here:
        createBGRequests();
    }//GEN-LAST:event_lblCreateRequestsMousePressed

    private void lblManageRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageRequestsMouseClicked
        // TODO add your handling code here:
        
        manageBGRequests();
    }//GEN-LAST:event_lblManageRequestsMouseClicked

    private void lblHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoryMouseClicked
        // TODO add your handling code here:
        
        bgHistory();
    }//GEN-LAST:event_lblHistoryMouseClicked

    private void lblCreateRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateRequestsMouseClicked
        // TODO add your handling code here:
        
        createBGRequests();
    }//GEN-LAST:event_lblCreateRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundCheckJPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreateRequests;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblManageRequests;
    private javax.swing.JPanel rightBackgroundCheckJPanel;
    // End of variables declaration//GEN-END:variables
}
