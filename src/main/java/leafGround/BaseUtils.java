package leafGround;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class BaseUtils {
	static ChromeDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/home.html");
		List<WebElement> allOptions = driver.findElementsByXPath("//a/h5");
		for(WebElement ele:allOptions){
			System.out.println(ele.getText());
		}
	}
	@AfterMethod
	public void windUp() {
		driver.close();
	}

}
