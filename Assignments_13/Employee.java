package corejavaL1;

public class Employee extends Person
{
    private int iEmpNo;
    private double dSalary;

    public Employee(int iEmpNo, double dSalary, String sName, int iDay, int iMonth, int iYear)
    {
        super(sName, iDay, iMonth, iYear);
        this.iEmpNo = iEmpNo;
        this.dSalary = dSalary;
    }
    
  //  @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("EmpNo: "+iEmpNo);
        System.out.println("Salary: "+dSalary);
    }
    
    public static void main(String[] args)
    {
        Person person = new Person("Sanjay", 10, 11, 1967);
        person.displayDetails();
        Employee employee = new Employee(111, 48000, "Dennis", 21, 03, 2001);
        employee.displayDetails();
        person=employee;
        person.displayDetails();
    }
}
