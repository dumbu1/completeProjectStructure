package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//public static WebDriver driver;
	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter E-Mail']")
	private WebElement text_enterEMail;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement text_password;
	
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement button_signIn;
	
	
	public void login(String username,String password) {
		text_enterEMail.sendKeys(username);
		text_password.sendKeys(password);
		button_signIn.click();
	}

}
