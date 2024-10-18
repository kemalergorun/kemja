package CalısmaConstructor;

public class CarRunner {
    public static void main(String[] args) {
        //car class tan obje üretelim
        Car c1=new Car("bmw","x1",2024,true);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);
        c1.hareket();
        c1.dur();
        Car c2=new Car("audi","a5",2019,false);
        System.out.println(c2.brand);
        System.out.println(c2.model);

        //java string okumak için tostring kullanır
        //to string oluşturmak gerekir obje içi için tostring kullanılır
        System.out.println(c1);
        System.out.println(c2);

    }
}
