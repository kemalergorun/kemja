package yeni16;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
        //inherited
        dog1.eat();
        dog1.drink();
        dog1.feed();

        Cat cat1=new Cat();
        cat1.meow();
        //inh
        cat1.drink();
        cat1.eat();
        cat1.feed();

    }
}
