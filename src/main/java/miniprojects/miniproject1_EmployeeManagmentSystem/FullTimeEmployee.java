package miniprojects.miniproject1_EmployeeManagmentSystem;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double benefits;
    public FullTimeEmployee(String name,String id,double salary,double bonus,double benefits){
        super(name,id);
        this.benefits=benefits;
        this.bonus=bonus;
        this.salary=salary;

    }

    @Override
    public double calculateSalary() {
        return salary+bonus+benefits;
    }

    @Override
    public String getDetails() {
        return "Full time employee name: " +getName() +" ID: "+getId()+" Total salary: "+calculateSalary();
    }
}
