package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\admin\\git\\FreamWork_Cucumber\\FrameWork_CuCumber\\src\\test\\resources\\FeatureFiles\\Login.feature"},
        glue = "StepDefinition",
        monochrome = true,
        plugin  ="pretty"
        
        
)

public class TestRunner {

}
