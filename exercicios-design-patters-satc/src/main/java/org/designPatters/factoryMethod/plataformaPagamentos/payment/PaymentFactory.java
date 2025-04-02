package org.designPatters.factoryMethod.plataformaPagamentos.payment;

import org.designPatters.factoryMethod.plataformaPagamentos.factory.Payment;

public interface PaymentFactory {
    Payment createPayment();
}