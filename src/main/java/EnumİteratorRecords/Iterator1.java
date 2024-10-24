package EnumİteratorRecords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("apple");
        myList.add("cherry");
        myList.add("orange");
        myList.add("fig");
        System.out.println(myList);
        //update
        //for (String w:myList){
           // System.out.println(w + "s");

       Iterator<String>myIter= myList.iterator();
        while (myIter.hasNext()){
            myIter.next();
            myIter.remove();
            //add op not allowed

        }
        System.out.println(myList);
        /*
         1- Iterators do the same job as loops
        2) There's no risk of an infinite loop with iterators (like with for-each)
        3) There is no performance difference between iterators and loops
        4) Iterators are more successful when it comes to removing elements from a collection
            or modifying an element within a collection
        5) There are two types of iterators:
            a) Iterator => This is only used for element removal; adding new elements or changing an element is not possible
            b) ListIterator => This can remove, add, and modify elements

            Note:
            The Iterator only works from left to right (from the first element to the last)
            ListIterator are Bi-directional => can work in both directions (goes Next and get back to Previous)

         */





            }
        }




