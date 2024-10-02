package yeni1;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String günismi= input.next();
        if (günismi.equalsIgnoreCase("cumartesi")||günismi.equalsIgnoreCase("pazar")){
            System.out.println("hafta sonu");


        } else if (günismi.equalsIgnoreCase("salı")|| günismi.equalsIgnoreCase("pazartesi")) {
            System.out.println("hafta içi");

        }else{
            System.out.println("geçerli gün gir");



        }


    }
}
