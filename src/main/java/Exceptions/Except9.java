package Exceptions;

public class Except9 {
    public static void main(String[] args) {
        //get a character string array
        String[] arr={"java","is","not","easy"};
        int a=12;
        int b=0;

        getElementFromArray(arr,a,b);



    }public static void getElementFromArray(String[]s,int a,int b){
        try {
            int idx=a/b;
            String element=s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index must be in bounds");

        }catch (ArithmeticException e){
            System.out.println("cant divide zero");
        }


    }

}

