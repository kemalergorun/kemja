package Exceptions;

public class Except3 {
    public static void main(String[] args) {
        String s="java is easy";
        getChar(s,0);
        getChar(s,12);


    }
    //get specific characters from string
    public static void getChar(String s,int idx){
        try {
            char ch=s.charAt(idx);
            System.out.println("ch = " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index is not in bounds");
            System.err.println("dont use index out of bounds");
            e.printStackTrace();//when developers want to see exception
            System.out.println("hello");
        }

    }




}
