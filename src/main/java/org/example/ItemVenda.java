package org.example;
public class ItemVenda {
    private String descricao;
    private double valorUnitario;
    private double quantidade;

    public ItemVenda(String descricao, double valorUnitario, double quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalItem() {
        return valorUnitario * quantidade;
    }

    public double calcularValorUnitario() {
        return valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
