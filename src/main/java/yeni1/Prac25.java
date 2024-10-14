package yeni1;

import java.util.Arrays;

public class Prac25 {
    public static void main(String[] args) {
        //0,2,3,0,12,0
       // sıfırları sona yazdır
        int[]arr={0,2,3,0,12,0};
        int[] newArr=new int[arr.length];
        int ilkIndex=0;
        for (int w:arr){
            if (w!=0){
                newArr[ilkIndex]=w;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
