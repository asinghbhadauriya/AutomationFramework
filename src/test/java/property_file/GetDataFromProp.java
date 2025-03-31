package property_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromProp {

	public static void main(String[] args) throws IOException {
//		step : 1 get the java representation object of the physical of fileInput
		FileInputStream fis=new  FileInputStream("./src/main/resources/commonData.properties");

		
		// step :2 by using load all the key of 
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String Browser=pobj.getProperty("bro");
		System.out.println(Browser);
		
		pobj.setProperty("lastName","Tripathi");
		
		FileOutputStream fos= new FileOutputStream("./src/main/resources/commonData.properties");
		pobj.store(fos,"added lastname ");
	}
	}
