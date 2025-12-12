package view.principal;


import controller.ClienteController;
import controller.FuncionarioController;
import controller.ProdutoController;
import controller.VendaController;
import java.awt.CardLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


public class PrincipalView extends javax.swing.JFrame {
    
    private ClienteController clienteController = new ClienteController();
    private FuncionarioController funcionarioController = new FuncionarioController();
    private ProdutoController produtoController = new ProdutoController();
    private VendaController vendaController = new VendaController();
    int linha;
    
    public PrincipalView() throws Exception {
        initComponents();
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
            clienteController.buscarMelhoresClientesPorProdutos(jTableMelhoresClientesProdutos.getModel());
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
            funcionarioController.buscarFuncionariosMaisVendem(jTableFuncionariosComMaiorPorcen.getModel());
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
            produtoController.buscarProdutosComEstoqueBaixo(jTableProdutosEstoqueBaixo.getModel());
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados iniciais: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanelOpcoes = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonFuncionarios = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jPanelTela = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelInicioEstoque = new javax.swing.JPanel();
        jLabelProdutosEstoqueB = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProdutosEstoqueBaixo = new javax.swing.JTable();
        jPanelInicioFuncionarios = new javax.swing.JPanel();
        jLabelProdutosEstoqueB1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableFuncionariosComMaiorPorcen = new javax.swing.JTable();
        jPanelInicioClientes = new javax.swing.JPanel();
        jLabelProdutosEstoqueB2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableMelhoresClientesProdutos = new javax.swing.JTable();
        jButtonRefreshInicio = new javax.swing.JButton();
        jPanelFuncionarios = new javax.swing.JPanel();
        jLabelFuncionarios = new javax.swing.JLabel();
        jPanelAddOrRemoveF = new javax.swing.JPanel();
        jButtonAdicionarFuncionarios = new javax.swing.JButton();
        jButtonRemoverFuncionarios = new javax.swing.JButton();
        jButtonRefreshF = new javax.swing.JButton();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jScrollPaneFuncionarios = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jPanelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jPanelAddOrRemoveC = new javax.swing.JPanel();
        jButtonAdicionarClientes = new javax.swing.JButton();
        jButtonRemoverClientes = new javax.swing.JButton();
        jButtonRefreshC = new javax.swing.JButton();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanelEstoque = new javax.swing.JPanel();
        jLabelEstoque = new javax.swing.JLabel();
        jPanelAddOrRemoveP = new javax.swing.JPanel();
        jButtonAdicionarProdutos = new javax.swing.JButton();
        jButtonRemoverProdutos = new javax.swing.JButton();
        jButtonRefreshP = new javax.swing.JButton();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jPanelVendas = new javax.swing.JPanel();
        jLabelVender = new javax.swing.JLabel();
        jPanelAddOrRemoveF1 = new javax.swing.JPanel();
        jButtonAdicionarVenda = new javax.swing.JButton();
        jButtonRefreshV = new javax.swing.JButton();
        jTextFieldNomeDaVenda = new javax.swing.JTextField();
        jScrollPaneVendas = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfumaria Even");

        jPanelOpcoes.setBackground(new java.awt.Color(0, 0, 0));
        jPanelOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        jPanelOpcoes.setLayout(new java.awt.GridLayout(0, 1, 0, 15));

        jButtonInicio.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/home.png"))); // NOI18N
        jButtonInicio.setMnemonic('I');
        jButtonInicio.setText("Início");
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInicio.setIconTextGap(5);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonInicio);

