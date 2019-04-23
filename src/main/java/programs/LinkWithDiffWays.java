package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LinkWithDiffWays {
	static ChromeDriver driver;
	//@Test
	//Direct way
	public void directWay() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").sendKeys(Keys.ENTER);
		/*Actions builder=new Actions(driver);
		builder.click(driver.findElementByLinkText("Go to Home Page"));*/
		

	}
	//Using Action
	@Test
	public void actionMethod() {
		Actions builder=new Actions(driver);
		builder.click(driver.findElementByLinkText("Go to Home Page"));
	}

	


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").sendKeys(Keys.ENTER);
		driver.navigate().back();
		Actions builder=new Actions(driver);
		builder.click(driver.findElementByLinkText("Go to Home Page")).perform();
		driver.navigate().back();
		//driver.executeScript("argument[0].click(, args);","driver.findElementByLinkText("Go to Home Page")");


	}
}
