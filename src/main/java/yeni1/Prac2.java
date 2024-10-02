package yeni1;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyet gir");
        String gender = scanner.next();
        System.out.println("yaş gir");
        int age = scanner.nextInt();


        if (gender.equalsIgnoreCase("erkek")) {
            if (age < 0) {
                System.out.println("yaş negatif olmaz");
            } else if (age < 16) {
                System.out.println("çalışmamalı");
            } else if (age <= 65) {
                System.out.println("çalışmalı");


            } else {
                System.out.println("emekli olmalı");

            }
        } else if (gender.equalsIgnoreCase("kadın")) {
            if (age < 0) {
                System.out.println("yaş negatif olmaz");
            } else if (age < 18) {
                System.out.println("çalışmamalı");


            } else if (age <= 60) {
                System.out.println("çalışmalı");


            } else {
                System.out.println("emekli olmalı");


            }

        } else {
            System.out.println("lutfen tanıma uy");


        }

    }
}
