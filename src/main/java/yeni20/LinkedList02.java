package yeni20;

import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args) {
        //if the name got 4 than characters move all
        LinkedList<String> names = new LinkedList<>();
        names.add("ali");
        names.add("tom");
        names.add("alexander");
        names.add("asye");
        names.add("kemal");
        names.add("emily");

        System.out.println("names = " + names);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 4) {
                names.remove(names.get(i));
                i--;
            }
            System.out.println("names = " + names);

        }


    }}



