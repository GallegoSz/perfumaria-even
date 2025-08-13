package view.produto;

import javax.swing.JOptionPane;
import model.Produto;

public class ExcluirProdutosView {
    public static boolean confirmarExclusao(Produto produto) {
        int resultado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR o produto: " + produto.getNome() + 
            "?", "Confirmar ação", JOptionPane.YES_NO_OPTION);
    
        if(resultado == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}
