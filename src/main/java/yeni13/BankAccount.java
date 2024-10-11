package yeni13;

public class BankAccount {
    //order of execution*********************
    //instance variables
    public String ownerName;
    public int accountNumb;
    public double balance;

    //static variable
    public static int accountCount=0;
    // instance block
    {
        this.accountNumb=++accountCount;//pre increment
        this.balance=100;//
        System.out.println("instance block is executed");

    }
    //static block
    static {
        accountCount=1000;
        System.out.println("static block executed");}

    //constructor
    public BankAccount(String ownerName){
        this.ownerName=ownerName;
            System.out.println("constructor is executed");

        }

    public void displayAccount() {

        System.out.println(balance);
        System.out.println(accountNumb);
        System.out.println(ownerName);
    }




    public static void main(String[] args) {
        BankAccount obj1=new BankAccount("kemal");

        obj1.displayAccount();
        BankAccount obj2=new BankAccount("ceylin");
        obj2.displayAccount();

    }
    }







