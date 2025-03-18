package projectmaven.TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreports {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void launch() {
				
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://artoftesting.com/samplesiteforselenium";
		driver.get(URL);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
	
	}
@Test
public void extentreport() {
		
	 report = new ExtentReports("D:\\eclipse-workspace\\TestNG\\reports\\extentreport.html");
	 test = report.startTest("demo execution");
	
	WebElement link = driver.findElement(By.partialLinkText("a link"));
	link.click();

	WebElement text = driver.findElement(By.xpath("//input[contains(@id,'fname')]"));
	text.sendKeys("Raziya");

	WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	button.click();
	
	
	
	//doubleclick need to use Actions class
	
	Actions act = new Actions(driver);
	WebElement alert = driver.findElement(By.id("dblClkBtn"));
	act.doubleClick(alert).perform();
	Alert obj = driver.switchTo().alert();
	obj.accept();

//radiobut using following siblings
	WebElement radiobutton = driver
			.findElement(By.xpath("//input[@id='male']//following-sibling::input[@id='female']"));
	radiobutton.click();

	// checkboxes using preceding siblings
	WebElement chkbox = driver
			.findElement(By.xpath("//input[@class='Performance']//preceding-sibling::input[@class='Automation']"));
	chkbox.click();

	// dropdown
	WebElement dropdown = driver.findElement(By.id("testingDropdown"));
	Select dd = new Select(dropdown);
	dd.selectByIndex(1);
	
		
	// generate alert text
	WebElement alttext = driver.findElement(By.xpath("//button[text()='Generate Alert Box']"));
	if (alttext.isDisplayed()) {
		alttext.click();
		//System.out.println("Hi! Art Of Testing, Here!");
		test.log(LogStatus.PASS,"Hi! Art Of Testing, Here!");
	} else {
		//System.out.println("alert not found!");
		test.log(LogStatus.FAIL, "alert not found!");
	}
	Alert obj2 = driver.switchTo().alert();
	obj2.accept();

	// generate confirm alert text
	WebElement confirmalt = driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
	if (confirmalt.isDisplayed()) {
		confirmalt.click();
		//System.out.println("Press a button!");
		test.log(LogStatus.INFO,"Press a button!");
	} else {
		//System.out.println("alert not found!");
		test.log(LogStatus.FAIL, "alert not found!");
	}
	Alert obj3 = driver.switchTo().alert();
	obj3.dismiss();

	// drag and drop
	// WebElement on which drag and drop operation needs to be performed
	WebElement fromElement = driver.findElement(By.id("myImage"));

	// WebElement to which the above object is dropped
	WebElement toElement = driver.findElement(By.id("targetDiv"));

	// Creating object of Actions class to build composite actions
	Actions builder = new Actions(driver);

	// Building a drag and drop action
	Action dragAndDrop = builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();

	// Performing the drag and drop action
	dragAndDrop.perform();

	// ancestor xpath
	WebElement ancestor = driver
			.findElement(By.xpath("//h1[text()='Sample Webpage for Automation Practice']//ancestor::body"));
	if (ancestor.isDisplayed()) {
		//System.out.println("sample web page for Automation practice");
		test.log(LogStatus.PASS,"sample web page for Automation practice");
	} else {
		//System.out.println("sample page not displayed");
		test.log(LogStatus.FAIL, "sample page not displayed");
	} 
}
	@AfterMethod
	public void close() {
		driver.close();
		report.endTest(test);
	report.flush();
}

}

