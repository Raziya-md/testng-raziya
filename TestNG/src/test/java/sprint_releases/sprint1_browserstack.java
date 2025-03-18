package sprint_releases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.browserstack_SignIn;
import pages.browserstack_forgotpassword;
import pages.browserstack_homepage;
import pages.browserstack_signup;

public class sprint1_browserstack {
	public class Sprint1_TestCases {
		WebDriver driver;
		browserstack_homepage objHomePage;
		browserstack_signup objSignUpPage;
		browserstack_SignIn objSignInPage;
		browserstack_forgotpassword objforgotpaswPage;

		@Parameters({ "AppURL" })
		@BeforeMethod
		public void launchApplication(String URL) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			System.out.println(driver.getCurrentUrl());
		}

		@Test(enabled = true)
		public void TC_01_Verify_HomePage_Header() {
			browserstack_homepage objHomePage = new browserstack_homepage(driver);
			objHomePage.verifyHeaderText();
		}

		@Test(enabled = true)
		public void TC_02_verifySignUpFunctionality() throws InterruptedException {
			browserstack_homepage objHomePage = new browserstack_homepage(driver);
			browserstack_signup objSignUpPage = new browserstack_signup(driver);
			objHomePage.clickGetStartedButton();
			Thread.sleep(10000);
			objSignUpPage.verifyPageHeader();
			objSignUpPage.enterFullName();
			objSignUpPage.enterBusinessEmail();
			objSignUpPage.enterPassword();
			objSignUpPage.SelectAgreeCheckBox();
			objSignUpPage.clickSingMeUpButton();
		}

		@Test(enabled = true)
		public void TC_03_verifySignIN() throws InterruptedException {
			browserstack_homepage objHomePage = new browserstack_homepage(driver);
			browserstack_SignIn objSignInPage = new browserstack_SignIn(driver);
			Thread.sleep(10000);
			objHomePage.clickSignInButton();
			Thread.sleep(10000);
			objSignInPage.verifyPageHeader();
			objSignInPage.enterBusinessEmail();
			objSignInPage.enterPassword();
			objSignInPage.clicksubmit();
		}

		@Test
		public void TC_04_verifyforgotpassword() throws InterruptedException {
			browserstack_homepage objHomePage = new browserstack_homepage(driver);
			browserstack_SignIn objSignInPage = new browserstack_SignIn(driver);
			browserstack_forgotpassword objforgotpaswPage = new browserstack_forgotpassword(driver);
			// Thread.sleep(10000);
			objHomePage.alert();
			objHomePage.clickSignInButton();
			objSignInPage.forgotpassword();
			objforgotpaswPage.verifypageheading();
			objforgotpaswPage.enteremail();
			objforgotpaswPage.resetbutton();

		}

	}
}
