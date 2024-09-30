package yeni2;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("gün gir");
        String gun=input.next();
        if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase ("pazar")){
            System.out.println("hafta sonu");


        } else if (gun.equalsIgnoreCase("pazartesi")||gun.equalsIgnoreCase("salı")) {
            System.out.println("hafta içi");


        }else{
            System.out.println("gecerli gun gir");

        }


    }


    }
