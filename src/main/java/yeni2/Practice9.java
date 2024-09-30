package yeni2;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int b=input.nextInt();
        if(b<0){
            System.out.println("sayı negatif");

        } else if (b>0) {
            System.out.println("sayı pazitif");

        }else{
            System.out.println("nötr");
        }


    }
}
