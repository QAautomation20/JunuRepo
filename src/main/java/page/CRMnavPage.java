package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMnavPage {

	WebDriver driver;
	public CRMnavPage(WebDriver driver) {
	this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using ="Calender")
	WebElement calender;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Contacts')]")
	WebElement Contacts;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Companies')]")
	WebElement Companies;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Deals')]")
	WebElement Deals;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Tasks')]")
	WebElement Tasks;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Case')]")
	WebElement Case;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Calls')]")
	WebElement Calls;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Documents')]")
	WebElement Documents;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Email')]")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Campaign')]")
	WebElement Campaign;
	@FindBy(how = How.XPATH, using = "//div[@id='main-nav']/descendant::span[contains(text(),'Forms')]")
	WebElement Forms;



	public void clickCalender() {
		calender.click();
	}
	public void clickContacts() {
		Contacts.click();
	}
	public void clickCompanies() {
		Companies.click();
	}
	public void clickDeals() {
		Deals.click();
	}
	public void clickTasks() {
		Tasks.click();
	}
	public void clickCase() {
		Case.click();
	}
	public void clickDocuments() {
		Documents.click();
	}
	public void clickCalls() {
		Calls.click();
	}
	public void clickEmail() {
		Email.click();
	}
	public void clickCampaign() {
		Campaign.click();
	}
	public void clickForms() {
		Forms.click();
	}
	
	
}