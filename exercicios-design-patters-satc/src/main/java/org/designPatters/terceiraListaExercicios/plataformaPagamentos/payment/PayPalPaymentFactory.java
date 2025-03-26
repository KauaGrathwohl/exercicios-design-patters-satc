package org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment;

import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.PayPalPayment;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.Payment;

public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}