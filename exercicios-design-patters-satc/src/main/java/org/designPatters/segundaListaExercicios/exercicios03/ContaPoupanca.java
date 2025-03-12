package org.designPatters.segundaListaExercicios.exercicios03;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
        System.out.println("Juros aplicados. Novo saldo: " + saldo);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
