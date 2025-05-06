package org.designPatters.builder.exercicio03;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CarBuilder builder = new CarBuilder();

    System.out.println("Digite o modelo do carro:");
    builder.setModelo(scanner.nextLine());

    System.out.println("Escolha o tipo de motor (GASOLINA, ELETRICO, HIBRIDO):");
    builder.setMotor(EngineType.valueOf(scanner.nextLine().toUpperCase()));

    System.out.println("Digite a cor do carro:");
    builder.setCor(scanner.nextLine());

    System.out.println("Escolha o tipo de câmbio (MANUAL, AUTOMATICO):");
    builder.setCambio(TransmissionType.valueOf(scanner.nextLine().toUpperCase()));

    System.out.println("Adicionar teto solar? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.comTetoSolar();

    System.out.println("Adicionar som premium? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.comSomPremium();

    System.out.println("Adicionar bancos de couro? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.comBancosCouro();

    try {
        Car carro = builder.build();
        System.out.println("\n" + carro);
    } catch (IllegalStateException e) {
        System.out.println("Erro ao criar carro: " + e.getMessage());
    }
}