package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLikeFunctionlity {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		LoginPage lp= new LoginPage(driver);
		lp.getUsername().sendKeys("amit");
		lp.getPassword().sendKeys("234444");
		lp.getLogin().click();
		

	}

}
