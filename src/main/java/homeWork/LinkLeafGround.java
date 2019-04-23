package homeWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		String attribute = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("Link name is "+attribute);
		String attributeError = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		if(attributeError.contains("error.html")) 
			System.out.println("The page contains error.html");
		else
			System.out.println("The page is not broken");
		driver.findElementByXPath("//label/preceding-sibling::a").click();
		driver.navigate().back();
		List<WebElement> totalLinks = driver.findElementsByXPath("//section[@class='innerblock']/div");
		System.out.println("Number of links in the page "+totalLinks.size());
		//driver.close();
	}

}
