package leafGround;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class UploadFile extends BaseUtils{
	@Test
	public void upload() throws InterruptedException, AWTException, IOException {
		
		
		Properties prob= new Properties();
		FileInputStream fileInputStream= new FileInputStream("C:\\Selenium Workspace\\Selenium\\src\\main\\java\\leafGround\\Data.properties");
		prob.load(fileInputStream);
		
		
		driver.navigate().to("http://www.leafground.com/pages/upload.html");
		driver.findElementByXPath("//input[@type='file']").sendKeys(prob.getProperty("path"));
		Thread.sleep(3000);
		
		
		
		driver.findElementByXPath("//input[@type='file']").click();
		StringSelection stringSelection=new StringSelection(prob.getProperty("path1"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	


}
