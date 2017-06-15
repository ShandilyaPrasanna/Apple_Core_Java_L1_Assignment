package corejavaL1;

public class Trainee extends Employee
{
    private double gradePointAverage;

    public Trainee(int iEmpNo, double dSalary, String sName, int iDay, int iMonth, int iYear, double gradePoint)
    {
        super(iEmpNo, dSalary, sName, iDay, iMonth, iYear);
        this.gradePointAverage = gradePoint;
    }
    
  //  @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Grade Points: "+gradePointAverage);
    }
}

