package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda4 {
    public static void main(String[] args) {
        List<Integer>myList=new ArrayList<>(Arrays.asList(11,2,24,5,2,11,13));
        System.out.println("myList = " + myList);
        //methodcall

        maxNumber(myList);
        maxNumber1(myList);
        maxNumber2(myList);

    }
    //create a method to find the max number from list
    //1st way
    public static void maxNumber(List<Integer>list){
        System.out.println(list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u));
    }
    //int min value provides minvalue that int can have
    //2. way by using element from stream
    public static void maxNumber1(List<Integer>list){
        System.out.println(list.stream().distinct().reduce(list.get(0), (t, u) -> t > u ? t : u));
    }
    //3.way using sorted
    public static void maxNumber2(List<Integer>list){
        System.out.println(list.stream().distinct().sorted().reduce( (t, u) -> u).get());
    }

    //reduce function can be used without identity element
    //1.option to declare optional data type
    //2.option use get method








}
