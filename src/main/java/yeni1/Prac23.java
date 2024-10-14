package yeni1;

import java.util.Arrays;

public class Prac23 {
    public static void main(String[] args) {
        //int ages 6 tane eleman gir en kucuk ve buyuğu topla
        int[]ages=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));
        //sırala
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        //System.out.println(ages[0] + ages[ages.length - 1]);
        //min max bulma math class
        int minimum=ages[0];
        int maximum=ages[0];

        for (int w:ages){
             minimum=Math.min(w,minimum);
        }
        System.out.println(minimum);
        for (int w:ages){
            maximum=Math.max(w,maximum);
        }
        System.out.println(maximum);
        System.out.println( maximum + minimum);


    }



}
