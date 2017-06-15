package corejavaL1;

import java.io.*;
import java.io.ObjectOutputStream;
class SerialDeserialDemo
{
    public static void main(String[] args) 
    {
    try{
        EmployeeDemo employee = new EmployeeDemo("JayaSree", 265180, 23000);
        FileOutputStream fos = new FileOutputStream("Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        System.out.println("Object Written to File");
        oos.flush();
        oos.close();
    }catch(Exception e){
    	System.out.println("Exceptio::"+e);
    	System.exit(0);
    }
    try{
    		EmployeeDemo objEmp;
           FileInputStream fis = new FileInputStream("Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        objEmp = (EmployeeDemo)ois.readObject();
        System.out.println(objEmp);
        ois.close();
    }catch(Exception e){
    	System.out.println("Exceptio::"+e);
    	System.exit(0);    
    }
}
}