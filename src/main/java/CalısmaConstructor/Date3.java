package CalısmaConstructor;

import java.time.LocalDate;
import java.util.Scanner;

public class Date3 {
    public static void main(String[] args) {
        //kullanıcıdan doğum tarihi al günü ismini yazdır
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen sıraya gir yıl ay gün");
        int y= input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();
        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());
        //tarihin gunu aldık



    }
}
