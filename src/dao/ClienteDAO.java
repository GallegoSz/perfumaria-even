package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class ClienteDAO {
    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTES (NOME, CPF, EMAIL, ENDERECO) VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getEndereco());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean cpfJaExiste(String cpf, int idIgnorar) {
        String sql = "SELECT 1 FROM CLIENTES WHERE CPF = ? AND id <> ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, cpf);
            ps.setInt(2, idIgnorar);
            return ps.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean emailJaExiste(String email, int idIgnorar) {
        String sql = "SELECT 1 FROM CLIENTES WHERE email = ? AND id <> ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, email);
            ps.setInt(2, idIgnorar);
            return ps.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public List<Cliente> buscarClientes(String nomeBusca) {
        List<Cliente> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM clientes WHERE nome LIKE ? ORDER BY nome";
        ResultSet rs = null;
        
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Cliente buscarId(int id) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        ResultSet rs = null;
        
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void alterarDadosCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nome = ?, cpf = ?, email = ?, endereco = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getEndereco());
            ps.setInt(5, cliente.getId());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
