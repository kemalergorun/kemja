package yeni5;

import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        //create a character arraylist wit duplicate values.transfer uniq
        //values into new arraylist
        ArrayList<Character> a=new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('a');
        a.add('v');
        a.add('a');
        System.out.println("a = " + a);
        ArrayList<Character> b=new ArrayList<>();
        for (Character w:a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println("b = " + b);
        //create a string arraylist for cities and remove that contains u
        ArrayList<String>cities=new ArrayList<>();
        cities.add("dubai");
        cities.add("london");
        cities.add("baku");
        cities.add("izmir");
        cities.add("istanbul");
        cities.add("zurich");
        System.out.println("cities = " + cities);


        for ( int i=0;i< cities.size();i++){
            if (cities.get(i).contains("u")){
                cities.remove(i);
                i--;
            }
        }
        System.out.println("cities = " + cities);


    }
}
