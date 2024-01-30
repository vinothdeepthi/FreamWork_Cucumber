package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements_Utils {
	
	WebDriver driver;
	
	public Elements_Utils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void ClickOnElement(WebElement ele, long duration) {
		
		
		
		WebElement element = WaitforElement(ele, duration);
		
		element.click();
	}
	
	public void TypeTextIntoElement(WebElement ele,String text,long Duration) {
	
		
		
		WebElement element =WaitforElement(ele, Duration);
		
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	public WebElement WaitforElement(WebElement element,long Duration) {
		
		WebElement ele = null;
		
          WebDriverWait wait = new WebDriverWait(driver, Duration);
		
		return ele =wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void SlelectByvisibleText(WebElement ele,String text,long Duration) {
		
		WebElement element = WaitforElement(ele, Duration);
		
		Select select = new Select(element);
		
		select.selectByVisibleText(text);
		
		
	}
	
       public void SlelectByIndext(WebElement ele,int indext,long Duration) {
		
		WebElement element = WaitforElement(ele, Duration);
		
		Select select = new Select(element);
		
		select.selectByIndex(indext);
		
	}
       
       public void SlelectByValue(WebElement ele,String text,long Duration) {
   		
   		WebElement element = WaitforElement(ele, Duration);
   		
   		Select select = new Select(element);
   		
   		select.selectByValue(text);	
   	}
       
       public WebElement WaitforElementToBeVisible(WebElement ele,long Duration) {
    	   
    	   WebElement element=null;
    	   
    	   WebDriverWait wait = new WebDriverWait(driver, Duration);
    	   
    	  element = wait.until(ExpectedConditions.visibilityOf(ele));
    	  
    	  return element;
       }
       
       public void MouseOverAndClick(WebElement ele,long Duration) {
    	   
    	  WebElement element= WaitforElementToBeVisible(ele, Duration);
    	  
    	  Actions act = new Actions(driver);
    	  
    	  act.moveToElement(element).click().perform();
       }
       
       public void JavaScriptClick(WebElement ele , long Duration ) {
    	   
    	  WebElement element = WaitforElementToBeVisible(ele, Duration);
    	  
    	  JavascriptExecutor java = (JavascriptExecutor)driver;
    	  
    	  java.executeScript("arguments[0].click();", element);
    	   
    	   
       }
       
       public void JavaScripSendkeys(WebElement ele , long Duration ,String type) {
    	   
     	  WebElement element = WaitforElementToBeVisible(ele, Duration);
     	  
     	  JavascriptExecutor java = (JavascriptExecutor)driver;
     	  
     	  java.executeScript("arguments[0].value='"+type+"'", element);
     	   
     	   
        }
       
       

}
