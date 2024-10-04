package yeni1;

import java.util.Scanner;

public class Prac11 {
    public static void main(String[] args) {
        //replaceall kullan gerekli değeri almak için
        String s="learn java earn 1234 money";

        int sum=s.replaceAll("[^0-9]","").length();
        System.out.println(sum);
        //matcher pattern metod chain son değere bakar
        //-------------------------------------------
        /*password oluştur
        en az 8 karakter space olmasın enaz bir byk bir kck ,
        en az bir rakam
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen sıfre gir");
        String pwd=input.nextLine();
        //enaz sekiz karakteri olsun
        boolean lengthcontrol=pwd.length()>7;
        System.out.println("lengthcontrol=" +lengthcontrol);
        //space olmasın space hariç sil 0 tane mi bak
        boolean spaceControl=pwd.replaceAll("[^ ]","").length()==0;





    }
}
