package runner;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/ServiceTerritories.feature"},
glue = "stepDefinition", monochrome =true,
  publish = true  )

public class RunnerClassCreateServiceTerritories extends BaseClass {
	
    


}
