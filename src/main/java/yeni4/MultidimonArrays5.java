package yeni4;

import java.util.Arrays;

public class MultidimonArrays5 {
    public static void main(String[] args) {
        //S
        int arr[][]={{4,7},{-9,4,8},{15,36,12,9},{67,23,88}};
        int max=arr[0][0];

       for(int[]outer:arr){
           for (int each:outer){
               max=Math.max(each,max);

           }


       }System.out.println("max = " + max);
        

    }

}
