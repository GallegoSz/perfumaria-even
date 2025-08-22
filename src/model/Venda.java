package model;

import java.time.LocalDateTime;

public class Venda {
    private int id;
    private Produto produto;
    private Funcionario funcionario;
    private Cliente cliente;
    private int qtd;
    private double precoUnitario;
    private double precoFinal;
    private LocalDateTime dataVenda;

    

    public Venda(Produto produto, Funcionario funcionario, Cliente cliente, int qtd) {
        this.produto = produto;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.qtd = qtd;
        this.precoUnitario = produto.getPreco();
        this.precoFinal = this.qtd * this.precoUnitario;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    public Venda() {
    }

    
    
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


