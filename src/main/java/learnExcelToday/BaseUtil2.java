package learnExcelToday;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseUtil2 {
	public String fileName;
	public String sheetName;
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String uName,String pWord) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement userName=driver.findElementById("username");
		userName.sendKeys(uName);
		WebElement passWord= driver.findElementById("password");
		passWord.sendKeys(pWord);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	
	@DataProvider(name="CreateLeadData")
	public String[][] getdata() throws IOException	{
		return LearnExcel1.dataReadFromExcel(fileName,sheetName);
		
		
		
	}
}