package org.designPatters.builder.exercicio02;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HotelReservationBuilder builder = new HotelReservationBuilder();

    System.out.println("Escolha o tipo de quarto (STANDARD, LUXO, PRESIDENCIAL): ");
    builder.withRoomType(RoomType.valueOf(scanner.nextLine().toUpperCase()));

    System.out.println("Digite o número de noites: ");
    builder.forNights(Integer.parseInt(scanner.nextLine()));

    System.out.println("Deseja adicionar café da manhã? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.addBreakfast();

    System.out.println("Deseja vista para o mar? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.addSeaView();

    System.out.println("Deseja Wi-Fi Premium? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.addPremiumWifi();

    System.out.println("Deseja Late Checkout? (s/n)");
    if (scanner.nextLine().equalsIgnoreCase("s")) builder.addLateCheckout();

    HotelReservation reserva = builder.build();
    System.out.println("\n" + reserva);
}