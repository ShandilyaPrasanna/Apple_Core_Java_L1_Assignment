package corejavaL1;

public class StaticAndNonStatic
{
    private static int iStatic;
    private char cChoice;
    
    public StaticAndNonStatic(char choice)
    {
        iStatic++;
        cChoice = choice;
    }
    
    public static void displayObjectCount()
    {
        System.out.println("Value of iStatic: "+ iStatic);
    }
    
    public void displayUserChoice()
    {
        System.out.println("The user choice is: "+cChoice);
    }
}


