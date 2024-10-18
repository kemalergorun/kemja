package miniprojects.miniproject1_EmployeeManagmentSystem;

public class Intern extends Employee {
    private double stipend;
    private int duration;
    public Intern(String name,String id,double stipend,int duration){
        super(name,id);
        this.duration=duration;
        this.stipend=stipend;


    }

    @Override
    public double calculateSalary() {
        if (duration>12||duration<1){
            System.out.println("ınvalid duration");
            System.out.println("num of months worked="+duration);
            return 0;
        }
        return stipend;

    }

    @Override
    public String getDetails() {
        return "intern name= "+getName()+" ID= "+getId()+" stipend ="+calculateSalary();
    }
}
