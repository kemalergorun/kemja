package Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        //filter work as if statements
        //we use for each to write each element
        //map function updates elements in stream after math ops

        List<Integer> nums=new ArrayList<>(Arrays.asList(3,5,2,6,11));
        System.out.print(nums);
        System.out.println("---------------------");
        printSquare(nums);
        System.out.println("---------------------------");
        printOddcube(nums);
        System.out.println("-------------------------,");

        List<Integer>nums2=new ArrayList<>(Arrays.asList(7,3,5,2,5,6,11,7));
        System.out.println(nums2);
        removeDuplicates(nums2);


    }
    //create a method to print square of each element
    public static void printSquare(List<Integer>list){
        list.stream().map(t->t*t).forEach(t-> System.out.println(t));

    }
    //create a method to print cube of odd elements
    public static void printOddcube(List<Integer>list){
        list.stream().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.println(t));
    }
//
    public static void removeDuplicates(List<Integer>list){
        list.stream().distinct().forEach(t-> System.out.println(t));
    }




}
