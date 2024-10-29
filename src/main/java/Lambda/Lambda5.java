package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda5 {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>(Arrays.asList(11,2,24,5,2,11,13));
        System.out.println("myList = " + myList);
        minNumber3(myList);

    }public static void minNumber3(List<Integer>list) {
        System.out.println(list.stream().distinct().reduce((Math::min)).get());

    }





}
