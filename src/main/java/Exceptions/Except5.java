package Exceptions;

public class Except5 {
    public static void main(String[] args) {
        String s="java is not easy";
        int a=20;
        int b=1;
        getChar(s,a,b);
    }
    public static void getChar(String s,int a,int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("index must in bound");
        }


    }}
