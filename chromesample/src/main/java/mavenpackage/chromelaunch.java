package mavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUBINA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver obj= new ChromeDriver();


	}

}
