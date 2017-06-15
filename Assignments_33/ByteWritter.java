package corejavaL1;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteWritter {
	public void writeBytes(OutputStream outstream){
		try{
				outstream.write(65);
				outstream.write(66);
				outstream.write(67);
		}catch(IOException ie){
			System.out.println("Error:;"+ie);
		}
	}
	public static void main(String[] args){
		try{
			ByteArrayOutputStream objBytearray =new ByteArrayOutputStream();
			FileOutputStream objFileOp =new FileOutputStream("Trng");
			ByteWritter objByte = new ByteWritter();
			objByte.writeBytes(System.out);
			System.out.println("\n");
			objByte.writeBytes(objBytearray);
			objByte.writeBytes(objFileOp);
			
			//print all elements of the byte array
			byte bArray[] = objBytearray.toByteArray();
			for(int iIndex=0; iIndex < bArray.length; iIndex++){
				System.out.println(bArray[iIndex]);
				
			}
			FileInputStream objFileIP =new FileInputStream("Trng");
			int iValue = objFileIP.read();
			while(iValue != -1){
				System.out.println((byte)iValue);
				iValue = objFileIP.read();
			}
			objFileIP.close();
		}
		catch(IOException ie){
			System.out.println("Error"+ie);
		
		}
	}
}

