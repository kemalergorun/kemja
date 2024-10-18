package CalısmaConstructor;

public class CarRunner {
    public static void main(String[] args) {
        //car class tan obje üretelim
        Car c1=new Car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);
        c1.hareket();
        c1.dur();


    }
}
