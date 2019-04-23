package week4Day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//Chrome driver details
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To disable notification 
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String searchName="TestLeaf";
		//Login
		driver.get("https://www.facebook.com/login/");
		driver.findElementByXPath("//input[@type='text']").sendKeys("kalaisonai@gmail.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("kalaisonai91");
		driver.findElementById("loginbutton").click();
		//Search for TestLeaf
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@class='_1frb']").sendKeys(searchName);
		driver.findElementByXPath("//button[@aria-label='Search']").click();
		//Check the result
		String resultName = driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").getText();
		if(searchName.equalsIgnoreCase(resultName))
			System.out.println(searchName+" is available in search result");
		else
			System.out.println(searchName+" is available not in search result "+resultName);
		Thread.sleep(3000);
		//Check the Like button , like it if not
		String likeText = driver.findElementByXPath("(//div[text()='TestLeaf']/following::button)[1]").getText();
		System.out.println("Like text "+likeText);
		if(likeText.equalsIgnoreCase("like")) {
			driver.findElementByXPath("(//div[text()='TestLeaf']/following::button)[1]").click();
			System.out.println("Button liked");
		}
		else if (likeText.equalsIgnoreCase("liked")) {
			System.out.println("Already Liked");
		}
		else {
			System.out.println("Like is not available");
		}
		//Select TestLeaf
		driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
		//Check if the title contains TestLeaf
		String title = driver.getTitle();
		if(title.contains(searchName))
			System.out.println("Page title is "+title+" and it contains "+searchName);
		//Get the likes
		String like = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
		System.out.println("Number of Likes "+like);
		//Get the Rating
		String rating = driver.findElementByXPath("//span[contains(text(),'out of 5')]").getText();
		System.out.println("Rating for this page is "+ rating);
		//Logout
		driver.findElementById("userNavigationLabel").click();
		driver.findElementByXPath("//span[text()='Log Out']").click();
		Thread.sleep(2000);
		driver.close();

	}

}
