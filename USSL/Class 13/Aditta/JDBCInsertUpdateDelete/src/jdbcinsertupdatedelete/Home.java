/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcinsertupdatedelete;

import database.DBConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author adittachakraborty
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabelRoll = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        jLabelDept = new javax.swing.JLabel();
        txtDept = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelName.setText("Name");

        txtName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabelRoll.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRoll.setText("Roll");

        txtRoll.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabelDept.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDept.setText("Dept.");

        txtDept.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnInsert.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelName)
                        .addGap(20, 20, 20)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelRoll)
                        .addGap(20, 20, 20)
                        .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelDept)
                        .addGap(20, 20, 20)
                        .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnInsert)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoll)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDept)
                    .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnInsert)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    boolean isName(String name){
        boolean isName = false;
        for(int i = 0; i < name.length(); i++){
            int currentChar = name.charAt(i);
            if((currentChar <= 90 && currentChar >= 65) && (currentChar <= 122 && currentChar >= 97)){
                isName = true;
            } else{
                isName = false;
                break;
            }
        }
        return isName;
    }
    String name = "";
    int roll = 0;
    String dept = "";
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        name = "";
        roll = 0;
        dept = "";
        if(txtName.getText().equals("")||txtRoll.getText().equals("")||txtDept.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Input information of all field");
        } else{
            try {
                roll = Integer.parseInt(txtRoll.getText());
                if(isName(txtName.getText())){
                    name = txtName.getText();
                } else{
                    JOptionPane.showMessageDialog(this, "Invalid Name");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        if(name.isEmpty() || roll == 0 || dept.isEmpty()){
            
        } else{
            DBConnection.getConnection();
            DBConnection.Insert(name);
            String query = "Insert into JDBCInsertUpdateDelete values('"+roll+"','"+name+"','"+dept+"')";
            DBConnection.Insert(query);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabelDept;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRoll;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
