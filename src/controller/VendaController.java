package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import service.ProdutoService;
import view.venda.*;
import model.*;
import service.ClienteService;
import service.FuncionarioService;
import service.VendaService;

public class VendaController {
    ProdutoService produtoService = new ProdutoService();
    ClienteService clienteService = new ClienteService();
    FuncionarioService funcionarioService = new FuncionarioService();
    VendaService vendaService = new VendaService();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    Funcionario funcionario = new Funcionario();
    
    double precoUnitario;

    public void abrirTelaCadastrarVenda() throws Exception {
        new view.venda.VendaView().setVisible(true);
    }

    public void setProdutoPorId(int id) throws SQLException, IllegalArgumentException {
        try {
            produto = produtoService.buscarId(id);
            produto.setId(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro ao buscar o Produto: " + e.getMessage());
        }
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setClientePorId(int id) throws SQLException, IllegalArgumentException {
        try {
            cliente = clienteService.buscarId(id);
            cliente.setId(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro ao buscar o cliente: " + e.getMessage());
        }
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setFuncionarioPorId(int id) throws SQLException, IllegalArgumentException {
        try {
            funcionario = funcionarioService.buscarId(id);
            funcionario.setId(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro ao buscar o funcionario: " + e.getMessage());
        }
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public boolean efetuarVenda(String strQtdRequerida) throws IllegalArgumentException, SQLException {
        if (strQtdRequerida == null || strQtdRequerida.isBlank()) {
            throw new IllegalArgumentException("O campo quantidade requerida está vazio");
        }
        
        int qtdRequerida;
        
        
        
        try {
            qtdRequerida = Integer.parseInt(strQtdRequerida);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato de quantidade requerida inválido");
        }
        
       
        if (qtdRequerida == 0) {
            throw new IllegalArgumentException("O valor da quantidade requerida tem que ser maior que zero");
        }
        
        
        double precoFinal = produto.getPreco() * qtdRequerida;
        
        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new IllegalArgumentException("Produto não informado");
        }
        
        if (cliente.getNome() == null || produto.getNome().isBlank()) {
            throw new IllegalArgumentException("Cliente não informado");
        }
        
        if (funcionario.getNome() == null || produto.getNome().isBlank()) {
            throw new IllegalArgumentException("Funcionário não informado");
        }
        
        vendaService.efetuarVenda(produto, cliente, funcionario, qtdRequerida, precoFinal);
        
        return true;
    }

    public void buscarVendas(String nome, TableModel model) throws SQLException {     
        List<Venda> lista = vendaService.buscarVendas(nome);
            
        DefaultTableModel modelo = (DefaultTableModel) model;
        modelo.setRowCount(0);
            
            
        for (Venda v : lista) {
            modelo.addRow(new Object[]{ 
                v.getId(), 
                v.getProduto(),
                v.getFuncionario(),
                v.getCliente(),
                v.getQtd(),
                v.getPrecoUnitario(),
                v.getPrecoFinal(),
                v.getDataVenda()
                });
            }
    }
}
