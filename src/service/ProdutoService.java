package service;

import model.Produto;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.List;


public class ProdutoService {
    private ProdutoDAO dao = new ProdutoDAO();
    
    public boolean produtoDisponivel(String nome, String marca, int idIgnorar) throws SQLException {
            return !dao.produtoJaExiste(nome, marca, idIgnorar);
        }
    
    public void cadastrarProduto(Produto produto) throws Exception {       
        if (!produtoDisponivel(produto.getNome(), produto.getMarca(), produto.getId())) {
            throw new Exception("Já existe esse produto");
        }
        
        try {
            dao.cadastrarProduto(produto);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar o produto no banco: " + e.getMessage(), e);
        }

        
    }
    
    public List<Produto> buscarProdutos(String nome) throws SQLException {
        try {
            return dao.buscarProdutos(nome);
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar produtos: " + e.getMessage(), e);
        }
        
    }

    public Produto buscarId(int id) throws SQLException, IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Valor Incorreto para Id");
        }
        
        Produto produto = new Produto();
        try {
            produto = dao.buscarId(id);
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pelo produto no banco: " + e.getMessage(), e);
        }
        

        return produto;
    }

    public void apagarProduto(int id) throws IllegalArgumentException, SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Valor Incorreto para Id");
        }
        try {
            dao.excluirProduto(id); 
        } catch (Exception e) {
            throw new SQLException("Erro ao apagar produto com ID");
        }
        
        
    }

    public void alterarDadosProduto(Produto produto) throws IllegalArgumentException, SQLException {
        if (!produtoDisponivel(produto.getNome(), produto.getMarca(), produto.getId())) {
            throw new IllegalArgumentException("Já existe um produto como esse no estoque.");
        }
        
        try {
            dao.alterarDadosProduto(produto);
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar os dados do produto no banco: " + e.getMessage(), e);
        }
        
    }
    
    
}

