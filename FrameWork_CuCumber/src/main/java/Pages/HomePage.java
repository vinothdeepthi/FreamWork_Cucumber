package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class HomePage {
	
	WebDriver driver;
	
	private Elements_Utils element;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement LoginLink;
	
	@FindBy(name = "search")
	private WebElement Search;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement Searchicon;
	
	
    public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		element = new Elements_Utils(driver);
	}
    
    
    public void ClickMyAccount() {
    	
    	element.ClickOnElement(MyAccount, CommonUtils.Explecityywait);
    }
	
    public void ClickRegisterLink() {
    	
    	element.ClickOnElement(RegisterLink, CommonUtils.Explecityywait);
    	
    }
    
    public void ClickLoginLink() {
    	
    	element.ClickOnElement(LoginLink, CommonUtils.Explecityywait);
    	
    }
    
     public void SearchProduct() {
    	
    	 element.ClickOnElement(Searchicon, CommonUtils.Explecityywait);
    
    }
     
     public void EnterProduct(String product) {
     	
    	 element.TypeTextIntoElement(Search, product, CommonUtils.Explecityywait);
     	
     }
	

}
