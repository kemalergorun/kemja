package Colecti;

import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        //
        HashMap<String,Integer>stdAges=new HashMap<>();
        stdAges.put("ali",19);
        stdAges.put("asye",21);
        stdAges.put("veli",22);
        stdAges.put("fatma",19);
        stdAges.put("meryem",25);
        System.out.println(stdAges);
        //adding null multiple nulls we cant add to key, but we can value
        stdAges.put(null,18);
        System.out.println(stdAges);
        //as value
        stdAges.put("hasan",null);
        stdAges.put("ke",null);
        System.out.println(stdAges);
        //replace update using keys
        stdAges.replace("ali",21);
        System.out.println(stdAges);
        stdAges.replace("asye",21,23);
        System.out.println(stdAges);
        //checks if key exists or not then add
        stdAges.putIfAbsent("arda",35);
        System.out.println(stdAges);
        //get or default does not exist and return default number
        System.out.println(stdAges.get("asye"));
        stdAges.getOrDefault("mikail",-1);
        //remove
        stdAges.remove("ke");
        stdAges.remove("hasan",null);
        System.out.println(stdAges);
        //



    }
}
