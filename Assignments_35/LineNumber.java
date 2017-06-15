package corejavaL1;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumber {
	public static void main(String args[]) throws IOException {
		try{
			FileReader objFileIn = new FileReader("E:/topgear1/src/corejavaL1/LineNumber.java");
			//code to generate the line nukmbers for the read lines
			LineNumberReader objLineNumber =new LineNumberReader(objFileIn);
			String str;
			while((str=objLineNumber.readLine())!=null){
				System.out.println(objLineNumber.getLineNumber() + "."+str);
			}
		}catch(IOException ie){
			System.out.println("Error::"+ie);
		}
	}

}
