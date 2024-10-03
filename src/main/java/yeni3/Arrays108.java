package yeni3;

import java.util.Arrays;

public class Arrays108 {
    public static void main(String[] args) {
        //two arrays equal
        int[] a={3,6,8};
        int[] b={3,8,6};
        boolean check=a.equals(b);
        System.out.println(check);
        //----------------------------------
        int number[]={-4,-8,5,12,-1};
        System.out.println(Arrays.toString(number));
        for (int w:number){
            if (w<5){
                System.out.println(w);

            }

        }
        //-------------------------------------------------
        //binary search always use after sorting
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 12));
        System.out.println(Arrays.binarySearch(number, 9));
        //------------------------------------------------------



    }
}
