package org.designPatters.poo;

public class PrimeiraListaExercicio08 {

    public static void main(String[] args) {
        Compra compra = new Compra(150.00);

        MetodoPagamento cartaoCredito = new CartaoCredito();
        MetodoPagamento payPal = new PayPal();
        MetodoPagamento boleto = new Boleto();

        compra.realizarPagamento(cartaoCredito);
        compra.realizarPagamento(payPal);
        compra.realizarPagamento(boleto);
    }
}

interface MetodoPagamento {
    void pagar(double valor);
}

class CartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}

class PayPal implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
    }
}

class Boleto implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto.");
    }
}

class Compra {
    private double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento(MetodoPagamento metodo) {
        metodo.pagar(valor);
    }
}