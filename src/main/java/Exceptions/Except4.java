package Exceptions;

public class Except4 {
    public static void main(String[] args) {
        //get a character string array
        String[] arr={"j","a","v","a"};
        getElementFromArray(arr,2);
        getElementFromArray(arr,4);


    }public static void getElementFromArray(String[]s,int idx){
        try {
            String element=s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index must be in bounds");

        }


    }

}
