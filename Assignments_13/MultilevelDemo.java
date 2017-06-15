package corejavaL1;

public class MultilevelDemo
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(0175, 40000, "Sathish Kumar", 8, 05, 2017);
        Person person = employee;
        person.displayDetails();
        Trainee trainee = new Trainee(265180, 25000, "Jaya", 8, 05, 2014, 9.5);
        person = trainee;
        person.displayDetails();
    }
}