
package qcm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import qcm.mysql.Person;
import qcm.mysql.Question;
import qcm.mysql.UserDaoImpl;


public class bestScoreForm extends javax.swing.JFrame {


    public bestScoreForm() {
        initComponents();            
         UserDaoImpl per = new UserDaoImpl();
          List<Person> persons = per.selectAll();
        lblScore.setText("<html>");
       
          int counter=0; 
        for(Person p : persons) {
            lblScore.setText(lblScore.getText() + counter + " " + p.getUsername() + " " + p.getScore() + " points <br>");
            counter++;
        }
      lblScore.setText(lblScore.getText() +"</html>");
        
            
      
      
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
        lblScore = new javax.swing.JLabel();
        btnConnecter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini projet java Meuilleur Score");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/view-details-256.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Meuilleur Score");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 10));

        lblScore.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblScore.setForeground(java.awt.Color.white);
        lblScore.setToolTipText("");
        jPanel2.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, 270));

        btnConnecter.setBackground(new java.awt.Color(51, 153, 255));
        btnConnecter.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnConnecter.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnConnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/arrow-111-32.png"))); // NOI18N
        btnConnecter.setText("  Retour");
        btnConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnecterActionPerformed(evt);
            }
        });
        jPanel2.add(btnConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 380, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnecterActionPerformed
         this.setVisible(false);
        new mainForm().setVisible(true);  // on reaffiche le loginform
    }//GEN-LAST:event_btnConnecterActionPerformed
   
    
           
     public List<Question> getRandomElement(List<Question> list, 
                                          int totalItems) 
    { 
        Random rand = new Random(); 
  
        // create a temporary list for storing 
        // selected element 
        List<Question> newList = new ArrayList<Question>(); 
        
        for (int i = 0; i < totalItems; i++) { 
  
            // take a raundom index between 0 to size  
            // of given List 
            int randomIndex = rand.nextInt(list.size()); 
  
            // add element in temporary list 
            newList.add(list.get(randomIndex)); 
  
            // Remove selected element from orginal list 
            list.remove(randomIndex); 
        } 
        return newList; 
    }      
         
         
         
   
    
    
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
            java.util.logging.Logger.getLogger(bestScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bestScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bestScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bestScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bestScoreForm().setVisible(true);
                             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnecter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
