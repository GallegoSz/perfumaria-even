package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    private String id;
    private Produto produto;
    private Funcionario funcionario;
    private Cliente cliente;
    private LocalDateTime dataHora;
    private int qtd;

    public Venda(Produto produto, Funcionario funcionario, Cliente cliente, LocalDateTime dataHora, int qtd) {
        this.produto = produto;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dataHora = dataHora;
        this.qtd = qtd;
    }

    public Venda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    
}


