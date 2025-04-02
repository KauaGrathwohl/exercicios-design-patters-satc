package org.designPatters.factoryMethod.plataformaPagamentos.payment;

import org.designPatters.factoryMethod.plataformaPagamentos.factory.CreditCardPayment;
import org.designPatters.factoryMethod.plataformaPagamentos.factory.Payment;

public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}