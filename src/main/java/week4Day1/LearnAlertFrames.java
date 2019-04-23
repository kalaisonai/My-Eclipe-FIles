package week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAlertFrames {

	public static void main(String[] args) throws InterruptedException {
		String name="kalai";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-work-with-iframes-in-selenium-webdriver");
		/*driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(4);
		String text = driver.findElementByXPath("//span[@contains]").getText();
		System.out.println(text);*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");//Frame by ID
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@name='f1b9abdb6f151f4']"));
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert= driver.switchTo().alert();

		String alertText = myAlert.getText();
		System.out.println("My Alert message "+alertText);
		myAlert.sendKeys(name);
		//Webdriver wait
		Thread.sleep(500);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		//myAlert.accept();
		String text = driver.findElementById("demo").getText();
		if(text.contains(name)) 
			System.out.println("Alert text conatins "+name);
		else
			System.out.println("Name not present in alert text "+text);
		driver.close();


	}

}
