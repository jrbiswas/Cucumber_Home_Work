package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinition extends TestBase {
	DatabasePage databasePage;
	LoginPage loginPageObj;

	@Before
	public void beforeRun() {
		initDriver();
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		 databasePage = new DatabasePage();
	} 

	@Given("^User is on Techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		loginPageObj.enterUserName(username);
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String data) {

//		if(data.equalsIgnoreCase("username")) {
//			loginPageObj.enterUserName("demo@techfios.com");
//		}else if(data.equalsIgnoreCase("password")) {
//			loginPageObj.enterPassword("abc123");
//		}else {
//			System.out.println("invalid data");
//		}

		switch (data) {
		case "username":
			System.out.println("Username from DB: " + databasePage.getDataFromDb("username"));
			loginPageObj.enterUserName("demo@techfios.com");
			break;
		case "password":
			System.out.println("Username from DB: " + databasePage.getDataFromDb("password"));
			loginPageObj.enterPassword("abc123");
			break;

		default:
			System.out.println("invalid data");

		}

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		loginPageObj.enterPassword(password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginPageObj.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPageObj.getPageTitle());
		// takesScreenshot(driver);
	}

	@When("^User enters \"([^\"]*)\" from Techfios database$")
	public void user_enters_from_Techfios_database(String data) {

		switch (data) {
		case "username":
			System.out.println("Username from DB: " + databasePage.getDataFromDb("username"));
			loginPageObj.enterUserName(databasePage.getDataFromDb("username"));
			break;
		case "password":
			System.out.println("Password from DB: " + databasePage.getDataFromDb("password"));
			loginPageObj.enterPassword(databasePage.getDataFromDb("password"));
			break;

		default:
			System.out.println("invalid data");

		}

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
