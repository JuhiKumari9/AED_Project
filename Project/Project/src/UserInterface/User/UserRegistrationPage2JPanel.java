/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;



import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.User.User;
import Business.UserAccount.UserAccount;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class UserRegistrationPage2JPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private Organization org;
    private Ecosystem system;
    private User user;
    private ArrayList<String> reasonForTreatment = new ArrayList<>();
    private ArrayList<String> medicalconditions = new ArrayList<>();
    private ArrayList<String> medicalSymptoms = new ArrayList<>();
       
    public UserRegistrationPage2JPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, Ecosystem system, Organization org, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        this.user = user;
        
    }
     public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
           setBackground(new java.awt.Color(74,122,193));
            return this;
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

        jPanel1 = new javax.swing.JPanel();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableReasonsTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnAddReason = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedReasonsTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        availableMedicalConditionJTable = new javax.swing.JTable();
        btnMedConditions = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        selectedMedicalConditionJTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        availableMedicalSymptomsJTable = new javax.swing.JTable();
        btnMedicalSymptoms = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        selectedMedicalSymptomsJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Registration");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        availableReasonsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ADHD"},
                {"Alcohol"},
                {"Anxiety"},
                {"Autism"},
                {"Behavior/Conduct"},
                {"Bipolar Disorder"},
                {"Depression"},
                {"Divorce"},
                {"Drug/ Substance Use"},
                {"Family Conflict"},
                {"Grief"},
                {"Infertility"},
                {"Mania"},
                {"Marital/ Domestic Issues"},
                {"Obsessive-Compulsive (OCD)"},
                {"Phobia"},
                {"PTSD and Trauma"},
                {"Racial Identity"},
                {"Smoking"},
                {"Sleep or Insomnia"},
                {"Suicidal/ Self harm thoughts"},
                {null}
            },
            new String [] {
                "Select reasons"
            }
        ));
        jScrollPane1.setViewportView(availableReasonsTable);

        jLabel12.setText("Select reasons for treatment");

        btnAddReason.setText("Add");
        btnAddReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReasonActionPerformed(evt);
            }
        });

        selectedReasonsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Selected reasons"
            }
        ));
        jScrollPane2.setViewportView(selectedReasonsTable);

        jLabel13.setText("My Medical conditions:");

        availableMedicalConditionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Allergy"},
                {"Arthritis"},
                {"Asthama"},
                {"Back Pain"},
                {"Breathing / Respiratory issues"},
                {"Bronchitis"},
                {"Cancer"},
                {"AIDS/HIV"},
                {"Chronic Pain"},
                {"Congestive Heart failure"},
                {"COPD"},
                {"Diabetes"},
                {"Erectile Dysfunction"},
                {"Headaches"},
                {"Hearing difficulties"},
                {"Hernia"},
                {"Hypothyroidism"},
                {"Kidney Failure"},
                {null}
            },
            new String [] {
                "Select Medical Conditions"
            }
        ));
        jScrollPane3.setViewportView(availableMedicalConditionJTable);

        btnMedConditions.setText("Add");
        btnMedConditions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedConditionsActionPerformed(evt);
            }
        });

        selectedMedicalConditionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Selected Medical Conditions"
            }
        ));
        jScrollPane4.setViewportView(selectedMedicalConditionJTable);

        jLabel14.setText("My Medical Symptoms:");

        availableMedicalSymptomsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nausea"},
                {"Headache"},
                {"Vomiting"},
                {"Sleepy"},
                {"Fatigue"},
                {"Itching"},
                {"Fever"},
                {"Sneezy"},
                {"High Blood Pressure"},
                {"Fast Pulse"},
                {"Chest Pain"},
                {"Weight Loss"},
                {"Weight Gain"},
                {null}
            },
            new String [] {
                "Select Medical Symptoms"
            }
        ));
        jScrollPane5.setViewportView(availableMedicalSymptomsJTable);

        btnMedicalSymptoms.setText("Add");
        btnMedicalSymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalSymptomsActionPerformed(evt);
            }
        });

        selectedMedicalSymptomsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Selected Medical Symptoms"
            }
        ));
        jScrollPane6.setViewportView(selectedMedicalSymptomsJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMedicalSymptoms)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnMedConditions)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddReason)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(lblDoctorslist1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAddReason)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnMedConditions)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnMedicalSymptoms)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(32, 32, 32))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 770, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReasonActionPerformed
        // TODO add your handling code here:
        int row = availableReasonsTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        String selectedResult=(String)availableReasonsTable.getValueAt(row, 0);
            reasonForTreatment.add(selectedResult);
            populateSelectedReasonsTable();
        }
    }//GEN-LAST:event_btnAddReasonActionPerformed

    private void btnMedConditionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedConditionsActionPerformed
        // TODO add your handling code here:
        int row = availableMedicalConditionJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        String selectedResult=(String)availableMedicalConditionJTable.getValueAt(row, 0);
            medicalconditions.add(selectedResult);
            populateSelectedMedicalConditionsTable();
        }
    }//GEN-LAST:event_btnMedConditionsActionPerformed

    private void btnMedicalSymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalSymptomsActionPerformed
        // TODO add your handling code here:
        int row = availableMedicalSymptomsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        String selectedResult=(String)availableMedicalSymptomsJTable.getValueAt(row, 0);
            medicalSymptoms.add(selectedResult);
            populateSelectedMedicalSysmptomsTable();
        }
    }//GEN-LAST:event_btnMedicalSymptomsActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        if(!reasonForTreatment.isEmpty()){
            for(String str: reasonForTreatment){
                user.getMedicalDetails().getReasonForTreatment().add(str);
            }
        }
        
        if(!medicalconditions.isEmpty()){
            for(String str: medicalconditions){
                user.getMedicalDetails().getMedicalConditions().add(str);
            }
        }
        
        if(!medicalSymptoms.isEmpty()){
            for(String str: medicalSymptoms){
                user.getMedicalDetails().getMedicalSymptoms().add(str);
            }
        }
        system.getUserAccountDirectory().addUserAccount(user);
        system.getUserDirectory().addUser(user);
        JOptionPane.showMessageDialog(this, "User registered successfully!, Please login to continue");
        userProcessContainer.removeAll();
