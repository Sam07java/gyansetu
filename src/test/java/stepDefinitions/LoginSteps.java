package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.Hooks;

public class LoginSteps
{
    public WebDriver driver;
    public LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException
    {

        loginPage=new LoginPage(Hooks.driver);
        loginPage.clickSigBtn();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials()
    {

        loginPage.enterUsername("sameers@gmail.com");
        loginPage.enterPassword("Same@1234");
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard()
    {
        loginPage.clickSigninNow();
        loginPage.alrtHandling();
    }
}
