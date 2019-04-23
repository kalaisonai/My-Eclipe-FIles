package week5Day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseUtil1 {
	public String excelName;
	public ChromeDriver driver;
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
	public String[][] getData() {
		String[][] createData=new String[2][3];
		createData[0][0]="Company1";
		createData[0][1]="kalai";
		createData[0][2]="selvi";
		createData[1][0]="Company2";
		createData[1][1]="Aravind";
		createData[1][2]="mohandas";
		return createData;
	}
	
	
	
	/*@DataProvider(name="CreateLeadData")
	public String[][] getdata() throws IOException
	
	
	{
	String[][] create_Lead_Data=new String [2][3];
		create_Lead_Data[0][0]="Hexacorp";
		create_Lead_Data[0][1]="Sai";
		create_Lead_Data[0][2]="krishan";
		create_Lead_Data[1][0]="Hexacorp";
		create_Lead_Data[1][1]="Vikrem";
		create_Lead_Data[1][2]="vehda";
		return create_Lead_Data;
		
	}*/

}
