package yeni5;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        //ınteger arraylist create
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(22);
        myList.add(5);
        myList.add(39);
        myList.add(14);
        System.out.println("myList = " + myList);
        //number of elements in the list
        int numElements=myList.size();
        System.out.println("numElements = " + numElements);
        //how to get specific element
         int thirdindex=myList.get(2);
        System.out.println("thirdindex = " + thirdindex);
        //replace a specific element
        myList.set(1, 7);
        System.out.println(myList);
        //replace all odd element from list to 10
        //using loops for each first

        for (Integer w:myList){
            if(w%2!=0){
                myList.set(myList.indexOf(w),10);

            }
        }
        System.out.println(myList);
        //even elements with 7
        for (Integer l:myList){
            if (l%2==0){
                myList.set(myList.indexOf(l),7 );

            }

        }
        System.out.println(myList);


    }
}
