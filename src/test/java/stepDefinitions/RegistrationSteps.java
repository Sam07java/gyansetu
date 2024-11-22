package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.RegistrationPage;

import java.time.Duration;

public class RegistrationSteps {
    WebDriver driver;
    RegistrationPage rp;
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://uatweb.gyansetu.ai/");

        rp=new RegistrationPage(driver);
        rp.clickSigninBtn();
        rp.signuphere();

    }
    @When("I enter Email and password")
    public void i_enter_email_and_password() {

        rp.enterEmail("aleena123@gmail.com");
        rp.enterPasswor("Aleena@123");
    }
    @Then("I should see successfull registration")
    public void i_should_see_successfull_registration() {
       rp.clickSignUpBtn();
       driver.close();
    }


}