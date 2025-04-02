package org.designPatters.pooUml.exercicios02;

public class Taxi extends Veiculo {
    private double taxaPorPassageiro;

    public Taxi(String modelo, int capacidade, double taxaPorPassageiro) {
        super(modelo, capacidade);
        this.taxaPorPassageiro = taxaPorPassageiro;
    }

    @Override
    public double calcularConsumo(double distancia, int passageiros) {
        return distancia * taxaPorPassageiro * passageiros;
    }

    // Getters e setters
    public double getTaxaPorPassageiro() {
        return taxaPorPassageiro;
    }

    public void setTaxaPorPassageiro(double taxaPorPassageiro) {
        this.taxaPorPassageiro = taxaPorPassageiro;
    }
}
