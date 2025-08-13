package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;
import java.sql.ResultSet;

public class LoginDAO {
    public boolean logar (Funcionario funcionario) {
        String sql = "SELECT * FROM funcionarios WHERE email = ? AND senha = ?";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, funcionario.getEmail());
            ps.setString(2, funcionario.getSenha());
             
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return false;
    }
}
