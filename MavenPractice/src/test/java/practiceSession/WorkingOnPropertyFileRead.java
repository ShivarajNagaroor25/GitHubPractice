package practiceSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingOnPropertyFileRead {

	 public static String getreadMethod(String url) throws IOException{
		 FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestURL");
		 Properties prop=new Properties();
		 prop.load(fis);
		 return prop.getProperty(url);
		 
	 }
}