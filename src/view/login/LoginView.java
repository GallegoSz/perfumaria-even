/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login;

import controller.LoginController;
import javax.swing.JOptionPane;


public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImgPerfumariaEven = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonRealizarLogin = new javax.swing.JButton();
        jLabelIconUSer = new javax.swing.JLabel();
        jLabelIconPassword = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfumaria Even - Login");
        setResizable(false);

        jLabelImgPerfumariaEven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/PerfumariaEven_Login.png"))); // NOI18N

        jTextFieldUsuario.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jButtonRealizarLogin.setBackground(new java.awt.Color(0, 51, 255));
        jButtonRealizarLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRealizarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealizarLogin.setText("LOGAR");
        jButtonRealizarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarLoginActionPerformed(evt);
            }
        });

        jLabelIconUSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/userIcon.png"))); // NOI18N
        jLabelIconUSer.setText("jLabel2");

        jLabelIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/password.png"))); // NOI18N
        jLabelIconPassword.setText("jLabel2");

        jTextFieldSenha.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImgPerfumariaEven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButtonRealizarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIconUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImgPerfumariaEven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconUSer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelIconPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRealizarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarLoginActionPerformed
        String usuario = jTextFieldUsuario.getText().trim();
        String senha = jTextFieldSenha.getText().trim();
        
        LoginController loginController = new LoginController();
        
        try {
            boolean resultado = loginController.realizarLogin(usuario, senha);
            if (resultado == true) {
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
 
    }//GEN-LAST:event_jButtonRealizarLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarLogin;
    private javax.swing.JLabel jLabelIconPassword;
    private javax.swing.JLabel jLabelIconUSer;
    private javax.swing.JLabel jLabelImgPerfumariaEven;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
