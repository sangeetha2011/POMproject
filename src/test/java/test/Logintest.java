package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class Logintest {
	WebDriver driver;
	@Test
	public void loginTest() {
	 driver = BrowserFactory.init();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.enterUserName("demo@techfios.com");
	loginpage.enterpassword("abc123");
	loginpage.clickSignInButton();
	DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);	
	dashboardpage.verifyDashBoardPage();	
		
	}

}
