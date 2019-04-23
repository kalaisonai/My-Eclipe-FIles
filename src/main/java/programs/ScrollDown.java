package programs;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException, AWTException {

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//new Select(element)
		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");


		int y = driver.findElementByLinkText("Xpert Conexions").getLocation().getY();

		// Way 1										   //x,y
		((JavascriptExecutor) driver).executeScript("scroll(0,"+y+");");
		driver.executeScript("document.body.style.zoom='60%'", "");

		// Way 2
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();		*/
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList= new ArrayList<String>();
		windowList.addAll(windowHandles);
		driver.switchTo().window(windowList.get(windowList.size()-1));
		driver.close();
		driver.quit();

	}
}
