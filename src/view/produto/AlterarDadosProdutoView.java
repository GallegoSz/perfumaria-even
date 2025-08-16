package view.produto;

import dao.*;
import javax.swing.JOptionPane;
import controller.ProdutoController;
import service.ProdutoService;
import model.Produto;
import dao.ProdutoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joped
 */
public class AlterarDadosProdutoView extends javax.swing.JFrame {
    int id;

    public AlterarDadosProdutoView(Produto produto) {
        initComponents();
        jTextFieldNome.setText(produto.getNome());
        jTextFieldMarca.setText(produto.getMarca());
        jTextFieldQtd.setText(String.valueOf(produto.getQtd()));
        jFormattedTextFieldPreco.setText(String.valueOf(produto.getPreco()));
        id = produto.getId();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAlterarP = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldQtd = new javax.swing.JTextField();
        jButtonRealizarAlteracao = new javax.swing.JButton();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Clientes");
        setResizable(false);

        jLabelAlterarP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelAlterarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarP.setText("Alterar");

        jTextFieldNome.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldMarca.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextFieldQtd.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldQtd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qtd", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jButtonRealizarAlteracao.setBackground(new java.awt.Color(102, 255, 102));
        jButtonRealizarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRealizarAlteracao.setText("Realizar Cadastro");
        jButtonRealizarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarAlteracaoActionPerformed(evt);
            }
        });

        jFormattedTextFieldPreco.setBackground(new java.awt.Color(242, 242, 242));
        jFormattedTextFieldPreco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jFormattedTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAlterarP, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonRealizarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextFieldPreco))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlterarP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRealizarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarAlteracaoActionPerformed
        ProdutoController controller = new ProdutoController();
        try {
            if (controller.alterarDadosProduto(jTextFieldNome.getText(), jTextFieldMarca.getText(), jFormattedTextFieldPreco.getText(),jTextFieldQtd.getText(), id)== true) {
                dispose(); 
                
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do produto: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRealizarAlteracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarAlteracao;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JLabel jLabelAlterarP;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQtd;
    // End of variables declaration//GEN-END:variables
}
