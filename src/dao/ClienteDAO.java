package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class ClienteDAO {
    public void cadastrarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (NOME, CPF, EMAIL, ENDERECO) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getEndereco());
            
            ps.execute();
            ps.close();
        }
    }
    
    public boolean cpfJaExiste(String cpf, int idIgnorar) throws SQLException{
        String sql = "SELECT 1 FROM clientes WHERE CPF = ? AND id <> ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, cpf);
            ps.setInt(2, idIgnorar);
            return ps.executeQuery().next();
        }
    }
    
    public boolean emailJaExiste(String email, int idIgnorar) throws SQLException{
        String sql = "SELECT 1 FROM clientes WHERE email = ? AND id <> ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, email);
            ps.setInt(2, idIgnorar);
            return ps.executeQuery().next();
        }
    }

    
    public List<Cliente> buscarClientes(String nomeBusca) throws SQLException{
        List<Cliente> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM clientes WHERE nome LIKE ? ORDER BY nome";
        ResultSet rs = null;
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){           
            ps.setString(1, "%" + nomeBusca + "%");
            rs = ps.executeQuery();
           
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));
                
                lista.add(c);
            }
            
        }
        return lista;
    }

    public Cliente buscarId(int id) throws SQLException{
        String sql = "SELECT * FROM clientes WHERE id = ?";
        ResultSet rs = null;
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));
                
                return c;
            }
            
        } 
        return null;
    }

    public void alterarDadosCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE clientes SET nome = ?, cpf = ?, email = ?, endereco = ? WHERE id = ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getEndereco());
            ps.setInt(5, cliente.getId());
            
            ps.execute();
            ps.close();
        }
    }

    public void excluirCliente(int id) throws SQLException{
        String sql = "DELETE FROM clientes WHERE id = ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
        }
    }
}
