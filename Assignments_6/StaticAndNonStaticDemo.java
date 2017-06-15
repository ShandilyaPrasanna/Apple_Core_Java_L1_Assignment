package corejavaL1;

public class StaticAndNonStaticDemo
{
   
    public static void main(String[] args)
    {
        System.out.println("Before Creating Objects");
        StaticAndNonStatic.displayObjectCount();
        System.out.println("");
        System.out.println("After Creating Objects");
        StaticAndNonStatic object = new StaticAndNonStatic('N');
        StaticAndNonStatic.displayObjectCount();
        object.displayUserChoice();
    }
}
