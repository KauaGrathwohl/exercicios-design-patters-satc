package org.designPatters.factoryMethod.plataformaPagamentos.payment;

import org.designPatters.factoryMethod.plataformaPagamentos.factory.BoletoPayment;
import org.designPatters.factoryMethod.plataformaPagamentos.factory.Payment;

public class BoletoPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BoletoPayment();
    }
}