package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/EditServiceTerritories.feature"},
glue = "stepDefinition", monochrome =true,
  publish = true  )

public class RunnerClassEditServiceTerritories extends AbstractTestNGCucumberTests {
	
    


}
