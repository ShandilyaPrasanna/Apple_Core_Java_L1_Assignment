package corejavaL1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferDataApp {
	public static void main(String[] args) throws Exception 
{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Trng"));
        byte b1=65, b2=66, b3=67;
        bos.write(b1);
        bos.write(b2);
        bos.write(b3);
        bos.close();
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("Trng"));
        int value =bis.read();
        while(value !=-1){
        	System.out.println((byte)value);
        	value =bis.read();
        }
        bis.close();
		
	}
}
