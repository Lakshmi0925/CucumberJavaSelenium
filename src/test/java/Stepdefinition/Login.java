package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("Open The Chrome Browser")
	public void open_the_chrome_browser() {
	    System.out.println("open the chrome browser");
	}

	@Given("user navigate to fb.com")
	public void user_navigate_to_fb_com() {
	    System.out.println("user navigaet to facebook url");
	}

	@When("enter the username")
	public void enter_the_username() {
	    System.out.println("enter the user name");
	}

	@When("enter the password")
	public void enter_the_password() {
	    System.out.println("enter the password");
	}

	@When("User click on login")
	public void user_click_on_login() {
	    System.out.println("click on the login");
	}

	@Then("user can see the logout page")
	public void user_can_see_the_logout_page() {
	    System.out.println("user see the logout page");
	}
}
