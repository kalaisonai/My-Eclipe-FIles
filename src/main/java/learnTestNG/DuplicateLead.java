package learnTestNG;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseUtil{
	@Test/*(alwaysRun=true)*/
	public void duplicateLead() throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
		//driver.findElementByName("emailAddress").clear();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("Lead ID "+leadId);
		//String leadName = driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/following::td)[1]/following-sibling::td").getText();
		//System.out.println("Lead Name is "+leadName);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		String leadName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Lead Name is "+leadName);
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Company Name "+companyName);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
			System.out.println(" The page title is " +title);
		driver.findElementByClassName("smallSubmit").click();
		String companyNewName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Company new Name "+companyNewName);
		String newName = driver.findElementById("viewLead_firstName_sp").getText();
		if(leadName.equals(newName))
			System.out.println(" First name of both leads are same");
		else 
			System.out.println("Name not matched");


	}

}
