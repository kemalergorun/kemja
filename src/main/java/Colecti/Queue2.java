package Colecti;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {
        //prıorıty order
        //fıfo highest priority object handled
        //highest urgency treated first
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


    }
}
