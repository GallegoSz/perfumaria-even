package controller;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import model.Produto;
import service.ProdutoService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.produto.ExcluirProdutosView;

public class ProdutoController {
    private ProdutoService produtoService;
    private Produto produto;
    
    public ProdutoController() {
        this.produtoService = new ProdutoService();
        this.produto = new Produto();
    }
    
    public boolean cadastrarProduto(String nome, String marca, String precoString, String qtdString) throws Exception {
        double preco;
        int qtd;
        
        if (nome == null || nome.isEmpty()) {
            throw new Exception("O campo nome está vazio.");
        }
        
        if (marca == null || marca.isEmpty()) {
            throw new Exception("O campo marca está vazio.");
        }
        
        if (precoString == null || precoString.isEmpty()) {
            throw new Exception("O campo preço está vazio.");
        }
        
        if (qtdString == null || qtdString.isEmpty()) {
            throw new Exception("O campo quantidade está vazio.");
        }
        
        try {
            NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
            preco = nf.parse(precoString).doubleValue();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato do salário inválido. Use vírgula para separar os centavos.");
            return false;
        }

        
        try {
            qtd = Integer.parseInt(qtdString);
        } catch (NumberFormatException e) {
            throw new Exception("Valor inválido para quantidade.");
        }
        
        if (preco == 0) {
            throw new Exception("O valor do preço tem que ser maio que zero.");
        }
        
        if (qtd == 0) {
            throw new Exception("O valor do quantidade tem que ser maio que zero.");
        }
        
        produto.setNome(nome);
        produto.setMarca(marca);   
        produto.setPreco(preco);
        produto.setQtd(qtd);
        
        try {
            produtoService.cadastrarProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage());
            return false;
        }
    }

    public void abrirTelaCadastrarProduto() {
        new view.produto.AdicionarProdutoView().setVisible(true);
    }

    public void buscarProdutos(String nome, TableModel model) throws Exception {
        try {           
            List<Produto> lista = produtoService.buscarProdutos(nome);
            
            DefaultTableModel modelo = (DefaultTableModel) model;
            modelo.setRowCount(0);
            
            
            for (Produto p : lista) {
                modelo.addRow(new Object[]{ 
                    p.getId(),
                    p.getNome(),
                    p.getMarca(),
                    p.getPreco(),
                    p.getQtd()
                    });
            }
            
        } catch(Exception e) {
            throw new Exception("Erro ao carregar o Estoque.");
        }
    }

    public void abrirTelaExcluirProduto(int id) {
        try {
            produto = produtoService.buscarId(id);
            produto.setId(id);
            
            boolean resultado = ExcluirProdutosView.confirmarExclusao(produto);
            
            if (resultado == true) {
                produtoService.apagarProduto(id);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao  Excluir Cliente: " + e.getMessage());
        }
    }

    
    
}
