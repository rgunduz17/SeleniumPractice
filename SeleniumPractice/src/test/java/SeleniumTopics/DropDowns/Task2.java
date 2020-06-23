package SeleniumTopics.DropDowns;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {
    /*
    TC #2: Selecting state from State dropdown and verifying result
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Select Illinois
    4.Select Virginia
    5.Select California
    6.Verify final selected option is California.
    Use all Select options.(visible text, value, index)
     */


    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void Task2() throws InterruptedException {

        WebElement element1= driver.findElement(By.xpath("//*[@id=\"state\"]"));

        Select stateDropdown = new Select(element1);

        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);
        Thread.sleep(2000);

        String expected = "California";
        String actual = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expected, actual);
        System.out.println("Assert Passed");
        driver.quit();
    }
    }
