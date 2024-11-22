package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Basepage {

   public RegistrationPage(WebDriver driver)
   {
       super(driver);
   }

    public void clickSigninBtn(){

        driver.findElement(By.xpath("//div[@class='btn btn-secondary w-100 outsecbtn rounded-pill']")).click();

    }

    public void signuphere()
    {
        WebElement signUp=driver.findElement(By.xpath("//a[normalize-space()='Sign up here']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",signUp);
    }

    public void enterEmail(String email)
    {
        driver.findElement(By.xpath("//input[@id='emailphone']")).sendKeys(email);
    }

    public void enterPasswor(String password)
    {
        driver.findElement(By.xpath("//input[@id=':r4:']")).sendKeys(password);
    }

    public void clickSignUpBtn()
    {
       WebElement signUpbtn=driver.findElement(By.xpath("//button[normalize-space()='Sign Up Now']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",signUpbtn);
    }

}
