package CalısmaConstructor;

import java.time.LocalDate;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        //kullanıcıdan tarih al geri ise geçersiz yaz ileri ise zamanı gir
        //scanner class ile yaz
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen tarih bilgisini belirttiğimiz sıraya göre gir");

        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();
        //kullanıcıdan alınan tarihi yazdır
        LocalDate girilenTarih=LocalDate.of(year,month,day);
        if (girilenTarih.isBefore(LocalDate.now())){
            System.out.println("gecersiz tarih girdiniz");
        }else {
            System.out.println("zamanı giriniz");
        }


    }
}
