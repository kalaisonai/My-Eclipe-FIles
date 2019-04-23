package leafGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsPage extends BaseUtils{

	@BeforeMethod
	public void windowsClick() {
		driver.findElementByLinkText("Window").click();
		String windowText = driver.findElementByTagName("h1").getText();
		System.out.println(windowText);
	}
	@Test
	public void windowsMainMethod() {
		driver.findElementByXPath("//button[text()='Open Home Page']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(list.size()-1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.switchTo().window(list.get(1)).close();
	}

}
