package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	public WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	public WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']")
	public WebElement dashboardPageHeader;

	
	public void enterUserName(String userName) {
	
        UserName.sendKeys(userName);
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public void enterPassword(String password) {
		
	Password.sendKeys(password);
	

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();

	}

		
	}

	public void clickSignInButton() {
		SignInButton.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		
	}

	public String getPageHeader() {
		return dashboardPageHeader.getText();

	

	}
}
	


	

