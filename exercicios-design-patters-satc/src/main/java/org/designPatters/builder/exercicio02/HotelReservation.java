package org.designPatters.builder.exercicio02;

public class HotelReservation {
    private RoomType roomType;
    private int nights;
    private boolean breakfast;
    private boolean seaView;
    private boolean premiumWifi;
    private boolean lateCheckout;

    public HotelReservation(RoomType roomType, int nights, boolean breakfast,
                            boolean seaView, boolean premiumWifi, boolean lateCheckout) {
        this.roomType = roomType;
        this.nights = nights;
        this.breakfast = breakfast;
        this.seaView = seaView;
        this.premiumWifi = premiumWifi;
        this.lateCheckout = lateCheckout;
    }

    @Override
    public String toString() {
        return "=== Reserva de Hotel ===\n" +
                "Tipo de Quarto: " + roomType + "\n" +
                "Noites: " + nights + "\n" +
                "Café da manhã: " + (breakfast ? "Sim" : "Não") + "\n" +
                "Vista para o mar: " + (seaView ? "Sim" : "Não") + "\n" +
                "Wi-Fi Premium: " + (premiumWifi ? "Sim" : "Não") + "\n" +
                "Late Checkout: " + (lateCheckout ? "Sim" : "Não");
    }
}
