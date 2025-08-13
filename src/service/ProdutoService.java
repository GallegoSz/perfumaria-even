package service;

import dao.ProdutoDAO;
import model.Produto;
import dao.ProdutoDAO;
import java.util.List;

public class ProdutoService {
    private ProdutoDAO dao = new ProdutoDAO();
    
    public void cadastrarProduto(Produto produto) throws Exception {       
        if (!produtoDisponivel(produto.getNome(), produto.getMarca())) {
            throw new Exception("Já existe esse produto");
        }

        dao.cadastrarProduto(produto);
    }
    
    public boolean produtoDisponivel(String nome, String marca) {
            return !dao.produtoJaExiste(nome, marca);
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
    
    
}

