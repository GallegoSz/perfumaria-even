package view.funcionario;

import controller.FuncionarioController;
import javax.swing.JOptionPane;
import model.Funcionario;

public class AlterarDadosFView extends javax.swing.JFrame {
    int id;
    Funcionario funcionario;
    
    public AlterarDadosFView(Funcionario funcionario) {
        initComponents();
        jTextFieldNome.setText(funcionario.getNome());
        jTextFieldEmail.setText(funcionario.getEmail());
        jTextFieldSalario.setText(String.valueOf(funcionario.getSalario()));
        jCheckBoxAdmin.setSelected(funcionario.isAdmin());
        jTextFieldSenha.setText(funcionario.getSenha());
        
        id = funcionario.getId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAlterar = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldConfirmarSenha = new javax.swing.JTextField();
        jCheckBoxAdmin = new javax.swing.JCheckBox();
        jButtonRealizarAlteracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar dados do Funcionário");
        setResizable(false);

        jLabelAlterar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterar.setText("Alterar");

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

        jButtonRealizarAlteracao.setBackground(new java.awt.Color(102, 255, 102));
        jButtonRealizarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRealizarAlteracao.setText("Realizar Alteração");
        jButtonRealizarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonRealizarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabelAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButtonRealizarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarAlteracaoActionPerformed
        FuncionarioController controller = new FuncionarioController();
        try {
            if (controller.alterarDadosFuncionario(jTextFieldNome.getText(), jTextFieldSenha.getText(), jTextFieldConfirmarSenha.getText(), jTextFieldEmail.getText(), jTextFieldSalario.getText(), jCheckBoxAdmin.isSelected(), id )== true) {
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do Funcionário: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRealizarAlteracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarAlteracao;
    private javax.swing.JCheckBox jCheckBoxAdmin;
    private javax.swing.JLabel jLabelAlterar;
    private javax.swing.JTextField jTextFieldConfirmarSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
