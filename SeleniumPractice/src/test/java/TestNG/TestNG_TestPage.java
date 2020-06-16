package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_TestPage {

    WebDriver driver = new ChromeDriver();
    @Test
    public void test() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
