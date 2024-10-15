package yeni16;

public class Cat extends Mammals{
    @Override
    public void feed() {
        System.out.println("cats hate milk");
    }

    public  void meow(){
    System.out.println("cat meow");

}

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void drink() {
        System.out.println("cat drink cola");
    }

    @Override
    public Animal create() {
        System.out.println("cat object creating");
        return new Cat();
    }
}



