package week4Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(windowHandles);
		System.out.println(list);
		driver.switchTo().window(list.get(list.size()-1));
		driver.manage().window().maximize();
		String pageSource = driver.getPageSource();
		System.out.println("Page Source "+ pageSource);
		String title = driver.getTitle();
		System.out.println("Child title "+title);
		driver.switchTo().window(list.get(0)).close();
		Thread.sleep(2000);
		//driver.switchTo().window(list.get(1)).close();
		driver.close();

	}

}
