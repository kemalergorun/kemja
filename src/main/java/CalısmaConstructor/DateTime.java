package CalısmaConstructor;

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {
        //now yerel saat
        LocalDate myDate=LocalDate.now();
        //stat,c metod class ismi ile ulaşır
        //non static metoda obje ulaşır
        //Math.min() static metod
        System.out.println(myDate);
        //getMonth ve value enum türüdür enumeration denir.enum sabittir
        //değişme ihtimali olmayanı enuma yükleriz
        System.out.println(myDate.getMonthValue());
        System.out.println(myDate.getMonth());
        //class lar data tiptir
        //get year yılı getirir
        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getDayOfWeek());
        //ileriki tarihe gidiş
        LocalDate newDate=myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);
        //----------------------------------------
        //minus yeAR MONtH DAY kullanılarak geriye gidilir
        //of girilince istediğin tarih oluşur
        LocalDate date1=LocalDate.of(1978,8,28);
        System.out.println(date1.getDayOfWeek());
        LocalDate date2=LocalDate.of(2010,5,4);
        boolean sonrami=date1.isAfter(date2);
        System.out.println(sonrami);


    }
}
