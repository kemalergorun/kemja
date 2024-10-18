package miniprojects.miniproject1_EmployeeManagmentSystem;

public abstract class Employee {
    private String name;
    private String id;
    protected double salary;//child classes can reach protected
    public Employee(String name,String id){
        this.name=name;
        this.id=id;
        //salary method abstract it must implement
        }
        public abstract double calculateSalary();
    //getters to read the private values
    public String getName(){
        return name;

    }
    public String getId(){
        return id;

    }
    //abstract method to display all methods
    public abstract String getDetails();



}
