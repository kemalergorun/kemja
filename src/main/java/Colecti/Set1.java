package Colecti;

import java.util.Arrays;
import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        //sets are used to store uniqe values
        //3 types of sets
        //hashset -linked hashset-treeSet
        //Hashset
        String s="java";
        System.out.println(s.hashCode());
        String ss="java is an interesting";
        System.out.println(ss.hashCode());
        //how to create hashset all collections dont accept primitive

        HashSet<String>hs=new HashSet<>();
        hs.add("mango");
        hs.add("lychee");
        hs.add("fig");
        hs.add("orange");
        hs.add("date");
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);
        Object fruits=hs.clone();//clone method returns shallow copy
        System.out.println(fruits);
        hs.clear();
        System.out.println(hs);
        //extra info about Structure
        HashSet<String>hs1=new HashSet<>(Arrays.asList("t","e","j"));
        System.out.println(hs1);
        //hashset mutable u can add element  but set is immutable
        hs1.add("a");
        System.out.println(hs1);
        //


    }
}
