package Calısmalar;

import java.util.Arrays;

public class Cal1 {
    public static void main(String[] args) {
        //array eşitliği nasıl anlaşılır
        //elemanlar aynı indexte ise equal olur
        //boolean result=Arrays.equas()metodu ile
        //multi dimensional array çok boyutlu
        //excel tablosu gibi sutun ve satırlar oluşur
        //dış array outer iç array inner
        //md oluşturma
        int[][]a=new int[3][2];
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=5;
        //yazdırırken deepto string
        System.out.println(Arrays.deepToString(a));
        //  --------------------------
        //özel eleman yazdırma
        System.out.println(a[1][1]);
        //md de bir array yazdırma
        System.out.println(Arrays.toString(a[2]));
        //kısa yol md oluşturma
        String[][]students={{"ali","kemal"},{"cemal"},{"ayhan","beyhan","seyhan"},{"ceyhan","burhan"}};
        System.out.println(Arrays.deepToString(students));
        //students array da kaç isim var
        int sum=0;
        for (String[] w:students){
            System.out.println( sum = sum + w.length);
        }


    }
}
