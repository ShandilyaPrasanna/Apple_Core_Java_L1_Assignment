package corejavaL1;

public class CommandLineArgs {
	public static void main(String args[]){
       if(args.length < 2 || args.length > 2)
		        {
		            System.out.println("Invalid no. of Arguments");
		            System.exit(0);
		        }
		        System.out.println("Command line arguments are::"+args[0]+" "+args[1]);
		    }
		}
	

