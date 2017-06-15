package corejavaL1;

import java.util.Scanner;
public class MathOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:;");
		double n=scan.nextDouble();
	System.out.println("Absolute value of number is" +Math.abs(n));
	System.out.println("Rounded value of number is"+Math.round(n));
	System.out.println("Square root of number is"+Math.sqrt(n));
	}

}

