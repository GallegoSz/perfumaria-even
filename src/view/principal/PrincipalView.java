/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.principal;

import view.funcionario.AdicionarFuncionariosView;
import view.cliente.AdicionarClientesView;
import controller.ClienteController;
import controller.FuncionarioController;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import java.awt.CardLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.*;
import view.produto.AdicionarProdutoView;
import controller.ProdutoController;

/**
 *
 * @author joped
 */
public class PrincipalView extends javax.swing.JFrame {
    
    private ClienteController clienteController = new ClienteController();
    private FuncionarioController funcionarioController = new FuncionarioController();
    private ProdutoController produtoController = new ProdutoController();
    int linha;
    
    public PrincipalView() throws Exception {
        initComponents();
        clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
        funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOpcoes = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonFuncionarios = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jPanelTela = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jPanelVender = new javax.swing.JPanel();
        jLabelVender = new javax.swing.JLabel();
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
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelInicio)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        jPanelTela.add(jPanelInicio, "inicio");

        jLabelVender.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelVender.setText("Vender");

        javax.swing.GroupLayout jPanelVenderLayout = new javax.swing.GroupLayout(jPanelVender);
        jPanelVender.setLayout(jPanelVenderLayout);
        jPanelVenderLayout.setHorizontalGroup(
            jPanelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVender, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVenderLayout.setVerticalGroup(
            jPanelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelVender)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        jPanelTela.add(jPanelVender, "vender");

        jLabelFuncionarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelFuncionarios.setText("Funcionários");

        jButtonAdicionarFuncionarios.setBackground(new java.awt.Color(245, 245, 245));
        jButtonAdicionarFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdicionarFuncionarios.setMnemonic('A');
        jButtonAdicionarFuncionarios.setText("Adicionar");
        jButtonAdicionarFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));
        jButtonAdicionarFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonRemoverFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonAdicionarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonRemoverClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonAdicionarProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonRemoverProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        cl.show(jPanelTela, "vender");
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

    private void jButtonAdicionarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFuncionariosActionPerformed
        try {
            funcionarioController.abrirTelaCadastrarFuncionario();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Adicionar Funcionário: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonAdicionarFuncionariosActionPerformed

    private void jButtonAdicionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarClientesActionPerformed
        try {
            clienteController.abrirTelaCadastrarCliente();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Adicionar Cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarClientesActionPerformed

    private void jButtonRemoverFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverFuncionariosActionPerformed
        int linhaSelecionada = jTableFuncionarios.getSelectedRow();
    
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "É necessário escolher um funcionário para excluir.");
            return;
        }

        Object valordoId = jTableFuncionarios.getValueAt(linhaSelecionada, 0);
        int id = Integer.parseInt(valordoId.toString());

        try {
            funcionarioController.abrirTelaExcluirCliente(id);
            funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir a tela Excluir Funcionários: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverFuncionariosActionPerformed

    private void jButtonRefreshFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshFActionPerformed
        funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
    }//GEN-LAST:event_jButtonRefreshFActionPerformed

    private void jButtonRefreshCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshCActionPerformed
        clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
    }//GEN-LAST:event_jButtonRefreshCActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableFuncionarios.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableFuncionarios.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    funcionarioController.abrirTelaEditarFuncionario(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Funcionário: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableFuncionariosMouseClicked

    private void jTextFieldNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyPressed
        funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyPressed

    private void jTextFieldNomeFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyReleased
        funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyReleased

    private void jTextFieldNomeFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioKeyTyped
        funcionarioController.buscarFuncionario(jTextFieldNomeFuncionario.getText(), jTableFuncionarios.getModel());
    }//GEN-LAST:event_jTextFieldNomeFuncionarioKeyTyped

    private void jTextFieldNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyPressed
        clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
    }//GEN-LAST:event_jTextFieldNomeClienteKeyPressed

    private void jTextFieldNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyReleased
        clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
    }//GEN-LAST:event_jTextFieldNomeClienteKeyReleased

    private void jTextFieldNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyTyped
        clienteController.buscarClientes(jTextFieldNomeCliente.getText(), jTableClientes.getModel());
    }//GEN-LAST:event_jTextFieldNomeClienteKeyTyped

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableClientes.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableClientes.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    clienteController.abrirTelaEditarCliente(id);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Cliente: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir a tela Excluir Cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverClientesActionPerformed

    private void jButtonAdicionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProdutosActionPerformed
        try {
            produtoController.abrirTelaCadastrarProduto();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Adicionar Cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarProdutosActionPerformed

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir a tela Excluir Produto: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRemoverProdutosActionPerformed

    private void jButtonRefreshPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshPActionPerformed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela Funcionários: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonRefreshPActionPerformed

    private void jTextFieldNomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyPressed
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar produto" + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyPressed

    private void jTextFieldNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyReleased
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar produto" + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyReleased

    private void jTextFieldNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyTyped
        try {
            produtoController.buscarProdutos(jTextFieldNomeProduto.getText(), jTableEstoque.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar produto" + ex.getMessage());
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyTyped

    private void jTableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMouseClicked
        if (evt.getClickCount() == 2) {
            linha = jTableEstoque.rowAtPoint(evt.getPoint());
            
            if (linha != -1) {
                Object valordoId = jTableEstoque.getValueAt(linha, 0);
                
                int id = Integer.parseInt(valordoId.toString());
                try {
                    produtoController.abrirTelaEditarProduto(id);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Produto: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTableEstoqueMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarClientes;
    private javax.swing.JButton jButtonAdicionarFuncionarios;
    private javax.swing.JButton jButtonAdicionarProdutos;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFuncionarios;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRefreshC;
    private javax.swing.JButton jButtonRefreshF;
    private javax.swing.JButton jButtonRefreshP;
    private javax.swing.JButton jButtonRemoverClientes;
    private javax.swing.JButton jButtonRemoverFuncionarios;
    private javax.swing.JButton jButtonRemoverProdutos;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFuncionarios;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelVender;
    private javax.swing.JPanel jPanelAddOrRemoveC;
    private javax.swing.JPanel jPanelAddOrRemoveF;
    private javax.swing.JPanel jPanelAddOrRemoveP;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelFuncionarios;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelOpcoes;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JPanel jPanelVender;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneFuncionarios;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldNomeProduto;
    // End of variables declaration//GEN-END:variables
}
