package miniproject2_busTicket_Calculation;

import java.util.Scanner;

public class TicketReservation {
    //create start method which will call to start reservation process
    public static void start(Bus bus, Ticket ticket) {
        Scanner scanner = new Scanner(System.in);
        int select;



        //use loop to present the choice options
        do {
            System.out.println("welcome Kemal Transport reservation desk");
            //get distance from user
            System.out.println("enter the distance you want to travel");
            double userDistance = scanner.nextDouble();
            //get journey type from user
            System.out.println("choose journey trip");
            System.out.println("1-One way \n2-Round trip");
            int userJourneyType = scanner.nextInt();
            //get age
            System.out.println("enter your age");
            int userAge = scanner.nextInt();

            //ask user to choose seat
            System.out.println("please choose the seat number");
            System.out.println("single seats are %20 expensive than others");

            //present list available seats
            System.out.println("available seats=" + bus.seats);
            int userSeat = scanner.nextInt();
            //remove the seat chosen by the user from the list
            bus.seats.remove(String.valueOf(String.valueOf(userSeat)));



            //conditions
            boolean check = userJourneyType == 1 || userJourneyType == 2;

            if (userDistance > 0 && userAge > 0 && check) {
                //initialized variables in ticket class

                ticket.distance = userDistance;
                ticket.journeyType = userJourneyType;
                ticket.seatNo = userSeat;


                //calculate price
                calculatePrice(ticket, userAge);
                ticket.printTicket(bus);


            } else {
                System.out.println("you entered wrong data");
            }



        } while (true);
    }//create method for calculation

    public static double calculatePrice(Ticket ticket, int age) {
        //distance,journey type,seatno,age
        //store inlocal variables

        double dis = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNo;

        double total = 0;
        switch (type) {
            case 1:
                if (seat % 3 == 0) {
                    total = dis * 1.2;
                } else {
                    total = dis * 1;

                }
                System.out.println("Total price=" + total);
                break;

            case 2:
                if (seat % 3 == 0) {
                    total = dis * 2.4;
                } else {
                    total = dis * 2;
                }
                total = total * 0.8;
                System.out.println("latest total" + total);
                break;
        }

        if (age > 0 && age < 6) {
            total = 0;
            System.out.println("children up to age 5 go free");
        } else if (age < 12) {
            total = total * 0.5;//
            System.out.println("total price after discount" + total);
        } else if (age < 25) {
            total = total * 0.9;
            System.out.println("total price after discount" + total);
        } else if (age > 65) {
            total = total * 0.7;
            System.out.println("total after discount" + total);

        }
        return ticket.price=total;



}}





