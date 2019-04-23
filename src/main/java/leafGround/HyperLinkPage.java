package leafGround;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HyperLinkPage extends BaseUtils{
	@BeforeMethod
	public void hyperLinkClicks() {
		driver.findElementByLinkText("HyperLink").click();
		driver.navigate().back();
		System.out.println("--Insdie @BeforeMethod");
		driver.findElementByXPath("//h5[text()='HyperLink']/parent::a").sendKeys(Keys.ENTER);
		System.out.println("Insdie @BeforeMethod");
		
	}
	@Test(enabled=true)
	public void hyperLinkpage() {
		System.out.println("Insdie @Test");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		String link = driver.findElementByPartialLinkText("without clicking me").getAttribute("href");
		System.out.println("Link is "+link);
		String brokenLink = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		if(brokenLink.contains("error"))
			System.out.println("The link is broken "+ brokenLink);
		driver.findElementByXPath("//label[text()='(Interact with same link name)']//preceding-sibling::a").click();
		driver.navigate().back();
		List<WebElement> linkCount = driver.findElementsByXPath("//section[@class='innerblock']//a");
		System.out.println("Total links in page is "+linkCount.size());
	}

}
