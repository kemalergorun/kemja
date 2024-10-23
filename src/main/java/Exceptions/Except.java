package Exceptions;

public class Except {
    public static void main(String[] args) {
        divide(8,4);
        divide1(8,0);//ArithmeticException
    }
    //throwable class exceptions class father
    //error and exception error cant be fixed
    //runtime exception null pointer index out of bound
    //compile time exception ıo sql except must caught declared recover
    //lets create  method divide
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("division is not possible");
        }else {
            System.out.println("division is successful");
            System.out.println(a / b);
        }
        //if works not recommended

    }

    public static void divide1(int a, int b) {
        try{
            System.out.println(a / b);
            System.out.println("division completed");
        }catch (ArithmeticException e){//e is variable name
            System.out.println("division is not possible");

            System.out.println("kemal is good at java");
        }
        //using try catch handling exceptions
        //try cant be used lonely there can be more catch  block
        //block application

    }


}
