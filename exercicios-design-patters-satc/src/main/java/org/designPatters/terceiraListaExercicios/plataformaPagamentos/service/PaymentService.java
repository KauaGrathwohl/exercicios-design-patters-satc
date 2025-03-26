package org.designPatters.terceiraListaExercicios.plataformaPagamentos.service;

import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.Payment;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment.BoletoPaymentFactory;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment.CreditCardPaymentFactory;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment.PayPalPaymentFactory;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment.PaymentFactory;

public class PaymentService {
    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment(100.0);

        PaymentFactory payPalFactory = new PayPalPaymentFactory();
        Payment payPalPayment = payPalFactory.createPayment();
        payPalPayment.processPayment(200.0);

        PaymentFactory boletoFactory = new BoletoPaymentFactory();
        Payment boletoPayment = boletoFactory.createPayment();
        boletoPayment.processPayment(300.0);
    }
}