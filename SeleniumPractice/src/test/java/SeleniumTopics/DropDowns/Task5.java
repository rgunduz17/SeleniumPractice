package SeleniumTopics.DropDowns;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task5 {

    /*
    TC #5: Selecting value from non-select dropdown
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Click to non-select dropdown
    4.Select Facebook from dropdown
    5.Verify title is “Facebook - Log In or Sign Up”
     */

    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void Task5() throws InterruptedException {

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[4]"));
     //   WebElement element3 = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']/div/a[4]"))

        element2.click();

        String expected = "Facebook - Log In or Sign Up";
        Thread.sleep(2000);
        String actual = driver.getTitle();

        Assert.assertEquals(expected, actual);

        System.out.println("Assert Passed");
        Thread.sleep(2000);
        //driver.quit();


    }
}