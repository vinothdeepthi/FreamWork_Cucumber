package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\admin\\eclipse-workspace\\FrameWork_CuCumber\\src\\test\\resources\\FeatureFiles\\Registration.feature"},
        glue = "StepDefinition",
        monochrome = true,
        plugin = "pretty"
        
        
)

public class TestRunner {

}
