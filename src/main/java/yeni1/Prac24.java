package yeni1;

import java.util.Arrays;

public class Prac24 {
    public static void main(String[] args) {
        //int array 12,3,-3,5,23 5den küçük yazdır
        int[]num={12,3,-3,5,23};
        for (int w:num){
            if (w<5){
                System.out.print(w+ "");
            }
        }
        //----------------------------------------
        //özel eleman var yok ara
        //binarysearch size o eleman index verir
        //sort olmadan kullanma yasak
        //"-" negatif eleman yok demek
        //ikiye böler öyle arar
        System.out.println("------------------------------------");
        int[]arr={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 2));
        //---------------------------------------------
        String[]str={"a","c","b","d"};
        Arrays.sort(str);
        System.out.println(Arrays.binarySearch(str, "b"));
        //----------------------------------------
        //cumle kaç kelime
        String s="java is easy. learn java earn money.";
        String[]words=s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);




    }
}
