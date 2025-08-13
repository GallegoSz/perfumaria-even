package app;
import view.login.LoginView;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginView().setVisible(true);
        });
        
        
    }
}
