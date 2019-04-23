package homeWork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditLeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new  FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kalaisonai@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("text");
		String fieldValue = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println("Default text in the field "+fieldValue);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		if(enabled==true) 
			System.out.println("The field is enabled");
		else
			System.out.println("The field in disabled");
		driver.close();
	}

}
