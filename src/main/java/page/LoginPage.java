package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//input[@id='username']")WebElement USERNAME_FIELD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement PASSWORD_FIELD;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success block full-width']")WebElement SIGNINBUTTON_FIELD;
	
	
	

//individual method technique	
	public void enterUserName(String username) {
		USERNAME_FIELD.sendKeys(username);

	}

	public void enterpassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNINBUTTON_FIELD.click();
	}

	
	
	//technique combined method public void testLogin(String username , String
	public void testLogin(String username , String password) {
	USERNAME_FIELD.sendKeys(username);
	 PASSWORD_FIELD.sendKeys(password); 
	 SIGNINBUTTON_FIELD.click(); 
	 }
	 
	

}
