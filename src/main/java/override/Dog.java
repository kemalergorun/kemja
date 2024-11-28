package override;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("dogs bark");
    }
    @Override
    public void eat(){
        System.out.println("dogs always eat");
    }
    @Override
    public Animal create(){
        return new Dog();
    }

    @Override
    public int add(int a, int b) {
        return a+b;//int değişmez parent child ilişkisi yok
    }

    @Override
    public Integer carpma(Integer a, Integer b) {
        Integer sonuc=super.carpma(a,b);
        //ek işlevsellik
        return sonuc +10;
    }





}
