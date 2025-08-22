package view.venda;

import controller.ClienteController;
import controller.FuncionarioController;
import controller.ProdutoController;
import controller.VendaController;
import java.awt.CardLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;

public class VendaView extends javax.swing.JFrame {
    
    private ClienteController clienteController = new ClienteController();
    private FuncionarioController funcionarioController = new FuncionarioController();
    private ProdutoController produtoController = new ProdutoController();
    private VendaController vendaController = new VendaController();
    private Produto produto = new Produto();
    int linha;
    
    public VendaView() throws Exception {
        initComponents();
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableProdutosVender.getModel());
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionariosVender.getModel());
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientesVender.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados iniciais: " + ex.getMessage());
        }
    }
    
    public void atualizarResumo(VendaController controller) {
        jTextFieldNomeProdutoCF.setText(controller.getProduto().getNome());
        jTextFieldDspEmEstoque.setText(String.valueOf(controller.getProduto().getQtd()));
        jTextFieldNomeFuncionarioCF.setText(controller.getFuncionario().getNome());
        jTextFieldNomeClienteCF.setText(controller.getCliente().getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOpcoes = new javax.swing.JPanel();
        jButtonProduto = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonConfiguracao = new javax.swing.JButton();
        jPanelTela = new javax.swing.JPanel();
        jPanelProdutos = new javax.swing.JPanel();
        jLabelProdutos = new javax.swing.JLabel();
        jPanelAddOrRemoveP = new javax.swing.JPanel();
        jButtonRefreshP = new javax.swing.JButton();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jScrollPaneProdutos = new javax.swing.JScrollPane();
        jTableProdutosVender = new javax.swing.JTable();
        jPanelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jPanelAddOrRemoveC = new javax.swing.JPanel();
        jButtonRefreshC = new javax.swing.JButton();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientesVender = new javax.swing.JTable();
        jPanelFuncionarios = new javax.swing.JPanel();
        jLabelFuncionarios = new javax.swing.JLabel();
        jPanelAddOrRemoveF = new javax.swing.JPanel();
        jButtonRefreshF = new javax.swing.JButton();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFuncionariosVender = new javax.swing.JTable();
        jPanelConfiguracoes = new javax.swing.JPanel();
        jLabelConfiguracao = new javax.swing.JLabel();
        jLabelNomeProduto = new javax.swing.JLabel();
        jTextFieldNomeProdutoCF = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelDspEmEstoque = new javax.swing.JLabel();
        jTextFieldDspEmEstoque = new javax.swing.JTextField();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionarioCF = new javax.swing.JTextField();
        jLabelNomeClienteCF = new javax.swing.JLabel();
        jTextFieldNomeClienteCF = new javax.swing.JTextField();
        jButtonDesistirVenda = new javax.swing.JButton();
        jButtonEfetuarVenda = new javax.swing.JButton();
        jButtonVoltarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realize a Venda");

        jPanelOpcoes.setBackground(new java.awt.Color(0, 51, 153));
        jPanelOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        jPanelOpcoes.setLayout(new java.awt.GridLayout(0, 1, 0, 15));

        jButtonProduto.setBackground(new java.awt.Color(0, 51, 153));
        jButtonProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/stock.png"))); // NOI18N
        jButtonProduto.setMnemonic('I');
        jButtonProduto.setText("Produto");
        jButtonProduto.setBorderPainted(false);
        jButtonProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProduto.setIconTextGap(5);
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonProduto);

        jButtonFuncionario.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/employees.png"))); // NOI18N
        jButtonFuncionario.setMnemonic('V');
        jButtonFuncionario.setText("Funcionário");
        jButtonFuncionario.setBorderPainted(false);
        jButtonFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonFuncionario.setIconTextGap(5);
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonFuncionario);

        jButtonCliente.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/customers.png"))); // NOI18N
        jButtonCliente.setMnemonic('E');
        jButtonCliente.setText("Cliente");
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCliente.setIconTextGap(5);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonCliente);

        jButtonConfiguracao.setBackground(new java.awt.Color(0, 51, 153));
        jButtonConfiguracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonConfiguracao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/settings.png"))); // NOI18N
        jButtonConfiguracao.setMnemonic('C');
        jButtonConfiguracao.setText("Configuração");
        jButtonConfiguracao.setBorderPainted(false);
        jButtonConfiguracao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConfiguracao.setIconTextGap(5);
        jButtonConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracaoActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonConfiguracao);

        jPanelTela.setLayout(new java.awt.CardLayout());

        jLabelProdutos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelProdutos.setText("Produtos");

        jButtonRefreshP.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshP.setMnemonic('U');
        jButtonRefreshP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshPActionPerformed(evt);
            }
        });

        jTextFieldNomeProduto.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOrRemovePLayout = new javax.swing.GroupLayout(jPanelAddOrRemoveP);
        jPanelAddOrRemoveP.setLayout(jPanelAddOrRemovePLayout);
        jPanelAddOrRemovePLayout.setHorizontalGroup(
            jPanelAddOrRemovePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrRemovePLayout.createSequentialGroup()
                .addComponent(jTextFieldNomeProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemovePLayout.setVerticalGroup(
            jPanelAddOrRemovePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonRefreshP, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeProduto)
        );

        jTableProdutosVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Preço", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutosVender.getTableHeader().setReorderingAllowed(false);
        jTableProdutosVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosVenderMouseClicked(evt);
            }
        });
        jScrollPaneProdutos.setViewportView(jTableProdutosVender);
        if (jTableProdutosVender.getColumnModel().getColumnCount() > 0) {
            jTableProdutosVender.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutosVender.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutosVender.getColumnModel().getColumn(2).setResizable(false);
            jTableProdutosVender.getColumnModel().getColumn(3).setResizable(false);
            jTableProdutosVender.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneProdutos)
                    .addComponent(jLabelProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelProdutos)
                .addGap(29, 29, 29)
                .addComponent(jPanelAddOrRemoveP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelProdutos, "produtosvenda");

        jLabelClientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelClientes.setText("Clientes");

        jButtonRefreshC.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshC.setMnemonic('R');
        jButtonRefreshC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshCActionPerformed(evt);
            }
        });

        jTextFieldNomeCliente.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOrRemoveCLayout = new javax.swing.GroupLayout(jPanelAddOrRemoveC);
        jPanelAddOrRemoveC.setLayout(jPanelAddOrRemoveCLayout);
        jPanelAddOrRemoveCLayout.setHorizontalGroup(
            jPanelAddOrRemoveCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrRemoveCLayout.createSequentialGroup()
                .addComponent(jTextFieldNomeCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemoveCLayout.setVerticalGroup(
            jPanelAddOrRemoveCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonRefreshC, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeCliente)
        );

        jTableClientesVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cpf", "Email", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientesVender.getTableHeader().setReorderingAllowed(false);
        jTableClientesVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesVenderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientesVender);
        if (jTableClientesVender.getColumnModel().getColumnCount() > 0) {
            jTableClientesVender.getColumnModel().getColumn(0).setResizable(false);
            jTableClientesVender.getColumnModel().getColumn(1).setResizable(false);
            jTableClientesVender.getColumnModel().getColumn(2).setResizable(false);
            jTableClientesVender.getColumnModel().getColumn(3).setResizable(false);
            jTableClientesVender.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelClientes)
                .addGap(29, 29, 29)
                .addComponent(jPanelAddOrRemoveC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelClientes, "clientesvenda");

        jLabelFuncionarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelFuncionarios.setText("Funcionários");

        jButtonRefreshF.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshF.setMnemonic('R');
        jButtonRefreshF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshFActionPerformed(evt);
            }
        });

        jTextFieldNomeFuncionario.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeFuncionarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeFuncionarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeFuncionarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOrRemoveFLayout = new javax.swing.GroupLayout(jPanelAddOrRemoveF);
        jPanelAddOrRemoveF.setLayout(jPanelAddOrRemoveFLayout);
        jPanelAddOrRemoveFLayout.setHorizontalGroup(
            jPanelAddOrRemoveFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrRemoveFLayout.createSequentialGroup()
                .addComponent(jTextFieldNomeFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemoveFLayout.setVerticalGroup(
            jPanelAddOrRemoveFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonRefreshF, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeFuncionario)
        );

        jTableFuncionariosVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Senha", "Email", "Salario", "Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionariosVender.getTableHeader().setReorderingAllowed(false);
        jTableFuncionariosVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosVenderMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableFuncionariosVender);
        if (jTableFuncionariosVender.getColumnModel().getColumnCount() > 0) {
            jTableFuncionariosVender.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionariosVender.getColumnModel().getColumn(1).setResizable(false);
            jTableFuncionariosVender.getColumnModel().getColumn(2).setResizable(false);
            jTableFuncionariosVender.getColumnModel().getColumn(3).setResizable(false);
            jTableFuncionariosVender.getColumnModel().getColumn(4).setResizable(false);
            jTableFuncionariosVender.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanelFuncionariosLayout = new javax.swing.GroupLayout(jPanelFuncionarios);
        jPanelFuncionarios.setLayout(jPanelFuncionariosLayout);
        jPanelFuncionariosLayout.setHorizontalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanelFuncionariosLayout.setVerticalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelFuncionarios)
                .addGap(29, 29, 29)
                .addComponent(jPanelAddOrRemoveF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelFuncionarios, "funcionariosvenda");

        jLabelConfiguracao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelConfiguracao.setText("Configuração final");

        jLabelNomeProduto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelNomeProduto.setText("Nome do Produto:");

        jTextFieldNomeProdutoCF.setEditable(false);
        jTextFieldNomeProdutoCF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jTextFieldQuantidade.setColumns(3);

        jLabelQuantidade.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelQuantidade.setText("Qtd.:");

        jLabelDspEmEstoque.setText("Disponvel em estoque:");

        jTextFieldDspEmEstoque.setEditable(false);
        jTextFieldDspEmEstoque.setColumns(3);

        jLabelNomeFuncionario.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelNomeFuncionario.setText("Nome do Funcionário:");

        jTextFieldNomeFuncionarioCF.setEditable(false);
        jTextFieldNomeFuncionarioCF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabelNomeClienteCF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelNomeClienteCF.setText("Nome do Cliente:");

        jTextFieldNomeClienteCF.setEditable(false);
        jTextFieldNomeClienteCF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jButtonDesistirVenda.setBackground(new java.awt.Color(245, 245, 245));
        jButtonDesistirVenda.setText("Desistir da Venda");
        jButtonDesistirVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        jButtonDesistirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesistirVendaActionPerformed(evt);
            }
        });

        jButtonEfetuarVenda.setBackground(new java.awt.Color(245, 245, 245));
        jButtonEfetuarVenda.setText("Efetuar a Venda");
        jButtonEfetuarVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 51), null));
        jButtonEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEfetuarVendaActionPerformed(evt);
            }
        });

        jButtonVoltarInicio.setBackground(new java.awt.Color(245, 245, 245));
        jButtonVoltarInicio.setText("Voltar a Venda do início");
        jButtonVoltarInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), null));
        jButtonVoltarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfiguracoesLayout = new javax.swing.GroupLayout(jPanelConfiguracoes);
        jPanelConfiguracoes.setLayout(jPanelConfiguracoesLayout);
        jPanelConfiguracoesLayout.setHorizontalGroup(
            jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                                .addComponent(jLabelNomeFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelDspEmEstoque)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDspEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldNomeFuncionarioCF)))
                            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                                .addComponent(jLabelNomeProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeProdutoCF))
                            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                                .addComponent(jLabelNomeClienteCF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeClienteCF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addComponent(jButtonDesistirVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGap(0, 151, Short.MAX_VALUE)
                        .addComponent(jButtonVoltarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConfiguracoesLayout.setVerticalGroup(
            jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelConfiguracao)
                .addGap(100, 100, 100)
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNomeProduto)
                        .addComponent(jTextFieldNomeProdutoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDspEmEstoque)
                            .addComponent(jTextFieldDspEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidade))))
                .addGap(33, 33, 33)
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFuncionario)
                    .addComponent(jTextFieldNomeFuncionarioCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeClienteCF)
                    .addComponent(jTextFieldNomeClienteCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonDesistirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEfetuarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVoltarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanelTela.add(jPanelConfiguracoes, "configuracoesvenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "produtosvenda");
    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "funcionariosvenda");
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "clientesvenda");
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonRefreshPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshPActionPerformed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableProdutosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshPActionPerformed

    private void jButtonRefreshCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshCActionPerformed
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientesVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshCActionPerformed

    private void jTableProdutosVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosVenderMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableProdutosVender.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableProdutosVender.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    vendaController.setProdutoPorId(id);
                    produto = vendaController.getProduto();
       
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                CardLayout cl = (CardLayout) jPanelTela.getLayout();
                cl.show(jPanelTela, "funcionariosvenda");
                atualizarResumo(vendaController);
            }
            
            
            
        } 
    }//GEN-LAST:event_jTableProdutosVenderMouseClicked

    private void jTextFieldNomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyPressed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableProdutosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyPressed

    private void jTextFieldNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyReleased
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableProdutosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyReleased

    private void jTextFieldNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyTyped
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableProdutosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyTyped

    private void jTextFieldNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyPressed
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientesVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyPressed

    private void jTextFieldNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyReleased
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientesVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyReleased

    private void jTextFieldNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyTyped
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientesVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyTyped

    private void jTableClientesVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesVenderMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableClientesVender.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableClientesVender.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    vendaController.setClientePorId(id);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                CardLayout cl = (CardLayout) jPanelTela.getLayout();
                cl.show(jPanelTela, "configuracoesvenda");
                atualizarResumo(vendaController);
            }
        }
    }//GEN-LAST:event_jTableClientesVenderMouseClicked

    private void jButtonRefreshFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshFActionPerformed
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionariosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshFActionPerformed

    private void jTextFieldNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyPressed
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionariosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyPressed

    private void jTextFieldNomeFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyReleased
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionariosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyReleased

    private void jTextFieldNomeFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyTyped
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionariosVender.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyTyped

    private void jTableFuncionariosVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosVenderMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableFuncionariosVender.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableFuncionariosVender.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    vendaController.setFuncionarioPorId(id);
                    
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                CardLayout cl = (CardLayout) jPanelTela.getLayout();
                cl.show(jPanelTela, "clientesvenda");
                atualizarResumo(vendaController);
            } 
        } 
    }//GEN-LAST:event_jTableFuncionariosVenderMouseClicked

    private void jButtonConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracaoActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "configuracoesvenda"); 
        atualizarResumo(vendaController);
    }//GEN-LAST:event_jButtonConfiguracaoActionPerformed

    private void jButtonDesistirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesistirVendaActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonDesistirVendaActionPerformed

    private void jButtonVoltarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInicioActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "produtosvenda");
    }//GEN-LAST:event_jButtonVoltarInicioActionPerformed

    private void jButtonEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEfetuarVendaActionPerformed
        String strQtdRequerida = jTextFieldQuantidade.getText();
        
        try {
            if (vendaController.efetuarVenda(strQtdRequerida)) {
                dispose();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Erro de validação: " + e.getMessage());
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonEfetuarVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonConfiguracao;
    private javax.swing.JButton jButtonDesistirVenda;
    private javax.swing.JButton jButtonEfetuarVenda;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JButton jButtonRefreshC;
    private javax.swing.JButton jButtonRefreshF;
    private javax.swing.JButton jButtonRefreshP;
    private javax.swing.JButton jButtonVoltarInicio;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelConfiguracao;
    private javax.swing.JLabel jLabelDspEmEstoque;
    private javax.swing.JLabel jLabelFuncionarios;
    private javax.swing.JLabel jLabelNomeClienteCF;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelProdutos;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JPanel jPanelAddOrRemoveC;
    private javax.swing.JPanel jPanelAddOrRemoveF;
    private javax.swing.JPanel jPanelAddOrRemoveP;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelConfiguracoes;
    private javax.swing.JPanel jPanelFuncionarios;
    private javax.swing.JPanel jPanelOpcoes;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneProdutos;
    private javax.swing.JTable jTableClientesVender;
    private javax.swing.JTable jTableFuncionariosVender;
    private javax.swing.JTable jTableProdutosVender;
    private javax.swing.JTextField jTextFieldDspEmEstoque;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeClienteCF;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionarioCF;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldNomeProdutoCF;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables

}