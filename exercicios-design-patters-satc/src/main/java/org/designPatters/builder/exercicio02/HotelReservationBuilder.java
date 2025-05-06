package org.designPatters.builder.exercicio02;

public class HotelReservationBuilder {
    private RoomType roomType;
    private int nights;
    private boolean breakfast;
    private boolean seaView;
    private boolean premiumWifi;
    private boolean lateCheckout;

    public HotelReservationBuilder withRoomType(RoomType roomType) {
        this.roomType = roomType;
        return this;
    }

    public HotelReservationBuilder forNights(int nights) {
        this.nights = nights;
        return this;
    }

    public HotelReservationBuilder addBreakfast() {
        this.breakfast = true;
        return this;
    }

    public HotelReservationBuilder addSeaView() {
        this.seaView = true;
        return this;
    }

    public HotelReservationBuilder addPremiumWifi() {
        this.premiumWifi = true;
        return this;
    }

    public HotelReservationBuilder addLateCheckout() {
        this.lateCheckout = true;
        return this;
    }

    public HotelReservation build() {
        if (roomType == null || nights <= 0) {
            throw new IllegalStateException("Tipo de quarto e número de noites são obrigatórios.");
        }
        return new HotelReservation(roomType, nights, breakfast, seaView, premiumWifi, lateCheckout);
    }
}
