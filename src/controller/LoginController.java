package controller;

import javax.swing.JOptionPane;
import model.Funcionario;
import service.LoginService;

public class LoginController {

    private LoginService loginService;
    
    public LoginController() {
        this.loginService = new LoginService();
    }

    public boolean realizarLogin(String usuario, String senha) throws Exception {
        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()) {
            throw new Exception("Preencha todos os campos");
        }
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setEmail(usuario);
        funcionario.setSenha(senha);
            
        if (loginService.validarLogin(funcionario) == true) {
            new view.principal.PrincipalView().setVisible(true);
            return true;
            /* Ver se é admin e dar permissões especiais*/
        } else {
            return false;
        }
    }
    
}
