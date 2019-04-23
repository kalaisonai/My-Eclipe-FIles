package leafGround;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesPage extends BaseUtils{
	@BeforeMethod
	public void framesLink() {
		driver.findElementByXPath("//div[@class='row']//h5[text()='Frame']").click();
		String FrameHeaderText = driver.findElementByTagName("h1").getText();
		System.out.println(FrameHeaderText);
	}
	@Test
	public void frameMainMethod() throws InterruptedException {
		//Switch to frame by webElement
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@src='default.html']"));
		//Confirm by getText()
		String frameText = driver.findElementByTagName("body").getText();
		System.out.println("Frame "+frameText);
		//Click button inside the frame
		WebElement buttonClick = driver.findElementByXPath("//button[@id='Click']");
		String beforeText = buttonClick.getText();
		System.out.println("Before Text "+beforeText);
		buttonClick.click();
		String AfterText = buttonClick.getText();
		System.out.println("After Text "+AfterText);
		driver.switchTo().parentFrame();
		System.out.println(driver.findElementByTagName("h1").getText());
		driver.executeScript("document.body.style.zoom='150'", "");
		Thread.sleep(3000);
		
		//Nested Frame
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@src='page.html']")).switchTo().frame("frame2");
		String frameText2 = driver.findElementByTagName("body").getText();
		System.out.println("Frame "+frameText2);
		WebElement buttonClick1 = driver.findElementByXPath("//button[@id='Click1']");
		String beforeText1 = buttonClick1.getText();
		System.out.println("Before Text "+beforeText1);
		buttonClick1.click();
		String AfterText1 = buttonClick1.getText();
		System.out.println("After Text "+AfterText1);
		driver.switchTo().defaultContent();
		driver.executeScript("document.body.style.zomm='90'", "");
		System.out.println(driver.findElementByTagName("h1").getText());
		
		//Number of frames
		
		System.out.println("Total frames "+driver.findElementsByTagName("iframe").size());
	}

}
