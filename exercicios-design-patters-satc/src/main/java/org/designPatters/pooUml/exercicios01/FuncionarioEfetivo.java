package org.designPatters.pooUml.exercicios01;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusAnual;

    public FuncionarioEfetivo(String nome, double salario, String cargo, double bonusAnual) {
        super(nome, salario, cargo);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularVencimentos() {
        return salario + bonusAnual;
    }

    // Getters e setters
    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}