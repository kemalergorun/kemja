package yeni7;

public class CarRunner {
    public static void main(String[] args) {

        Car a=new Car();
        a.brake();
        a.accelerate();
        System.out.println(a.brand+","+a.engine+","+a.model+","+a.year);

        Car Tesla=new Car("tesla ","s ",2023);
        System.out.print(Tesla.brand);
        System.out.print(Tesla.model);
        System.out.print(Tesla.year);


    }
}
