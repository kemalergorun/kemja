package yeni4;

import java.util.Arrays;

public class MultidimonArrays {
    public static void main(String[] args) {
        //vreate multıdımen 3 raws and flex col string concat all elem
        String [][] arr={
                {"Java","is","a","programming","language"} ,
                {"i","love","Java."},
                {"just","kidding!!"}};

        System.out.println(Arrays.deepToString(arr));
        String result="";

        for (String[] outerArray:arr){
            for (String eachElement:outerArray){
               // System.out.println("eachElement = " + eachElement);
                result+=(eachElement);

            }



          //  System.out.println(Arrays.deepToString(outerArray));
        }System.out.println("result = " + result);



    }

}
