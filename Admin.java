/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Uddeepa Wijerathna
 */
public class Admin extends javax.swing.JFrame {
    Login login;

  
    
    //constructor should have one parameter. Parameter is a object of Login class.
    public Admin(Login login) {
        initComponents();
        this.login=login;
    }

    private Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/doca.png"))); // NOI18N
        jButton1.setText("LAB ASSISTANT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, 70));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/NURSEE.png"))); // NOI18N
        jButton2.setText("NURSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 70));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Register New User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 126, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/RECEPTIONIST.png"))); // NOI18N
        jButton4.setText("RECEPTIONIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, 70));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/docc.png"))); // NOI18N
        jButton5.setText("DOCTOR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN DASHBOARD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("View and Update User Info");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/main.png"))); // NOI18N
        jButton6.setText("MAINTENANCE STAFF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 70));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setText("VIEW");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Selecet User Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 20));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 102));
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 180, 50));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 102));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/mon.png"))); // NOI18N
        jButton9.setText("FINANCE STAFF");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 180, 70));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "Receptionist", "FinanceStaff", "MaintenanceStaff", "LabAssistant" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 102));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "Receptionist", "FinanceStaff", "MaintenanceStaff", "LabAssistant" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Selecet User Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 180, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/s.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //creating a lab assistant registration object and make visible it while disappearing the existing interface
        LabAssistantRegistration form = new LabAssistantRegistration(this);
      form.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      //creating a doctorregistration object and make visible it while disappearing the existing interface 
      DoctorRegistration form = new DoctorRegistration(this);
      form.setVisible(true);
      this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //creating a  nurse registration object and make visible it while disappearing the existing interface
        NurseRegistration form = new NurseRegistration(this);
      form.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //creating a  receptionist registration object and make visible it while disappearing the existing interface
        ReceptionistRegistration form = new ReceptionistRegistration(this);
      form.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //creating a  maintenance staff registration object and make visible it while disappearing the existing interface
      MaintenanceStaffRegistration form = new MaintenanceStaffRegistration(this);
      form.setVisible(true);
      this.dispose(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      //creating a finance staff registration object and make visible it while disappearing the existing interface
        FinanceStaffRegistration form = new FinanceStaffRegistration(this);
      form.setVisible(true);
      this.dispose();
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//   making visible login interface while disappearing the existing interface   
     login.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jComboBox1.getSelectedItem()=="Doctor")
        {
             //creating a doctor update object and make visible it while disappearing the existing interface
            DoctorUpdate du=new DoctorUpdate(this);
            du.setVisible(true);
            this.dispose();
        }
        else if(jComboBox1.getSelectedItem()=="Nurse")
        {
             //creating a nurse update object and make visible it while disappearing the existing interface
            NurseUpdate du=new NurseUpdate(this);
            du.setVisible(true);
            this.dispose();
        }
        else if(jComboBox1.getSelectedItem()=="LabAssistant")
        {
             //creating a lab assistant object and make visible it while disappearing the existing interface
            LabAssistantUpdate du=new LabAssistantUpdate(this);
            du.setVisible(true);
            this.dispose();
        }
        else if(jComboBox1.getSelectedItem()=="Receptionist")
        {
             //creating a receptionist update object and make visible it while disappearing the existing interface
            ReceptionistUpdate du=new ReceptionistUpdate(this);
            du.setVisible(true);
            this.dispose();
        }
        else if(jComboBox1.getSelectedItem()=="FinanceStaff")
        {
             //creating a finance staff update object and make visible it while disappearing the existing interface
            FinanceStaffUpdate du=new FinanceStaffUpdate(this);
            du.setVisible(true);
            this.dispose();
        }        
        else if(jComboBox1.getSelectedItem()=="MaintenanceStaff")
        {
             //creating a maintenance staff update object and make visible it while disappearing the existing interface
            MaintenanceStaffUpdate du=new MaintenanceStaffUpdate(this);
            du.setVisible(true);
            this.dispose();
        }        


        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            // connecting to the database
            Statement s= Database.getStatement();
            if(jComboBox2.getSelectedItem()=="Doctor")
            {
            String query= "SELECT Name,Address,Contact_No FROM  employee WHERE employee.Emp_ID Like 'D%'" ;
            //,Specialization,Ward_No,Doctor_Fee doctorregistration,
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface 
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
            else if(jComboBox2.getSelectedItem()=="Nurse")
            {
                
            String query="SELECT Name,Address,Contact_No FROM  employee WHERE employee.Emp_ID Like 'N%'";
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            } 
            else if(jComboBox2.getSelectedItem()=="FinanceStaff")
            {
            String query="SELECT Name,Address,Contact_No FROM  employee WHERE employee.Emp_ID Like 'F%'";
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
            else if(jComboBox2.getSelectedItem()=="LabAssistant")
            {
            String query="SELECT Name,Address,Contact_No FROM  employee WHERE employee.Emp_ID Like 'L%'";
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
            else if(jComboBox2.getSelectedItem()=="Receptionist")
            {
            String query="SELECT Name,Address,Contact_No FROM  employee WHERE employee.Emp_ID Like 'R%'";
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
            else if(jComboBox2.getSelectedItem()=="MaintenanceStaff")
            {
            String query="SELECT Name,Address,Contact_No FROM  "
                    + "employee WHERE employee.Emp_ID Like 'M%'";
            ResultSet rs=s.executeQuery(query);
            //Data retrieved from the database are shown in a table which is displayed in another interface
            JTable table=new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }
    	

    



public static DefaultTableModel buildTableModel(ResultSet rs)
    throws SQLException {

ResultSetMetaData metaData = rs.getMetaData();

// names of columns
Vector<String> columnNames = new Vector<String>();
int columnCount = metaData.getColumnCount();
for (int column = 1; column <= columnCount; column++) {
    columnNames.add(metaData.getColumnName(column));
}

// data of the table
Vector<Vector<Object>> data = new Vector<Vector<Object>>();
while (rs.next()) {
    Vector<Object> vector = new Vector<Object>();
    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
        vector.add(rs.getObject(columnIndex));
    }
    data.add(vector);
}

return new DefaultTableModel(data, columnNames);

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

   // private TableModel buildTableModel(ResultSet rs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
