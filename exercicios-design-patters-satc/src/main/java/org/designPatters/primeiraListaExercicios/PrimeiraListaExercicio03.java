package org.designPatters.primeiraListaExercicios;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraListaExercicio03 {

    /*

    # Exercicio 03

    ## Converta um código que simula um sistema bancário simples (com contas, depósitos e saques) usando funções para uma versão orientada a objetos.
    ```
    type Conta = {
        numero: number;
        saldo: number;
    };

    let contas: Conta[] = [];

    function criarConta(numero: number, saldoInicial: number): void {
        contas.push({ numero, saldo: saldoInicial });
        console.log(`Conta ${numero} criada com saldo inicial de R$${saldoInicial}.`);
    }

    function depositar(numeroConta: number, valor: number): void {
        const conta = contas.find(c => c.numero === numeroConta);
        if (conta) {
            conta.saldo += valor;
            console.log(`Depósito de R$${valor} realizado na conta ${numeroConta}. Novo saldo: R$${conta.saldo}.`);
        } else {
            console.log("Conta não encontrada.");
        }
    }

    function sacar(numeroConta: number, valor: number): void {
        const conta = contas.find(c => c.numero === numeroConta);
        if (conta) {
            if (conta.saldo >= valor) {
                conta.saldo -= valor;
                console.log(`Saque de R$${valor} realizado na conta ${numeroConta}. Novo saldo: R$${conta.saldo}.`);
            } else {
                console.log("Saldo insuficiente.");
            }
        } else {
            console.log("Conta não encontrada.");
        }
    }

    function consultarSaldo(numeroConta: number): void {
        const conta = contas.find(c => c.numero === numeroConta);
        if (conta) {
            console.log(`Saldo da conta ${numeroConta}: R$${conta.saldo}.`);
        } else {
            console.log("Conta não encontrada.");
        }
    }

    criarConta(123, 1000);
    depositar(123, 500);
    sacar(123, 200);
    consultarSaldo(123);

    */

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.criarConta(123, 1000);
        banco.depositar(123, 500);
        banco.sacar(123, 200);
        banco.consultarSaldo(123);
    }
}

class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}


class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(int numero, double saldoInicial) {
        contas.add(new Conta(numero, saldoInicial));
        System.out.println("Conta " + numero + " criada com saldo inicial de R$" + saldoInicial + ".");
    }

    public void depositar(int numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta + ". Novo saldo: R$" + conta.getSaldo() + ".");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(int numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            if (conta.sacar(valor)) {
                System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta + ". Novo saldo: R$" + conta.getSaldo() + ".");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void consultarSaldo(int numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Saldo da conta " + numeroConta + ": R$" + conta.getSaldo() + ".");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}