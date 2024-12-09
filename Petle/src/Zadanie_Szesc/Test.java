package Zadanie_Szesc;

public class Test {
    public static void main(String[] args) {
        double ticketPrice = 30;

        for (TicketType value : TicketType.values()) {
            double v = value.discountCalculator(ticketPrice);
            System.out.println(v);
        }
    }


}
