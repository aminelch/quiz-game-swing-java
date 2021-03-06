
package qcm;

public class aboutForm extends javax.swing.JFrame {

    public aboutForm() {
        initComponents();            
        String copyright ="Pour ce mini projet j'ai utilisé :<br>" +
        "→ <b>NetBeans IDE 11.0</b> et son formBuilder pour créer<br>" +
        "les interfaces graphiques <br>" +
        "→ des <b>icones</b> de la part de<br><a target='_blank'  style='color:green;' href='https://iconfinder.com'>https://iconfinder.com</a> <br>" +
        "→ La bibliothèque <b>apache commonCodec</b><br> pour crypter le mot de" +
        "passe en algorithme SHA-1 <br>" + 
        "<b>mysql-connector-java-8.0.16.jar</b><br> pour l'intéraction avec la base "                ; 
        
        lblpar1.setText("<html><style>a:link {color: green;}</style>" + copyright + "</html>");
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblpar1 = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mini projet java: A propos");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/info-3-256.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("A propos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Copyright Louchi Amine <aminelch> 2019");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Dans le cadre de mini projet java ");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 20));

        lblpar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblpar1.setForeground(java.awt.Color.white);
        lblpar1.setText("Pour ce mini projet j'ai utilisé : \n→ NetBeans IDE 11.0 et son formBuilder pour créer\nles interfaces graphiques \n→ des icones de la part de https://iconfinder.com\n→ La bibliothèque apache pour crypter le mot de \npasse en algorithme SHA-1 ");
        lblpar1.setToolTipText("");
        lblpar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblpar1.setFocusable(false);
        jPanel2.add(lblpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 340, 270));

        btnRetour.setBackground(new java.awt.Color(51, 153, 255));
        btnRetour.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRetour.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/arrow-111-32.png"))); // NOI18N
        btnRetour.setText("  Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 370, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
             this.setVisible(false);
             new mainForm().setVisible(true);  
    }//GEN-LAST:event_formWindowClosing

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        this.setVisible(false);
        new mainForm().setVisible(true);  // on reaffiche le loginform
    }//GEN-LAST:event_btnRetourActionPerformed
   
    
    
   
    
    
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
            java.util.logging.Logger.getLogger(aboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutForm().setVisible(true);
                             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetour;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblpar1;
    // End of variables declaration//GEN-END:variables
}
