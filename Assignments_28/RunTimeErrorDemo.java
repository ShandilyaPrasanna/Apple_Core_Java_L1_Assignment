package corejavaL1;

public class RunTimeErrorDemo
{
    public static void main(String[] args)
    {
        String str = "Wipro";
        Object obj = str;
        String str2 = (String)obj;
        Integer integer = new Integer(10);
        obj = integer;
        Integer i = (Integer)obj;
        str2 = (String)obj;
    }   
}

