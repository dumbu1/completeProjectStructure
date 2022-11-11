package stepDefinations;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagesObjects.LoginPage;
import utility.DriverManager;
import utility.PropertyReader;

public class LoginPage_Steps {
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user enters valid username, password and clicks on Sign In button")
	public void user_enters_valid_username_password_and_clicks_on_sign_in_button() {
	    
		String username=PropertyReader.getPropertyValue("login", "useremail");
		String password=PropertyReader.getPropertyValue("login", "password");
		
		LoginPage obj_LoginPage=new LoginPage(DriverManager.getDriver());
		obj_LoginPage.login(username, password);
		
	}
	@Given("check the page")
	public void check_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
