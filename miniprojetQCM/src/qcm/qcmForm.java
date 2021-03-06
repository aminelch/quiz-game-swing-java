package qcm;

/*****
 * @author: Louhichi Amine alias<aminelch> 
 * @url : github.com/aminelch 
 * @description: ce classe contient le coeur de mon app 
 */
import java.util.List;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import qcm.mysql.Person;
import qcm.mysql.Question;
import qcm.mysql.UserDaoImpl;

public class qcmForm extends javax.swing.JFrame {

    private ButtonGroup radioGroup;

    private int numeroQuestionAleatoire;//stocke le num de question choiisi aléatoirement 
    private int score;//stocke le score de l'utilisateur
    private int questionCounter; //compteur des questions 
    private String reponseJuste; //stocke la reponse vraie
    private String reponseChoisie; //stocke de l'utilisateur 
    private boolean OneRadioBtnIsChecked; // vrai si un radioBtn ést coché 
    private boolean fin = false;  //indique si on a achever les questions 
    private final int questionMax = 8; //nombre max des qcm
    private Random rand; 
    List<Question> questions;
   

    public qcmForm() {
        initComponents();
        if ((appUtils.user.getUsername().length() > 0)) {
            lblUsername.setText("Utilisateur " + appUtils.user.getUsername());
        }

        //ajouter les radiobox au groupRadioBox 
        groupButton();
        rand =new Random(); 
        UserDaoImpl per = new UserDaoImpl();
        
        questions = per.getAllQuestions();

   
            BringQuestion();
      
        score = 0;
        questionCounter = 1;
        lblQuestionNum.setText("Question numéro:" + Integer.toString(questionCounter));

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
        jSeparator2 = new javax.swing.JSeparator();
        lblimg = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblUsername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnonnce = new javax.swing.JTextArea();
        btnOK = new javax.swing.JButton();
        lblQuestionNum = new javax.swing.JLabel();
        rdop2 = new javax.swing.JRadioButton();
        rdop3 = new javax.swing.JRadioButton();
        rdop1 = new javax.swing.JRadioButton();
        rdop4 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblQuestionNum1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini projet java: A propos");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/quiz-red-icon-256.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 260));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 310, 10));

        lblimg.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblimg.setForeground(new java.awt.Color(0, 0, 0));
        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/medal.png"))); // NOI18N
        jPanel1.add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 40));

        lblScore.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lblScore.setForeground(new java.awt.Color(0, 0, 0));
        lblScore.setText("Score:0");
        lblScore.setToolTipText("");
        jPanel1.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 230, 50));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 300, -1));

        lblUsername.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/user.png"))); // NOI18N
        lblUsername.setText("Utilisateur<dynamic>");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 10));

        btnNext.setBackground(new java.awt.Color(51, 153, 255));
        btnNext.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnNext.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/arrow-11-32.png"))); // NOI18N
        btnNext.setText("Question Suivant");
        btnNext.setBorderPainted(false);
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 170, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("QCM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jScrollPane1.setBorder(null);

        txtEnonnce.setEditable(false);
        txtEnonnce.setBackground(new java.awt.Color(36, 47, 65));
        txtEnonnce.setColumns(20);
        txtEnonnce.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEnonnce.setForeground(new java.awt.Color(255, 255, 255));
        txtEnonnce.setLineWrap(true);
        txtEnonnce.setRows(5);
        txtEnonnce.setWrapStyleWord(true);
        txtEnonnce.setFocusable(false);
        txtEnonnce.setOpaque(false);
        txtEnonnce.setRequestFocusEnabled(false);
        txtEnonnce.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(txtEnonnce);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 150));

        btnOK.setBackground(new java.awt.Color(51, 153, 255));
        btnOK.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOK.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/power-32.png"))); // NOI18N
        btnOK.setText("Quitter");
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel2.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 160, 40));

        lblQuestionNum.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblQuestionNum.setForeground(java.awt.Color.white);
        lblQuestionNum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qcm/img/conversation.png"))); // NOI18N
        lblQuestionNum.setText("Question <dynamic>");
        lblQuestionNum.setToolTipText("");
        jPanel2.add(lblQuestionNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 40));

        rdop2.setBackground(new java.awt.Color(36, 47, 65));
        rdop2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdop2.setForeground(new java.awt.Color(255, 255, 255));
        rdop2.setText("<dynamic op2>");
        rdop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdop2ActionPerformed(evt);
            }
        });
        jPanel2.add(rdop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        rdop3.setBackground(new java.awt.Color(36, 47, 65));
        rdop3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdop3.setForeground(new java.awt.Color(255, 255, 255));
        rdop3.setText("<dynamic op3>");
        rdop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdop3ActionPerformed(evt);
            }
        });
        jPanel2.add(rdop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 40));

        rdop1.setBackground(new java.awt.Color(36, 47, 65));
        rdop1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdop1.setForeground(new java.awt.Color(255, 255, 255));
        rdop1.setText("<dynamic op1>");
        rdop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdop1ActionPerformed(evt);
            }
        });
        jPanel2.add(rdop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        rdop4.setBackground(new java.awt.Color(36, 47, 65));
        rdop4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdop4.setForeground(new java.awt.Color(255, 255, 255));
        rdop4.setText("<dynamic op4>");
        rdop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdop4ActionPerformed(evt);
            }
        });
        jPanel2.add(rdop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 10));

        lblQuestionNum1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblQuestionNum1.setForeground(java.awt.Color.white);
        lblQuestionNum1.setText("Réponses");
        lblQuestionNum1.setToolTipText("");
        jPanel2.add(lblQuestionNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 380, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        if (fin == true) {
            System.out.println("fin des questions btn next");
        }

        System.out.println("reponse choisi " + reponseChoisie);
        System.out.println("one radio is checked : " + OneRadioBtnIsChecked);
        //si l'utilisateur a choisi un option parmi les radioBtn 
        if ((OneRadioBtnIsChecked == true) && (reponseChoisie != null)) {

            if (reponseJuste.equals(reponseChoisie)) {
                //on modifie le score et le label aussi 
                updateScore();

            }

            if (fin) {
                javax.swing.JOptionPane.showMessageDialog(null, "utilisateur , votre score =" + score, appUtils.nomProjet, INFORMATION_MESSAGE);
                Person us = new Person();
                us = appUtils.getActifUser();
                us.setScore(score);
                appUtils.updateUserScore(us, us.getUsername());
                javax.swing.JOptionPane.showMessageDialog(null, "utilisateur , votre score =" + score, appUtils.nomProjet, INFORMATION_MESSAGE);
            }

            resetInterface();

            BringQuestion();

        } else {
            //affiche le dialogue d'erreur
            javax.swing.JOptionPane.showMessageDialog(null, "Vous devez choisir une réponse", appUtils.nomProjet, ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnNextActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
     
         int reponse= JOptionPane.showConfirmDialog(null, "Voulez vous vraiment quitter", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
   
        if(reponse == JOptionPane.YES_OPTION ){
        this.setVisible(false);
        new mainForm().setVisible(true);  
        }
        
       

    }//GEN-LAST:event_btnOKActionPerformed

    private void rdop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdop1ActionPerformed

        OneRadioBtnIsChecked = true;
        reponseChoisie = rdop1.getText();
    }//GEN-LAST:event_rdop1ActionPerformed

    private void rdop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdop2ActionPerformed

        OneRadioBtnIsChecked = true;
        reponseChoisie = rdop2.getText();
    }//GEN-LAST:event_rdop2ActionPerformed

    private void rdop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdop3ActionPerformed
        OneRadioBtnIsChecked = true;
        reponseChoisie = rdop3.getText();
    }//GEN-LAST:event_rdop3ActionPerformed

    private void rdop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdop4ActionPerformed

        OneRadioBtnIsChecked = true;
        reponseChoisie = rdop4.getText();
    }//GEN-LAST:event_rdop4ActionPerformed

    /**
     * ****************************************************************************
     *** Afficher un question passé en param dans un textbox ainsi que les
     * reponses
    ******************************************************************************
     */
    private void showQuestion(Question q) {
        txtEnonnce.setText(q.getQuestion());
        rdop1.setText(q.getOp1());
        rdop2.setText(q.getOp2());
        rdop3.setText(q.getOp3());
        rdop4.setText(q.getOp4());
        reponseJuste = q.getReponse();
    }

    /**
     * ****************************************************************
     *** Ajouter les radiobox au groupButton
    ******************************************************************
     */
    private void groupButton() {
        radioGroup = new ButtonGroup();
        radioGroup.add(rdop1);
        radioGroup.add(rdop2);
        radioGroup.add(rdop3);
        radioGroup.add(rdop4);

        rdop1.setSelected(false);
        rdop2.setSelected(false);
        rdop3.setSelected(false);
        rdop4.setSelected(false);
        OneRadioBtnIsChecked = false;//on remet l'etat à false 
    }

    /**
     * ****************************************************************
     *** Mise à zéro des champs et des variables  
    ******************************************************************
     */
    private void resetInterface() {
        txtEnonnce.setText("");

        rdop1.setSelected(false);
        rdop2.setSelected(false);
        rdop3.setSelected(false);
        rdop4.setSelected(false);

        rdop1.setText("");
        rdop2.setText("");
        rdop3.setText("");
        rdop4.setText("");

        OneRadioBtnIsChecked = false;
        reponseChoisie = null;
        reponseJuste = null;

    }

    /**
     * ****************************************************************
     *** Mettre à jout la variable score et le label de score 
    ******************************************************************
     */
    private void updateScore() {
        score = score + 10;
        lblScore.setText("Score:" + score);
    }

    /**
     * ****************************************************************************
     *** gènere un question àleatoire à chaque fois et mise à ajour des
     * compteurs 
    ******************************************************************************
     */
    private void BringQuestion() {

        if (questions.size() > 1) {
            questionCounter++;
            //si le conteur ne depasse pas le max 
            if (questionCounter <= questionMax) {
                lblQuestionNum.setText("Question numero: " + questionCounter);

                numeroQuestionAleatoire = rand.nextInt((questions.size()) - 1);
                //affiche le question
                showQuestion(questions.get(numeroQuestionAleatoire));
                questions.remove(numeroQuestionAleatoire);

                System.out.println("conteur question : " + questionCounter);
                System.out.println("num aleatoire " + numeroQuestionAleatoire);

                System.out.println("size : " + questions.size());

            } else {
                System.out.println("fin des questions 1");
                fin = true;
                updateScore();

                javax.swing.JOptionPane.showMessageDialog(null, "Votre score  est " + score, appUtils.nomProjet, INFORMATION_MESSAGE);

                UserDaoImpl per = new UserDaoImpl();
                per.updateUserScore(appUtils.getActifUser().getUsername(), score);

                this.setVisible(false);
                new bestScoreForm().setVisible(true);

            }

        } else {

            //fin de la liste 
            fin = true;
            System.out.println("fin des questions 2");
        }

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
            java.util.logging.Logger.getLogger(qcmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qcmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qcmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qcmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qcmForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblQuestionNum;
    private javax.swing.JLabel lblQuestionNum1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblimg;
    private javax.swing.JRadioButton rdop1;
    private javax.swing.JRadioButton rdop2;
    private javax.swing.JRadioButton rdop3;
    private javax.swing.JRadioButton rdop4;
    private javax.swing.JTextArea txtEnonnce;
    // End of variables declaration//GEN-END:variables
}
