package classRoomExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		System.out.println(drag.getLocation());
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();
		//builder.contextClick().perform();
		//WebElement link = driver.findElementByPartialLinkText("Resizable");
		driver.findElementByPartialLinkText("Resizable").click();;
		//builder.contextClick(link).perform();
		
		
		
	}
}
