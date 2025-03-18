package projectmaven.TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class browser_windowhandling {
	WebDriver driver;

	@BeforeTest
	public void launch_URL() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		System.out.println(driver.getCurrentUrl());
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@Test
	public void windowshandling() throws InterruptedException {
		WebElement newtab = driver.findElement(By.xpath("//button[text()='New Tab']"));
		newtab.click();
		String actwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(actwindow);
		System.out.println(childwindow);
		// driver.switchTo().window(actwindow); //back to parent window
		// driver.switchTo().defaultContent(); //other way
		Iterator<String> obj = childwindow.iterator();
		while (obj.hasNext()) {
			String text = obj.next();
			if (actwindow.equals(text)) {
				System.out.println("actwindow and childwindow are same");
			} else {
				driver.switchTo().window(text);
			}
		}
		WebElement verifywin1 = driver.findElement(By.xpath("//h1[text()='New Tab']"));
		verifywin1.getText();
		String txt = verifywin1.getText();
		System.out.println(verifywin1.getText());
		if (txt.equals("New Tab")) {
			System.out.println("New tab opened");
		} else {
			System.out.println("New tab not opened");
		}
		 driver.switchTo().window(actwindow); 
		 WebElement newwindow = driver.findElement(By.xpath("//button[text()='New Window']"));
			newwindow.click();
			Iterator<String> obj1 = childwindow.iterator();
			while (obj1.hasNext()) {
				String text1 = obj1.next();
				if (actwindow.equals(text1)) {
					System.out.println("actwindow and childwindow are same");
				} else {
					driver.switchTo().window(text1);
				}
			}
			WebElement verifywin2 = driver.findElement(By.xpath("//h1[text()='New Tab']"));
			verifywin2.getText();
			String txt1 = verifywin2.getText();
			System.out.println(verifywin2.getText());
			if (txt1.equals("New Tab")) {
				System.out.println("New window opened");
			} else {
				System.out.println("New window not opened");
			}
			//driver.close();
			driver.switchTo().window(actwindow); 
			 WebElement newwindowmsg = driver.findElement(By.xpath("//button[text()='New Window Message']"));
				newwindowmsg.click();
				Thread.sleep(1000);
				Iterator<String> obj2 = childwindow.iterator();
				while (obj2.hasNext()) {
					String text2 = obj2.next();
					if (actwindow.equals(text2)) {
						System.out.println("actwindow and childwindow are same");
					} else {
						driver.switchTo().window(text2);
					}
				}
				Thread.sleep(1000);
				WebElement verifywin3 = driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
				verifywin3.getText();
				String txt2 = verifywin2.getText();
				System.out.println(verifywin2.getText());
				if (txt2.equals("Selenium - Automation Practice Form")) {
					System.out.println("New windowmsg opened");
				} else {
					System.out.println("New windowmsg not opened");
			
	
}
				
				
}
}