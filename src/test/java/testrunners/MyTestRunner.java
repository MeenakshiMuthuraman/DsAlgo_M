package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		features= {"src/test/resources/AppFeatures"},
		glue= {"stepdefinition","AppHooks"},
		plugin= {"pretty"}
		
		)



public class MyTestRunner extends AbstractTestNGCucumberTests{

	
	
	
}
