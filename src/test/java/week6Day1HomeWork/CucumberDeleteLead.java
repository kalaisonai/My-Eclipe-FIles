/*package week6Day1HomeWork;

import cucumber.api.java.en.And;

public class CucumberDeleteLead extends CucumberEditLead {
	public String leadId;

	@And("Get the Lead Id")
	public void getLeadID() {
		leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
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
*/