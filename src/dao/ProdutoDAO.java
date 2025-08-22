package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;


public class ProdutoDAO {

    public static boolean atualizarEstoque(Produto produto, int qtdRequerida) throws SQLException {
        String atualizarEstoque = "UPDATE produtos SET qtd = qtd - ? WHERE id = ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(atualizarEstoque)){
            ps.setInt(1, qtdRequerida);
            ps.setInt(2, produto.getId());
            
            ps.execute();
            ps.close();
        }
        return true;
    }
    
    
    public void cadastrarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO produtos (NOME, MARCA, PRECO, QTD) VALUES (?, ?, ?, ?)";
        
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {    
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getMarca());
            ps.setDouble(3, produto.getPreco());
            ps.setInt(4, produto.getQtd());
            
            
            ps.execute();
            ps.close();
        }
        
    }
    
    public boolean produtoJaExiste(String nome, String marca, int idIgnorar) throws SQLException {
        String sql = "SELECT 1 FROM produtos WHERE NOME = ? AND MARCA = ? AND id <> ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setInt(3, idIgnorar);
            return ps.executeQuery().next();
        }
    }
    
    public List<Produto> listarProdutos() throws SQLException {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        ResultSet rs = null;

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);){
            
            rs = ps.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setMarca(rs.getString("marca"));
                p.setPreco(rs.getDouble("preco"));
                p.setQtd(rs.getInt("qtd"));

                lista.add(p);
            }

            rs.close();
            ps.close();
        }

        return lista;
        }
    
    public List<Produto> buscarProdutos(String nomeBusca) throws SQLException {
        List<Produto> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM produtos WHERE nome LIKE ? ORDER BY nome";
        ResultSet rs = null;
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, "%" + nomeBusca + "%");
            rs = ps.executeQuery();
           
            while (rs.next()) {                
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setMarca(rs.getString("marca"));
                p.setPreco(rs.getDouble("preco"));
                p.setQtd(rs.getInt("qtd"));
                
                lista.add(p);
            }
            
        }
        return lista;
    }

    public Produto buscarId(int id) throws SQLException {
        String sql = "SELECT * FROM produtos WHERE id = ?";
        ResultSet rs = null;
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setMarca(rs.getString("marca"));
                p.setPreco(rs.getDouble("preco"));
                p.setQtd(rs.getInt("qtd"));
                
                
                return p;
            }
            
        }
        return null;
    }

    public void excluirProduto(int id) throws Exception {
        String sql = "DELETE FROM produtos WHERE id = ?";       
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
        }
    }

    public void alterarDadosProduto(Produto produto) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, marca = ?, preco = ?, qtd = ? WHERE id = ?";
          
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getMarca());
            ps.setDouble(3, produto.getPreco());
            ps.setInt(4, produto.getQtd());
            ps.setInt(5, produto.getId());
            
            ps.execute();
            ps.close();
        }
    }
}

