package Wipro.TT.BDC;
import Wipro.TT.ProjectZone.*;

public class AccessSpecifiersDemo extends AccessSpecifiers {
	void view(){
		//System.out.println(iDefNo);
		System.out.println(iProNo);
		//System.out.println(iPriNo);
	}
//	display();

public static void main(String args[]){
	AccessSpecifiersDemo obj = new AccessSpecifiersDemo();
	obj.view();
	AccessSpecifiers obj2 = new AccessSpecifiers();
	obj2.display();
	
}
}
