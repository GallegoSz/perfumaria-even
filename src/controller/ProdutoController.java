package controller;

import java.sql.SQLException;
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
            NumberFormat nf = NumberFormat.getInstance(Locale.of("pt", "BR"));
            preco = nf.parse(precoString).doubleValue();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, 
                "Formato do salário inválido. Use vírgula para separar os centavos.");
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
        
        produtoService.cadastrarProduto(produto);
        return true;
        
    }

    public void abrirTelaCadastrarProduto() throws Exception {
        try {
            new view.produto.AdicionarProdutoView().setVisible(true);
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela cadastrar produto");
        }
        
    }

    public void buscarProdutos(String nome, TableModel model) throws Exception {        
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

    public void abrirTelaEditarProduto(int id) {
        try {
            produto = produtoService.buscarId(id);
            produto.setId(id);
            new view.produto.AlterarDadosProdutoView(produto).setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Produto: " + e.getMessage());
        }
        
    }


    public boolean alterarDadosProduto(String nome, String marca, String precoString, String qtdString, int id) throws IllegalArgumentException, SQLException {
        double preco;
        int qtd;
        
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O campo nome está vazio.");
        }
        
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("O campo marca está vazio.");
        }
        
        if (precoString == null || precoString.isBlank()) {
            throw new IllegalArgumentException("O campo preço está vazio.");
        }
        
        if (qtdString == null || qtdString.isBlank()) {
            throw new IllegalArgumentException("O campo quantidade está vazio.");
        }
        
        try {
            NumberFormat nf = NumberFormat.getInstance(Locale.of("pt", "BR"));
            preco = nf.parse(precoString).doubleValue();
        } catch (ParseException e) {
           throw new IllegalArgumentException("Formato do salário inválido. Use vírgula para separar os centavos.");
        }

        
        try {
            qtd = Integer.parseInt(qtdString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor inválido para quantidade.");
        }
        
        if (preco == 0) {
            throw new IllegalArgumentException("O valor do preço tem que ser maio que zero.");
        }
        
        if (qtd == 0) {
            throw new IllegalArgumentException("O valor do quantidade tem que ser maio que zero.");
        }
        
        produto.setNome(nome);
        produto.setMarca(marca);   
        produto.setPreco(preco);
        produto.setQtd(qtd);
        produto.setId(id);
        
        
        produtoService.alterarDadosProduto(produto);
        produto.setId(id);
        return true;
       
    }
    
}
