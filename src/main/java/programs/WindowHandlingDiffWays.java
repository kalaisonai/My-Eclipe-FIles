package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingDiffWays {

	@Test
	public void setMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		String parentWindow = driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(window);
		driver.switchTo().window(list.get(list.size()-1));
		System.out.println("1 "+driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println("2 "+driver.getTitle());
		driver.executeScript("document.body.style.zoom='150%'", "");
		Thread.sleep(3000);
		//driver.close();

	}

	@Test(enabled=false)
	public void byPageTitle() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> allWindows= driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			String title = driver.getTitle();
			if(title.contains("HyperLinks")) 
				break;
		}
		System.out.println("2 "+driver.getTitle());
		driver.close();
	}
		@Test(enabled=false)
		public void hasNextMethod1() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.leafground.com/pages/Window.html");
			driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
			Set<String> allWindows= driver.getWindowHandles();
			Iterator<String> allwindowHandles=allWindows.iterator();
			boolean hasNext = allwindowHandles.hasNext();
			if(hasNext)
				driver.switchTo().window(allwindowHandles.next());
			System.out.println("3 "+driver.getTitle());
			driver.close();
		}
		


	}





