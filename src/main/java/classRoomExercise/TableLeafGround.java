package classRoomExercise;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class TableLeafGround {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new  FirefoxDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		//first
		List<WebElement> columnCount = driver.findElementsByXPath("//tr[@class='even']/td");
		System.out.println("Total Column count "+ columnCount.size());
		//table//tr[2]/td
		List<WebElement> rowCount = driver.findElementsByXPath("//table[@cellspacing='0']//tr");
		System.out.println("Total row count "+ (rowCount.size()-1));
		//table/tbody/tr[*]/td/parent::tr
		//Third exercise
		WebElement progressValue = driver.findElementByXPath("//font[contains(text(),'Learn to interact with')]/following::font[1]");
		String text = progressValue.getText();
		System.out.println("Progress % of Learn to interact with "+text);
		//System.out.println(Integer.parseInt(text));
		//Third Exercise
		List<WebElement> percentage = driver.findElementsByXPath("//font[contains(text(),'%')]");
		int size = percentage.size();
		System.out.println("Total % Size "+size);
		//Fourth Exercise
		List<WebElement> percentageValue = driver.findElementsByXPath("//font[contains(text(),'%')]");
		int percentCount = percentageValue.size();
		int[] Arravalue=new int [percentCount];
		int i=0;
		for(WebElement element:percentageValue) {
			String value=element.getText();
			String spaceValue=value.replaceAll("%", "");
			int percentInInt=Integer.parseInt(spaceValue);
			Arravalue[i]=percentInInt;
			System.out.println("Array "+Arravalue[i]);
			i++;
		}
		//sorting Array to find lowest value
		Arrays.sort(Arravalue);
		System.out.println("Least % value "+Arravalue[0]);
		//dynamically passed the lowest value to the Xpath
		/*WebElement minValue = driver.findElementByXPath("(//font[contains(text(),'"+Arravalue[0]+"')]/preceding::font)[8]");
		System.out.println(minValue.getText());*/
		driver.close();
	}

}

