package org.designPatters.factoryMethod.plataformaPagamentos.payment;

import org.designPatters.factoryMethod.plataformaPagamentos.factory.PayPalPayment;
import org.designPatters.factoryMethod.plataformaPagamentos.factory.Payment;

public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}