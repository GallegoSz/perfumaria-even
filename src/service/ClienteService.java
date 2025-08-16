package service;

import model.Cliente;
import dao.ClienteDAO;
import java.util.List;

public class ClienteService {
    private ClienteDAO dao = new ClienteDAO();
    
    public boolean cpfDisponivel(String cpf, int idIgnorar) {
        return !dao.cpfJaExiste(cpf, idIgnorar);
    }

    public boolean emailDisponivel(String email, int idIgnorar) {
        return !dao.emailJaExiste(email, idIgnorar);
    }

    public void cadastrar(Cliente cliente) throws Exception {
        if (!cpfDisponivel(cliente.getCpf(), cliente.getId())) {
            throw new Exception("Este CPF já está em uso.");
        }
        
        if (!emailDisponivel(cliente.getEmail(), cliente.getId())) {
            throw new Exception("Este e-mail já está em uso.");
        }

        dao.cadastrarCliente(cliente);
    }

    public Cliente buscarId(int id) throws Exception{
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        Cliente cliente = dao.buscarId(id);

        return cliente;
        
    }

    public void alterarDadosCliente(Cliente cliente) throws Exception{ 
        if (!cpfDisponivel(cliente.getCpf(), cliente.getId())) {
            
            throw new Exception("Este CPF já está em uso.");
        }
        if (!emailDisponivel(cliente.getEmail(), cliente.getId())) {
            throw new Exception("Este e-mail já está em uso.");
        }

        dao.alterarDadosCliente(cliente);
    }

    public void apagarCliente(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        dao.excluirCliente(id);
    }

    public List<Cliente> buscarClientes(String nome) {      
        return dao.buscarClientes(nome);
    }
}
