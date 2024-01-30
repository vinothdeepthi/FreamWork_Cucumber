package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.Elements_Utils;

public class SearchProduct_Page {
	
	WebDriver driver;
	
	private Elements_Utils element;
	
	
	@FindBy(xpath = "//p[contains(text(),'There is no product that matches the search criter')]")
	private WebElement NoSearchProductResult;
	
	@FindBys({@FindBy(xpath = "//div[@class='caption']//a")})
	private List<WebElement> SearchProduct;
	
	public SearchProduct_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		element = new Elements_Utils(driver);
	}
	
	
	public String NoSerchproduct() {
		
		return element.WaitforElementToBeVisible(NoSearchProductResult, CommonUtils.Explecityywait).getText();
		
	}
	
       public void Serchproduct() {
		
		for (WebElement pro : SearchProduct) {
			
			element.WaitforElementToBeVisible(pro, CommonUtils.Explecityywait).getText();
			 
		}
		
		
		
		
	}

}
