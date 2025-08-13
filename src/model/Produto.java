package model;

public class Produto {
    private int id;
    private String nome;
    private String marca;
    private Double preco;
    private int qtd;

    public Produto(String nome, String marca, Double preco, int qtd) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public Produto() {
        
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}




