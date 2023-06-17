package keyWordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	public class Utility {
	    public Object fetchProperty(String key) throws IOException
	    {
	    	   FileInputStream file=new FileInputStream("./Data/TestCses");
	    	   Properties pro=new Properties();
	    	   pro.load(file);
	    	  return pro.get(key);
	    }


}
