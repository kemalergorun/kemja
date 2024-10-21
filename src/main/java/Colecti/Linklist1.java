package Colecti;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linklist1 {
    public static void main(String[] args) {
        LinkedList<String>list1=new LinkedList<>(Arrays.asList("earth","moon","mars"));
        System.out.println(list1);
        list1.add("jupiyer");
        //arrays as list create fixed length array linkled list mutable
        //and link create empty list then copy these
        System.out.println(list1);
        LinkedList<String>list2=new LinkedList<>(List.of("Earth","moon"));
        System.out.println(list2);
        //
        list2.add("mercury");
        System.out.println(list2);
        List<String>list3=List.of("neptune","pluton");
        System.out.println(list3);
        //list of method is immutable
        //poll method removes return first element not thro exception list empty
        //*****
        System.out.println(list1.poll());
        System.out.println(list1);

        //element method retrieves the first element but not remove
        //****
        System.out.println(list1.element());
        System.out.println(list1);

        //pop method removes return first element on empty list exception thr
        System.out.println(list1.pop());
        System.out.println(list1);

        //clear method is clearing all elements
        list1.clear();
        System.out.println(list1);


    }
}
