package yeni1;

public class Prac14 {
    public static void main(String[] args) {
        //tekrarsız karakterleri yan yana yazdır
        //yusuf
        String a="yusuf";
        //index of ve lastindex aynı ise tekrar yok farklı ise tekrarlı
        if (a.indexOf("y")==a.lastIndexOf("y")){
            System.out.print("y");
        }
        if (a.indexOf("u")==a.lastIndexOf("u")){
            System.out.println("u");
        }
        System.out.println("");
        //---------------------------------------------
        //bir banka kartının son dört hane hariç * yap
       // 1234 6789 1234 6789=>**** **** **** 6789
        String cardNum="1234 6789 1234 6789";
        String first=cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println("first = " + first);
        String last=cardNum.substring(15);
        System.out.println("last = " + last);

        String result1=first+last;
        System.out.println("result1 = " + result1);
        String result2=first.concat(last);
        System.out.println("result2 = " + result2);

    }
}
