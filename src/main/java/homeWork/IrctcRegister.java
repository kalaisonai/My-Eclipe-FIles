package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is "+title);
		/*WebElement countryDD = driver.findElementById("userRegistrationForm:countries");
		Select country=new Select(countryDD);
		List<WebElement> countryList = country.getOptions();
		for(WebElement element:countryList) {
			System.out.println("Country "+element.getText());
		}*/
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("kalaisonai");
		driver.findElementById("userRegistrationForm:password").sendKeys("Aravind1");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Aravind1");
		WebElement securityDropDown = driver.findElementById("userRegistrationForm:securityQ");
		Select secDD=new Select(securityDropDown);
		secDD.selectByValue("1");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("school");
		WebElement languageDD = driver.findElementById("userRegistrationForm:prelan");
		Select langDD=new Select(languageDD);
		langDD.selectByVisibleText("English"); 
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Kalai");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Selvi");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Sonai");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dayDD = driver.findElementById("userRegistrationForm:dobDay");
		Select day=new Select(dayDD);
		day.selectByVisibleText("04");
		WebElement monthDD = driver.findElementById("userRegistrationForm:dobMonth");
		Select month=new Select(monthDD);
		month.selectByVisibleText("MAY");
		WebElement yearDD = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year=new Select(yearDD);
		year.selectByVisibleText("1991");
		Select occupation=new Select(driver.findElementById("userRegistrationForm:occupation"));
		occupation.selectByIndex(3);
		WebElement countryDD = driver.findElementById("userRegistrationForm:countries");
		Select country=new Select(countryDD);
		country.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("kalaisonai@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876514310");
		WebElement nationalityDD = driver.findElementById("userRegistrationForm:nationalityId");
		Select nationality=new Select(nationalityDD);
		nationality.selectByVisibleText("India");	
		driver.findElementById("userRegistrationForm:address").sendKeys("19/8,Indra Illam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600091",Keys.TAB);
		//Webdriver Wait
		Thread.sleep(500);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userRegistrationForm:cityName")));
		WebElement cityDD = driver.findElementById("userRegistrationForm:cityName");
		Select city=new Select(cityDD);
		city.selectByIndex(1);
		//Webdriver Wait
		Thread.sleep(500);
		WebDriverWait wait1=new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("userRegistrationForm:postofficeName")));
		
		WebElement postalDD = driver.findElementById("userRegistrationForm:postofficeName");
		Select post=new Select(postalDD);
		post.selectByIndex(1);	
		driver.findElementById("userRegistrationForm:landline").sendKeys("9876543210");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();


}

}
