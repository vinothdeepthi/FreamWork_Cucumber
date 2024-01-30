package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class ProductPage {
	
    WebDriver driver;
	
	private Elements_Utils element;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement Product;
	
	@FindBy(xpath = "//div[@id='content']//p[2]")
	private WebElement WithoutProductResult;
	
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		element = new Elements_Utils(driver);
	}
	
	public String GetProductName() {
		 
		 return element.WaitforElementToBeVisible(Product, CommonUtils.Explecityywait).getText();
		 
	 }
	
	public String WithoutProductResult() {
		 
		 return element.WaitforElementToBeVisible(WithoutProductResult, CommonUtils.Explecityywait).getText();
		 
	 }

}
