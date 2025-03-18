package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class common_methods {
	WebDriver driver;
	public void captureimage(WebDriver driver) throws IOException {
	
	TakesScreenshot objscr=((TakesScreenshot)driver);
	File srcfile =objscr.getScreenshotAs(OutputType.FILE);
	File Destlocation=new File("D:\\eclipse-workspace\\TestNG\\reports/sample2.png");
	FileUtils.copyFile(srcfile,Destlocation);
	
}
}