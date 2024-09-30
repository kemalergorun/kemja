package yeni2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("adınızı soyadınızı giriniz");
        String fullname= input.nextLine();
        System.out.println("yasınızı giriniz");
        byte age= input.nextByte();
        System.out.println("boyunuzu giriniz");
        float boy= input.nextFloat();
        System.out.println("kilonuzu giriniz");
        short kilo= input.nextShort();
        System.out.println("medeni durumunuzu giriniz");
        String medenidurum=input.next();
        System.out.println(fullname);
        System.out.println(age);
        System.out.println(boy);
        System.out.println(kilo);
        System.out.println(medenidurum);



    }
}
