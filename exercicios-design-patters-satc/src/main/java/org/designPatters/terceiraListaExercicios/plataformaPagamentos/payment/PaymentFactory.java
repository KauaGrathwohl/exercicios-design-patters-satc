package org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment;

import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.Payment;

public interface PaymentFactory {
    Payment createPayment();
}