package yeni3;

import java.util.Arrays;

public class Arrays110 {
    public static void main(String[] args) {
        // move all zeros to end
        int []arr={0,2,5,0,12,17,0,0,21};
        System.out.println(Arrays.toString(arr));
        int []brr=new int[arr.length];
        int inde=0;
        for (int w:arr){
            if(w!=0){
                brr[inde]=w;
                inde++;




            }
           // System.out.println(Arrays.toString(brr));
        }

        System.out.println(Arrays.toString(brr));



    }
}
