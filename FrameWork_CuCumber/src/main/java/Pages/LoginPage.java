package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class LoginPage {
	
	WebDriver driver;
	
	private Elements_Utils element;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement LoginEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement LoginPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement Login;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement LoginErrorMessage;
	
	@FindBy(xpath = "//div[@class='row']//h2")
	private WebElement LoginSuccessMessage;
	
	
	 public LoginPage(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
			
			element = new Elements_Utils(driver);
		}
	 
	 
	 public void EnterloginEmail(String loginemail) {
		 
		 element.TypeTextIntoElement(LoginEmail, loginemail, CommonUtils.Explecityywait);
		 
	 }
	 
     public void EnterloginPassword(String loginPassword) {
		 
    	 element.TypeTextIntoElement(LoginPassword, loginPassword, CommonUtils.Explecityywait);
		 
	 }

     public void ClickLogin() {
	 
    	 element.ClickOnElement(Login, CommonUtils.Explecityywait);
}
     
     public String LoginError() {
    	 
    	return element.WaitforElementToBeVisible(LoginErrorMessage, CommonUtils.Explecityywait).getText();	
     }
     
     public String LoginSuccessMessage() {
    	 
    	 return element.WaitforElementToBeVisible(LoginSuccessMessage, CommonUtils.Explecityywait).getText();
  
      }
	    

}
