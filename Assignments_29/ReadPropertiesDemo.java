package corejavaL1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ReadPropertiesDemo
{
    private ResourceBundle resourceBundle;
    
    public ReadPropertiesDemo() throws Exception
    {
      //  ResourceBundle.getBundle("E:/topgear1/src/corejavaL1/Trainings.properties");
    	//final String FILENAME = "E:/topgear1/src/corejavaL1/Trainings.properties";
        //  resourceBundle = ResourceBundle.getBundle(FILENAME);

    	  FileInputStream fis = new FileInputStream("E:/topgear1/src/corejavaL1/Trainings.properties");
    	  resourceBundle = new PropertyResourceBundle(fis);

        String sType[] = resourceBundle.getString("Type").split(",");
        String sBu[] = resourceBundle.getString("BU").split(",");
        String sLoc[] = resourceBundle.getString("Location").split(",");
        for(int i=0; i<sType.length; i++)
        {
            System.out.println("Type: "+(i+1));
            System.out.println("Type: "+sType[i]);
            System.out.println("BU: "+sBu[i]);
            System.out.println("Loc: "+sLoc[i]);
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        ReadPropertiesDemo readProperties = new ReadPropertiesDemo();
    }
}
