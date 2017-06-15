package corejavaL1;
interface MyInterface{}
class MyClass1{ }
class MyClass2 extends MyClass1 implements MyInterface{ }
class MyClass3 implements MyInterface{ }

public class ReferenceDemo {
	public static void main(String args[]){
		MyClass1 obj1= new MyClass1();
		MyClass2 obj2 =new MyClass2();
		MyClass3  obj3= new MyClass3();
		//obj2=obj3;
		//obj3 = obj2;
		MyInterface interfaceRef = obj3;
		//obj3 = (MyClass3)obj2;
		//obj2 = obj1;
		System.out.println("MyInterface interfaceRef = obj3"+" is the valid Option.");
		
	}
}
