package org.designPatters.factoryMethod.plataformaPagamentos.factory;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}