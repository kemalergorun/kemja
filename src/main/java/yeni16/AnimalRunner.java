package yeni16;

public class AnimalRunner {
    public static void main(String[] args) {
       Animal.price=95;
       //we cant update final or override





        Dog dog1=new Dog();
        System.out.println(dog1.price);
        dog1.bark();
        //inherited
        dog1.eat();
        dog1.drink();
        dog1.feed();
        dog1.create();


        Cat cat1=new Cat();
        cat1.meow();
        //inh
        cat1.drink();
        cat1.eat();
        cat1.feed();
        cat1.create();


    }
}
