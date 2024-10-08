package yeni5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist5 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);
        //remove
        list.remove(1);
        //get
        System.out.println(list.get(2));
        //set
        System.out.println(list.set(0, 16));
        //updated
        System.out.println("list = " + list);
        //create a list
        List<Integer>newList= Arrays.asList(12,8,15,3);
        System.out.println("newList = " + newList);


    }
}
