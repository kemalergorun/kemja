package CalısmaConstructor;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.Scanner;

public class Date2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LocalDate girilentarih=null;
        while (true){
            System.out.println("lutfen yılı gir");
            int year=input.nextInt();
            System.out.println("lutfen ayı gir");
            int month=input.nextInt();
            if (month<1||month>12){
            System.out.println("ay 1 ile 12 arasında olsun.lutfen tekrar dene");
            continue;
            }
            System.out.println("lutfen gunu gir");
            int day= input.nextInt();
            //o ayı kaç çeker obje oluştur
            YearMonth yearMonth=YearMonth.of(year,month);
            // oayı  max gün hesaplar
            int dayInMonth=yearMonth.lengthOfMonth();
            if (day<1||day>dayInMonth){
                System.out.println("girilen ay için geçersiz gün");
                continue;
            }
            girilentarih=LocalDate.of(year,month,day);
            if (girilentarih.isBefore(LocalDate.now())){
                System.out.println("gecersiz girdin yeni gir");
            }else {
                System.out.println("zaman gir");
                break;

            }







        }







    }
}
