package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.ExelUtility;
import utility.Hooks;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginStepDataExel {
    public WebDriver driver;
    public LoginPage lp;

    String path="src/test/java/testData/gyansetu login data.xlsx";

    @Given("User is on the signing page")
    public void i_am_on_the_login_page(){
        lp=new LoginPage(Hooks.driver);
        lp.clickSigBtn();
    }

    @When("I fetch login data from {string} and {int}")
    public void i_fetch_login_data_from_and(String sheetName, Integer rownum) throws IOException {
        ExelUtility ex = new ExelUtility(path);
        List<Map<String,String>> listlogin=ex.storeData(path,"Sheet1");
        String uname=listlogin.get(rownum).get("UserName");
        String pwd=listlogin.get(rownum).get("Password");
        System.out.println(uname+" "+pwd);
        lp.enterUsername(uname);
        lp.enterPassword(pwd);
    }

    @Then("Validate login for each dataset")
    public void validate_login_for_each_dataset() throws IOException, InterruptedException {
        lp.clickSigninNow();
        Thread.sleep(1000);
        lp.alrtHandling();
    }



}
