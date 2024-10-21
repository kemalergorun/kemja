package Colecti;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        //que is data structure fıfo principle are usefull ordered op
        //linked list and priority que implemented
        Queue<String>store=new LinkedList<>();
        store.add("milk");
        store.add("juice");
        store.add("eggs");
        store.add("bread");
        store.add("cheese");
        store.add("vegetables");
        store.add("meat");
        System.out.println(store);
        String firstel=store.remove();
        System.out.println(firstel);
        //returns first element but not remove peek metod returns null if empty
        System.out.println(store.peek());
        //poll first element remove and returns
        System.out.println(store.poll());
        //element  show first but if empty que throw exception
        System.out.println(store.element());
        store.offer("honey");
        store.offer("chips");
        System.out.println(store);


    }
}
