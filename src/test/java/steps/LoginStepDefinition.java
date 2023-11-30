package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankAndCash;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	BankAndCash bankandCash;
	

	@Before
	public void beforeRun() {

		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankandCash=PageFactory.initElements(driver,BankAndCash.class);
		
		// DatabasePage databasePage = new DatabasePage();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		
		
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		
		
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String logindata, String loginField) {
		
	
		
		
		switch (loginField) {
		
		case "username":
			
			loginPage.enterUserName(logindata);
			break;
			
		case "password":
			
			loginPage.enterPassword(logindata);
		break;
		
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String clickon) {
		
		switch (clickon) {
		
		case "login":
			loginPage.clickSignInButton();
			break;
			
		case"bankCash":
			
			bankandCash.clickBankAndCash();
	
		break;
		
		case"newAccount":
			bankandCash.clickNewAccount();
			break;
			
		case "submit":
			
			bankandCash.clickSubmitButton();
		}
		
		
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		
		String expedtedDashboardHeader= "Dashboard";
		String ActualDashboardHeader= loginPage.getPageHeader();
		Assert.assertEquals("Dashborad page not found", expedtedDashboardHeader, ActualDashboardHeader);
		takeScreenshot(driver);

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String clientInformation, String clientInformationField )
	{
		switch(clientInformationField) {
		
		case "accountTitle":
		bankandCash.insertAccountTitle(clientInformation);
		break;
		
		case "description":
			
			bankandCash.insertDescription(clientInformation);
			break;
		case "initialBalance":
			bankandCash.insertInitialBalance(clientInformation);
			break;
		case "accountNumber":
			bankandCash.insertAccauntNumber(clientInformation);
			break;
		case "contactPerson":
			bankandCash.insertContactPerson(clientInformation);
			break;
		case "Phone":
			bankandCash.insertPhoneNumber(clientInformation);
			break;
		case "internetBankingURL":
			bankandCash.insertInternetBankingUrl(clientInformation);
			break;
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		
		String expectedPagerHeader ="Manage Accounts";
		String ActualPageHeader= bankandCash.validationPage();				
		Assert.assertEquals("Account added successfully", expectedPagerHeader, ActualPageHeader);
		takeScreenshot(driver);

	}
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
		
	}
	
	

}