package Colecti;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        //hash set offer faster performance
        //linked hashset in order and use insertion order
        //order its important but slower
        //student number order and item order
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(23);
        lhs.add(3);
        lhs.add(11);
        lhs.add(6);
        lhs.add(8);
        System.out.println(lhs);//in order
        LinkedHashSet<Integer>lhs2=new LinkedHashSet<>();
        lhs2.add(3);
        lhs2.add(50);
        lhs2.add(65);
        lhs2.add(89);
        lhs2.add(6);
        System.out.println(lhs2);
        System.out.println(lhs.retainAll(lhs2));
        System.out.println(lhs);//retain all method keeps same data
        System.out.println(lhs2);
        lhs.add(null);
        System.out.println(lhs);
        //tree set
        TreeSet<Character>ts=new TreeSet<>();
        ts.add('d');
        ts.add('l');
        ts.add('b');
        ts.add('y');
        System.out.println(ts);
        //tree set dont accept null


    }
}
