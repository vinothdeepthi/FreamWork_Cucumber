package Utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils extends Configration{

	public static final int implecitywait=15;
	
	public static final int Explecityywait=30;
	
	
	protected static WebDriver driver;
	
	public void SetUp(String browsername, String url) {

		switch (browsername) {     
		case "chrome":
      
			System.setProperty(pro.getProperty("system"),pro.getProperty("browserPath"));
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(implecitywait, TimeUnit.SECONDS);
			driver.get(url);


			break;

		case "firefox":

			System.setProperty(pro.getProperty("system"),pro.getProperty("browserPath") );
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(implecitywait, TimeUnit.SECONDS);
			driver.get(url);

			break;

		default:

			System.err.println("Browser is Invalid");
			break;
		}

	}
	
	


}
