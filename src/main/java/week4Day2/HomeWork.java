package week4Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		String mailID="kalaiselvis@gmail.com";
		String passWord="Aravind1";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Register']").click();
		driver.findElementById("emailNew").sendKeys(mailID);
		driver.findElementById("passwordNew").sendKeys(passWord);
		driver.findElementById("confirmNew").sendKeys(passWord);
		driver.findElementById("checkTerms").click();
		driver.findElementById("buttonRegister").click();
		try {
			//System.out.println("Check if User Exist already");
			WebElement findElementByXPath = driver.findElementByXPath("//div[@class='dropdown'][1]");
			System.out.println("User Registered Successfully"+findElementByXPath);

		} catch (Exception e) {
			//Accept the alert
			Alert myAlert= driver.switchTo().alert();
			myAlert.accept();
			System.out.println("Email id is already registered, Please Login");
			//Proceed to login page
			driver.navigate().back();
			//Login with already registered creds
			driver.findElementById("email").sendKeys(mailID);
			driver.findElementById("password").sendKeys(passWord);
			driver.findElementById("buttonLogin").click();
		}
		//Mouse hover and Select User Options
		Actions builder=new Actions(driver);
		WebElement findElementByXPath = driver.findElementByXPath("//div[@class='dropdown'][1]");
		builder.moveToElement(findElementByXPath).pause(2000).perform();
		driver.findElementByXPath("//a[text()='Reset test data']").click();
		driver.findElementById("buttonRTD").click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();;
		//Select Vendor
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement vendor = driver.findElementByXPath("//button[text()=' Vendors']");
		builder.moveToElement(vendor).pause(2000).perform();
		driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		driver.findElementById("vendorTaxID").sendKeys("DE767565");
		driver.findElementById("buttonSearch").click();
		try {
			String vendorName = driver.findElementByXPath("//table//td[1]").getText();
			System.out.println("Vendor Name is "+vendorName);
		}
		catch (Exception e) {
			System.out.println("No vendor based on the taxid you have entered could be found in the database");
		}
		System.out.println(driver.getTitle());
		driver.close();
	}


}
