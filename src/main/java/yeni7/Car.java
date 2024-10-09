package yeni7;

public class Car {
    //classes are like templates blueprints to create objects
    //dataclass create activ and passive characters
    //parameter cons public car(String brand)
    public Car(){}
    String brand ="toyota";
    String model ="auris";
    int year=2021;
    int price= 20000;
    String engine="hybrid";
    boolean aircondition=true;
    boolean sunroof=false;
    //active character methods
    public void accelerate(){
        System.out.println(brand +"reaches upto 120km in 5 seconds");

    }
    public void brake(){
        System.out.println(brand +"brakes in 2 seconds");
    }




    public Car (String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;

    }




}
