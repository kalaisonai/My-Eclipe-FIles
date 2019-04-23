package week3Day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Erail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver= new ChromeDriver();
		Set<Integer> setObj=new LinkedHashSet<Integer>();
		List<Integer> listObj=new ArrayList<Integer>();
		Set<String> nameObj=new TreeSet<String>();
		List<Integer> sortListObj=new ArrayList<Integer>();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Get the trains numbers from the page and sort it
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("mas",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("tvr",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> trainNumber = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]/a");
		int trainCount = trainNumber.size();
		System.out.println(trainNumber);
		for (WebElement element : trainNumber) {
			System.out.println(element.getText());
			setObj.add(Integer.parseInt(element.getText()));
		}
		int setSize = setObj.size();
		if(trainCount==setSize)
			System.out.println("Trains displayed without duplicates");
		else
			System.out.println("Train number contains duplicates");

		listObj.addAll(setObj);
		Collections.sort(listObj);
		System.out.println("Sorting "+listObj);
		
		//Get train names in alphabet order--> Used TreeSet to show them in alphabet order
		
		List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]/a");
		int nameSize = trainName.size();
		for (WebElement element1 : trainName) {
			nameObj.add(element1.getText());
		}
		System.out.println("Original name "+nameObj);
		nameObj.add("My Train");
		System.out.println("After adding Extra train "+nameObj);
		int setNameSize = nameObj.size();
		if(nameSize==setNameSize)
			System.out.println("Train names are unique");
		else
			System.out.println("Train names not unique");
		//On clicking train heading, the numbers will be sorted, get the result and compare with order that we sorted 
		driver.findElementByXPath("//a[@title='Click here to sort on Train Number']").click();
		List<WebElement> trainNumberSort = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]/a");
		//int trainCountNew = trainNumberSort.size();
		//System.out.println(trainNumberSort);
		for (WebElement element : trainNumberSort) {
			System.out.println(element.getText());
			sortListObj.add(Integer.parseInt(element.getText()));
		}
		System.out.println("After train sorting "+sortListObj);
		if(sortListObj.equals(listObj))
			System.out.println("Both sorting are equal");
		else
			System.out.println("Sorting differs");
	}

}
