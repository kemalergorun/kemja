package miniprojects.miniproject1_EmployeeManagmentSystem;

public class PartTimeEmployee extends Employee {
    //hoursWorked hourlyRate specific data
    private double hourlyRate;
    private int hoursWork;
    public PartTimeEmployee(String name,String id,double hourlyRate,int hoursWork){
        super(name,id);
        this.hourlyRate=hourlyRate;
        this.hoursWork=hoursWork;


    }


    @Override
    public double calculateSalary() {
        if (hoursWork<1||hoursWork>40){
            System.out.println("invalid number of hours entered");
            return 0;
        }
        return hourlyRate*hoursWork;
    }

    @Override
    public String getDetails() {
        return "parttime employee name= "+getName()+" ID= "+getId()+" Total= "+calculateSalary();
    }
}
