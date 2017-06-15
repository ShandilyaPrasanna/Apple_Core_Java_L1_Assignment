package corejavaL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String args[]) throws IOException{
		System.out.println("Enter the string to check");
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String str= bf.readLine();
		System.out.println(str);
		int count=0, loc;
		//to count the numbers of blankspaces
		for(int i=1;i < str.length();i++){
			loc = str.charAt(i);
			if(loc == 32){
				count++;
			}
		}
		System.out.println("Number of blankspaces::"+count);
	}
}
