package com.automationprac.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin = { "pretty", "html:target/html report/cucumber-pretty", "json:target/cucumber.json" },
		
		features = {"Automation_Prac_Feature"}, // Runner file
		
		glue = {"com.automationprac.teststeps"} ,// Step definition
		monochrome = true, 
		dryRun= false,
		strict = true 
		
		
		)


public class AutomationPrac_MyRunner extends AbstractTestNGCucumberTests { 
	
	
	
	
}
