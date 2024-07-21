package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/Features/TS_001_orangeHRMLoginFunctionality.feature",
		glue="StepDefinition" 
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
