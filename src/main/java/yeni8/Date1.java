package yeni8;

import java.time.LocalDate;
import java.time.Month;

public class Date1 {
    public static void main(String[] args) {
        //type code to get todays date
       LocalDate currentDate= LocalDate.now();
        System.out.println("currentDate = " + currentDate);
        //get month
         int monthValue=currentDate.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        Month month=currentDate.getMonth();
        System.out.println("month = " + month);

        int dayOfMonth=currentDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        int year=currentDate.getYear();
        System.out.println("year = " + year);
        //get future day month and day

        LocalDate futureDate=currentDate.plusYears(4).plusMonths(4).plusDays(1);
        System.out.println("futureDate = " + futureDate);

        LocalDate date2=LocalDate.of(2024,2,29);
        System.out.println("date2 = " + date2);


    }
}
