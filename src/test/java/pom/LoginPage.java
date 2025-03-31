package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 LoginPage(WebDriver driver) {
		 //page factory is a class which is used inislized the webElement
		PageFactory.initElements(driver,this);
	}
	
	@FindAll({@FindBy(id="em"),@FindBy(name ="e"),@FindBy(xpath = "//input[contains(@aria-label,'E')]")})
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=\"Log in\"]")
	private WebElement loginBtn;
	
	//creating getters for all element so that it can be  access user without showing actual funtionlity

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return loginBtn;
	}

}
