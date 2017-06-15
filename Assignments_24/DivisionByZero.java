package corejavaL1;

public class DivisionByZero {
	public void division(){
		int iNumber=10;
		int iDenominator =0;
		try{
			System.out.println(iNumber+"/"+iDenominator+"="+(iNumber/iDenominator));
			System.out.println("After Exception");
		}catch(NullPointerException ne){
			System.out.println("Nullpointer Exception::+ne");
		}catch(ArithmeticException ae){
			System.out.println("Division by zero error"+ae);
		}
		finally
		{
			System.out.println("After handling Exception");
		}
		System.out.println("Happy Learing");
	}
	public static void main(String args[]){
		new DivisionByZero().division();
		System.out.println("End of the main");
	}
}