        jButtonVender.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/sell.png"))); // NOI18N
        jButtonVender.setMnemonic('V');
        jButtonVender.setText("Vender");
        jButtonVender.setBorderPainted(false);
        jButtonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVender.setIconTextGap(5);
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonVender);

        jButtonEstoque.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/stock.png"))); // NOI18N
        jButtonEstoque.setMnemonic('E');
        jButtonEstoque.setText("Estoque");
        jButtonEstoque.setBorderPainted(false);
        jButtonEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEstoque.setIconTextGap(5);
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonEstoque);

        jButtonFuncionarios.setBackground(new java.awt.Color(0, 0, 0));
        jButtonFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/employees.png"))); // NOI18N
        jButtonFuncionarios.setMnemonic('F');
        jButtonFuncionarios.setText("Funcionarios");
        jButtonFuncionarios.setBorderPainted(false);
        jButtonFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonFuncionarios.setIconTextGap(5);
        jButtonFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionariosActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonFuncionarios);

        jButtonClientes.setBackground(new java.awt.Color(0, 0, 0));
        jButtonClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/customers.png"))); // NOI18N
        jButtonClientes.setMnemonic('C');
        jButtonClientes.setText("Clientes");
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClientes.setIconTextGap(5);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        jPanelOpcoes.add(jButtonClientes);

        jPanelTela.setLayout(new java.awt.CardLayout());

        jLabelInicio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelInicio.setText("Início");

        jLabelProdutosEstoqueB.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelProdutosEstoqueB.setText("Produtos com estoque baixo:");

        jTableProdutosEstoqueBaixo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Preço", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutosEstoqueBaixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosEstoqueBaixoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableProdutosEstoqueBaixo);
        if (jTableProdutosEstoqueBaixo.getColumnModel().getColumnCount() > 0) {
            jTableProdutosEstoqueBaixo.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutosEstoqueBaixo.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutosEstoqueBaixo.getColumnModel().getColumn(2).setResizable(false);
            jTableProdutosEstoqueBaixo.getColumnModel().getColumn(3).setResizable(false);
            jTableProdutosEstoqueBaixo.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelInicioEstoqueLayout = new javax.swing.GroupLayout(jPanelInicioEstoque);
        jPanelInicioEstoque.setLayout(jPanelInicioEstoqueLayout);
        jPanelInicioEstoqueLayout.setHorizontalGroup(
            jPanelInicioEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioEstoqueLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelInicioEstoqueLayout.createSequentialGroup()
                        .addComponent(jLabelProdutosEstoqueB)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelInicioEstoqueLayout.setVerticalGroup(
            jPanelInicioEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProdutosEstoqueB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Estoque", jPanelInicioEstoque);

        jLabelProdutosEstoqueB1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelProdutosEstoqueB1.setText("Funcionários com a maior porcentagem de vendas realizadas:");

        jTableFuncionariosComMaiorPorcen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Senha", "Email", "Salário", "Admin", "% de Vendas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionariosComMaiorPorcen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosComMaiorPorcenMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableFuncionariosComMaiorPorcen);
        if (jTableFuncionariosComMaiorPorcen.getColumnModel().getColumnCount() > 0) {
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(1).setResizable(false);
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(2).setResizable(false);
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(3).setResizable(false);
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(4).setResizable(false);
            jTableFuncionariosComMaiorPorcen.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanelInicioFuncionariosLayout = new javax.swing.GroupLayout(jPanelInicioFuncionarios);
        jPanelInicioFuncionarios.setLayout(jPanelInicioFuncionariosLayout);
        jPanelInicioFuncionariosLayout.setHorizontalGroup(
            jPanelInicioFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioFuncionariosLayout.createSequentialGroup()
                        .addComponent(jLabelProdutosEstoqueB1)
                        .addGap(0, 356, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanelInicioFuncionariosLayout.setVerticalGroup(
            jPanelInicioFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProdutosEstoqueB1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Funcionários", jPanelInicioFuncionarios);

        jLabelProdutosEstoqueB2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabelProdutosEstoqueB2.setText("Melhores clientes:");

        jTableMelhoresClientesProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Email", "Endereço", "Produtos Comprados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMelhoresClientesProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMelhoresClientesProdutosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableMelhoresClientesProdutos);
        if (jTableMelhoresClientesProdutos.getColumnModel().getColumnCount() > 0) {
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(4).setResizable(false);
            jTableMelhoresClientesProdutos.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanelInicioClientesLayout = new javax.swing.GroupLayout(jPanelInicioClientes);
        jPanelInicioClientes.setLayout(jPanelInicioClientesLayout);
        jPanelInicioClientesLayout.setHorizontalGroup(
            jPanelInicioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioClientesLayout.createSequentialGroup()
                        .addComponent(jLabelProdutosEstoqueB2)
                        .addGap(0, 704, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanelInicioClientesLayout.setVerticalGroup(
            jPanelInicioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProdutosEstoqueB2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Clientes", jPanelInicioClientes);

        jButtonRefreshInicio.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshInicio.setMnemonic('U');
        jButtonRefreshInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRefreshInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane))
                .addContainerGap())
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelInicio))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonRefreshInicio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        jPanelTela.add(jPanelInicio, "inicio");

        jLabelFuncionarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelFuncionarios.setText("Funcionários");

        jButtonAdicionarFuncionarios.setBackground(new java.awt.Color(245, 245, 245));
        jButtonAdicionarFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdicionarFuncionarios.setMnemonic('A');
        jButtonAdicionarFuncionarios.setText("Adicionar");
        jButtonAdicionarFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));
        jButtonAdicionarFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFuncionariosActionPerformed(evt);
            }
        });

        jButtonRemoverFuncionarios.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRemoverFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonRemoverFuncionarios.setMnemonic('R');
        jButtonRemoverFuncionarios.setText("Remover");
        jButtonRemoverFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
        jButtonRemoverFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemoverFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverFuncionariosActionPerformed(evt);
            }
        });

        jButtonRefreshF.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshF.setMnemonic('U');
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
                .addComponent(jButtonAdicionarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoverFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemoveFLayout.setVerticalGroup(
            jPanelAddOrRemoveFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAdicionarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jButtonRefreshF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRemoverFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeFuncionario)
        );

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Senha", "Email", "Salário", "Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPaneFuncionarios.setViewportView(jTableFuncionarios);
        if (jTableFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(2).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(3).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(4).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanelFuncionariosLayout = new javax.swing.GroupLayout(jPanelFuncionarios);
        jPanelFuncionarios.setLayout(jPanelFuncionariosLayout);
        jPanelFuncionariosLayout.setHorizontalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneFuncionarios)
                    .addComponent(jLabelFuncionarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPaneFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelFuncionarios, "funcionarios");

        jLabelClientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelClientes.setText("Clientes");

        jButtonAdicionarClientes.setBackground(new java.awt.Color(245, 245, 245));
        jButtonAdicionarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdicionarClientes.setMnemonic('A');
        jButtonAdicionarClientes.setText("Adicionar");
        jButtonAdicionarClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));
        jButtonAdicionarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarClientesActionPerformed(evt);
            }
        });

        jButtonRemoverClientes.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRemoverClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonRemoverClientes.setMnemonic('R');
        jButtonRemoverClientes.setText("Remover");
        jButtonRemoverClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
        jButtonRemoverClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemoverClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverClientesActionPerformed(evt);
            }
        });

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
                .addComponent(jButtonAdicionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoverClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemoveCLayout.setVerticalGroup(
            jPanelAddOrRemoveCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAdicionarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRefreshC, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jButtonRemoverClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeCliente)
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setResizable(false);
            jTableClientes.getColumnModel().getColumn(1).setResizable(false);
            jTableClientes.getColumnModel().getColumn(2).setResizable(false);
            jTableClientes.getColumnModel().getColumn(3).setResizable(false);
            jTableClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
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

        jPanelTela.add(jPanelClientes, "clientes");

        jLabelEstoque.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelEstoque.setText("Estoque");

        jButtonAdicionarProdutos.setBackground(new java.awt.Color(245, 245, 245));
        jButtonAdicionarProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdicionarProdutos.setMnemonic('A');
        jButtonAdicionarProdutos.setText("Adicionar");
        jButtonAdicionarProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));
        jButtonAdicionarProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProdutosActionPerformed(evt);
            }
        });

        jButtonRemoverProdutos.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRemoverProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonRemoverProdutos.setMnemonic('R');
        jButtonRemoverProdutos.setText("Remover");
        jButtonRemoverProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
        jButtonRemoverProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverProdutosActionPerformed(evt);
            }
        });

        jButtonRefreshP.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshP.setMnemonic('R');
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
                .addComponent(jButtonAdicionarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoverProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemovePLayout.setVerticalGroup(
            jPanelAddOrRemovePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAdicionarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRefreshP, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jButtonRemoverProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeProduto)
        );

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Preço", "Qtd"
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
        jTableEstoque.getTableHeader().setReorderingAllowed(false);
        jTableEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEstoque);
        if (jTableEstoque.getColumnModel().getColumnCount() > 0) {
            jTableEstoque.getColumnModel().getColumn(0).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(1).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(2).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(3).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelEstoqueLayout = new javax.swing.GroupLayout(jPanelEstoque);
        jPanelEstoque.setLayout(jPanelEstoqueLayout);
        jPanelEstoqueLayout.setHorizontalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanelEstoqueLayout.setVerticalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelEstoque)
                .addGap(29, 29, 29)
                .addComponent(jPanelAddOrRemoveP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelEstoque, "estoque");

        jLabelVender.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelVender.setText("Vender");

        jButtonAdicionarVenda.setBackground(new java.awt.Color(245, 245, 245));
        jButtonAdicionarVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdicionarVenda.setMnemonic('A');
        jButtonAdicionarVenda.setText("Adicionar");
        jButtonAdicionarVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));
        jButtonAdicionarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarVendaActionPerformed(evt);
            }
        });

        jButtonRefreshV.setBackground(new java.awt.Color(245, 245, 245));
        jButtonRefreshV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imgs/refresh.png"))); // NOI18N
        jButtonRefreshV.setMnemonic('U');
        jButtonRefreshV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshVActionPerformed(evt);
            }
        });

        jTextFieldNomeDaVenda.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNomeDaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDaVendaActionPerformed(evt);
            }
        });
        jTextFieldNomeDaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeDaVendaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeDaVendaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeDaVendaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOrRemoveF1Layout = new javax.swing.GroupLayout(jPanelAddOrRemoveF1);
        jPanelAddOrRemoveF1.setLayout(jPanelAddOrRemoveF1Layout);
        jPanelAddOrRemoveF1Layout.setHorizontalGroup(
            jPanelAddOrRemoveF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrRemoveF1Layout.createSequentialGroup()
                .addComponent(jButtonAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297)
                .addComponent(jTextFieldNomeDaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefreshV, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddOrRemoveF1Layout.setVerticalGroup(
            jPanelAddOrRemoveF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAdicionarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jButtonRefreshV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldNomeDaVenda)
        );

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Nome do Funcionário", "Nome do Cliente", "Qtd", "Preço unitário", "Preço final", "Data_venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVendas.getTableHeader().setReorderingAllowed(false);
        jTableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasMouseClicked(evt);
            }
        });
        jScrollPaneVendas.setViewportView(jTableVendas);
        if (jTableVendas.getColumnModel().getColumnCount() > 0) {
            jTableVendas.getColumnModel().getColumn(0).setResizable(false);
            jTableVendas.getColumnModel().getColumn(1).setResizable(false);
            jTableVendas.getColumnModel().getColumn(2).setResizable(false);
            jTableVendas.getColumnModel().getColumn(3).setResizable(false);
            jTableVendas.getColumnModel().getColumn(4).setResizable(false);
            jTableVendas.getColumnModel().getColumn(5).setResizable(false);
            jTableVendas.getColumnModel().getColumn(6).setResizable(false);
            jTableVendas.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneVendas)
                    .addComponent(jLabelVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addComponent(jPanelAddOrRemoveF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelVender)
                .addGap(29, 29, 29)
                .addComponent(jPanelAddOrRemoveF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTela.add(jPanelVendas, "vendas");

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

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "inicio");
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "vendas");
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "estoque");
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionariosActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "funcionarios");
    }//GEN-LAST:event_jButtonFuncionariosActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        CardLayout cl = (CardLayout) jPanelTela.getLayout();
        cl.show(jPanelTela, "clientes");
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jTableVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasMouseClicked
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTableVendasMouseClicked

    private void jTextFieldNomeDaVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaVendaKeyTyped
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeDaVendaKeyTyped

    private void jTextFieldNomeDaVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaVendaKeyReleased
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeDaVendaKeyReleased

    private void jTextFieldNomeDaVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaVendaKeyPressed
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeDaVendaKeyPressed

    private void jTextFieldNomeDaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaVendaActionPerformed
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeDaVendaActionPerformed

    private void jButtonRefreshVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshVActionPerformed
        try {
            vendaController.buscarVendas(jTextFieldNomeDaVenda.getText(), jTableVendas.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de vendas: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de vendas: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de vendas: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshVActionPerformed

    private void jButtonAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarVendaActionPerformed

        try {
            vendaController.abrirTelaCadastrarVenda();
        } catch (Exception ex) {
            System.getLogger(PrincipalView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }//GEN-LAST:event_jButtonAdicionarVendaActionPerformed

    private void jTableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableEstoque.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableEstoque.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    produtoController.abrirTelaEditarProduto(id);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableEstoqueMouseClicked

    private void jTextFieldNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyTyped
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyTyped

    private void jTextFieldNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyReleased
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyReleased

    private void jTextFieldNomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyPressed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyPressed

    private void jButtonRefreshPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshPActionPerformed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de produtos: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de produtos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshPActionPerformed

    private void jButtonRemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverProdutosActionPerformed
        int linhaSelecionada = jTableEstoque.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "É necessário escolher um produto para excluir.");
            return;
        }

        Object valordoId = jTableEstoque.getValueAt(linhaSelecionada, 0);
        int id = Integer.parseInt(valordoId.toString());

        try {
            produtoController.abrirTelaExcluirProduto(id);
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao excluir produto: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao excluir produto: " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao excluir produto: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverProdutosActionPerformed

    private void jButtonAdicionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProdutosActionPerformed
        try {
            produtoController.abrirTelaCadastrarProduto();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao abrir tela de cadastro de produto: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao abrir tela de cadastro de produto: " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao abrir tela de cadastro de produto: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarProdutosActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableClientes.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableClientes.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    clienteController.abrirTelaEditarCliente(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTextFieldNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyTyped
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyTyped

    private void jTextFieldNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyReleased
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyReleased

    private void jTextFieldNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyPressed
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyPressed

    private void jButtonRefreshCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshCActionPerformed
        try {
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de clientes: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de clientes: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de clientes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshCActionPerformed

    private void jButtonRemoverClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverClientesActionPerformed
        int linhaSelecionada = jTableClientes.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "É necessário escolher um cliente para excluir.");
            return;
        }

        Object valordoId = jTableClientes.getValueAt(linhaSelecionada, 0);
        int id = Integer.parseInt(valordoId.toString());

        try {
            clienteController.abrirTelaExcluirCliente(id);
            clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao excluir cliente: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao excluir cliente: " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao excluir cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverClientesActionPerformed

    private void jButtonAdicionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarClientesActionPerformed
        try {
            clienteController.abrirTelaCadastrarCliente();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao abrir tela de cadastro de cliente: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao abrir tela de cadastro de cliente: " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao abrir tela de cadastro de cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarClientesActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableFuncionarios.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableFuncionarios.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    funcionarioController.abrirTelaEditarFuncionario(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableFuncionariosMouseClicked

    private void jTextFieldNomeFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyTyped
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyTyped

    private void jTextFieldNomeFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyReleased
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyReleased

    private void jTextFieldNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyPressed
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyPressed

    private void jButtonRefreshFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshFActionPerformed
        try {
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao atualizar lista de funcionários: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao atualizar lista de funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshFActionPerformed

    private void jButtonRemoverFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverFuncionariosActionPerformed
        int linhaSelecionada = jTableFuncionarios.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "É necessário escolher um funcionário para excluir.");
            return;
        }

        Object valordoId = jTableFuncionarios.getValueAt(linhaSelecionada, 0);
        int id = Integer.parseInt(valordoId.toString());

        try {
            funcionarioController.abrirTelaExcluirFuncionario(id);
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao excluir funcionário: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao excluir funcionário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao excluir funcionário: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverFuncionariosActionPerformed

    private void jButtonAdicionarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFuncionariosActionPerformed
        try {
            funcionarioController.abrirTelaCadastrarFuncionario();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Erro de validação ao abrir tela de cadastro de funcionário: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados ao abrir tela de cadastro de funcionário: " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao abrir tela de cadastro de funcionário: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarFuncionariosActionPerformed

    private void jTableFuncionariosComMaiorPorcenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosComMaiorPorcenMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableFuncionariosComMaiorPorcen.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableFuncionariosComMaiorPorcen.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    funcionarioController.abrirTelaEditarFuncionario(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableFuncionariosComMaiorPorcenMouseClicked

    private void jTableProdutosEstoqueBaixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosEstoqueBaixoMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableProdutosEstoqueBaixo.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableProdutosEstoqueBaixo.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    produtoController.abrirTelaEditarProduto(id);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }

            try {
                produtoController.buscarProdutosComEstoqueBaixo(jTableProdutosEstoqueBaixo.getModel());
            } catch (Exception ex) {
                System.getLogger(PrincipalView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }//GEN-LAST:event_jTableProdutosEstoqueBaixoMouseClicked

    private void jTableMelhoresClientesProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMelhoresClientesProdutosMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableMelhoresClientesProdutos.rowAtPoint(evt.getPoint());

            if (linha != -1) {
                Object valordoId = jTableMelhoresClientesProdutos.getValueAt(linha, 0);

                int id = Integer.parseInt(valordoId.toString());
                try {
                    funcionarioController.abrirTelaEditarFuncionario(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableMelhoresClientesProdutosMouseClicked

    private void jButtonRefreshInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshInicioActionPerformed
        try {
            produtoController.buscarProdutosComEstoqueBaixo(jTableProdutosEstoqueBaixo.getModel());
            funcionarioController.buscarFuncionariosMaisVendem(jTableFuncionariosComMaiorPorcen.getModel());
            clienteController.buscarMelhoresClientesPorProdutos(jTableMelhoresClientesProdutos.getModel());
        } catch (Exception ex) {
            System.getLogger(PrincipalView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jButtonRefreshInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarClientes;
    private javax.swing.JButton jButtonAdicionarFuncionarios;
    private javax.swing.JButton jButtonAdicionarProdutos;
    private javax.swing.JButton jButtonAdicionarVenda;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFuncionarios;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRefreshC;
    private javax.swing.JButton jButtonRefreshF;
    private javax.swing.JButton jButtonRefreshInicio;
    private javax.swing.JButton jButtonRefreshP;
    private javax.swing.JButton jButtonRefreshV;
    private javax.swing.JButton jButtonRemoverClientes;
    private javax.swing.JButton jButtonRemoverFuncionarios;
    private javax.swing.JButton jButtonRemoverProdutos;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFuncionarios;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelProdutosEstoqueB;
    private javax.swing.JLabel jLabelProdutosEstoqueB1;
    private javax.swing.JLabel jLabelProdutosEstoqueB2;
    private javax.swing.JLabel jLabelVender;
    private javax.swing.JPanel jPanelAddOrRemoveC;
    private javax.swing.JPanel jPanelAddOrRemoveF;
    private javax.swing.JPanel jPanelAddOrRemoveF1;
    private javax.swing.JPanel jPanelAddOrRemoveP;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelFuncionarios;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelInicioClientes;
    private javax.swing.JPanel jPanelInicioEstoque;
    private javax.swing.JPanel jPanelInicioFuncionarios;
    private javax.swing.JPanel jPanelOpcoes;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneFuncionarios;
    private javax.swing.JScrollPane jScrollPaneVendas;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTable jTableFuncionariosComMaiorPorcen;
    private javax.swing.JTable jTableMelhoresClientesProdutos;
    private javax.swing.JTable jTableProdutosEstoqueBaixo;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeDaVenda;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldNomeProduto;
    // End of variables declaration//GEN-END:variables
}
