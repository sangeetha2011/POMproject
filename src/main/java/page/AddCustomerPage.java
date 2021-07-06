package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	public AddCustomerPage (WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement FULLNAME_FIELD;
	@FindBy(how = How.XPATH, using ="//select[@id='cid']")WebElement COMPANYNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAILID_FIELD;
	
	
	public void enterFullName(String fullname) {
	int num =	generaterandomNumber(999);
		FULLNAME_FIELD.sendKeys(fullname + num );	
	}
	
	public void enterCompany(String company) {
		selectDropDown(COMPANYNAME_FIELD,company);
	}
	public void enterEmailId(String email) {
		EMAILID_FIELD.sendKeys(generaterandomNumber(999)+email);
	}
	
	}