//        MainJFrame toLoginAndContinue=new MainJFrame();
//        userProcessContainer.add("toLoginAndContinue", toLoginAndContinue);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableMedicalConditionJTable;
    private javax.swing.JTable availableMedicalSymptomsJTable;
    private javax.swing.JTable availableReasonsTable;
    private javax.swing.JButton btnAddReason;
    private javax.swing.JButton btnMedConditions;
    private javax.swing.JButton btnMedicalSymptoms;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTable selectedMedicalConditionJTable;
    private javax.swing.JTable selectedMedicalSymptomsJTable;
    private javax.swing.JTable selectedReasonsTable;
    // End of variables declaration//GEN-END:variables

        public void populateSelectedReasonsTable(){
        DefaultTableModel model = (DefaultTableModel) selectedReasonsTable.getModel();
        model.setRowCount(0);
           for(String req : reasonForTreatment){
            Object[] row = new Object[1];
            row[0] = req;
            model.addRow(row);
        }   
        }
        
        public void populateSelectedMedicalConditionsTable(){
        DefaultTableModel model = (DefaultTableModel) selectedMedicalConditionJTable.getModel();
        model.setRowCount(0);
           for(String req : medicalconditions){
            Object[] row = new Object[1];
            row[0] = req;
            model.addRow(row);
        }   
        }
        
         public void populateSelectedMedicalSysmptomsTable(){
        DefaultTableModel model = (DefaultTableModel) selectedMedicalSymptomsJTable.getModel();
        model.setRowCount(0);
           for(String req : medicalSymptoms){
            Object[] row = new Object[1];
            row[0] = req;
            model.addRow(row);
        }   
        }
}
