package leafGround;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagePage extends BaseUtils{
	@BeforeMethod
	public void imageLinkClick() {
		driver.findElementByLinkText("Image").click();
		driver.navigate().back();
		driver.findElementByXPath("//a[@href='pages/Image.html']").sendKeys(Keys.ENTER);	
	}
	@Test
	public void imagePage() throws ClientProtocolException, IOException, InterruptedException {
		driver.findElementByXPath("//img[contains(@src,'home.png')]").click();
		driver.navigate().back();
		System.out.println("Try");
		/*	boolean enabled = driver.findElementByXPath("//img[contains(@src,'abcd.jpg')]").isEnabled();
		if(enabled==false)
			System.out.println("The image is broken");*/

		WebElement eleBroken = driver.findElementByXPath("//img[contains(@src,'abcd.jpg')]");

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(eleBroken.getAttribute("src"));
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() != 200)
			System.out.println("The image is broken");


		//Actions builder=new Actions(driver);
		/*try {
			builder.moveToElement().click().perform();

		} catch (Exception e) {
			System.out.println("By Action...The image is broken");
		}*/
		WebElement actionElement = driver.findElementByXPath("//img[contains(@src,'keyboard.png')]");
		//actionElement.sendKeys(Keys.ENTER);
		actionElement.click();
		driver.navigate().back();
		Thread.sleep(500);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//img[contains(@src,'keyboard.png')]"))).click();
		//builder.moveToElement(actionElement).click().perform();

	}
}
