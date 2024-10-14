package yeni1;

import java.util.Random;
import java.util.Scanner;

public class Prac21 {
    public static void main(String[] args) {

        //0-100 arası number guessing
        //scan ve random
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        //0-100 arsı seç
        int rastgeleSayi= random.nextInt(101);
        //kullanıcı kaç deneme yaptığı
        int denemeSayi=0;
        //kullanıcı tahmin ettiği sayi değişken
        int tahminedilen;
        //kullanıcı tahmini doğru yanlış
        boolean tahminDoğrumu=false;
        //oyun açıklaması
        System.out.println("0-100 arası sayıyı tahmin et");
        //doğru tamine kadar döngü
        do{
            //kullanıcı tahmin etsin
            System.out.println("tahmininizi yapınız");
            tahminedilen= scanner.nextInt();

            //sayacı bir artır
            denemeSayi++;

            //tahmini kontrol et
            if (tahminedilen<rastgeleSayi){
                System.out.println("sayı daha buyuk");
            } else if (tahminedilen>rastgeleSayi) {
                System.out.println("sayı daha kucuk");
            }else{
                tahminDoğrumu=true;
                System.out.println("tebrikler doğru tahmin");
                System.out.println("denemeSayi = " + denemeSayi);


            }


        }while ((!tahminDoğrumu));
        scanner.close();//açtğın classı kapat




    }
}
