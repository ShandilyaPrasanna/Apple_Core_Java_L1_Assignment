package corejavaL1;

public class ConstructorOverload {
	int a,b;
	public ConstructorOverload(){
		System.out.println("Default argument constructor:");
		System.out.println("a is::"+a+" "+"b is::"+b);
	}
	public ConstructorOverload(int n){
		a=n;
		System.out.println("Constructor with one argument::");
		System.out.println("a is::"+a+" "+"b is::"+b);

	}
	public ConstructorOverload(int n,int m){
		a=n;
		b=m;
		System.out.println("Constructor with two argument::");
		System.out.println("a is::"+a+" "+"b is::"+b);

	}
	
}
