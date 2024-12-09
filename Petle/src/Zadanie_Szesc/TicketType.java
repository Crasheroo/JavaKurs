package Zadanie_Szesc;

public enum TicketType {
    CHILD(0.20),
    ADULT(0.50),
    SENIOR(0.70);

    private double discount;

    TicketType(double discount) {
        this.discount = discount;
    }

    public double discountCalculator(double ticketPrice) {
        return ticketPrice - ticketPrice * discount;
    }
}
