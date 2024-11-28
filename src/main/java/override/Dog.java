package override;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("dogs bark");
    }
    @Override
    public void eat(){
        System.out.println("dogs  eat");
    }



}
