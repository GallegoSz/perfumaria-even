package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class FuncionarioDAO {
    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionarios (NOME, SENHA, EMAIL, SALARIO, ADMIN) VALUES (?, ?, ?, ?, ?)";
        
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getSenha());
            ps.setString(3, funcionario.getEmail());
            ps.setDouble(4, funcionario.getSalario());
            ps.setBoolean(5, funcionario.isAdmin());
            
            
            ps.execute();
            ps.close();
        }
    }
    
    public boolean emailJaExiste(String email, int idIgnorar) throws SQLException {
        String sql = "SELECT 1 FROM funcionarios WHERE EMAIL = ? AND id <> ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, email);
            ps.setInt(2, idIgnorar);
            return ps.executeQuery().next();
        }
    }
    
    public void excluirFuncionario(int id) throws SQLException {
        String sql = "DELETE FROM funcionarios WHERE id = ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setInt(1, id);           
            ps.execute();
            ps.close();
        }
    }
    
    
    
    public List<Funcionario> buscarFuncionarios(String nomeBusca) throws SQLException {
        List<Funcionario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM funcionarios WHERE nome LIKE ? ORDER BY nome";
        ResultSet rs = null;
        
        try ( PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setString(1, "%" + nomeBusca + "%");
            rs = ps.executeQuery();
           
            while (rs.next()) {                
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                f.setEmail(rs.getString("email"));
                f.setSalario(rs.getDouble("salario"));
                f.setAdmin(rs.getBoolean("admin"));
                
                lista.add(f);
            }
            
        }
        return lista;
    }

    public void alterarDadosFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionarios SET nome = ?, senha = ?, email = ?, salario = ?, admin = ? WHERE id = ?";
          
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            
            ps.setString(1,funcionario.getNome());
            ps.setString(2, funcionario.getSenha());
            ps.setString(3, funcionario.getEmail());
            ps.setDouble(4, funcionario.getSalario());
            ps.setBoolean(5, funcionario.isAdmin());
            ps.setInt(6, funcionario.getId());
            
            ps.execute();
            ps.close();
        }
    }

    public Funcionario buscarId(int id) throws SQLException {
        String sql = "SELECT * FROM funcionarios WHERE id = ?";
        ResultSet rs = null;
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)){
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                f.setEmail(rs.getString("email"));
                f.setSalario(rs.getDouble("salario"));
                f.setAdmin(rs.getBoolean("admin"));
                
                return f;
            }
            
        }
        return null;
    }
}
