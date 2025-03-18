package projectmaven.TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class window_snippet {
	WebDriver driver;
	
	@Test
	public void window_handling() {
	
		// Set up WebDriver for Chrome (update path to your chromedriver)
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
        
        // Open multiple tabs (this is just an example, you can open them based on your needs)
        driver.get("https://www.google.com");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.yahoo.com', '_blank');");

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        
        // Iterator to iterate over the window handles
        Iterator<String> iterator = windowHandles.iterator();
        
        // Store the first window handle (the one you want to keep open)
        String mainWindowHandle = iterator.next();  // First window handle

        // Close all other windows/tabs
        while (iterator.hasNext()) {
            String currentWindowHandle = iterator.next();
            driver.switchTo().window(currentWindowHandle);
            driver.close();
        }

        // Switch back to the main window/tab
        driver.switchTo().window(mainWindowHandle);
        
        // Now only one tab (the main tab) will remain open.
        System.out.println("Only one tab remains open!");

        // You can continue performing actions on the remaining tab here.
        
        // Example: Close the remaining tab
        // driver.quit();
    }

	}


