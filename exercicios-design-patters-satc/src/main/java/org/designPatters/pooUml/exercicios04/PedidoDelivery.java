package org.designPatters.pooUml.exercicios04;

import java.util.List;

public class PedidoDelivery extends Pedido {
    private double taxaEntrega;

    public PedidoDelivery(int numero, List<Item> itens, double taxaEntrega) {
        super(numero, itens);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total + taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}
