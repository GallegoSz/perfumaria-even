package view.funcionario;

import controller.FuncionarioController;
import javax.swing.JOptionPane;

public class AdicionarFuncionariosView extends javax.swing.JFrame {
    FuncionarioController funcionarioController;
    
    public AdicionarFuncionariosView() {
        initComponents();
        this.funcionarioController = new FuncionarioController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastrarF = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldConfirmarSenha = new javax.swing.JTextField();
        jCheckBoxAdmin = new javax.swing.JCheckBox();
        jButtonRealizarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Funcionários");
        setResizable(false);

        jLabelCadastrarF.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCadastrarF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrarF.setText("Cadastrar");

        jTextFieldNome.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldEmail.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldSalario.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldSalario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldSenha.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldConfirmarSenha.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jCheckBoxAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxAdmin.setText("Admin");
        jCheckBoxAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBoxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAdminActionPerformed(evt);
            }
        });

        jButtonRealizarCadastro.setBackground(new java.awt.Color(102, 255, 102));
        jButtonRealizarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRealizarCadastro.setMnemonic('R');
        jButtonRealizarCadastro.setText("Realizar Cadastro");
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelCadastrarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonRealizarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jTextFieldSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jTextFieldConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jCheckBoxAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAdmin)
                .addGap(18, 18, 18)
                .addComponent(jButtonRealizarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroActionPerformed
        String nome = jTextFieldNome.getText().trim();
        String email = jTextFieldEmail.getText().trim();
        String salarioString = jTextFieldSalario.getText().trim();
        String senha = jTextFieldSenha.getText().trim();
        String confirmarSenha = jTextFieldConfirmarSenha.getText().trim();
        boolean admin = jCheckBoxAdmin.isSelected();
        
        try {
            if (funcionarioController.cadastrarFuncionario(nome, email, salarioString, senha, admin, confirmarSenha) == true) {
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastar funcionário: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonRealizarCadastroActionPerformed

    private void jCheckBoxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAdminActionPerformed

    
     /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JCheckBox jCheckBoxAdmin;
    private javax.swing.JLabel jLabelCadastrarF;
    private javax.swing.JTextField jTextFieldConfirmarSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
