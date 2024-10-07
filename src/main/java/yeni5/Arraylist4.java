package yeni5;

import java.util.ArrayList;
import java.util.List;

public class Arraylist4 {
    public static void main(String[] args) {
        //if there is any element and space
        //array class list interface
        List<String> list1=new ArrayList<>();
        System.out.println("list1 = " + list1);
        list1.add(" ");
        list1.add(" ");
        list1.add(" ");
        System.out.println("list1 = " + list1);
        //removeall is remowe multiple elements checking condition
        List<String>list2=new ArrayList<>();
        list2.add(" ");
        list1.removeAll(list2);
        System.out.println(list1);
        if (list1.isEmpty()){
           System.out.println( "the list is empty");

        }else{
            System.out.println("the list is not empty");
        }


}}



