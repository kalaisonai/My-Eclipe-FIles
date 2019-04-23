package week6Day1HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberEditLead {
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

	@And("Click on Leads from the Menu")
	public void leadClick() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Select Find Leads from left")
	public void findLeadFromLeftPanel() {
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
	}
	@And("Search with Email Address")
	public void searchWithEmail() {
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
	}
	@And("Select Find Lead button")
	public void findClick() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
	}
	@And("Select the first lead ID from the result")
	public void firstResultClick() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	}
	@And("Select Edit button")
	public void editButton() {
		driver.findElementByLinkText("Edit").click();
	}
	@And("Clear And update the company name")
	public void updateName() {	
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
	}
	@When("Select Update button")
	public void updateButtonClick() {
		driver.findElementByXPath("//input[@value='Update']").click();
	}
	@Then("Confirm the Company Name")
	public void confirmUpdate() {
		String attribute = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Company Name "+attribute);
		if(attribute.contains("TestLeaf"))
			System.out.println("Company name Updated");
		else
			System.out.println("Company name not updated");
	}

	public String leadId;
	//Delete Lead
	@And("Get the Lead Id to delete")
	public void getLeadID() {
		leadId = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//a)[1]").getText();
		System.out.println("Lead ID "+leadId);
	}
	@And("Select Delete button")
	public void deleteButtonClick() {
		driver.findElementByClassName("subMenuButtonDangerous").click();
	}
	@And("Search with the deleted Lead ID")
	public void searchID() throws InterruptedException {
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
	}
	@And("Confirm that ID is deleted")
	public void confirmDeletedID() {
		boolean noRecord = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		if(noRecord==true)
			System.out.println("No records found with lead Id "+leadId);
		else
			System.out.println("Record available for ID "+leadId);
	}
}
