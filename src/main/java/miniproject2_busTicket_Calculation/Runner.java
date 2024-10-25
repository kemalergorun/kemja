package miniproject2_busTicket_Calculation;

public class Runner {
    public static void main(String[] args) {
        //bus object creation
        Bus bus=new Bus("74");
        Ticket ticket=new Ticket();
        TicketReservation.start(bus,ticket);


    }
}
