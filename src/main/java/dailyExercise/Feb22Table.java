package dailyExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb22Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		//Headers in web table
		List<WebElement> headerElements = driver.findElementsByXPath("//div[@class='x-grid3-header-offset']");
		for(WebElement element:headerElements) {
			System.out.println("Header elements "+ element.getText());
		}
		
		//All data in web table
		List<WebElement> tableElements = driver.findElementsByXPath("//div[@class='x-panel-body xedit-grid']");
		System.out.println(" All table elements");
		for(WebElement element:tableElements) {
			System.out.println(element.getText());
		}

	}

}
