package yeni12;

public class InstanceBlock2 {
//static block is used to initialise static variables
    //instance variables non static variables
    //static variables are class property and it can reach trough class name
    //static block runs once the class is loaded in the memory
    //static{} block this
    public static double pi;
    static {
        System.out.println(pi = 3.14);
        System.out.println("static is executed");
    }
    //constructor
    public InstanceBlock2(){
        System.out.println("constructor run");
    }

    public static void main(String[] args) {
        System.out.println("main method run");
        InstanceBlock2 obj=new InstanceBlock2();

        //jvm makes clss to ready
        //1main method 2methods and variables
        //


    }












}
