package projectmaven.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mouse_draganddrop {
WebDriver driver;
	
	//@Parameters({"URL"})
	@BeforeMethod
	public void launch_URL() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	
	}
	@Test
	public void mouse_actions() throws InterruptedException {
				//drag and drop
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions obj=new Actions(driver);
		obj.clickAndHold(drag).moveToElement(drop).release().build().perform();
		WebElement droppable=driver.findElement(By.id("droppable"));
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("item dropped succefully");
		}else {
			System.out.println("item not able to dropped");
		}
	}
		@Test
		public void mouse_revertactions() throws InterruptedException {
			
			//revert drag and drop
			WebElement revert=driver.findElement(By.xpath("//a[text()='Revert draggable position']"));
			revert.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame(0);
			WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop=driver.findElement(By.id("droppable"));
			Actions obj=new Actions(driver);
			obj.dragAndDrop(drag,drop).perform();
			WebElement drag2=driver.findElement(By.xpath("//div[@id='draggable2']"));
			WebElement drop2=driver.findElement(By.id("droppable"));
			//obj.dragAndDrop(drag2,drop2).perform(); (or)down code also can use
			obj.clickAndHold(drag2).moveToElement(drop2).perform();
			WebElement droppable=driver.findElement(By.id("droppable"));
			if(droppable.getText().equals("Dropped!")) {
				System.out.println("item dropped succefully");
			}else {
				System.out.println("item not able to dropped");
			}
			
}
}