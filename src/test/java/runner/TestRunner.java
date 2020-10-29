package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\chinn\\IdeaProjects\\tm4j_Test_BDD\\src\\main\\resources\\login.feature",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/Google.json"}
)
public class TestRunner {

}

