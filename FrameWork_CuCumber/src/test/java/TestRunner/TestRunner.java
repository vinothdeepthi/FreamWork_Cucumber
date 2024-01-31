package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\admin\\git\\FreamWork_Cucumber\\FrameWork_CuCumber\\src\\test\\resources\\FeatureFiles"},
        dryRun = !true,
        glue = "StepDefinition",
        monochrome = true,
        tags = "@Smoke",
        plugin  ="pretty"
        
        
)

public class TestRunner {

}
