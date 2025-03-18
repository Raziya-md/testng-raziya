package projectmaven.TestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class fileclass_properties {
	WebDriver driver;

@Test
public void launch_URL() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	Properties obj=new Properties();
	try {
	FileInputStream obj1 =new FileInputStream("D:\\eclipse-workspace\\TestNG\\config.properties");
	obj.load(obj1);
	String URL=obj.getProperty("URL");
	driver.get(URL);
	System.out.println(URL);
	}catch(Exception e){
		System.out.println(e);
	}
	driver.manage().window().maximize();
	
	
}
}