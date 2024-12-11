package pageObjects;

import org.openqa.selenium.WebDriver;

public class Basepage {
    static WebDriver driver;

    public Basepage(WebDriver driver)
    {
        Basepage.driver =driver;
    }



}
