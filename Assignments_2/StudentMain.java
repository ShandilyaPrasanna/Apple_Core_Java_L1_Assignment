package corejavaL1;

public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] objStudent = new Student[3];
		objStudent[0] = new Student();
		objStudent[0].setName("Jaya");
		System.out.println("Student Name is::"+objStudent[0].getName());
		objStudent[0].setMarks(89);
		System.out.println("Student marks is::"+objStudent[0].getMarks());
		
		objStudent[1] = new Student();
		objStudent[1].setName("Sathish");
		System.out.println("Student Name is::"+objStudent[1].getName());
		objStudent[1].setMarks(50);
		System.out.println("Student marks is::"+objStudent[1].getMarks());
		
		objStudent[2] = new Student();
		objStudent[2].setName("Naani");
		System.out.println("Student Name is::"+objStudent[2].getName());
		objStudent[2].setMarks(75);
		System.out.println("Student marks is::"+objStudent[2].getMarks());
		objStudent[0].getResults(objStudent[0].getMarks());
		objStudent[1].getResults(objStudent[1].getMarks());
		objStudent[2].getResults(objStudent[2].getMarks());

		
		
		//objStudent.getResults(objStudent.getMarks());
		
	}

}
