package miniproject2_busTicket_Calculation;

public class Ticket {
//distance trip type seat no price
    public double distance;
    public int journeyType;
    public int seatNo;
    public double price;

    public void printTicket(Bus bus){
        System.out.println("------ticket detail-------");
        System.out.println("busNum = " + bus.busNum);
        System.out.println("distance = " + this.distance);
        System.out.println("journeyType = " + this.journeyType);
        System.out.println("seatNo = " + this.seatNo);
        System.out.println("totalprice = " + this.price);
        System.out.println("have a nice trip");
    }
}
