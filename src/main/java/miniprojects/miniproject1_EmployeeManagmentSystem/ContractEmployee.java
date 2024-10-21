package miniprojects.miniproject1_EmployeeManagmentSystem;

public class ContractEmployee extends Employee {
    private int contractLength;
    private double contractRate;

    public ContractEmployee(String name,String id,double contractRate,int contractLength){
        super(name,id);
        this.contractLength=contractLength;
        this.contractRate=contractRate;

    }


    @Override
    public double calculateSalary() {
        if (contractLength<1||contractLength>24){
            System.out.println("invalid contractLength");
            System.out.println("num of months worked:" + contractLength);
            return 0;

        }
        return contractLength*contractRate;
    }

    @Override
    public String getDetails() {
        return "Contract employee name "+getName()+"ID"+getId()+"Salary"+calculateSalary();
    }
}
