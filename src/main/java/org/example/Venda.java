
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
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
    @Test
    public void testCalculaValorTotalVendaSemDesconto() {
        // Criação de itens
        ItemVenda item1 = new ItemVenda("Produto 1", 50.0, 2);
        ItemVenda item2 = new ItemVenda("Produto 2", 30.0, 3);

        // Criação da venda
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        Venda venda = new Venda("Cliente", itens, 0.0);

        // Cálculo do valor total da venda sem desconto
        double expectedTotal = (50.0 * 2) + (30.0 * 3);
        double actualTotal = venda.calcularValorTotal();

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void testCalculaValorTotalVendaComDesconto() {
        // Criação de itens
        ItemVenda item1 = new ItemVenda("Produto 1", 50.0, 2);
        ItemVenda item2 = new ItemVenda("Produto 2", 30.0, 3);

        // Criação da venda com desconto
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        double desconto = 20.0;
        Venda venda = new Venda("Cliente", itens, desconto);

        // Cálculo do valor total da venda com desconto
        double expectedTotal = ((50.0 * 2) + (30.0 * 3)) - desconto;
        double actualTotal = venda.calcularValorTotalComDesconto();

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void testCalculaValorUnitarioItem() {
        // Criação de um item
        ItemVenda item = new ItemVenda("Produto Teste", 10.0, 5);

        // Cálculo do valor unitário do item
        double expectedValue = 10.0;
        double actualValue = item.calcularValorUnitario();

        assertEquals(expectedValue, actualValue);
    }


}
