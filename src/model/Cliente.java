package model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private int totalProdutosComprados;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getTotalProdutosComprados() {
        return totalProdutosComprados;
    }

    public void setTotalProdutosComprados(int totalProdutosComprados) {
        this.totalProdutosComprados = totalProdutosComprados;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
}
