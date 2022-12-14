/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital_management_system;

import DatabaseConnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mahapatra
 */
public class ManageDoctorsList extends javax.swing.JFrame {

    /**
     * Creates new form ManageDoctorsList
     */
    public ManageDoctorsList() {
        initComponents();
        addMoreDoctorsButtonLogic(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorListTable = new javax.swing.JTable();
        addMoreDoctorsButton = new javax.swing.JButton();
        doctorIDLabel = new javax.swing.JLabel();
        doctorIDTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        specialtyLabel = new javax.swing.JLabel();
        visitingHoursLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        specialtyTextField = new javax.swing.JTextField();
        visitingHoursTextField = new javax.swing.JTextField();
        detailsTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 320));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "Speciality", "Visiting Hours", "Details"
            }
        ));
        jScrollPane1.setViewportView(doctorListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 42, 593, 490));

        addMoreDoctorsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addMoreDoctorsButton.setText("Add More Doctors");
        addMoreDoctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoreDoctorsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMoreDoctorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 70, -1, -1));

        doctorIDLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        doctorIDLabel.setText("Doctor ID:");
        getContentPane().add(doctorIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 143, -1, -1));

        doctorIDTextField.setPreferredSize(new java.awt.Dimension(180, 26));
        getContentPane().add(doctorIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        specialtyLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        specialtyLabel.setText("Specialty:");
        getContentPane().add(specialtyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        visitingHoursLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        visitingHoursLabel.setText("Visiting Hours:");
        getContentPane().add(visitingHoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        detailsLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");
        getContentPane().add(detailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(180, 26));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        specialtyTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        specialtyTextField.setPreferredSize(new java.awt.Dimension(180, 26));
        getContentPane().add(specialtyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        visitingHoursTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visitingHoursTextField.setPreferredSize(new java.awt.Dimension(180, 26));
        getContentPane().add(visitingHoursTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, -1, -1));

        detailsTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsTextField.setPreferredSize(new java.awt.Dimension(180, 26));
        getContentPane().add(detailsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, -1, -1));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/save_icon.png"))); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/save_icon.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/close_icon.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/background_image.jpg"))); // NOI18N
        backgroundImage.setPreferredSize(new java.awt.Dimension(1100, 638));
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean toggle;
    private void addMoreDoctorsButtonLogic(boolean cond){
        doctorIDTextField.setVisible(cond);
        nameTextField.setVisible(cond);
        specialtyTextField.setVisible(cond);
        visitingHoursTextField.setVisible(cond);
        detailsTextField.setVisible(cond);
        doctorIDLabel.setVisible(cond);
        nameLabel.setVisible(cond);
        specialtyLabel.setVisible(cond);
        visitingHoursLabel.setVisible(cond);
        detailsLabel.setVisible(cond);
        addButton.setVisible(cond);
        updateButton.setVisible(cond);
    }
    private void addMoreDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoreDoctorsButtonActionPerformed
        if(toggle == false){
            addMoreDoctorsButtonLogic(true);
            toggle = true;
            
        }
        else{
            addMoreDoctorsButtonLogic(false);
            toggle = false;
        }
    }//GEN-LAST:event_addMoreDoctorsButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String doctorID = doctorIDTextField.getText();
        String name = nameTextField.getText();        
        String specialty = specialtyTextField.getText();
        String visitingHours = visitingHoursTextField.getText();        
        String details = detailsTextField.getText();
        try{
                Connection con = DBConnection.getCon();
                Statement st = con.createStatement();
                st.executeUpdate(String.format("INSERT INTO doctors VALUES ('%s','%s','%s','%s','%s')",
                        doctorID, name, specialty, visitingHours, details));
                
                JOptionPane.showMessageDialog(null, "Successfully added.");
                this.setVisible(false);
                new ManageDoctorsList().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid details.");
            }

    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String doctorID = doctorIDTextField.getText();
        String name = nameTextField.getText();        
        String specialty = specialtyTextField.getText();
        String visitingHours = visitingHoursTextField.getText();        
        String details = detailsTextField.getText();
        try{
            Connection con = DBConnection.getCon();
            Statement st = con.createStatement();
//            st.executeUpdate("UPDATE doctor SET NAME = '" + name + "', specialty = '" + specialty + "', visitingHours = '" + visitingHours + "', details = '" + details 
//                    + "' WHERE doctorID = '" + doctorID + "'");
            st.executeUpdate(String.format("UPDATE doctors SET NAME = '%s', specialty = '%s', visitingHours = '%s', details = '%s' WHERE doctorID = '%s'",
                     name, specialty, visitingHours, details, doctorID));
            
            JOptionPane.showMessageDialog(null, "Doctor details updated successfully!");
            this.setVisible(false);
            new ManageDoctorsList().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid details.");
            }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            Connection con = DBConnection.getCon();
            Statement st = con.createStatement();
            //ResultSet rs = st.executeQuery("SELECT * FROM patient INNER JOIN patientDiagnosisReports ON patient.patientID = patientDiagnosisReports.patientID");
            ResultSet rs = st.executeQuery("SELECT doctorID as Doctor_ID, name as Name, specialty as Specialty, visitingHours as Visiting_Hours, details as Details FROM doctors");
            doctorListTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Commands!");
        }
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDoctorsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addMoreDoctorsButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextField detailsTextField;
    private javax.swing.JLabel doctorIDLabel;
    private javax.swing.JTextField doctorIDTextField;
    private javax.swing.JTable doctorListTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel specialtyLabel;
    private javax.swing.JTextField specialtyTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel visitingHoursLabel;
    private javax.swing.JTextField visitingHoursTextField;
    // End of variables declaration//GEN-END:variables
}
