
package org.example;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente, List<ItemVenda> itens, double valorDesconto) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorDesconto = valorDesconto;
        calcularValorVenda();
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.calcularValorTotalItem();
        }
        return total;
    }

    public double calcularValorTotalComDesconto() {
        double total = calcularValorTotal();
        return total - valorDesconto;
    }

    private void calcularValorVenda() {
        this.valorVenda = calcularValorTotal();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
