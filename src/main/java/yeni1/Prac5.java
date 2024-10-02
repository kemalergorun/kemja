package yeni1;

import java.util.concurrent.locks.Condition;

public class Prac5 {
    public static void main(String[] args) {
        int a=-4;
        int sonuc= a<0 ? -1*a : a;
        System.out.println(sonuc);
        //---------------------------------

        int c=5;
        int b=7;
        Object sonu=(c>0 && b>0) || (c<0 && b<0) ? c*b :"farklı sayıları çarpamam";
        System.out.println(sonu);
        //object ortak sınıf
        //----------------------------------










    }
}
