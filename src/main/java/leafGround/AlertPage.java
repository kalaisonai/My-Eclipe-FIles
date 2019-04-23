package leafGround;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class AlertPage extends BaseUtils{
	
	
	@BeforeMethod
	public void alert() {
		driver.findElementByLinkText("Alert").click();
		driver.findElementByXPath("//img[@alt='logo Testleaf']").click();
		driver.findElementByXPath("//img[contains(@src,'alert.png')]").click();		
	}
	@Test
	public void alertPage() {
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		alert.accept();
		String text = driver.findElementById("result").getText();
		System.out.println("Confrim Box "+text);
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		alert.sendKeys("TCS");
		alert.accept();
		String text1 = driver.findElementById("result1").getText();
		System.out.println("Prompt Box "+text1);
		
		//Split by \\n and Convert into String[] and check if the count is >1
		driver.findElementByXPath("//button[contains(text(),'Breaks')]").click();
		String text2 = alert.getText();
		System.out.println("Text 2 "+text2);
		String replaceAll[] = text2.split("\\n");
		if(replaceAll.length>1)
			System.out.println("The Alert text contains line break "+replaceAll.length);
		
		//Convert 2 lines into single and check if it any line breaks...
		String single=text2.replaceAll("\\n", "");
		System.out.println("Text2 "+single);
		String replaceAll1[] = single.split("\\n");
		System.out.println(replaceAll1+ "   "+ replaceAll1.length);
		if(replaceAll1.length>1)
			System.out.println("The Alert text contains line break");
		else
			System.out.println("No line breaks");


	}
}