package yeni19;

public class RunnerCla {
    public static void main(String[] args) {
        AudiA5 A5n=new AudiA5();
        A5n.abs();
        A5n.eco();
        A5n.digital();
        A5n.turbo();
        A5n.esp(6);
        A5n.run();
        //implements from interface
        //so implement cant override methods
        //interface has no constructor
        //but abstract got

        Brake.speed();
        A5n.power();
        //we cant update variables interface cause final
        //********
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("AirCond.price = " + AirCond.price);

    }
}
