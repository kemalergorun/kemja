package Exceptions;

public class Except6 {
    public static void main(String[] args) {
        //count the number of characters
        String s="java is not easy.";
        numOfChars(s);
        String s2=null;
        numOfChars(s2);

    }public static void numOfChars(String s){
        try {
            int length=s.length();
        System.out.println("length = " + length);

    }catch (NullPointerException e){
            System.err.println("\"cant count length of null\" = " + "cant count length of null");
        }


}}
