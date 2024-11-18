package AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {
        List objectList=new ArrayList<>();
        objectList.add("kemal");
        objectList.add(123);
        String string=(String) objectList.get(0);
        Integer integer=(Integer) objectList.get(1);
        System.out.println(string);
        System.out.println(integer);
    }
}
