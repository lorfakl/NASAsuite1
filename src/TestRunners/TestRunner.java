package TestRunners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources/features", glue= {"stepDefinition"})

public class TestRunner 
{

}
