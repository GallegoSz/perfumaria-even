package controller;
import java.util.List;
import model.Cliente;
import service.ClienteService;
import view.cliente.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClienteController {
    private ClienteService clienteService;
    private Cliente cliente;
    
    public ClienteController() {
        this.clienteService = new ClienteService();
        this.cliente = new Cliente();
        
    }

    public boolean alterarDadosCliente(String nome, String email, String endereco, String cpf, int id) {
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setCpf(cpf);
        cliente.setId(id);
        
        try {
            clienteService.alterarDadosCliente(cliente);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados " + e.getMessage());
            return false;
        }
    }

    public void abrirTelaEditarCliente(int id) {
        try {
            cliente = clienteService.buscarId(id);
            cliente.setId(id);
            new view.cliente.AlterarDadosCView(cliente).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Cliente: " + e.getMessage());
        }
    }

    public void abrirTelaExcluirCliente(int id) {
        try {
            cliente = clienteService.buscarId(id);
            cliente.setId(id);
            
            boolean resultado = ExcluirClientesView.confirmarExclusao(cliente);
            
            if (resultado == true) {
                clienteService.apagarCliente(id);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao  Excluir Cliente: " + e.getMessage());
        }
    }

    public void buscarClientes(String nome, TableModel model) {
        try {           
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
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao caregar clientes");
        }
    }

    public void abrirTelaCadastrarCliente() {
        new view.cliente.AdicionarClientesView().setVisible(true);
    }

    public boolean cadastrarCliente(String nome, String cpf, String email, String endereco) {
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        
        try {
            clienteService.cadastrar(cliente);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Cliente: " + e.getMessage());
            return false;
        }
    }
}
