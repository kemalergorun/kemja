package yeni2;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give row number");
        int rows=input.nextInt();
        System.out.println("give columns num");
        int columns= input.nextInt();

        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=columns; j++)
            {System.out.print("* ");

            }
            System.out.println();


        }


    }
}
