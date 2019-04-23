package leafGround;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonPgae extends BaseUtils{
	@BeforeMethod
	public void buttonClick() {
		driver.findElementByXPath("//h5[text()='Button']").click();
		driver.navigate().back();
		driver.findElementByXPath("//h5[text()='Button']/parent::a").sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}

	@Test(enabled=true)
	public void buttonPage() {
		driver.findElementByXPath("//button[@id='home']").click();
		//To navigate back to Button page
		Actions builder=new Actions(driver);
		builder.click(driver.findElementByXPath("//h5[text()='Button']")).perform();
		int x = driver.findElementById("position").getLocation().getX();
		int y = driver.findElementById("position").getLocation().getY();
		System.out.println("X location "+x+" & Y location "+y);
		String color = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Color "+color);
		Dimension buttonSize = driver.findElementById("size").getSize();
		System.out.println("Button size "+buttonSize);
	}


}
