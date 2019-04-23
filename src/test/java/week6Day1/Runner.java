package week6Day1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/week6Day1/CreateLead.feature", glue="week6Day1",monochrome=true)

public class Runner extends AbstractTestNGCucumberTests{

}
