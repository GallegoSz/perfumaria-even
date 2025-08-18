package controller;
import java.util.List;
import model.Cliente;
import service.ClienteService;
import view.cliente.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;

public class ClienteController {
    private ClienteService clienteService;
    private Cliente cliente;
    
    public ClienteController() {
        this.clienteService = new ClienteService();
        this.cliente = new Cliente();
        
    }

    public boolean alterarDadosCliente(String nome, String email, String endereco, String cpf, int id) throws SQLException, IllegalArgumentException {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório");
        }
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O CPF é obrigatório");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O e-mail é obrigatório");
        }  
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("O endereço é obrigatório");
        }

        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setCpf(cpf);
        cliente.setId(id);

        clienteService.alterarDadosCliente(cliente);
        return true;
    }

    public void abrirTelaEditarCliente(int id) throws Exception {
        try {
            cliente = clienteService.buscarId(id);
            cliente.setId(id);
            new view.cliente.AlterarDadosCView(cliente).setVisible(true);
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela Editar Cliente");
        }
    }

    public void abrirTelaExcluirCliente(int id) throws Exception {
        try {
            cliente = clienteService.buscarId(id);
            cliente.setId(id);
            
            boolean resultado = ExcluirClientesView.confirmarExclusao(cliente);
            
            if (resultado == true) {
                clienteService.apagarCliente(id);
            }
            
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela excluir cliente");
        }
    }

    public void buscarClientes(String nome, TableModel model) throws SQLException {     
        List<Cliente> lista = clienteService.buscarClientes(nome);
            
        DefaultTableModel modelo = (DefaultTableModel) model;
        modelo.setRowCount(0);
            
            
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{ 
                c.getId(), 
                c.getNome(),
                c.getCpf(),
                c.getEmail(), 
                c.getEndereco()
                });
            }
    }

    public void abrirTelaCadastrarCliente() throws Exception {
        try {
            new view.cliente.AdicionarClientesView().setVisible(true);
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela cadastrar cliente");
        }
        
    }

    public boolean cadastrarCliente(String nome, String cpf, String email, String endereco) throws Exception {
        if (nome == null || nome.isBlank()  ) {
            throw new IllegalArgumentException("O nome é obrigatório");
        }
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O CPF é obrigatório");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O e-mail é obrigatório");
        }  
        if (endereco == null || endereco.isBlank() ) {
            throw new IllegalArgumentException("O endereço é obrigatório");
        }
        
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
    
        clienteService.cadastrar(cliente);
        return true;
        }
    }

