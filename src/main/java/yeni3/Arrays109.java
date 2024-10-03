package yeni3;

import java.util.Arrays;

public class Arrays109 {
    public static void main(String[] args) {
        String letter[]={"G","A","O","M","Y"};
        Arrays.sort(letter);
        System.out.println(Arrays.toString(letter));
        int indexofM=Arrays.binarySearch(letter,"M");
        System.out.println(indexofM);
        //---------------------------------
        String str="Java is fun.Learn Java, earn money";
        //split string to array

        String word[]=str.split(" ");

        System.out.println(Arrays.toString(word));
        System.out.println(word.length);
        //-------------------------------------------













    }
}
