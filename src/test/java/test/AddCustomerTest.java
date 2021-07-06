package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	@Test
public void validCustomerShouldBeAbleToCreateCustomer()  {
	 driver = BrowserFactory.init();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.enterUserName("demo@techfios.com");
	loginpage.enterpassword("abc123");
	loginpage.clickSignInButton();
	DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);	
	dashboardpage.verifyDashBoardPage();	
	
	dashboardpage.clickcustomerButton();
	//dashboardpage.waitforElement();
	//dashboardpage.clickCustomerElement();
	
    dashboardpage.clickAddcustomerButton();
   // dashboardpage.waitforAddCustomerElement();
	//dashboardpage.clickAddCustomerElement();
    AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
    addcustomerpage.enterFullName("Timothy");
    addcustomerpage.enterCompany("Techfios");
    addcustomerpage.enterEmailId("timothy@gmail.com");
    
  
    
    
	}

}
