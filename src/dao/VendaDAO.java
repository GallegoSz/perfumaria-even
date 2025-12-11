package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Connection;
import java.time.LocalDateTime;



public class VendaDAO {

    public Venda efetuarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO vendas (produto_id, funcionario_id, cliente_id, quantidade, preco_unitario, preco_final, data_venda) VALUES (?,?,?,?,?,?,?)";

        Connection conn = Conexao.getConexao();
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, venda.getProduto().getId());
            ps.setInt(2, venda.getFuncionario().getId());
            ps.setInt(3, venda.getCliente().getId());
            ps.setInt(4, venda.getQtd());
            ps.setDouble(5, venda.getPrecoUnitario());
            ps.setDouble(6, venda.getPrecoFinal());

            // garante que a data seja gravada (se não preencher, usa NOW() no DB)
            LocalDateTime dt = venda.getDataVenda();
            if (dt == null) {
                dt = LocalDateTime.now();
            }
            ps.setTimestamp(7, Timestamp.valueOf(dt));

            int affected = ps.executeUpdate();

            if (affected == 0) {
                throw new SQLException("A inserção da venda falhou, nenhuma linha afetada.");
            }

            // obtém a chave gerada (id)
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    venda.setId(idGerado);
                } else {
                    throw new SQLException("A inserção da venda falhou, ID gerado não retornado.");
                }
            }
        }

        return venda;
    }


    public List<Venda> buscarVendas(String nomeBusca) throws SQLException {
        List<Venda> lista = new ArrayList<>();

        String sql = "SELECT " +
                     "v.id AS venda_id, v.quantidade, v.preco_unitario, v.preco_final, v.data_venda, " +
                     "p.id AS produto_id, p.nome AS produto_nome, p.preco AS produto_preco, " +
                     "c.id AS cliente_id, c.nome AS cliente_nome, c.endereco AS cliente_endereco, " +
                     "f.id AS funcionario_id, f.nome AS funcionario_nome " +
                     "FROM vendas v " +
                     "JOIN produtos p ON v.produto_id = p.id " +
                     "JOIN clientes c ON v.cliente_id = c.id " +
                     "JOIN funcionarios f ON v.funcionario_id = f.id " +
                     "WHERE v.data_venda LIKE ? " +
                     "ORDER BY v.data_venda";

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {           
            ps.setString(1, "%" + nomeBusca + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {                
                Venda v = new Venda();

                v.setId(rs.getInt("venda_id"));
                v.setQtd(rs.getInt("quantidade"));
                v.setPrecoUnitario(rs.getDouble("preco_unitario"));
                v.setPrecoFinal(rs.getDouble("preco_final"));

                Timestamp ts = rs.getTimestamp("data_venda");
                if (ts != null) {
                    v.setDataVenda(ts.toLocalDateTime());
                }

                Produto p = new Produto();
                p.setId(rs.getInt("produto_id"));
                p.setNome(rs.getString("produto_nome"));
                p.setPreco(rs.getDouble("produto_preco"));

                Cliente c = new Cliente();
                c.setId(rs.getInt("cliente_id"));
                c.setNome(rs.getString("cliente_nome"));
                c.setEndereco(rs.getString("cliente_endereco"));

                Funcionario f = new Funcionario();
                f.setId(rs.getInt("funcionario_id"));
                f.setNome(rs.getString("funcionario_nome"));

                v.setProduto(p);
                v.setCliente(c);
                v.setFuncionario(f);

                lista.add(v);
            }
        }

        return lista;
    }
}

