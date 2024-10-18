package miniprojects.miniproject1_EmployeeManagmentSystem;

public class Runner {
    public static void main(String[] args) {
        FullTimeEmployee firstfull=new FullTimeEmployee("kemal","k888",1000,100,50);
        System.out.println(firstfull.getDetails());

        PartTimeEmployee partFirst=new PartTimeEmployee("betül","b777",18.90,32);
        System.out.println(partFirst.getDetails());

        Intern firstIntern=new Intern("ceylin","c666",243.60,11);
        System.out.println(firstIntern.getDetails());
        Manager firstManager=new Manager("tamer","t555",1000,100,50);
        System.out.println(firstManager.getDetails());


    }
}
