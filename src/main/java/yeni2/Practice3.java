package yeni2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        double fn= input.nextDouble();
        double sn= input.nextDouble();
        System.out.println("toplam: "+(fn+sn));
        System.out.println("fark: "+(fn-sn));
        System.out.println("çarpma: "+(fn*sn));
        System.out.println("bölme: "+String.format("%.2f",(fn/sn)));












    }
}
