package Pages;

import java.util.List;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class Cart_page {
	
	WebDriver driver;
	
	private Elements_Utils element;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement Cart;
	
	@FindBys({@FindBy(xpath = "//td[@class='text-left']//a")})
	private List<WebElement> All_Cart_Products;
	
	
	
     public Cart_page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		element = new Elements_Utils(driver);
	}
     
     public void ClickCart() { 
    	 
    	 element.ClickOnElement(Cart, CommonUtils.Explecityywait);
    	 
     }
     
     public void SelectTheProduct(String product) {
 		
 		for (WebElement all : All_Cart_Products) {
 			
 			if(element.WaitforElementToBeVisible(all, CommonUtils.Explecityywait).getText().equalsIgnoreCase(product)) {

 		        System.out.println("Correct Product");
 		        break;
 			}
 		}
		
 	}	

}
