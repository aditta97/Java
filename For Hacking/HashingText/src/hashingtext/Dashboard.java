/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashingtext;

import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author adittachakraborty
 */
public final class Dashboard extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        JFrameIcon();
        radioGroup();
    }

    //Setting an Icon for jFrame
    void JFrameIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/Cobra.png")));
    }

    public void radioGroup() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(md2);
        bg.add(md5);
        bg.add(sha1);
        bg.add(sha224);
        bg.add(sha256);
        bg.add(sha384);
        bg.add(sha512);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        md2 = new javax.swing.JRadioButton();
        md5 = new javax.swing.JRadioButton();
        sha1 = new javax.swing.JRadioButton();
        sha224 = new javax.swing.JRadioButton();
        sha256 = new javax.swing.JRadioButton();
        sha384 = new javax.swing.JRadioButton();
        sha512 = new javax.swing.JRadioButton();
        txtOutput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hashing Text");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jButton1.setText("Hash Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hashing System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monaco", 0, 18))); // NOI18N

        md2.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        md2.setText("MD2");

        md5.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        md5.setText("MD5");

        sha1.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        sha1.setText("SHA-1");

        sha224.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        sha224.setText("SHA-224");

        sha256.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        sha256.setText("SHA-256");

        sha384.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        sha384.setText("SHA-384");

        sha512.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        sha512.setText("SHA-512");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sha256)
                    .addComponent(md2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(md5)
                    .addComponent(sha384))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sha1)
                    .addComponent(sha512))
                .addGap(20, 20, 20)
                .addComponent(sha224)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md2)
                    .addComponent(md5)
                    .addComponent(sha1)
                    .addComponent(sha224))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sha256)
                    .addComponent(sha384)
                    .addComponent(sha512))
                .addGap(15, 15, 15))
        );

        txtOutput.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        jLabel2.setText("Version 1.O");

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        jLabel1.setText("Copyright © Aditta Chakraborty 2019 for COBRA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2))
                            .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String password = txtPassword.getText();
        if (md2.isSelected()) {
            String hash = "MD2";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (md5.isSelected()) {
            String hash = "MD5";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (sha1.isSelected()) {
            String hash = "SHA-1";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (sha224.isSelected()) {
            String hash = "SHA-224";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (sha256.isSelected()) {
            String hash = "SHA-256";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (sha384.isSelected()) {
            String hash = "SHA-384";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        } else if (sha512.isSelected()) {
            String hash = "SHA-512";
            txtOutput.setText(HashEncrypt.encryptThisString(hash, password));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton md2;
    private javax.swing.JRadioButton md5;
    private javax.swing.JRadioButton sha1;
    private javax.swing.JRadioButton sha224;
    private javax.swing.JRadioButton sha256;
    private javax.swing.JRadioButton sha384;
    private javax.swing.JRadioButton sha512;
    private javax.swing.JTextField txtOutput;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
