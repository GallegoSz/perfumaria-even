package service;

import dao.ProdutoDAO;
import dao.VendaDAO;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class VendaService {

    private final VendaDAO vendaDao = new VendaDAO();

    public void efetuarVenda(Produto produto, Cliente cliente, Funcionario funcionario,
                             int qtdRequerida, double precoFinal)
            throws IllegalArgumentException, SQLException {

        if (qtdRequerida > produto.getQtd()) {
            throw new IllegalArgumentException("A quantidade requerida é maior que o estoque disponível.");
        }

        Venda venda = new Venda(produto, funcionario, cliente, qtdRequerida);
        venda.setPrecoFinal(precoFinal);
        venda.setDataVenda(LocalDateTime.now());

        try {
            Venda vendaSalva = vendaDao.efetuarVenda(venda);

            GeradorDeXMLService.gerarNFCe(vendaSalva);

            ProdutoDAO.atualizarEstoque(produto, qtdRequerida);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a venda no banco: " + e.getMessage(), e);
        }
    }

    public List<Venda> buscarVendas(String nome) throws SQLException {
        try {
            return vendaDao.buscarVendas(nome);
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar vendas: " + e.getMessage(), e);
        }
    }
}


