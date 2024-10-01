package yeni2;

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        int no;

        do {

            System.out.println("enter number");
            no= input.nextInt();
            if (no<0){
                System.out.println("u cant enter negative no");
                break;
            } else if (no>0 && no<101) {
                System.out.println("you won!!!");

            }
        }while(no<101);
        System.out.println("you lost!!no more tries!!");






    }
}
