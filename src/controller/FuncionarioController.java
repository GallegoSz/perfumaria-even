package controller;

import java.sql.SQLException;
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
    
    public void abrirTelaCadastrarFuncionario() throws Exception {
        try {
            new view.funcionario.AdicionarFuncionariosView().setVisible(true);
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela cadastrar Funcionário");
        }
        
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
            throw new IllegalArgumentException("Formato do salário inválido");
        }
        
       
        if (salario == 0) {
            throw new Exception("O valor do salário tem que ser maio que zero");
        }
        
        
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setSalario(salario);
        funcionario.setSenha(senha);
        funcionario.setAdmin(admin);
        
        funcionarioService.cadastrar(funcionario);
        return true;
    }

    public boolean alterarDadosFuncionario(String nome, String senha, String confirmarSenha, String email, String salarioString, boolean admin, int id) throws Exception {
        if (salarioString == null || salarioString.isBlank()) {
            throw new IllegalArgumentException("O campo salário está vazio");
        }
        
        if (id <= 0) {
           throw new IllegalArgumentException("ID do funcionário inválido");
        }
        
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("A senha é obrigatória");
        }
        
        if (!senha.equals(confirmarSenha) ) {
            throw new IllegalArgumentException("Repita a senha corretamente");
        }
        
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório");
        }
        
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O email é obrigatório");
        }
        
        
        
        double salario;
        
        try {
            salario = Double.parseDouble(salarioString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato do salário inválido");
        }
        
        if (salario == 0) {
            throw new IllegalArgumentException("O valor do salário tem que ser maio que zero");
        }
        
        
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setSalario(salario);
        funcionario.setSenha(senha);
        funcionario.setAdmin(admin);
        funcionario.setId(id);
        

        funcionarioService.alterarDadosFuncionario(funcionario);
        return true;
    }
    
    public void buscarFuncionario(String nome, TableModel model) throws SQLException {         
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
            
    }
    

    public void abrirTelaExcluirFuncionario(int id) throws Exception {
        try {
            funcionario = funcionarioService.buscarId(id);
            funcionario.setId(id);
            
            boolean resultado = ExcluirFuncionariosView.confirmarExclusao(funcionario);
            
            if (resultado == true) {
                funcionarioService.apagarFuncionario(id);
            }
        } catch (Exception e) {
            throw new Exception("Erro ao abrir a tela excluir funcionário");
        }
    }
    
    public void buscarFuncionariosMaisVendem(TableModel model) throws SQLException {
        List<Funcionario> lista = funcionarioService.buscarFuncionariosMaisVendem();

        DefaultTableModel modelo = (DefaultTableModel) model;
        modelo.setRowCount(0);

        String adminText;

        for (Funcionario f : lista) {
            if (f.isAdmin() == true) {
                adminText = "Administrador";
            } else {
                adminText = "Usuário comum";
            }

            String porcentagemFormatada = String.format("%.2f%%", f.getPorcentagemVendas());

            modelo.addRow(new Object[]{ 
                f.getId(), 
                f.getNome(),
                f.getSenha(),
                f.getEmail(),
                f.getSalario(),
                adminText,
                porcentagemFormatada 
            });
        }
    }
}