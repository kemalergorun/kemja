package yeni4;

import java.util.Arrays;

public class MultidimonArrays2 {
    public static void main(String[] args) {
        //crete int multidimen
        //calculate its min max value
        //get total min and max
        int[][] numbers={{24,5},{2,66,12},{32,95,56,9}};
       // System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        int min=numbers[0][0];
        int max=numbers[0][0];
        for (int[] outer:numbers){
            for (int each:outer){
              min= Math.min(min,each);
               max=Math.max(max,each);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int sum=max+min;
        System.out.println("sum = " + sum);
        //-------------------------------------
        //find sum of each
        int sum1=0;
        for (int[]outer:numbers){

        }



    }

}
