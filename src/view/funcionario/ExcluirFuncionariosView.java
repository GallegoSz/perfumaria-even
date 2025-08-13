package view.funcionario;
import javax.swing.JOptionPane;
import model.Funcionario;

public class ExcluirFuncionariosView {
    public static boolean confirmarExclusao(Funcionario funcionario) {
        int resultado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR o cliente: " + funcionario.getNome() + 
            "?", "Confirmar ação", JOptionPane.YES_NO_OPTION);
    
        if(resultado == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}
