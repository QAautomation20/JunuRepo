package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMLoginPage extends CRMBasePage
	{

		WebDriver driver;

		// Every Page must have a constructor to invite the driver
		public CRMLoginPage(WebDriver driver) {
			this.driver = driver;
		}

		// Element Library
		@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']/child::span[text() = 'Log In' ]")
		WebElement LogInButton;
		@FindBy(how = How.NAME, using = "email")
		WebElement UserEmail;
		@FindBy(how = How.NAME, using = "password")
		WebElement Password;
		@FindBy(how = How.XPATH, using = "//div[@class='ui fluid large blue submit button']")
		WebElement SignInButton;

		// Methods to interact with the elements
		public void login(String userEmail, String passWord) {
			LogInButton.click();
			UserEmail.sendKeys(userEmail);
			Password.sendKeys(passWord);
			SignInButton.click();
		}

		public String getPageTitle() {
			return driver.getTitle();
		}

}
