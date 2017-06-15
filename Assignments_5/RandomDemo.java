package corejavaL1;

public class RandomDemo {
		public static void main(String[] args){
			double number = Math.random();
			System.out.println("Random number is::"+number);
			//Using if -else 
		if(number < 0.5){
			System.out.println("Tha value is less than 0.5 using if-else");
		}else if (number >0.5 || number ==0.5){
			System.out.println("The value is greater than 0.5 using if-else");
		}
 //Using Ternary operator
		System.out.println((number < 0.5) ||(number >= 0.5)? "The valus is less than 0.5 using ternary operator" : "The value is greter than 0.5 using ternary operator");
		}
}