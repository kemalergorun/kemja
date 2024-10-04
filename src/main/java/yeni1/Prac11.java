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
       // System.out.println("lengthcontrol=" +lengthcontrol);
        //space olmasın space hariç sil 0 tane mi bak
        boolean spaceControl=pwd.replaceAll("[^ ]","").length()==0;
        //System.out.println("spaceControl ="+ spaceControl);
        //enaz bir byk olsun byk harf hariç herşeyi sil
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]","").length()>0;
       // System.out.println("upperCaseControl = " + upperCaseControl);
        //enaz bir kck olsun kck haric hepsini sil
        boolean lowerCaseControl=pwd.replaceAll("[^a-z]","").length()>0;
       // System.out.println("lowerCaseControl = " + lowerCaseControl);
        //enaz bir rakam olsun rakam haric hepsini sil
        boolean numberControl=pwd.replaceAll("[^0-9]","").length()>0;
       // System.out.println("numberControl = " + numberControl);
        //hata için if(!numbercontrol)sout sifre en az bir rakam içermeli
        //sonuc
        boolean isValid=lengthcontrol&&spaceControl&&upperCaseControl&&lowerCaseControl&&numberControl;

        if (isValid){
            System.out.println( "sifre gecerlidir.");
        }else {
            System.out.println("şifre yanlış");

        }



    }
}
