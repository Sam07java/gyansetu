package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.Hooks;

import static utility.Hooks.driver;

public class LoginDataValidation {

    public WebDriver driver;
    public LoginPage lop;

    @Given("Navigate to Gyansetu Login Page")
    public void navigate_to_gyansetu_login_page() {

        lop=new LoginPage(Hooks.driver);
        lop.clickSigBtn();

    }
    @When("The user enter sheet {string} and {string}")
    public void the_user_enter_sheet_and(String string, String string2) {
        lop.enterUsername(string);
        lop.enterPassword(string2);

    }
    @Then("click login button on gyasetu")
    public void click_login_button_on_gyasetu() throws InterruptedException {
        lop.clickSigninNow();
        Thread.sleep(2000);
        lop.alrtHandling();

    }

}
