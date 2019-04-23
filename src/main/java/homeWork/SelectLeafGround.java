package homeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLeafGround {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement indexDD = driver.findElementById("dropdown1");
		Select index=new Select(indexDD);
		index.selectByIndex(1);
		//Thread.sleep(3000);
		WebElement textDD = driver.findElementByName("dropdown2");
		Select text=new Select(textDD);
		text.selectByVisibleText("Appium");
		//Thread.sleep(3000);
		WebElement valueDD = driver.findElementById("dropdown3");
		Select value=new Select(valueDD);
		value.selectByValue("3");
		//Thread.sleep(3000);
		
		WebElement countDD = driver.findElementByClassName("dropdown");
		Select count=new Select(countDD);
		System.out.println("Total options in DD "+count.getOptions().size());
		driver.close();
	}

}
