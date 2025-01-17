package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/loginValidationDataDriven.feature",
        glue = {"stepDefinitions", "utility",},
        plugin = {"pretty","html:target/cucumber-reorts.html"}
)

public class TestRunner {

}
