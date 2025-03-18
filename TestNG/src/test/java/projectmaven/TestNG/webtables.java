package projectmaven.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class webtables {
WebDriver driver;
//@Parameters({"URL"})

@BeforeMethod
public void launch_URL() {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
}	
@Test
public void Webtables() {
	List<WebElement>rows=driver.findElements(By.xpath("//table[@name='courses']//tbody//tr"));
		System.out.println(rows.size());
		for(int i=2;i<=rows.size();i++) {
		for(int j=1;j<=3;j++) {
			String col=driver.findElement(By.xpath("//table[@name='courses']//tbody//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(col);
			if (col.equals("Write effective QA Resume that will turn to interview call")) {
				System.out.println("Write effective QA Resume that will turn to interview call exist in the table");
			}
		}
		}

	List<WebElement>rows2=driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody//tr"));
	System.out.println(rows2.size());
		for(int i=1;i<=rows2.size();i++) {
		for(int j=1;j<=4;j++) {
			String col1=driver.findElement(By.xpath("(//table[@id='product'])[2]//tbody//tr["+i+"]//td["+j+"]")).getText();
						if (col1.equals("Chennai")) {
							System.out.println("chennai exist in the table");
			}System.out.println(col1);
}
}
}
}
