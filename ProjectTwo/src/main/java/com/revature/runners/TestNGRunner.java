package com.revature.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/Caliber.feature","src/test/java/Popup.feature","src/test/java/Close.feature"},
		
		glue = {"com.revature.StepImplementation"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
