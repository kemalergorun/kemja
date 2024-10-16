package yeni19;

public class AudiA5 implements Brake,Engine,AirCond{

    @Override
    public void abs() {
        System.out.println("Audi use abs");
    }

    @Override
    public void esp(int a) {
        System.out.println("esp is here");
    }

    @Override
    public void eco() {
        System.out.println("audi has got eco");
    }

    @Override
    public void turbo() {
        System.out.println("audi has got turbo");

    }

    @Override
    public void digital() {
        System.out.println("audi has got digital");
    }

    @Override
    public void run() {

        System.out.println("audi brakes 25 km/h");
    }
}
