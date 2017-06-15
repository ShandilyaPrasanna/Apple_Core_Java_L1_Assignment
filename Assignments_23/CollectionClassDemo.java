package corejavaL1;


import java.util.*;

public class CollectionClassDemo
{
    public static void main(String[] args)
    {
        if(args.length != 10)
        {
            System.out.println("Enter only 10 Number as argument");
            return;
        }
        List<Double> list = new ArrayList<>();
        for(String arg : args)
        {
            try
            {
                list.add(Double.valueOf(arg));
            }
            catch (NumberFormatException e)
            {
                System.out.println("please enter only Numbers!");
            }
        }
        Collections.reverse(list);
        for(Double ans: list)
        {
            System.out.print(" "+ans);
        }
        System.out.println();
    }
}
