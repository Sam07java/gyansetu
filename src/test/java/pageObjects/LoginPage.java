package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Basepage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickSigninBtn(){

        driver.findElement(By.xpath("//div[@class='btn btn-secondary w-100 outsecbtn rounded-pill']")).click();

    }

    public void enterUsername(String username)
    {
        driver.findElement(By.xpath("//input[@id='email/phone']")).sendKeys(username);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(pass);
    }

    public void clickSigninNow()
    {
       // driver.findElement(By.xpath("//input[@id=':r1:']")).click();

        WebElement clickk= driver.findElement(By.xpath("//button[text()='Sign in Now']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clickk);
    }

}
