package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	WebDriver driver;

	@Given("Open The Chrome Browser")
	public void open_the_chrome_browser() {
	    driver= new ChromeDriver();
	}

	@Given("user navigate the url {string}")
	public void user_navigate_the_url(String string) {
	   driver.get(string);
	   driver.manage().window().maximize();
	}

	@When("enter the username {string}")
	public void enter_the_username(String string) {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	}

	@When("enter the password {string}")
	public void enter_the_password(String string) {
	    driver.findElement(By.xpath("//input[@id='pasword']")).sendKeys(string);
	}

	@When("User click on login")
	public void user_click_on_login() {
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("user can see the logout {string}")
	public void user_can_see_the_logout(String string) {
	    String Acturl = driver.getTitle();
	    Assert.assertEquals(Acturl, string);
	}

}
