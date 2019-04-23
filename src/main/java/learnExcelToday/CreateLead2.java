package learnExcelToday;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead2 extends BaseUtil2 {
	@BeforeTest
	public void setFileName()
	{
		fileName = "MyWorkSheet";
		sheetName="SheetTwo";
	}
	
	@Test(dataProvider="CreateLeadData"/*,expectedExceptions=Exception.class*/)
	public  void createLead(String compName,String FName,String LName) throws InterruptedException {
		System.out.println("Inside @Test");
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
		driver.findElementByName("submitButton").click();
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		driver.findElementByLinkText("Edit").click();
		//Drop Down
		WebElement industry = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1=new Select(industry);
		dd1.selectByVisibleText("Computer Software");//Select by visible text
		WebElement ownership = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select dd2=new Select(ownership);
		List<WebElement> dropDown = dd2.getOptions();
		dd2.selectByIndex(dropDown.size()-1);//Select by index
		WebElement submitButton = driver.findElementByClassName("smallSubmit");
		WebElement currency = driver.findElementById("updateLeadForm_currencyUomId");
		Select dd3=new Select(currency);
		dd3.selectByValue("INR");//select by value
		submitButton.click();
		//WebElement userName=driver.findElementById("username",Keys.TAB);
		//Thread.sleep(3000);
	}




}


