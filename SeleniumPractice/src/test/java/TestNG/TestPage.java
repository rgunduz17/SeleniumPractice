package TestNG;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage {


    @Test
    public void titleTest() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
