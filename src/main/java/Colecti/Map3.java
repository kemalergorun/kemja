package Colecti;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map3 {
    public static void main(String[] args) {
        //hash table hash tree
        Hashtable<String,Integer>stdGrades=new Hashtable<>();
        stdGrades.put("ali",94);
        stdGrades.put("aisha",96);
        stdGrades.put("veli",90);
        stdGrades.put("kemal",95);
        stdGrades.put("mert",94);
        stdGrades.put("hulya",94);
        System.out.println(stdGrades);
        //we cant add null hashtables
        //in order tables run
        //not thread safe and syncronized

        TreeMap<String,String>capitals=new TreeMap<>();
        //we cant use null key but value we can
        capitals.put("uk","london");
        capitals.put("turkiye","ankara");
        capitals.put("uae","abu dabi");
        capitals.put("spain","madrid");
        capitals.put("germany","berlin");
        System.out.println(capitals);
        capitals.put("ıtaly","null");
        System.out.println(capitals);
        //linked hashmap is in order and insertion order
        Set<Map.Entry<String,String>>allEntries=capitals.entrySet();
        System.out.println(allEntries);
        for (Map.Entry<String,String>w:allEntries){
            String key= w.getKey();
            String value= w.getValue();
            System.out.print(value);
        }

        /*
        Homework: Interview Question
        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}


         */
            }
        }


