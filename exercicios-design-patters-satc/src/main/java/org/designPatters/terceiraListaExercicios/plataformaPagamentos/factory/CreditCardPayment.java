package org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}