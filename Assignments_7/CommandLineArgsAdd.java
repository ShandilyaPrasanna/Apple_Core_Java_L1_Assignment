package corejavaL1;

public class CommandLineArgsAdd
{
    public static void main(String[] args)
    {
        if(args.length < 2 || args.length > 2)
        {
            System.out.println("Invalid no. of Arguments");
            return;
        }
        double n1 = Double.valueOf(args[0]);
        double n2 = Double.valueOf(args[1]);
        System.out.println(n1+n2);
    }
}

