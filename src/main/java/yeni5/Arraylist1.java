package yeni5;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        //how to create arraylst
        ArrayList<Integer> ages=new ArrayList<>();
        //adding elements to arraylist
        ages.add(4);
        ages.add(9);
        ages.add(6);
        System.out.println("ages = " + ages);
        ages.add(1,21);
        ages.add(3,15);
        System.out.println("ages = " + ages);
        ages.add(10);
        System.out.println("ages = " + ages);
        ages.addFirst(1);
        System.out.println("ages = " + ages);
        ArrayList<Integer> grades= new ArrayList<>();
        grades.add(45);
        grades.add(70);
        grades.add(85);
        System.out.println("grades = " + grades);
        ages.addAll(grades);
        System.out.println("ages = " + ages);
        ages.addAll(3,grades);
        System.out.println("ages = " + ages);


    }
}
