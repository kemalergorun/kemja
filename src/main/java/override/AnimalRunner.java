package override;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.feedWMilk();
        d.eat();
        d.drink();
        //bird
        Bird b=new Bird();
        b.tweet();
        b.drink();
        b.eat();
        //single inheritance vardır multiple inheritance olmaz
        //birden fazla child ile oluşturulursa hierarchical inheritance
        //multilevel inheritance vardır parent ve grandparent var
        //object ata class tır
        //child parent ın private özelliklerini kullanamaz
        //parent tan child a( has a )yukardan aşağı
        //child parenta (is a) aşağıdan yukarı

        Cat c=new Cat();
        c.feedWMilk();




    }
}
