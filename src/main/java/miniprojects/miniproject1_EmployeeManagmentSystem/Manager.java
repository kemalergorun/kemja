package miniprojects.miniproject1_EmployeeManagmentSystem;

public class Manager extends FullTimeEmployee {


    public Manager(String name, String id, double salary, double bonus,double benefits) {
        super(name, id, salary, bonus,benefits);
    }
    //in multilevel one of subclass must implement abstract methods
    //then all of them implented to the child

    @Override
    public double calculateSalary() {
        return super.calculateSalary()*1.1;

    }

    @Override
    public String getDetails() {
        System.out.println(getName()+" is managing the team");
        return "manager name= "+getName()+" ID= "+getId()+" Total salary ="+calculateSalary();
    }
}
