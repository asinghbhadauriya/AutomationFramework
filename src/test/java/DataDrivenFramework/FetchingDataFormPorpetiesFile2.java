package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




public class FetchingDataFormPorpetiesFile2 {

	public static void main(String[] args) throws IOException  {
		//FileInputStream thows exception that is FileNotFoundException
		FileInputStream f=new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties p= new Properties();
		//Properties.load thows exception like IOException
		p.load(f);
		
		System.out.println(p.getProperty("url","chrome"));
		
	}

}
