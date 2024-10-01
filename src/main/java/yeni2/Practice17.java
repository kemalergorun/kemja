package yeni2;

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kullanıcıAdı;
        String sifre;




        int notries=1;


        do {
            if (notries==5){
                System.out.println("hesabın bloke edildi");
                break;
            }
            System.out.println("kullanıcı adı  giriniz");
            kullanıcıAdı= input.next();

            System.out.println("sifre giriniz");
            sifre=input.next();


            notries++;
            if (kullanıcıAdı.equals("admin")&& sifre.equals("pwd123")){
                System.out.println("hesabına hoşgeldin");
                break;

            }else {
                System.out.println("kullanıcı adı veya şifre hatalı");
                System.out.println("uyarı sizin "+notries+" .denemeniz");

            }






        }while(true);




    }
}
