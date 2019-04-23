package homeWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLeafGround {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		Point location = driver.findElementById("position").getLocation();
		System.out.println("Position "+location);
		String color = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Button color is "+color);
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Height & Width "+size);
		driver.findElementByXPath("//button[@id='home']").click();
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./snps/img.png"));
		
		
		driver.close();
	}

}
