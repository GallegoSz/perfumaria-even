package service;

import dao.ProdutoDAO;
import model.Produto;
import dao.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoService {
    private ProdutoDAO dao = new ProdutoDAO();
    
    public boolean produtoDisponivel(String nome, String marca, int idIgnorar) {
            return !dao.produtoJaExiste(nome, marca, idIgnorar);
        }
    
    public void cadastrarProduto(Produto produto) throws Exception {       
        if (!produtoDisponivel(produto.getNome(), produto.getMarca(), produto.getId())) {
            throw new Exception("Já existe esse produto");
        }

        dao.cadastrarProduto(produto);
    }
    
    public List<Produto> buscarProdutos(String nome) {
        return dao.buscarProdutos(nome);
    }

    public Produto buscarId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        Produto produto = dao.buscarId(id);

        return produto;
    }

    public void apagarProduto(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        dao.excluirProduto(id);
    }

    public void alterarDadosProduto(Produto produto) throws Exception {
        if (!produtoDisponivel(produto.getNome(), produto.getMarca(), produto.getId())) {
            JOptionPane.showMessageDialog(null, produto.getId());
 
            throw new Exception("Já existe um produto como esse no estoque.");
        }
        
        dao.alterarDadosProduto(produto);
    }
    
    
}

