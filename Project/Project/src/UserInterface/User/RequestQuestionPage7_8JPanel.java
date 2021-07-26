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
import Business.Role.UserRole;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Request;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juhip
 */
public class RequestQuestionPage7_8JPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private Organization org;
    private Ecosystem system;
    private Request request;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
   
       
    public RequestQuestionPage7_8JPanel(JPanel userProcessContainer, Ecosystem system,UserAccount userAccount, Request request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
         populateUsStates();
        
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
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        question7ComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        question8ComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Registration");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("What gender would you prefer in a provider?");

        question7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "I'm not sure" }));
        question7ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question7ComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("What state do you live in?");

        question8ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question8ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(lblDoctorslist1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(question7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addGap(68, 68, 68)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(question7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(question8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 620, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String res = question7ComboBox.getSelectedItem().toString();
        String res2 = question8ComboBox.getSelectedItem().toString();
        if(res.isEmpty() || res2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select one from the dropdown first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            User user = system.getUserDirectory().findUserByUserName(userAccount.getUsername());
            request.setPreferedPsychiatristGender(res);
            request.setState(res2);
            request.setStatus("New");
            request.setUser(user);
            user.getRequestDirectory().getRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Request generated successfully!");
        RequestDetailsJPanel requestDetails=new RequestDetailsJPanel(userProcessContainer,system,userAccount);
        userProcessContainer.add("requestDetails", requestDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void question8ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question8ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question8ComboBoxActionPerformed

    private void question7ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question7ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question7ComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JComboBox<String> question7ComboBox;
    private javax.swing.JComboBox<String> question8ComboBox;
    // End of variables declaration//GEN-END:variables
        public void populateUsStates(){
        ArrayList<String> state_names = new ArrayList<String>(Arrays.asList("AK - Alaska", 
                "AL - Alabama", 
                "AR - Arkansas", 
                "AS - American Samoa", 
                "AZ - Arizona", 
                "CA - California", 
                "CO - Colorado", 
                "CT - Connecticut", 
                "DC - District of Columbia", 
                "DE - Delaware", 
                "FL - Florida", 
                "GA - Georgia", 
                "GU - Guam", 
                "HI - Hawaii", 
                "IA - Iowa", 
                "ID - Idaho", 
                "IL - Illinois", 
                "IN - Indiana", 
                "KS - Kansas", 
                "KY - Kentucky", 
                "LA - Louisiana", 
                "MA - Massachusetts", 
                "MD - Maryland", 
                "ME - Maine", 
                "MI - Michigan", 
                "MN - Minnesota", 
                "MO - Missouri", 
                "MS - Mississippi", 
                "MT - Montana", 
                "NC - North Carolina", 
                "ND - North Dakota", 
                "NE - Nebraska", 
                "NH - New Hampshire", 
                "NJ - New Jersey", 
                "NM - New Mexico", 
                "NV - Nevada", 
                "NY - New York", 
                "OH - Ohio", 
                "OK - Oklahoma", 
                "OR - Oregon", 
                "PA - Pennsylvania", 
                "PR - Puerto Rico", 
                "RI - Rhode Island", 
                "SC - South Carolina", 
                "SD - South Dakota", 
                "TN - Tennessee", 
                "TX - Texas", 
                "UT - Utah", 
                "VA - Virginia", 
                "VI - Virgin Islands", 
                "VT - Vermont", 
                "WA - Washington", 
                "WI - Wisconsin", 
                "WV - West Virginia", 
                "WY - Wyoming"));
        for(String str : state_names){
            question8ComboBox.addItem(str);
        }
    }
}