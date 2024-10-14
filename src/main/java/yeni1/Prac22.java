package yeni1;

import java.util.Arrays;

public class Prac22 {
    public static void main(String[] args) {
        //çoklu data saklar class değil obje tek datatipi
        //veritipi ve dizi sayısı
        //hızlı boyutu sabit memory az harcarhem primitive hem non primitive

        //array oluştur
        String[]stdName=new String[3];
        System.out.println(Arrays.toString(stdName));
        //5 elemanlı not
        int[]notlar=new int[5];
        //ınteger wrap ile oluştur
        Integer[] integers=new Integer[10];
        //3 elemanlı string isimler
        String[]isimler=new String[3];
        isimler[0]="kemal";
        isimler[1]="ceylin";
        isimler[2]="betül";
        System.out.println(Arrays.toString(isimler));
        //array de bir veri almak
        System.out.println(isimler[1]);
        //----------------------------------------------------
        //string array 5 elemanlı içerdiği karakter sayıları
        String[]cities=new String[5];
        cities[0]="bayburt";
        cities[1]="sivas";
        cities[2]="denizli";
        cities[3]="adana";
        cities[4]="ankara";
        System.out.println(Arrays.toString(cities));
        //for loop ile
        int totalChar=0;
        for (int i = 0; i <cities.length ; i++) {
            totalChar=totalChar+cities[i].length();
        }
        System.out.println(totalChar);
        //for each ile
        //genel kabul w whatever demek genel tercih
        int sum=0;
        for (String w:cities){
            sum=sum+w.length();
        }
        System.out.println("sum = " + sum);


    }
}
