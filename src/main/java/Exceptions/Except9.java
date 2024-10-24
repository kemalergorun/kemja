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
        }finally {
            System.out.println("cut the connection");
        }//try only once finally only once
        //catch can use multiple
        //compile time file not found class not found
        //runtime string idex array index out arithmetic
        /*types of Exceptions?
                1. Compile Time Exceptions (Checked Exceptions)
        a. FileNotFoundException
        b. ClassNotFoundException
        2. RunTime Exceptions (UnChecked Exceptions)
        a. StringIndexOutOfBoundException
        b. ArrayIndexOutOfBoundException
        c. ArithmaticException
        d. NumberFormatException
        e. IllegalArgumentsException
       ……..
        To handle exceptions => try catch block
        We can throw exception to stop the application at a given point


         */


    }

}

