package yeni2;

import java.util.Random;
import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {

        //guess the number
        Scanner scan = new Scanner(System.in);

        int num;
        int counter = 0;


        Random ran = new Random();
        int rannum = ran.nextInt(101);

        do {

            System.out.println("guess the number betwwen 0 to 100");
            num = scan.nextInt();


            counter++;


            if (num < rannum) {
                System.out.println("your number is smalller than the ran");


            } else if (num > rannum) {
                System.out.println("your number is bigger than the ran");


            } else {
                System.out.println("congratulations you guessed correct");
                System.out.println("you guessed " + counter + ".attempts");
                break;


            }


        } while (true);


    }
}
