package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/Features/TS_001_PIMPageFunctionality.feature",
		glue ="StepDefinition"
		
		
		)

public class RunnerTest1 extends AbstractTestNGCucumberTests{

}
