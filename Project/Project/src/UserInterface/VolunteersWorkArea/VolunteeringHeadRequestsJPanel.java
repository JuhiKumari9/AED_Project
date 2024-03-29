/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VolunteersWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.VolunteeringHead.VolunteeringHead;
import Business.WorkQueue.FinanceRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rtspi
 */
public class VolunteeringHeadRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerWorkArea
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private OrganizationDirectory orgDir;
    private Ecosystem system;
    private Organization org;
    public VolunteeringHeadRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount,OrganizationDirectory orgDir,Ecosystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.orgDir = orgDir;
        this.system = system;
        this.org = org;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
         model.setRowCount(0);
             VolunteeringHead volunteer =org.getVolunteeringHeadDirectory().findUserByUserName(useraccount.getUsername());
           for(FinanceRequest req : volunteer.getFinanceRequestDirectory().getFinanceRequestList()){
               System.out.println(req.getUser().getName());
            Object[] row = new Object[5];
            row[0] = req.getRequestNumber();
            row[1] = req;
            row[2] = req.getUser().getName();
            row[3] = req.getUser().getContactNumber();
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

        jLabel1 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volunteering Head Work Area");

        btnAccept.setText("Accept Request");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject Request");

        btnCompleted.setText("Complete Request");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnProcess.setText("Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Number", "Request Name", "User Name", "User Contact", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequests);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAccept)
                                .addGap(126, 126, 126)
                                .addComponent(btnReject)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))
                        .addComponent(btnProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(585, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccept)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReject)
                        .addComponent(btnProcess)))
                .addGap(169, 169, 169)
                .addComponent(btnCompleted)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
        int row = tblRequests.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FinanceRequest fReq=(FinanceRequest)tblRequests.getValueAt(row, 1);
        if(fReq.getStatus().equalsIgnoreCase("Completed")){
            JOptionPane.showMessageDialog(null, "Request is completed already", "Warning", JOptionPane.WARNING_MESSAGE);

            }
        else if(fReq.getStatus().equalsIgnoreCase("Accepted")){
            JOptionPane.showMessageDialog(null, "Please process the request first", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else if(fReq.getStatus().equalsIgnoreCase("Rejected")){
            JOptionPane.showMessageDialog(null, "Request is rejected already", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else
        {
        
        
        fReq.setStatus("Completed");
        
        JOptionPane.showMessageDialog(null, "Request Completed successfully!!!");
        } 
        populateTable();
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int row = tblRequests.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FinanceRequest fReq=(FinanceRequest)tblRequests.getValueAt(row, 1);
         if(fReq.getStatus().equalsIgnoreCase("Rejected")){
            JOptionPane.showMessageDialog(null, "Request is rejected already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(fReq.getStatus().equalsIgnoreCase("Accepted")){
            JOptionPane.showMessageDialog(null, "Request is already accepted", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(fReq.getStatus().equalsIgnoreCase("Processed")){
            JOptionPane.showMessageDialog(null, "Request is processed already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
       else if(fReq.getStatus().equalsIgnoreCase("Completed")){
            JOptionPane.showMessageDialog(null, "Request is completed already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        
        
        fReq.setStatus("Accepted");
        JOptionPane.showMessageDialog(null, "Request Accepted successfully!!!");
        } 
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int row = tblRequests.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        FinanceRequest fReq=(FinanceRequest)tblRequests.getValueAt(row, 1);
        if(fReq.getStatus().equalsIgnoreCase("Rejected")){
            JOptionPane.showMessageDialog(null, "Request is rejected already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(fReq.getStatus().equalsIgnoreCase("Processed")){
            JOptionPane.showMessageDialog(null, "Request is processed already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(fReq.getStatus().equalsIgnoreCase("Completed")){
            JOptionPane.showMessageDialog(null, "Request is completed already", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        
        
        fReq.setStatus("Processed");
        JOptionPane.showMessageDialog(null, "Request Processed successfully!!!");
        } 
        populateTable();
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
