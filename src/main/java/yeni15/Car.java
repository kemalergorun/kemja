package yeni15;

public class Car extends Vehicle{

    public Car(){
        this("hi ı am mal");

        System.out.println("h-pack");
    }//passive
    public String model="accord";
    public int year=2022;
    public Car(String type)
    {super("accura",40000,"eco");

        System.out.println("type = " + type);
    }

}
