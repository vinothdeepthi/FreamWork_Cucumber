package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunction extends CommonUtils {
	
    private LoginPage log = new LoginPage(driver);
	
	@Given("User As Navigate To Login Page")
	public void user_as_navigate_to_login_page() {
		
		
	  HomePage home = new HomePage(driver);
	  
	  home.ClickMyAccount();
	  
	  home.ClickLoginLink();
	}
	@When("User Enter Valid User Name {string} into the User Name Field")
	public void user_enter_valid_user_name_into_the_user_name_field(String validusername) throws InterruptedException {
		 
		 log.EnterloginEmail(validusername);
	}
	@And("User Enter Valid Password {string} into the password Field")
	public void user_enter_valid_password_into_the_password_field(String validPassword) throws InterruptedException {
	    
		
		log.EnterloginPassword(validPassword);
	}
	@And("User Click On Login button")
	public void user_click_on_login_button() throws InterruptedException {
		
		log.ClickLogin();
	}
	@Then("User Should Be Successfully Logged In The Application")
	public void user_should_be_successfully_logged_in_the_application() throws InterruptedException {
		
		Assert.assertEquals(log.LoginSuccessMessage(), "My Account");
	}
	
	@When("User Enter inValid User Name {string} into the User Name Field")
	public void user_enter_invalid_user_name_into_the_user_name_field(String invalidusername) throws InterruptedException {
		
		log.EnterloginEmail(invalidusername);
	}
	
	@And("User Enter inValid Password {string} into the password Field")
	public void user_enter_invalid_password_into_the_password_field(String invalidpassword) {
	    
		log.EnterloginPassword(invalidpassword);
	}
	
	@Then("User Should Be get The Proper Warning Message About The credentiels Missmatch")
	public void user_should_be_get_the_proper_warning_message_about_the_credentiels_missmatch() {
	  
		Assert.assertEquals(log.LoginError(), "Warning: No match for E-Mail Address and/or Password.");
	}
	
	@When("User Without Enter Valid User Name {string} into the User Name Field")
	public void user_without_enter_valid_user_name_into_the_user_name_field(String withoutusername) {
	   
		log.EnterloginEmail(withoutusername);
	}
	
	@And("User Without Enter Password {string} into the password Field")
	public void user_without_enter_password_into_the_password_field(String withoutpassword) {
	    
		log.EnterloginPassword(withoutpassword);
	}
	
	
	
	
}
