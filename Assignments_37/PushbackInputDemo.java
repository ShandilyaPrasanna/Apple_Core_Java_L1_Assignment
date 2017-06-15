package corejavaL1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputDemo {
	public static void main(String args[]) throws IOException{
		String str= "This is java Input/Output";
		System.out.println("Before push back\n"+str);
		byte buf[] = str.getBytes();
		ByteArrayInputStream objByteArray = new ByteArrayInputStream(buf);
		PushbackInputStream objPushback = new PushbackInputStream(objByteArray);
	        for(int i=0; i<buf.length; i++)
	        {
	            char ch = (char)objPushback.read();
	            if(i == 0)
	            {
	                objPushback.unread(Character.toLowerCase(ch));
	                break;
	            }
	        }
	        System.out.println("After push back::");
	        for(int i=0; i<buf.length; i++)
	        {
	            System.out.print((char)objPushback.read());
	        }
	    }
	}
