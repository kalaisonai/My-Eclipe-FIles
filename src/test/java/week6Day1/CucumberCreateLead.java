/*package week6Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

Given Launch browser
And Maximize it
And Set Implicit wait 
And Launch URL
And Pass the UserName as DemoSalesManager
And Pass the PassWord as crmsfa
And Login button click
And Click on CRMSFA
And Click on Create Lead link
And Enter Company Name
And Enter First Name
And Enter Last Name
When Click Submit button
Then Check the Created Lead 

public class CucumberCreateLead {
	public ChromeDriver driver;
	@Given("Launch browser")
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();		
	}
	@And("Maximize it")
	public void maximizeBrowser() {
		driver.manage().window().maximize();		
	}
	@And("Set Implicit wait")
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@And("Launch URL")
	public void launchURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Pass the UserName as (.*)")
	public void userName(String userName) {
		driver.findElementById("username").sendKeys(userName);
	}
	@And("Pass the PassWord as (.*)")
	public void password(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	@And("Login button click")
	public void loginClick() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click on CRMSFA")
	public void crmsfaClick() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	And Click on Create Lead link
	And Enter Company Name
	And Enter First Name
	And Enter Last Name
	When Click Submit button
	Then Check the Created Lead

	@And("Click on Create Lead link")
	public void createLinkClick() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter Company Name as (.*)")
	public void compName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}
	@And("Enter First Name as (.*)")
	public void firstName( String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);	
	}
	@And("Enter Last Name as (.*)")
	public void lastName( String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);	
	}
	@When("Click Submit button")
	public void submit() {
		driver.findElementByName("submitButton").click();
	}
	@Then("Check the Created Lead")
	public void checkStatus() {
		System.out.println("Create Lead is done");
	}
}*/