package corejavaL1;

public class StringDemo
{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.out.println("Enter only two arguments");
            return;
        }
        int n = 0;
        char nNChar[] = args[0].toCharArray();
        n = count(nNChar);
        nNChar = args[1].toCharArray();
        n += count(nNChar);
        
        args[0] = args[0].replaceAll("w", "T");
        args[1] = args[1].replaceAll("w", "T");
        args[0] = args[0].replaceAll("W", "T");
        args[1] = args[1].replaceAll("W", "T");
        
        args[0] = args[0].toUpperCase();
        args[1] = args[1].toUpperCase();
        
        System.out.println(args[0]+args[1]);
    }
    
    public static int count(char []ch)
    {
        int num = 0;
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] == 'W' || ch[i] == 'n')
            {
               num++; 
            }
        }
        return num;
    }
}
