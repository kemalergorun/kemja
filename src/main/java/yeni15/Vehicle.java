package yeni15;

public class Vehicle {
    //non parametrised cons
    public Vehicle(){
        System.out.println("vehicle constructor");


        }
        public Vehicle(String brand,int price,String engine){
        System.out.println(brand +"," + price+"," + engine);
    }
}
