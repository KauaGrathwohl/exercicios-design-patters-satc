package org.designPatters.builder.exercicio03;

public class Car {
    private String modelo;
    private EngineType motor;
    private String cor;
    private TransmissionType cambio;
    private boolean tetoSolar;
    private boolean somPremium;
    private boolean bancosCouro;

    public Car(String modelo, EngineType motor, String cor, TransmissionType cambio,
               boolean tetoSolar, boolean somPremium, boolean bancosCouro) {
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.cambio = cambio;
        this.tetoSolar = tetoSolar;
        this.somPremium = somPremium;
        this.bancosCouro = bancosCouro;
    }

    @Override
    public String toString() {
        return "=== Configuração do Carro ===\n" +
                "Modelo: " + modelo + "\n" +
                "Motor: " + motor + "\n" +
                "Cor: " + cor + "\n" +
                "Câmbio: " + cambio + "\n" +
                "Teto Solar: " + (tetoSolar ? "Sim" : "Não") + "\n" +
                "Som Premium: " + (somPremium ? "Sim" : "Não") + "\n" +
                "Bancos de Couro: " + (bancosCouro ? "Sim" : "Não");
    }
}
