package corejavaL1;

public class Person
{
    private String sName;
    private int iDay, iMonth, iYear;

    public Person(String sName, int iDay, int iMonth, int iYear)
    {
        this.sName = sName;
        this.iDay = iDay;
        this.iMonth = iMonth;
        this.iYear = iYear;
    }
    
    public void displayDetails()
    {
        System.out.println("Name: "+sName);
        System.out.println("DOB: "+iDay+"-"+iMonth+"-"+iYear);
    }
}
