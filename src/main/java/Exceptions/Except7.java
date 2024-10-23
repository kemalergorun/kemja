package Exceptions;

public class Except7 {
    public static void main(String[] args) {
        //print if the given age valid
        printAge(12);
        printAge(2);//ıllegal argument thrown
        try {
            printAge(-5);
        }catch (IllegalArgumentException e){
            System.out.println("what kind of age");
        }
    }
    public static void printAge(int age){
        if (age<=0){
            throw new IllegalArgumentException("age cant be less then 0");


        }else {
            System.out.println(age);
        }
    }
}
