package org.designPatters.builder.exercicio03;

public class CarBuilder {
    private String modelo;
    private EngineType motor;
    private String cor;
    private TransmissionType cambio;
    private boolean tetoSolar;
    private boolean somPremium;
    private boolean bancosCouro;

    public CarBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarBuilder setMotor(EngineType motor) {
        this.motor = motor;
        return this;
    }

    public CarBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarBuilder setCambio(TransmissionType cambio) {
        this.cambio = cambio;
        return this;
    }

    public CarBuilder comTetoSolar() {
        this.tetoSolar = true;
        return this;
    }

    public CarBuilder comSomPremium() {
        this.somPremium = true;
        return this;
    }

    public CarBuilder comBancosCouro() {
        this.bancosCouro = true;
        return this;
    }

    public Car build() {
        if (modelo == null || motor == null || cor == null || cambio == null) {
            throw new IllegalStateException("Todos os campos obrigatórios devem ser preenchidos.");
        }

        int opcionais = 0;
        if (tetoSolar) opcionais++;
        if (somPremium) opcionais++;
        if (bancosCouro) opcionais++;

        if (opcionais < 2) {
            throw new IllegalStateException("É necessário selecionar pelo menos 2 opcionais.");
        }

        return new Car(modelo, motor, cor, cambio, tetoSolar, somPremium, bancosCouro);
    }
}
