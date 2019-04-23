package leafGround;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablePage extends BaseUtils{
	@BeforeMethod
	public void tableClick() {
		driver.findElementByLinkText("Table").click();
		driver.navigate().back();
		driver.findElementByXPath("//img[contains(@src,'images/table.png') ]").click();
	}
	@Test
	public void webTablePage() {
		List<WebElement> columnCount = driver.findElementsByXPath("//table//tr[2]//td");
		System.out.println("Total Column count is "+columnCount.size());
		List<WebElement> rowCount = driver.findElementsByXPath("//table//tr/td//parent::tr");
		System.out.println("Total row count is "+rowCount.size());
		WebElement progress = driver.findElementByXPath("//font[contains(text(),'Learn to interact with')]//following::font[1]");
		String text = progress.getText().replace("%", "");
		System.out.println("Progress is " +text);
		List<Integer> list = new ArrayList<Integer>();
		List<WebElement> allProgress = driver.findElementsByXPath("//tr//td[2]");
		System.out.println("All progress "+allProgress.size());
		for (WebElement webElement : allProgress) {
			String eachProgress = webElement.getText().replace("%", "");
			list.add(Integer.parseInt(eachProgress));
		}
		System.out.println("Least Progress value "+Collections.min(list));
		System.out.println("Highest Progress value "+Collections.max(list));
	}

}
