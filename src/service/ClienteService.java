package service;

import model.Cliente;
import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.List;

public class ClienteService {
    private ClienteDAO dao = new ClienteDAO();
    
    public boolean cpfDisponivel(String cpf, int idIgnorar) throws SQLException{
        return !dao.cpfJaExiste(cpf, idIgnorar);
    }

    public boolean emailDisponivel(String email, int idIgnorar) throws SQLException{
        return !dao.emailJaExiste(email, idIgnorar);
    }

    public void cadastrar(Cliente cliente) throws SQLException {
        if (!cpfDisponivel(cliente.getCpf(), cliente.getId())) {
            throw new SQLException("Este CPF já está em uso.");
        }
        
        if (!emailDisponivel(cliente.getEmail(), cliente.getId())) {
            throw new SQLException("Este e-mail já está em uso.");
        }

        try {
            dao.cadastrarCliente(cliente);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar o cliente no banco: " + e.getMessage(), e);
        }
        
    }

    public Cliente buscarId(int id) throws SQLException{
        if (id <= 0) {
            throw new IllegalArgumentException("Valor Incorreto para Id");
        }
        
        Cliente cliente = new Cliente();
        
        try {
            cliente = dao.buscarId(id);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar pelo cliente no banco: " + ex.getMessage(), ex);
        }

        return cliente;
        
    }

    public void alterarDadosCliente(Cliente cliente) throws SQLException, IllegalArgumentException { 
        if (!cpfDisponivel(cliente.getCpf(), cliente.getId())) {    
            throw new IllegalArgumentException("Este CPF já está em uso.");
        }
        if (!emailDisponivel(cliente.getEmail(), cliente.getId())) {
            throw new IllegalArgumentException("Este e-mail já está em uso.");
        }

        try {
            dao.alterarDadosCliente(cliente);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar cliente no banco: " + e.getMessage(), e);
        }
    }

    public void apagarCliente(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Valor incorreto para ID");
        }

        try {
            dao.excluirCliente(id);
        } catch (SQLException e) {
            throw new SQLException("Erro ao apagar cliente com ID " + id, e);
        }
    }

    public List<Cliente> buscarClientes(String nome) throws SQLException {      
        try {
            return dao.buscarClientes(nome);
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clientes: " + e.getMessage(), e);
        }
        
    }
    
    public List<Cliente> buscarMelhoresClientesPorProdutos() throws SQLException {
        try {
            return dao.buscarTopClientesPorProdutos();
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar top clientes por produtos: " + e.getMessage(), e);
        }
    }
}
