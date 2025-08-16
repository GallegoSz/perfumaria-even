package service;
import dao.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;

public class FuncionarioService {
    private FuncionarioDAO dao = new FuncionarioDAO();
    
    public boolean emailDisponivel(String email, int idIgnorar) {
        return !dao.emailJaExiste(email, idIgnorar);
    }
    
    public void cadastrar(Funcionario funcionario) throws Exception{
       if (!emailDisponivel(funcionario.getEmail(), funcionario.getId())) {
            throw new Exception("Este e-mail já está em uso.");
        }
        
        dao.cadastrarFuncionario(funcionario);
    }

    public void alterarDadosFuncionario(Funcionario funcionario) throws Exception {
        if (!emailDisponivel(funcionario.getEmail(), funcionario.getId())) {
            throw new Exception("Este e-mail já está em uso.");
        }
        
        dao.alterarDadosFuncionario(funcionario);
    }

    public Funcionario buscarId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        Funcionario funcionario = dao.buscarId(id);

        return funcionario;
    }

    public List<Funcionario> buscarFuncionarios(String nome) {
        return dao.buscarFuncionarios(nome);
    }

    public void apagarFuncionario(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Valor Incorreto para Id");
        }
        
        dao.excluirFuncionario(id);
    }
}
