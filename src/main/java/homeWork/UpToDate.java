package homeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class UpToDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//login
		driver.get("https://qawww.utdlab.com/contents/search");
		driver.findElementByLinkText("Log In").click();
		driver.findElementById("userName").sendKeys("qauser22");
		driver.findElementById("password").sendKeys("Uptodate1");
		boolean remember = driver.findElementById("remember").isSelected();
		if(remember==false)
			driver.findElementById("remember").click();
		else 
			System.out.println("User Name is already remembered");
		driver.findElementById("btnLoginSubmit").click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Page after login is "+title);
		//Check CME value
		Thread.sleep(5000);
		String cmeValue = driver.findElementByXPath("(//span[@class='wkUtdCmeValue'])[2]").getText();
		System.out.println("CME value is "+cmeValue);
		float number = Float.parseFloat(cmeValue);
		//Do search when CME is 0
		if(number==0){
			System.out.println("CME value is not available. Please do search and gain some CME");
			driver.findElementById("tbSearch").sendKeys("heart",Keys.ENTER);
			Thread.sleep(3000);
			driver.findElementByXPath("(//div[@class='search-result'])[1]/a").click();
			driver.findElementById("tbSearch").clear();
			Actions builder= new Actions(driver);
			builder.click(driver.findElementById("tbSearch")).sendKeys("ey").pause(3000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
			
			//driver.findElementById("tbSearch").sendKeys("eye",Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ENTER);
			Thread.sleep(3000);
			driver.findElementByXPath("(//div[@class='search-result'])[1]/a").click();
			driver.navigate().refresh();
			
		}
		//CME from header
		driver.findElementById("cmeTickerDesktopHeader").click();
		Thread.sleep(2000);
		//CME setting change
		driver.findElementById("sidebarDesktopCmeSettings").click();
		Thread.sleep(2000);
		String firstSetting = driver.findElementByXPath("(//ul[@class='cme-credits-list']//div)[2]/h4").getText();
		System.out.println("First setting is "+firstSetting);
		if(firstSetting.contains("AMA PRA Category 1 Credit™"))
			driver.navigate().back();
		else {
		driver.findElementByXPath("//h4[text()='AMA PRA Category 1 Credit™']").click();
		driver.findElementByXPath("//button[@class='footer-button footer-button-confirm button-left']").click();
		}
		//Redeem
		driver.findElementByXPath("//button[contains(text(),'Redeem')]").click();
		/*//Month Range selection
		driver.findElementByXPath("//button[text()='Month Range']").click();
		Select fromDD=new Select(driver.findElementByXPath("//select[1]"));
		fromDD.selectByIndex(25);
		Select toDD=new Select(driver.findElementByXPath("(//select)[2]"));
		toDD.selectByIndex(1);*/
		
		String creditHour = driver.findElementByXPath("//button[@class='hourFilter active']").getText();
		//Check for credit based
		if(creditHour.contains("Credit")) { 
			driver.findElementByXPath("//input[@name='0']").click();
			//Continue with CME submission for hours based
			driver.findElementByXPath("//button[@class='footer-button button-right footer-button-confirm']").click();
			driver.findElementByXPath("(//div[@class='select-container'])[1]//input").click();
			driver.findElementByXPath("(//div[@class='select-container'])[2]//input").click();
			driver.findElementByXPath("//button[@class='footer-button button-left footer-button-confirm']").click();
		}
		//Check for hour based
		else if (creditHour.contains("Hour")) {
			driver.findElementByXPath("//input[@name='0']").click();
			boolean continueEnable = driver.findElementByXPath("//button[@class='footer-button button-right footer-button-confirm']").isEnabled();
			while(continueEnable==false)
			{
				driver.findElementByXPath("(//input[@type='checkbox'])").click();	
			}
		}
		//Continue with CME submission for hours based
		//driver.findElementByXPath("//button[@class='footer-button button-right footer-button-confirm']").click();
		driver.findElementByXPath("//button[@class='footer-button button-center-wide footer-button-confirm']").click();
		driver.findElementByXPath("//a[contains(text(),'Download')]").click();
		driver.findElementByXPath("//button[contains(text(),'Go to Online MOC')]").click();
		Thread.sleep(2000);
		//driver.close();
	}

}
