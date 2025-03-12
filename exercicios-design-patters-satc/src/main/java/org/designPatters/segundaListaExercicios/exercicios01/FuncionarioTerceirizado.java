package org.designPatters.segundaListaExercicios.exercicios01;

public class FuncionarioTerceirizado extends Funcionario {
    private double custoProjeto;

    public FuncionarioTerceirizado(String nome, double salario, String cargo, double custoProjeto) {
        super(nome, salario, cargo);
        this.custoProjeto = custoProjeto;
    }

    @Override
    public double calcularVencimentos() {
        return salario + custoProjeto;
    }

    // Getters e setters
    public double getCustoProjeto() {
        return custoProjeto;
    }

    public void setCustoProjeto(double custoProjeto) {
        this.custoProjeto = custoProjeto;
    }
}