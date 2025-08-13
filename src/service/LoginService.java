package service;

import dao.LoginDAO;
import javax.swing.JOptionPane;
import model.Funcionario;

public class LoginService {
    private LoginDAO loginDAO = new LoginDAO();


    public boolean validarLogin(Funcionario funcionario) throws Exception {   
        if (loginDAO.logar(funcionario) == true) {
            return true;
        } else {
            return false;
        }
    }
    
}
