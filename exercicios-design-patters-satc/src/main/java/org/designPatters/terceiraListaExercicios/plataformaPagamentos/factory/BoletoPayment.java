package org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory;

public class BoletoPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing boleto payment of $" + amount);
    }
}