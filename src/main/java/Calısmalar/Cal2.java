package Calısmalar;

import java.util.Arrays;

public class Cal2 {
    public static void main(String[] args) {
        //iki boyutlu arrayi teke çevir
        int[][]num={{5,4},{2,3,2}};
        //iki boyutlu array kaç eleman olduğunu bul
        //tek boyutlu array eleman sayısına göre oluştur
        //iki boyutlu daki teke geçir
        int sum=0;

        for (int[]w:num){
            sum=sum+ w.length;
        }
        System.out.println(sum);
        int[]newArr=new int[sum];
        int idx=0;

        for (int[]w:num){
            for (int k:w){
                newArr[idx]=k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(newArr));


    }
}
