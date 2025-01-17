package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.*;

public class LoginPage extends Basepage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickSigBtn(){

       WebElement phone=driver.findElement(By.xpath("//div[text()='Sign in with Email / Phone']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",phone);
        //driver.findElement(By.xpath("//div[@class='btn btn-secondary w-100 outsecbtn rounded-pill']")).click();

    }

    public void enterUsername(String username)
    {
        driver.findElement(By.xpath("//input[@id='email/phone']")).sendKeys(username);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys(pass);
    }

    public void clickSigninNow()
    {
       // driver.findElement(By.xpath("//input[@id=':r1:']")).click();

        WebElement clickk= driver.findElement(By.xpath("//button[text()='Sign in Now']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clickk);
    }

    public void alrtHandling()
    {
        try {
            WebElement dash = driver.findElement(By.xpath("//h3[normalize-space()='Hi, How can I help you today?']"));
            dash.isDisplayed();
            Assert.assertTrue(true);
                System.out.println(dash.getText());

        }

        catch (NoSuchElementException e)
        {
            WebElement chatBox=driver.findElement(By.xpath("//div[@class='chat-box']"));
            if(chatBox.isDisplayed())
            {
                Assert.assertTrue(true);
            }
        }

        catch(Exception e)
        {
            WebElement alert=driver.findElement(By.xpath("//div[contains(text(),'Invalid userid or password')]"));
            alert.getText();
            Assert.fail("Login failed");
        }


    }

}
