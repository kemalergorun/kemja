package yeni12;

public class InstanceBlock1 {
    public int year;//instance
    //original

    public InstanceBlock1(){

        System.out.println("hello kemal");

    }
    //parameterised constructor
    public InstanceBlock1(int year){
        System.out.println("hello kemal");
        this.year=year;
        System.out.println(year);
    }
    public int price;
    public String colour;
    public String fuelType;
    public String brand;
    public String model;
    public String airCond;
    {
        System.out.print(price = 60000 );
        System.out.print(colour = " black");
        System.out.print(fuelType = " diesel");
        System.out.print(brand = " honda");
        System.out.print(model = " accord");
        System.out.print(airCond = " false");
    }
    public InstanceBlock1(int year, int price, String colour, String fuelType, String brand, String model, String airCond) {
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
        this.airCond = airCond;
    }
    {
        System.out.print(" ben babayım  ");
    }

    public static void main(String[] args) {
        InstanceBlock1 obj1=new InstanceBlock1();
        InstanceBlock1 obj2=new InstanceBlock1(2022);

        InstanceBlock1 obj3=new InstanceBlock1(2024,50000,"red","oil","pego","407","true");

        System.out.println(obj3.colour);

    }//instance block first
    //constructor next
    //other variables and methods run third
    //instance block run in order






}
