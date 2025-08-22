package model;

public class Funcionario {
    private int id;
    private String nome;
    private String senha;
    private String email;
    private Double salario;

    public Funcionario(String nome, String senha, String email, Double salario, boolean admin) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.salario = salario;
        this.admin = admin;
    }
    protected boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
