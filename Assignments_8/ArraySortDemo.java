package corejavaL1;

import java.util.Arrays;

public class ArraySortDemo
	{
	    public static void main(String[] args)
	    
	    {
	        /*if(args.length != 5)
	        {
	            System.out.println("Enter only 5 Arguments(Number)");
	            return;
	        }*/
	        double []num = new double[5];
	        System.out.println("Befor Sorting Array values are::");
	        for(int i=0; i<num.length; i++)
	        {
	            num[i] = Double.valueOf(args[i]);
		        System.out.println(args[i]);

	        }
	        Arrays.sort(num);
	        System.out.println("After sorting Array values are::"+Arrays.toString(num));
	    }
	}

