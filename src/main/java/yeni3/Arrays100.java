package yeni3;

import java.util.Arrays;

public class Arrays100 {
    public static void main(String[] args) {
        int []numbers=new int[5];
        numbers[1]=12;
        numbers[0]=7;
        numbers[2]=41;
        numbers[4]=88;
        numbers[3]=35;

        System.out.println(Arrays.toString(numbers));
        int firstnum=numbers[0];
        int lastnum=numbers[numbers.length-1];
        System.out.println("sum= "+(firstnum+lastnum));
        Integer numbers1[]=new Integer[5];
        System.out.println(Arrays.toString(numbers1));








    }
}
