package corejavaL1;

class DivisionByZero1
{
    public void division()
    {
        int iNumerator = 10;
        int iDenominator = 0;
        try
        {
            System.err.println(iNumerator+"/"+iDenominator+" = "+(iNumerator/iDenominator));
            System.out.println("After Exception");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer Error");
        }
        finally
        {
            System.out.println("End of Finally Block");
        }
        System.out.println("After Exception Handler");
    }
    
    public static void main(String[] args)
    {
        new DivisionByZero1().division();
        System.out.println("End of Main");
    }
}
