package org.designPatters.segundaListaExercicios.exercicios04;

import java.util.List;

public class PedidoPresencial extends Pedido {

    public PedidoPresencial(int numero, List<Item> itens) {
        super(numero, itens);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}