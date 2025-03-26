package org.designPatters.terceiraListaExercicios.plataformaPagamentos.payment;

import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.BoletoPayment;
import org.designPatters.terceiraListaExercicios.plataformaPagamentos.factory.Payment;

public class BoletoPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BoletoPayment();
    }
}