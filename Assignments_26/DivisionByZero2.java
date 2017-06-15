package corejavaL1;

class DivisionByZeroException extends Exception
{
    public DivisionByZeroException(String msg)
    {
        super(msg);
    }
}

public class DivisionByZero2
{
    public void division() throws DivisionByZeroException
    {
        int iNumerator = 10;
        int iDenominator = 0;
        if(iDenominator == 0)
        {
            throw new DivisionByZeroException("Divide by Zero");
        }
        System.out.println(iNumerator+"/"+iDenominator+" = "+(iNumerator/iDenominator));
        System.out.println("End of Function");
    }
    
    public static void main(String[] args)
    {
        try
        {
            new DivisionByZero2().division();
        }
        catch (DivisionByZeroException e)
        {
            System.out.println("Error: "+e);
        }
        finally
        {
            System.out.println("End of Main");
        }
    }
}
