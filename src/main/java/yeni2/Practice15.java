package yeni2;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" give number between 1-10");
        int number= input.nextInt();
        int result=1;
        int i=1;

        while (i<11){
            if (number<0 || number>10 ){
                System.out.println("give right number");
                break;
            }
            result=i*number;

            System.out.println(number+"x"+i+"="+(result));
            i++;



        }




    }
}
