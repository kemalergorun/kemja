package yeni2;

import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
        int a= input.nextInt();

        int sum=0;

        while (a>0){
            sum+=a%10;
            a=a/10;


        }
        System.out.println("sum="+sum);



    }
}
