package Colecti;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        //maps are not collections
        //tree map ---sorted map--map
        //hashmap-linked-hashmap-
        //hashcode-key-value keys are unique
        //value can be duplicated
        //hashcode are unique
        //keys are unique and same datatypes
        //values can be different data types
        //every element call entry
        //entry set all of them
        //maps are not collection hashmap in random order superfast
        //keys are using set
        //HASHMAP*******
        HashMap<String,Integer>myMap=new HashMap<>();
        myMap.put("tom cruise",67);
        myMap.put("john travolta",60);
        myMap.put("mat damon",49);
        myMap.put("george clooney",56);
        myMap.put("keria knigty",32);
        myMap.put("kıvanç",36);
        myMap.put("ann hathway",41);
        System.out.println(myMap);
        System.out.println(myMap.values());
        System.out.println(myMap.keySet());
        Set<String>keys=myMap.keySet();
        System.out.println(keys);
        Collection<Integer>values=myMap.values();
        System.out.println(values);
        //get metod returns its value
        //can we get key value pair one by one from
        for (String w:keys){
            System.out.print(w);
        }
        //values
        for (Integer w:values){
            System.out.print(w);
        }//entry
        for (Map.Entry<String,Integer>w: myMap.entrySet()){
            System.out.print(w);
        }



    }
}
