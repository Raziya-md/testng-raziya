package projectmaven.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class list_foreachloop {
WebDriver driver;
	
	
	@BeforeMethod
	public void launch_URL() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://practice.expandtesting.com/dropdown");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void list_foreach() {
List<WebElement> countries =driver.findElements(By.xpath("//select[@id='country']//option"));
	System.out.println(countries.size());
	for (WebElement c:countries) {    //not able to get the text showing xpath in console why???
		String values=c.getText();
		System.out.println(values);
	}
	List<WebElement> elements =driver.findElements(By.xpath("//select[@id='elementsPerPageSelect']//option"));
	System.out.println(elements.size());
		for (WebElement e:elements) {
		String value=e.getText();
		System.out.println(value);
		
	}
	
	
}
}
