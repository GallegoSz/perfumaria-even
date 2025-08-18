package service;

import dao.FuncionarioDAO;
import java.sql.SQLException;
import java.util.List;
import model.Funcionario;

public class FuncionarioService {
    private FuncionarioDAO dao = new FuncionarioDAO();
    
    public boolean emailDisponivel(String email, int idIgnorar) throws SQLException {
        return !dao.emailJaExiste(email, idIgnorar);
    }
    
    public void cadastrar(Funcionario funcionario) throws Exception{
       if (!emailDisponivel(funcionario.getEmail(), funcionario.getId())) {
            throw new Exception("Este e-mail já está em uso.");
        }
        
        try {
            dao.cadastrarFuncionario(funcionario);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar os dados do funcionário: " + e.getMessage());
        }
        
    }

    public void alterarDadosFuncionario(Funcionario funcionario) throws SQLException, IllegalArgumentException {
        if (!emailDisponivel(funcionario.getEmail(), funcionario.getId())) {
            throw new IllegalArgumentException("Este e-mail já está em uso.");
        }
        
        try {
            dao.alterarDadosFuncionario(funcionario);
        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar os dados do funcionário: " + e.getMessage());
        }
        
    }

    public Funcionario buscarId(int id) throws SQLException, IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Valor Incorreto para Id");
        }
        Funcionario funcionario = new Funcionario();
        
        try {
           funcionario = dao.buscarId(id); 
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pelo funcionário no banco: " + e.getMessage());
        }
        

        return funcionario;
    }

    public List<Funcionario> buscarFuncionarios(String nome) throws SQLException {
        try {
            return dao.buscarFuncionarios(nome);
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar funcionários: " + e.getMessage(), e);
        }
        
    }

    public void apagarFuncionario(int id) throws IllegalArgumentException, SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Valor Incorreto para Id");
        }
        
        try {
            dao.excluirFuncionario(id);
        } catch (SQLException e) {
            throw new SQLException("Erro ao apagar funcionário com ID " + id, e);
        }
        
    }
}
