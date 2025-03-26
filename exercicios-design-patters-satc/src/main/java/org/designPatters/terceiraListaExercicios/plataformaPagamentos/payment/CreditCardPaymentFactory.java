package org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment;

import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.CreditCardPayment;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.Payment;

public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}