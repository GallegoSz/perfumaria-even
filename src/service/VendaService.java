package service;

import dao.ProdutoDAO;
import dao.VendaDAO;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author gallego
 */
public class VendaService {
    private VendaDAO vendaDao = new VendaDAO();
    private Venda venda = new Venda();

    public void efetuarVenda(Produto produto, Cliente cliente, Funcionario funcionario, int qtdRequerida, double precoFinal) throws IllegalArgumentException, SQLException{
        if (qtdRequerida > produto.getQtd()) {
            throw new IllegalArgumentException("A quantidade requerida foi maior que a disponível em estoque.");
        }
        
        
        
        boolean sucesso;
        
        try {
            sucesso = vendaDao.efetuarVenda(produto, cliente, funcionario, qtdRequerida, precoFinal);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a venda no banco: " + e.getMessage(), e);
        }
        
        
        if (sucesso) {
            ProdutoDAO.atualizarEstoque(produto, qtdRequerida);
            
        }
    }

    public List<Venda> buscarVendas(String nome) throws SQLException {
         try {
            return vendaDao.buscarVendas(nome);
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos: " + e.getMessage(), e);
        }
    }

    
    
}
