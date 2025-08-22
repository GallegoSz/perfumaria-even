package dao;

import model.Cliente;
import model.Funcionario;
import model.Produto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.Venda;
import java.sql.ResultSet;
import java.sql.Timestamp;



public class VendaDAO {
    private Venda venda = new Venda();

    public boolean efetuarVenda(Produto produto, Cliente cliente, Funcionario funcionario, int qtdRequerida, double precoFinal) throws SQLException{
        String sql = "INSERT INTO vendas (produto_id, funcionario_id, cliente_id, quantidade, preco_unitario, preco_final) VALUES (?,?,?,?,?,?)";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setInt(1, produto.getId());
            ps.setInt(2, funcionario.getId());
            ps.setInt(3, cliente.getId());
            ps.setInt(4, qtdRequerida);
            ps.setDouble(5, produto.getPreco());
            ps.setDouble(6, precoFinal);
            
            
            ps.execute();
            ps.close();
            
        }
        return true;
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

