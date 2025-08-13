package view.cliente;

import javax.swing.JOptionPane;
import model.Cliente;

public class ExcluirClientesView {
    public static boolean confirmarExclusao(Cliente cliente) {
        int resultado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR o cliente: " + cliente.getNome() + 
            "?", "Confirmar ação", JOptionPane.YES_NO_OPTION);
    
        if(resultado == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}
