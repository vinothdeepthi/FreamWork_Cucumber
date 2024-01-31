package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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
	
	@FindBys({@FindBy(xpath = "//div[@class='caption']//a")})
	private List<WebElement> All_Products;
	
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement Quantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartButton;
	
	
	
	
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
	
	public void SelectTheProduct(String product) {
		
		for (WebElement all : All_Products) {
			
			if(all.getText().equalsIgnoreCase(product)) {
				element.ClickOnElement(all, CommonUtils.Explecityywait);
				break;
			}
		}
	}
	
	public void EnterQuantity(String quan) {
		
		element.TypeTextIntoElement(Quantity, quan, CommonUtils.Explecityywait);
	}
	
	public void AddToCartProduct() {
		
		element.ClickOnElement(AddToCartButton, CommonUtils.Explecityywait);
	}

}
