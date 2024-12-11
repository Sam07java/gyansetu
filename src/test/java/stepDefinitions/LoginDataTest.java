package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utility.Hooks;

public class LoginDataTest {

    LoginPage lp;
    @Given("The user is on Sign in page")
    public void the_user_is_on_sign_in_page() {

    }

    @When("The user enter valid username {string} and password {string}")
    public void the_user_enter_valid_username_and_password(String string, String string2) {


    }

    @Then("click login button")
    public void click_login_button() {


    }
}
