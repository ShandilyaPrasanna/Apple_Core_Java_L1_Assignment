package corejavaL1;

import java.io.Serializable;

@SuppressWarnings("serial")
class EmployeeDemo implements Serializable {
	String name;
	int empNO;
	double salary;
	public EmployeeDemo(String name,int empNO, double salary)
	{
		this.name=name;
		this.empNO=empNO;
		this.salary=salary;
	}
	public String toString(){
		return "Name="+name+";EmpNo="+empNO+";Salary="+salary;
	
	}
}
