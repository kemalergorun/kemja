package miniproject2_busTicket_Calculation;

import java.util.Scanner;

public class TicketReservation {
    //create start method which will call to start reservation process
    public static void start(Bus bus){
        Scanner scanner=new Scanner(System.in);

        //use loop to present the choice options
        do{
            System.out.println("welcome Kemal Transport reservation desk");
            //get distance from user
            System.out.println("enter the distance you want to travel");
            double userDistance =scanner.nextDouble();
            //get journey type from user
            System.out.println("choose journey trip");
            System.out.println("1-One way \n2-Round trip");
            int userJourneyType=scanner.nextInt();
            //get age
            System.out.println("enter your age");
            int userAge=scanner.nextInt();

            //ask user to choose seat
            System.out.println("please choose the seat number");
            System.out.println("single seats are %20 expensive than others");

            //present list available seats
            System.out.println("available seats=" + bus.seats);
            int userSeat= scanner.nextInt();
            //remove the seat chosen by the user from the list
            bus.seats.remove(userSeat);

            //conditions
            boolean check =userJourneyType==1||userJourneyType==2;

            if (userDistance>0&&userAge>0&&check){
                //calculate price


            }else {
                System.out.println("you entered wrong data");
            }




        }while ();




    }//create method for calculation
    public static double calculatePrice(Ticket ticket){
        //distance,journey type,seatno,age
        double dis= ticket.distance;
        int jour= ticket.journeyType;
        int seat=ticket.seatNo;


    }





}
