package StepDefinition;

import java.util.Map;

import org.testng.Assert;

import Pages.HomePage;
import Pages.RegisterPage;
import Utils.CommonUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration  extends CommonUtils{
	
	private Map<String, String> data;
	
	 private RegisterPage reg  = new RegisterPage(driver);
	
	@Given("User Naviage To The Registration Registration Page")
	public void user_naviage_to_the_registration_registration_page() {
		
		HomePage home = new HomePage(driver);
		  
		  home.ClickMyAccount();
		  
		  home.ClickRegisterLink();
	    
	}
	@When("User Entring The Details With Below The Field")
	public void user_entring_the_details_with_below_the_field(DataTable dataTable) {
	  
		 data =dataTable.asMap(String.class,String.class);
		 
		 reg.EnterFirstName(data.get("FirstName"));
		 reg.EnterLastName(data.get("LastName"));
		 reg.EnterEmail(data.get("Email"));
		 reg.EnterPhone(data.get("phone"));
		 reg.EnterPassword(data.get("Password"));
		 reg.EnterConfirmPassword(data.get("confirmPassword"));
		 
	}
	@When("User Select Privacy and Policy")
	public void user_select_privacy_and_policy() {
	    
		reg.CheckPrivacyPolicy();
	}
	@When("User Click On Contine button")
	public void user_click_on_contine_button() {
	    
		reg.Submit();
	}
	@Then("User Account Should Be Create Succssfully")
	public void user_account_should_be_create_succssfully() {
	   
		
		Assert.assertEquals(reg.SuccessfullCreateMessage(), "Congratulations! Your new account has been successfully created!");
	}
	
	@When("User Without Entring The Details With Below The Field")
	public void user_without_entring_the_details_with_below_the_field(DataTable dataTable1) {
	    
		 Map<String ,String> d =dataTable1.asMap(String.class,String.class);
		
		 reg.EnterFirstName(d.get("FirstName"));
		 reg.EnterPassword(d.get("Password"));
		 reg.EnterConfirmPassword(d.get("Confirm Password"));
	}
	@When("User Slelect The New Setteler Subcription")
	public void user_slelect_the_new_setteler_subcription() {
	    
		reg.ClickNewSettler();
	}
	
	@Then("User Should Not Be Create An Account and User Should Be View Proper Warning Message")
	public void user_should_not_be_create_an_account_and_user_should_be_view_proper_warning_message() {
	  
		Assert.assertEquals(reg.GetWarningError(), "Last Name must be between 1 and 32 characters!");
		
	}
	

@When("User Without Select Privacy and Policy CheckBox")
public void user_without_select_privacy_and_policy_check_box() {
	
	
  
}
@Then("User Should Be Get The Proper Warning Message")
public void user_should_be_get_the_proper_warning_message() {
   
	
	Assert.assertEquals(reg.GetPrivacyWarning(), "Warning: You must agree to the Privacy Policy!");
}


}
