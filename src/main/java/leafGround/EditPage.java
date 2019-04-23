package leafGround;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditPage extends BaseUtils{
	@BeforeMethod
	public void editIcon()  {
		driver.findElementByXPath("//h5[text()='Edit']").click();
		driver.navigate().back();
		driver.findElementByXPath("//h5[text()='Edit']/parent::a").sendKeys(Keys.ENTER);
		driver.navigate().back();
		Actions builder= new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("//div[@class='wp-landing-categories']//following::h5[text()='Edit']")).click().perform();
		}
	@Test(enabled=true)
	public void editPage() throws InterruptedException {
		driver.findElementById("email").sendKeys("kalai@mail.com");
		driver.findElementByXPath("//input[contains(@value,'Append')]").sendKeys("TextAdded");
		String fieldValue = driver.findElementByXPath("//input[@name='username' and @value='TestLeaf']").getAttribute("value");
		System.out.println("Text field value "+fieldValue);
		driver.findElementByXPath("//label[text()='Clear the text']/following::input[@value='Clear me!!']").clear();
		Thread.sleep(3000);
		boolean enabled = driver.findElementByXPath("//label[contains(text(),'disabled')]/following-sibling::input").isEnabled();
		if(enabled==false)
			System.out.println("The edit field is disabled");
	}
	


}

