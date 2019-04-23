package week5Day2;
import org.testng.annotations.Test;

public class DeleteLead1 extends BaseUtil1{
	@Test
	/*(dependsOnMethods="learnTestNG.MergeLeads.mergerLead")*/
	public void deleteLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
		//driver.findElementByName("emailAddress").clear();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("Lead ID "+leadId);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		boolean noRecord = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		if(noRecord==true)
			System.out.println("No records found with lead Id "+leadId);
		else
			System.out.println("Record available for ID "+leadId);
		Thread.sleep(1000);
		
	}

}
