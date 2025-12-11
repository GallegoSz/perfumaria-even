package app;
import view.login.LoginView;
import view.principal.PrincipalView;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LoginView().setVisible(true);
            } catch (Exception ex) {
                System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
        
        
    }
}
