package DataDrivenFramework;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingDataFromProperty {
//	static String path= "./src/test/resources/CommonData.properties";
//	
//	static WebDriver driver;

	public static void main(String[] args) throws IOException {
//		to load your property file
		FileInputStream f = new FileInputStream("./src/test/resources/CommonData.properties");
//		create the object of properties class
		Properties p=new Properties();
//		to load all the keys
		p.load(f);
//		to fetch the data
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
//		System.out.println("==================================");
//		String browser=Flib.getDataFromProperty(path,"browser");
//		String url=Flib.getDataFromProperty(path, "url");
//		
//		if(browser.equals("chrome"))
//		driver=new ChromeDriver();
//		else if(browser.equals("firefox"))
//		driver=new FirefoxDriver();
//		else if(browser.equals("edge"))
//			driver=new EdgeDriver();
//		else
//			System.out.println("invlied driver");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get(url);
		
		
	}

}
