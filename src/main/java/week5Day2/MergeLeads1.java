package week5Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

public class MergeLeads1 extends BaseUtil1{
	@Test/*(alwaysRun=true)*/

	public void mergerLead() throws InterruptedException {
		//It will cal Before Method Annotation
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> window = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(window);
		System.out.println("Windows "+list);
		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		driver.findElementByName("id").sendKeys("100");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//a[@class='linktext']").click();
		String fromLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("From lead is "+fromLead);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> window2 = driver.getWindowHandles();
		List<String> list2=new ArrayList<String>();
		list2.addAll(window2);
		System.out.println("Windows 2 "+list2);
		driver.switchTo().window(list2.get(1));
		driver.manage().window().maximize();
		driver.findElementByName("id").sendKeys("100");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(fromLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		boolean errMsg = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		if(errMsg==true)
			System.out.println("Lead ID is already merged "+fromLead);
		else
			System.out.println("Lead ID is not merged "+fromLead);
		
	}

}
