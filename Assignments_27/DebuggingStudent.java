package corejavaL1;

public class DebuggingStudent{
	
	    private int roll;
	    private String name;

	    public int getRoll()
	    {
	        return roll;
	    }

	    public void setRoll(int roll)
	    {
	        this.roll = roll;
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }
	    
	    public static void main(String[] args)
	    {
	        DebuggingStudent student[] = new DebuggingStudent[2];
	        student[0] = new DebuggingStudent();
	        student[0].setRoll(39977);
	        System.out.println(student[0].getRoll());
	    }
	}

