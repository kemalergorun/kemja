package Exceptions;

public class Except2 {
    public static void main(String[] args) {
        //convert the given String to int
        String s="1234";
        convertStringToInt(s);
        String s2="123abc87";
        convertStringToInt(s2);

    }
    public static void convertStringToInt(String s){
        try {
            int numbers=Integer.valueOf(s);
            System.out.println(numbers);

        }catch (NumberFormatException e){
            System.out.println("letters cant be int");
            System.out.println(e.getMessage());
        }
        System.out.println("everything good");




    }
}
