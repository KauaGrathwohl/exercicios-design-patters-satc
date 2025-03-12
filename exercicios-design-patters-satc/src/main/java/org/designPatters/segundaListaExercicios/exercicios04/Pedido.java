package org.designPatters.segundaListaExercicios.exercicios04;

import java.util.List;

public abstract class Pedido {
    protected int numero;
    protected List<Item> itens;

    public Pedido(int numero, List<Item> itens) {
        this.numero = numero;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public abstract double calcularTotal();
}
