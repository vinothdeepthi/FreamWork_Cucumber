package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class RegisterPage {
	
	WebDriver driver;
	
	private Elements_Utils element;
	
	@FindBy(id = "input-firstname")
	private WebElement FirstName;
	
	@FindBy(id = "input-lastname")
	private WebElement LastName;
	
	@FindBy(id = "input-email")
	private WebElement Email;
	
	@FindBy(id = "input-telephone")
	private WebElement PhoneNumber;
	
	@FindBy(id = "input-password")
	private WebElement Password;
	
	@FindBy(id = "input-confirm")
	private WebElement Confirm_Password;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement Privacy_Pollicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement Submit;
	
	@FindBy(xpath = "(//input[@name='newsletter'])[1]")
	private WebElement NewSetteler;
	
	@FindBy(xpath = "//*[@id=\"content\"]/p[1]")
	private WebElement SuccessRegister;
	
	@FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
	private WebElement WarningError;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement PrivacyAndPolicyWarnigMessage;
	
	
	
	
    public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		element = new Elements_Utils(driver);
	}
    
    public void EnterFirstName(String fiestname) {
    	
    	element.TypeTextIntoElement(FirstName, fiestname, CommonUtils.Explecityywait);
    	
    }
    
 public void EnterLastName(String lastname) {
    	
	 element.TypeTextIntoElement(LastName, lastname, CommonUtils.Explecityywait);
			 
    }
 
 public void EnterEmail(String email) {
 	
	 element.TypeTextIntoElement(Email, email, CommonUtils.Explecityywait);
 }
 
 public void EnterPhone(String number) {
	 
	 element.TypeTextIntoElement(PhoneNumber, number, CommonUtils.Explecityywait);
 	
 }
 
 public void EnterPassword(String password) {
	 
	 element.TypeTextIntoElement(Password, password, CommonUtils.Explecityywait);
	 
 }
 
 public void EnterConfirmPassword(String confirmpass) {
 	
	 element.TypeTextIntoElement(Confirm_Password, confirmpass, CommonUtils.Explecityywait);
 }
 
 public void CheckPrivacyPolicy() {
 	
	 element.ClickOnElement(Privacy_Pollicy, CommonUtils.Explecityywait);
 }
 
 public void Submit() {
	 
 	element.ClickOnElement(Submit, CommonUtils.Explecityywait);
	 
 }
 
 public String SuccessfullCreateMessage() {
	 
	 return element.WaitforElementToBeVisible(SuccessRegister, CommonUtils.Explecityywait).getText();
 }
 
 public void ClickNewSettler() {
	 
	 element.ClickOnElement(NewSetteler, CommonUtils.Explecityywait);
	 
 }
 
 public String GetWarningError() {
	 
	 return element.WaitforElementToBeVisible(WarningError, CommonUtils.Explecityywait).getText();
	 
 }
 
 public String GetPrivacyWarning() {
	 
	 return element.WaitforElementToBeVisible(PrivacyAndPolicyWarnigMessage, CommonUtils.Explecityywait).getText();
	 
 }
 
 
	
	

}
