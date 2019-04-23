package week6Day1HomeWork;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/week6Day1HomeWork/EditLead.feature",glue="week6Day1HomeWork",monochrome=true)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
