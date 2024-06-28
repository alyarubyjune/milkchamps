package com.example.myapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JFrame;

/**
 *
 * @author Alya
 */
public class SignUp extends javax.swing.JFrame {
    
    public SignUp() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        label_foto = new javax.swing.JLabel();
        label_signup = new javax.swing.JPanel();
        label_header = new javax.swing.JLabel();
        label_subHeader = new javax.swing.JLabel();
        panel_email = new javax.swing.JPanel();
        label_email = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        panel_nama = new javax.swing.JPanel();
        label_nama = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        panel_username = new javax.swing.JPanel();
        label_username = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        panel_pass = new javax.swing.JPanel();
        label_pass = new javax.swing.JLabel();
        input_pass = new javax.swing.JPasswordField();
        panel_confirm = new javax.swing.JPanel();
        label_confirm = new javax.swing.JLabel();
        input_confirm = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();
        panel_back = new javax.swing.JPanel();
        label_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(234, 255, 255));
        panel_base.setPreferredSize(new java.awt.Dimension(1920, 1080));

        label_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gambar_susu_banyak-removebg-preview.png"))); // NOI18N
        label_foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        label_signup.setBackground(new java.awt.Color(68, 174, 219));
        label_signup.setPreferredSize(new java.awt.Dimension(960, 1080));

        label_header.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label_header.setForeground(new java.awt.Color(255, 255, 255));
        label_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_header.setText("Create Your Account");

        label_subHeader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_subHeader.setForeground(new java.awt.Color(255, 255, 255));
        label_subHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_subHeader.setText("Please fill the input below");

        panel_email.setBackground(new java.awt.Color(199, 242, 255));
        panel_email.setPreferredSize(new java.awt.Dimension(497, 85));

        label_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_email.setText("Email");

        input_email.setBackground(new java.awt.Color(199, 242, 255));
        input_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_email.setToolTipText("");
        input_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        input_email.setName(""); // NOI18N

        javax.swing.GroupLayout panel_emailLayout = new javax.swing.GroupLayout(panel_email);
        panel_email.setLayout(panel_emailLayout);
        panel_emailLayout.setHorizontalGroup(
            panel_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emailLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_emailLayout.setVerticalGroup(
            panel_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_nama.setBackground(new java.awt.Color(199, 242, 255));
        panel_nama.setPreferredSize(new java.awt.Dimension(497, 85));

        label_nama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_nama.setText("Full Name");

        input_nama.setBackground(new java.awt.Color(199, 242, 255));
        input_nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_nama.setToolTipText("");
        input_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        input_nama.setName(""); // NOI18N

        javax.swing.GroupLayout panel_namaLayout = new javax.swing.GroupLayout(panel_nama);
        panel_nama.setLayout(panel_namaLayout);
        panel_namaLayout.setHorizontalGroup(
            panel_namaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_namaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_namaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nama))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panel_namaLayout.setVerticalGroup(
            panel_namaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_namaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_username.setBackground(new java.awt.Color(199, 242, 255));
        panel_username.setPreferredSize(new java.awt.Dimension(497, 85));

        label_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_username.setText("Username");

        input_username.setBackground(new java.awt.Color(199, 242, 255));
        input_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_username.setToolTipText("");
        input_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        input_username.setName(""); // NOI18N

        javax.swing.GroupLayout panel_usernameLayout = new javax.swing.GroupLayout(panel_username);
        panel_username.setLayout(panel_usernameLayout);
        panel_usernameLayout.setHorizontalGroup(
            panel_usernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usernameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_usernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_username))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_usernameLayout.setVerticalGroup(
            panel_usernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_pass.setBackground(new java.awt.Color(199, 242, 255));
        panel_pass.setPreferredSize(new java.awt.Dimension(497, 85));

        label_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_pass.setText("Password");

        input_pass.setBackground(new java.awt.Color(199, 242, 255));
        input_pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        input_pass.setMinimumSize(new java.awt.Dimension(64, 18));
        input_pass.setPreferredSize(new java.awt.Dimension(64, 18));

        javax.swing.GroupLayout panel_passLayout = new javax.swing.GroupLayout(panel_pass);
        panel_pass.setLayout(panel_passLayout);
        panel_passLayout.setHorizontalGroup(
            panel_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pass))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_passLayout.setVerticalGroup(
            panel_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_confirm.setBackground(new java.awt.Color(199, 242, 255));
        panel_confirm.setPreferredSize(new java.awt.Dimension(497, 85));

        label_confirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_confirm.setText("Confirm Password");

        input_confirm.setBackground(new java.awt.Color(199, 242, 255));
        input_confirm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_confirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        input_confirm.setPreferredSize(new java.awt.Dimension(64, 18));

        javax.swing.GroupLayout panel_confirmLayout = new javax.swing.GroupLayout(panel_confirm);
        panel_confirm.setLayout(panel_confirmLayout);
        panel_confirmLayout.setHorizontalGroup(
            panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_confirmLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_confirm))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_confirmLayout.setVerticalGroup(
            panel_confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_confirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        button_login.setBackground(new java.awt.Color(0, 0, 102));
        button_login.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("LOGIN");
        button_login.setBorderPainted(false);
        button_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_login.setMargin(new java.awt.Insets(4, 14, 4, 14));
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout label_signupLayout = new javax.swing.GroupLayout(label_signup);
        label_signup.setLayout(label_signupLayout);
        label_signupLayout.setHorizontalGroup(
            label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, label_signupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(label_signupLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_subHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_header, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, label_signupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel_email, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                .addComponent(panel_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(panel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );
        label_signupLayout.setVerticalGroup(
            label_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(label_signupLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(label_header, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_subHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(panel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        panel_back.setBackground(new java.awt.Color(68, 174, 219));

        label_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_back.setForeground(new java.awt.Color(255, 255, 255));
        label_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_back.setText("BACK");
        label_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_backLayout = new javax.swing.GroupLayout(panel_back);
        panel_back.setLayout(panel_backLayout);
        panel_backLayout.setHorizontalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_back, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        panel_backLayout.setVerticalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)))
                .addComponent(label_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                .addComponent(label_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(label_foto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_backMouseClicked
        Homepage frame = new Homepage();
        frame.setVisible(true);
    }//GEN-LAST:event_label_backMouseClicked

    private void button_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseClicked
        Homepage frame = new Homepage();
        frame.setVisible(true);
    }//GEN-LAST:event_button_loginMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new form_login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JPasswordField input_confirm;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel label_back;
    private javax.swing.JLabel label_confirm;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_foto;
    private javax.swing.JLabel label_header;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_pass;
    private javax.swing.JPanel label_signup;
    private javax.swing.JLabel label_subHeader;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel panel_back;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_confirm;
    private javax.swing.JPanel panel_email;
    private javax.swing.JPanel panel_nama;
    private javax.swing.JPanel panel_pass;
    private javax.swing.JPanel panel_username;
    // End of variables declaration//GEN-END:variables
}
