package projectmaven.TestNG;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class workingwith_cssselector1 {
WebDriver driver;
	
@Parameters({"URL"})
	@BeforeMethod
	public void Dmartlogin(String URL) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get(URL);
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void tc_01() throws IOException {
	
		//report = new ExtentReports("D:\\eclipse-workspace\\TestNG\\reports\\extentreport.html");
		//radiobtn2.click(); test = report.startTest("demo execution");
		 
		//verify the page
		WebElement verify_pagetitle=driver.findElement(By.xpath("//title[text()='Practice Page']"));
		if (verify_pagetitle.isDisplayed()) {
			System.out.println("page tilte displayed successfully");
			//test.log(LogStatus.PASS,"page tilte Practice Page displayed successfully");
		}else {
			System.out.println("page tilte Practice Page not displayed successfully");
			//test.log(LogStatus.FAIL,"page tilte Practice Page not displayed successfully");
		}
	    WebElement chkbox1=driver.findElement(By.cssSelector("#checkBoxOption1"));
	    chkbox1.click();  //css id locater
	    WebElement chkbox3=driver.findElement(By.cssSelector("input#checkBoxOption3"));
	    chkbox3.click();
	    
	   // TakesScreenshot objscr=((TakesScreenshot)driver);
		//File srcfile =objscr.getScreenshotAs(OutputType.FILE);
		//File Destlocation=new File("D:\\eclipse-workspace\\TestNG\\reports/css.png");
		//FileUtils.copyFile(srcfile,Destlocation);
		
		WebElement txtbox=driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input"));
	    txtbox.clear();
		txtbox.sendKeys("India");  //css classname locater
		
	    
	    WebElement radiobtn1=driver.findElement(By.cssSelector("input[value='radio1']"));
	    radiobtn1.click();  //css attribute locater
	    
	   // common_methods obj = new common_methods();
		//obj.captureimage(driver);
	    
	    WebElement radiobtn2=driver.findElement(By.cssSelector("[value='radio2']"));
	    radiobtn2.click();
	    	    /*  if (radiobtn2.isDisplayed()){
	    	radiobtn2.click();
	    	test.log(LogStatus.PASS,"radio2 is displayed");
	    }else {
	    	test.log(LogStatus.FAIL,"radio2 is not dispalyed");
	    }  */
		
		}
	
}
