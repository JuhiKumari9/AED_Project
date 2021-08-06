/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GOVTExecutive;

import UserInterface.BackgroundCheckAdminWorkArea.*;
import Business.Enterprise.Enterprise;
import Business.Executive.Executive;
import Business.HealthMinistryRepresentative.Representative;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RationRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rtspi
 */
public class ManageExecutiveRationRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form manageBGRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private OrganizationDirectory orgDir;
    private Organization org;
    
    public ManageExecutiveRationRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount,OrganizationDirectory orgDir, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.orgDir = orgDir;
        this.org = org;
        populateRepresentativeComboBox();
        populateTable();
    }
    
    public void populateRepresentativeComboBox(){
        
        representativeJComboBox.removeAllItems();
        for(Organization org : orgDir.getOrgList()){
            
            for(Representative ra: org.getRepresentativeDirectory().getRepresentativeList()){
                
                    representativeJComboBox.addItem(ra);
                
                
            }
            
        }                
    }
    
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblRequestHistory.getModel();
        model.setRowCount(0);
        Executive executive = org.getExecutiveDirectory().findUserByUserName(useraccount.getUsername());

        for(RationRequest req : executive.getRationRequestDirectory().getRationRequestList()){
            System.out.println(req);
            Object[] row = new Object[5];
            row[0] = req.getRequestName();
            row[1] = req.getTypeOfPacket();
            row[2] = req.getSizeOfPacket();
            row[3] = req.getUnits();
            row[4] = req.getStatus();
            model.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        representativeJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestHistory = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccept.setText("Accept Request");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 200, -1, -1));

        btnReject.setText("Reject Request");
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 200, -1, -1));

        btnCompleted.setText("Complete Request");
        add(btnCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 200, -1, -1));

        jLabel1.setText("Assign Representative:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 293, 120, 29));

        btnProcess.setText("Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 429, -1, -1));

        add(representativeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 180, -1));

        tblRequestHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Name", "Type of Packet", "Size of Packet", "# of Units", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequestHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox representativeJComboBox;
    private javax.swing.JTable tblRequestHistory;
    // End of variables declaration//GEN-END:variables
}
