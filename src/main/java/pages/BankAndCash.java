package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCash extends TestBase {
	
	WebDriver driver;

	
	public BankAndCash (WebDriver driver) {
		
		this.driver=driver;
		
		
			
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	
	public WebElement BankAndCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	public WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	public WebElement AccountPageHeader; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	public WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	public WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	public WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	public WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	public WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	public WebElement Phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	public WebElement InternetBankingUrl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	public WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//h5[text()='Manage Accounts']")
	public WebElement ValidationPageHeader;
	
	
	
	public void clickBankAndCash() {
		
		BankAndCash.click();
		
		try {
			
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
		public void clickNewAccount() {
			NewAccount.click();
			
		}
			
			public void insertAccountTitle(String title) {
				AccountTitle.sendKeys(title+generateRandomNum(999));
					
	}
			public void insertDescription (String description) {
				
				Description.sendKeys(description);
			}
			public void insertInitialBalance(String initialBalance) {
				InitialBalance.sendKeys(initialBalance);
		

			}
			public void insertAccauntNumber(String account) {
				AccountNumber.sendKeys(account);

			}
			public void insertContactPerson(String contactperson) {
				ContactPerson.sendKeys(contactperson);
				
				}

			public void insertPhoneNumber(String phonenumber) {
				Phone.sendKeys(phonenumber);

			}
			public void insertInternetBankingUrl(String bankingUrl) {
				InternetBankingUrl.sendKeys(bankingUrl);
	

			}
			public void clickSubmitButton() {
				SubmitButton.click();
				
				
			}
			
			public String validationPage() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				return ValidationPageHeader.getText();
				
						
			}
		}
	
			
				
				
			
	
	
	
	


