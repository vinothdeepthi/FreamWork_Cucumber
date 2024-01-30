package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonUtils {
	
	
	@Before
	public void lounch_Browser() throws IOException {
		
		
		SetUp(ReadProperties().getProperty("browser"), ReadProperties().getProperty("url"));
		
	}
	
	@AfterStep
	public void TearDown(Scenario scc) throws IOException {
		
		if(scc.isFailed()==true) {
			
		TakesScreenshot take = (TakesScreenshot) driver;
		
		byte[] sourse = take.getScreenshotAs(OutputType.BYTES);
		
		scc.attach(sourse, "image/png", scc.getName());
		
		}	
		
	}
	
	@After
	public void TearDown() {  
		
        //driver.quit();
	}
	

}
