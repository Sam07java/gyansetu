package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class studentDashBoard extends Basepage {


    public studentDashBoard(WebDriver driver) {
        super(driver);
    }


    public void profilechatinner_1stText(String fullName)
    {
        driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']")).sendKeys();
    }

    public void profilechatinner_2stText()
    {
        driver.findElement(By.xpath(""));
    }
}
