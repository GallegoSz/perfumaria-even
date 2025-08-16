package controller;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Funcionario;
import service.FuncionarioService;
import view.funcionario.*;

public class FuncionarioController {
    Funcionario funcionario = new Funcionario();
    FuncionarioService funcionarioService = new FuncionarioService();
    
    public void abrirTelaCadastrarFuncionario() {
        new view.funcionario.AdicionarFuncionariosView().setVisible(true);
    }
    
    public void abrirTelaEditarFuncionario(int id) {
        try {
            funcionario = funcionarioService.buscarId(id);
            funcionario.setId(id);
            new view.funcionario.AlterarDadosFView(funcionario).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela Editar Funcionários: " + e.getMessage());
        }
    }

    public boolean cadastrarFuncionario(String nome, String email, String salarioString, String senha, boolean admin, String confirmarSenha) throws Exception {
        if (salarioString == null || salarioString.isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo salário está vazio");
            return false;
        }
        
        if (senha == null || senha.isBlank()) {
            throw new Exception("A senha é obrigatória");
        }
        
        if (!senha.equals(confirmarSenha) ) {
            JOptionPane.showMessageDialog(null, "Repita a senha corretamente");
            return false;
        }
        
        if (nome == null || nome.isBlank()) {
            throw new Exception("O nome é obrigatório");
        }
        if (email == null || email.isBlank()) {
            throw new Exception("O email é obrigatório");
        }
        

        double salario;
        
        try {
            salario = Double.parseDouble(salarioString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato do salário inválido");
            return false;
        }
        
       
        if (salario == 0) {
            throw new Exception("O valor do salário tem que ser maio que zero");
        }
        
        
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setSalario(salario);
        funcionario.setSenha(senha);
        funcionario.setAdmin(admin);
        
        
        
        try {
            funcionarioService.cadastrar(funcionario);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário");
            return false;
        }        
    }

    public boolean alterarDadosFuncionario(String nome, String senha, String confirmarSenha, String email, String salarioString, boolean admin, int id) throws Exception {
        if (salarioString == null || salarioString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo salário está vazio");
            return false;
        }
        
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "ID do funcionário inválido");
            return false;
        }
        
        if (senha.isEmpty() || senha.isBlank()) {
            throw new Exception("A senha é obrigatória");
        }
        
        if (!senha.equals(confirmarSenha) ) {
            JOptionPane.showMessageDialog(null, "Repita a senha corretamente");
            return false;
        }
        
        if (nome == null || nome.isBlank()) {
            throw new Exception("O nome é obrigatório");
        }
        
        if (email == null || email.isBlank()) {
            throw new Exception("O email é obrigatório");
        }
        
        
        
        double salario;
        
        try {
            salario = Double.parseDouble(salarioString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato do salário inválido");
            return false;
        }
        
        if (salario == 0) {
            throw new Exception("O valor do salário tem que ser maio que zero");
        }
        
        
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setSalario(salario);
        funcionario.setSenha(senha);
        funcionario.setAdmin(admin);
        funcionario.setId(id);
        
        try {
            funcionarioService.alterarDadosFuncionario(funcionario);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao modificar funcionário" + e.getMessage());
            return false;
        }      
    }
    
    public void buscarFuncionario(String nome, TableModel model) {
        try {           
            List<Funcionario> lista = funcionarioService.buscarFuncionarios(nome);
            
            DefaultTableModel modelo = (DefaultTableModel) model;
            modelo.setRowCount(0);
            
            String adminText;
            
            for (Funcionario f : lista) {
                if (f.isAdmin() == true) {
                    adminText = "Administrador";
                } else {
                    adminText = "Usuário comum";
                }
                modelo.addRow(new Object[]{ 
                    f.getId(), 
                    f.getNome(),
                    f.getSenha(),
                    f.getEmail(),
                    f.getSalario(),
                    adminText 
                    });
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao caregar funcionários");
        }
    }

    public void abrirTelaExcluirCliente(int id) {
        try {
            funcionario = funcionarioService.buscarId(id);
            funcionario.setId(id);
            
            boolean resultado = ExcluirFuncionariosView.confirmarExclusao(funcionario);
            
            if (resultado == true) {
                funcionarioService.apagarFuncionario(id);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao  Excluir Funcionário: " + e.getMessage());
        }
    }
}
