package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uatweb.gyansetu.ai/");
        loginPage=new LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials()
    {
        loginPage.clickSigninBtn();
        loginPage.enterUsername("sameers@gmail.com");
        loginPage.enterPassword("Same@1234");

    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard()
    {
        loginPage.clickSigninNow();
        driver.close();
    }
}
