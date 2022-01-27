package org.definition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class LoginFuction extends BaseClass {

	@Given("The user should be in target  page")
	public void the_user_should_be_in_target_page() {
		browser("chrome");
		//chromeBrowser();
		urlLanunch("https://www.target.com/");
		impWait(10);
	}

	@Given("Click the page sign button and click sign")
	public void click_the_page_sign_button_and_click_sign() {
		WebElement signbutton = driver.findElement(By.id("account"));
		signbutton.click();

		WebElement signup = driver.findElement(By.xpath("//div[contains(text(),'Sign in')]"));
		signup.click();

	}

	@When("The user has to file {string} and {string}")
	public void the_user_has_to_file_and(String user, String pass) {

		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, user);

		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, pass);

	}

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
		WebElement sign = driver.findElement(By.id("login"));
		sign.click();

	}

	@Then("The user Should navigate to the invalid login page")
	public void the_user_Should_navigate_to_the_invalid_login_page() {
		driver.getCurrentUrl();
		System.out.println("-----user navigated invalid login page----------");
       quit();
	}

	@Given("Click on the page create button to click")
	public void click_on_the_page_create_button_to_click() {
		WebElement createaccount = driver.findElement(By.id("createAccount"));
		createaccount.click();

	}

	@When("The user has to fill Emailaddress,Firstname,LastName,mobilenumber\\(optional)and create password")
	public void the_user_has_to_fill_Emailaddress_Firstname_LastName_mobilenumber_optional_and_create_password() {

		WebElement emailname = driver.findElement(By.id("username"));
		sendKeys(emailname, "kamal@gmail.com");

		
		WebElement firstname = driver.findElement(By.id("firstname"));
		sendKeys(firstname, "kamal");

		WebElement lastname = driver.findElement(By.id("lastname"));
		sendKeys(lastname, "nathan");

		WebElement mobilenu = driver.findElement(By.id("phone"));
		sendKeys(mobilenu, "8489887870");

		WebElement crtpassword = driver.findElement(By.id("password"));
		sendKeys(crtpassword, "123456");

	}

	@When("Keep me sign in button to click")
	public void keep_me_sign_in_button_to_click() {
		System.out.println("click");
	}
		@Then("Create an acoount button to click")
		public void create_an_acoount_button_to_click() {
			
			WebElement createaccount = driver.findElement(By.id("createAccount"));
			createaccount.click();
            
			quit();
	}


}
