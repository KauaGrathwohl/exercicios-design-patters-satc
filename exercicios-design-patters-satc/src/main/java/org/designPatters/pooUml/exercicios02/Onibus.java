package org.designPatters.pooUml.exercicios02;

public class Onibus extends Veiculo {
    private double consumoPorKm;

    public Onibus(String modelo, int capacidade, double consumoPorKm) {
        super(modelo, capacidade);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularConsumo(double distancia, int passageiros) {
        return distancia * consumoPorKm;
    }

    // Getters e setters
    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
}
