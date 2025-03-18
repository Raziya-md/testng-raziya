package projectmaven.TestNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.common_methods;

public class workingwithwebtables {
	WebDriver driver;
	@BeforeMethod
	public void Launch_URL() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getCurrentUrl());

		}
	@Test
	public void webtables() throws IOException {
List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
List<WebElement> coloumns = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
System.out.println( "total number of rows:" +  rows.size());
WebElement name=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[1]"));
	name.getText();
	System.out.println(name.getText());
	//for(i=2;i<rows.size();i++) {
		//String col1= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[1]")).getText();	
	TakesScreenshot objscr=((TakesScreenshot)driver);
	File srcfile =objscr.getScreenshotAs(OutputType.FILE);
	File Destlocation=new File("D:\\eclipse-workspace\\TestNG\\reports/sample.png");
	FileUtils.copyFile(srcfile,Destlocation);		
	}
	}
