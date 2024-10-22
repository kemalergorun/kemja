package Colecti;

import java.util.*;

public class Queue2 {
    public static void main(String[] args) {
        //prıorıty order
        //fıfo the highest priority object handled
        //highest urgency treated first
        //deque fifo and lifo double ended browser history
        PriorityQueue<String>emergencyq=new PriorityQueue<>();
        emergencyq.add("bouka");
        emergencyq.add("saima");
        emergencyq.add("shukrullah");
        emergencyq.add("ali");
        emergencyq.add("kemal");
        emergencyq.add("pelin");
        emergencyq.add("hulya");

        System.out.println(emergencyq);
        Deque<String>stdlist=new LinkedList<>();
        stdlist.add("bouka");
        stdlist.add("saima");
        stdlist.add("shukrullah");
        stdlist.add("ali");
        stdlist.add("kemal");
        stdlist.add("pelin");
        stdlist.add("hulya");
        System.out.println(stdlist);
        stdlist.addFirst("ceylin");
        stdlist.addFirst("ceylin");
        System.out.println(stdlist);
        //addlast
        stdlist.addLast("betül");
        System.out.println(stdlist);
        //remove, remove first, remove last
        //remove first occurrence and last occurrence
        //push adding first place, offer last place
        //how to get data from deque one by one
        //for(String w:stdlist){
           // System.out.println(w);
            //----------------------------------------
            //array deque is dynamic ideal for add removal ops
            Deque<String>furnitureTruck=new ArrayDeque<>();
            furnitureTruck.add("sofa");
            furnitureTruck.add("bed");
            furnitureTruck.add("chair");
            furnitureTruck.add("coffee table");
            furnitureTruck.add("dining table");
            System.out.println(furnitureTruck);
            //insertion order
        furnitureTruck.addLast("tv");
        furnitureTruck.addFirst("chair");
        System.out.println(furnitureTruck);


    }


    }

