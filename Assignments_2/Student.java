package corejavaL1;

public class Student {
	public String name;
	public int marks;
	public String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		//getResults(marks);
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void getResults(int marks1){
	 System.out.print("\n"+getName()+" "+"Grade is:: ");
	        if(marks>80 && marks <=100)
	        {
	            System.out.print("A");
	        }
	        else if(marks>73 && marks<=79)
	        {
	            System.out.print("B+");
	        }else if(marks>65 &&marks <= 72)
	        {
	        	System.out.println("B");
	        }
	        else if(marks>55 && marks<=64)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
	}
}
