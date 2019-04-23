package week4Day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		//Chrome driver details
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Get URL for zoom car site
		driver.get("https://www.zoomcar.com/chennai");
		//Select Start Journey
		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		//Selecting first location from 'POPULAR PICK-UP POINTS'
		driver.findElementByXPath("(//div[@class='items'])[2]").click();
		//Select Next
		driver.findElementByXPath("//button[text()='Next']").click();
		// Get the current date
		Date date = new Date();
		// Get only the date (and not month, year, time etc)
		DateFormat sdf = new SimpleDateFormat("dd");
		// Get today's date
		String today = sdf.format(date);
		// Convert to integer and add 1 to it
		Integer tomorrow = Integer.parseInt(today)+1;
		// Print tomorrow's date
		System.out.println("Tomorrow "+tomorrow);
		//Selecting tomorrow date
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"') and @class='day low-price']").click();;
		//Select Next
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(2000);
		String confirmDate = driver.findElementByXPath("//div[@class='day picked low-price']").getText();
		String stringDate = tomorrow.toString();
		System.out.println("Date in Confirm page "+confirmDate);
		if(confirmDate.contains(stringDate))
			System.out.println("Selected Date is present in Conform page");
		else
			System.out.println("Selected Date is not present ");
		//Select Done in Confirm page
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(2000);
		//Creating list for price
		List<String> price=new ArrayList<String>();
		//List<String> dupPrice=new ArrayList<String>();
		//Get the price from the list
		List<WebElement> priceElement = driver.findElementsByXPath("//div[@class='price']");
		System.out.println("Number of price "+priceElement.size());
		for (WebElement webElement : priceElement) {
			price.add(webElement.getText());
		}
		System.out.println("Price list "+price);
		//dupPrice.addAll(price);
		String maxPrice = Collections.min(price);
		//		Collections.sort(price);
		System.out.println("Highest price "+price.get((priceElement.size()-1)));

		List<String> carName=new ArrayList<String>();
		List<WebElement> name = driver.findElementsByXPath("//h3");
		for (WebElement element : name) {
			carName.add(element.getText());
		}
		System.out.println("Car Names "+carName);
		//System.out.println("Car Price "+dupPrice);
		//Finding index of high price
		//String index = price.get((price.size()-1));
		System.out.println("Car with highest price "+maxPrice);
		int indexOf = price.indexOf(maxPrice);
		System.out.println("Index of high price car "+indexOf);
		String carWithMaxPrice = carName.get(indexOf);
		System.out.println("Car name with highest price!!!!!"+carWithMaxPrice);
		//Another method
		//driver.findElementByXPath("")

	}




}
