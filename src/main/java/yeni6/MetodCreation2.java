package yeni6;

public class MetodCreation2 {
    public static void main(String[] args) {
       //access modifiers
        //public everyone access
        //protected -across packages to relationship inheritence

        //default-same package access(package private)
        //private-only class access

        multiply(2,4,7);
        addAndmultiply(3,4,5);
        printText("crazy");







    }
    //multiply metod
    public static int multiply(int a,int b,int c){
        int result=a*b*c;
        System.out.println("result = " + result);
        return result;

    }
     private static int addAndmultiply(int a,int b,int c){
        int result=a*b+c;
        System.out.println("result = " + result);
        return result;

    }
    protected static void printText(String s){
        System.out.println("s = " + s);
    }






}
