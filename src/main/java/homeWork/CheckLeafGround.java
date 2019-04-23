package homeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//TO UNCHECK THE CHECKED BOX
		
		/* List<WebElement> checkBoxCount = driver.findElementsByXPath("//input[@type='checkbox']");
		 for(WebElement element:checkBoxCount) {
				if(element.isSelected()) {
					element.click();
				}
			}*/
		
		driver.findElementByXPath("//input[@type='checkbox'][1]").click();
		driver.findElementByXPath("//input[@type='checkbox'][3]").click();
		boolean selected = driver.findElementByXPath("//label[contains(text(),'Confirm Selenium is')]/following-sibling::input").isSelected();
		if(selected==true)
			System.out.println("The checkbox is selected");
		else
			System.out.println("The checkbox is not selected");
		boolean deselect = driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following-sibling::input[1]").isSelected();
		if(deselect==true)
			driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following-sibling::input[1]").click();
		else
			driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following-sibling::input[2]").click();
		List<WebElement> selectAll = driver.findElementsByXPath("//label[contains(text(),'Select all')]/following-sibling::input");
		for(WebElement element:selectAll) {
			if(!element.isSelected()) {
				element.click();
			}
		}
		driver.close();
	}

}
