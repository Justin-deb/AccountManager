package Presentation;

import javax.swing.JOptionPane;

public class jfm_registrer extends javax.swing.JFrame {

    private jfm_login login;
    String name = "";
    String lastName = "";
    String userName = "";
    long ID= 0;
    String psswrd = "";
    String psswrd2 = "";
    public jfm_registrer() {
        initComponents();
        hideErrors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnl_main = new javax.swing.JPanel();
        pnl_right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_txts = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        txt_userName = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_password1 = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        lbl_userName = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_psswrd = new javax.swing.JLabel();
        lbl_psswrd2 = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        lbl_login = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create your account!");
        setResizable(false);

        pnl_main.setBackground(new java.awt.Color(255, 255, 255));

        pnl_right.setBackground(new java.awt.Color(0, 102, 102));
        pnl_right.setMinimumSize(new java.awt.Dimension(400, 500));
        pnl_right.setName(""); // NOI18N

        javax.swing.GroupLayout pnl_rightLayout = new javax.swing.GroupLayout(pnl_right);
        pnl_right.setLayout(pnl_rightLayout);
        pnl_rightLayout.setHorizontalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnl_rightLayout.setVerticalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Sign Up!");

        pnl_txts.setBackground(new java.awt.Color(255, 255, 255));

        txt_name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NAME:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        txt_lastName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LAST NAME:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        txt_userName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USER NAME:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        txt_ID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        txt_password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        txt_password1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD AGAIN:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 15), new java.awt.Color(0, 102, 102))); // NOI18N

        lbl_name.setBackground(new java.awt.Color(255, 51, 0));
        lbl_name.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 0, 0));
        lbl_name.setText("* ERROR");

        lbl_lastName.setBackground(new java.awt.Color(255, 51, 0));
        lbl_lastName.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(255, 0, 0));
        lbl_lastName.setText("* ERROR");

        lbl_userName.setBackground(new java.awt.Color(255, 51, 0));
        lbl_userName.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(255, 0, 0));
        lbl_userName.setText("* ERROR");

        lbl_ID.setBackground(new java.awt.Color(255, 51, 0));
        lbl_ID.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(255, 0, 0));
        lbl_ID.setText("* ERROR");

        lbl_psswrd.setBackground(new java.awt.Color(255, 51, 0));
        lbl_psswrd.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_psswrd.setForeground(new java.awt.Color(255, 0, 0));
        lbl_psswrd.setText("* ERROR");

        lbl_psswrd2.setBackground(new java.awt.Color(255, 51, 0));
        lbl_psswrd2.setFont(new java.awt.Font("Fira Code", 2, 15)); // NOI18N
        lbl_psswrd2.setForeground(new java.awt.Color(255, 0, 0));
        lbl_psswrd2.setText("* ERROR");

        javax.swing.GroupLayout pnl_txtsLayout = new javax.swing.GroupLayout(pnl_txts);
        pnl_txts.setLayout(pnl_txtsLayout);
        pnl_txtsLayout.setHorizontalGroup(
            pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_txtsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password)
                    .addComponent(txt_password1)
                    .addGroup(pnl_txtsLayout.createSequentialGroup()
                        .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_name)
                            .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_txtsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_psswrd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_psswrd2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnl_txtsLayout.setVerticalGroup(
            pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_txtsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(lbl_lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_userName)
                    .addComponent(lbl_ID))
                .addGap(1, 1, 1)
                .addGroup(pnl_txtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lbl_psswrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_psswrd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_create.setBackground(new java.awt.Color(0, 102, 102));
        btn_create.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        btn_create.setForeground(new java.awt.Color(255, 255, 255));
        btn_create.setText("Create Account!!");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        lbl_login.setForeground(new java.awt.Color(0, 102, 102));
        lbl_login.setText("Already have an account? Log in Here!");
        lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addComponent(pnl_right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(18, 117, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(107, 107, 107))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btn_create))
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_login)
                                    .addComponent(pnl_txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_login)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_main, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseClicked
        setLogin(login);
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_loginMouseClicked

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        hideErrors();
        if(validateTxt()){
            System.out.println("validated");
        }
    }//GEN-LAST:event_btn_createActionPerformed

    public jfm_login getLogin() {
        return login;
    }

    public void setLogin(jfm_login login) {
        this.login = login;
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
            java.util.logging.Logger.getLogger(jfm_registrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfm_registrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfm_registrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfm_registrer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfm_registrer().setVisible(true);
            }
        });
    }
    
    public void hideErrors(){
        lbl_ID.setVisible(false);
        lbl_lastName.setVisible(false);
        lbl_name.setVisible(false);
        lbl_psswrd.setVisible(false);
        lbl_psswrd2.setVisible(false);
        lbl_userName.setVisible(false);
    }
    
    public boolean validateTxt(){
        if(txt_name.getText().isBlank()) {
            lbl_name.setVisible(true);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_psswrd;
    private javax.swing.JLabel lbl_psswrd2;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_right;
    private javax.swing.JPanel pnl_txts;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_password1;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
