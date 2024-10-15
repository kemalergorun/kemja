package yeni16;

public class Dog extends Mammals {
    public void bark() {
        System.out.println("dogs bark");

    }

    @Override//is used to this method over riden from pAREnt
    public void feed() {
        System.out.println("dogs like milk too");
    }

    @Override
    public void eat() {
        System.out.println("dog eat meat");
    }

    @Override
    public void drink() {
        System.out.println("dog drink water");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Animal create() {
        System.out.println("allows dog object");
        return new Dog();
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}




