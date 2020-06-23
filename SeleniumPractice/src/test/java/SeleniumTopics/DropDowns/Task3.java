package SeleniumTopics.DropDowns;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task3 {

    /*
    TC #3: Selecting date on dropdown and verifying
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Select “December 1st, 1921” and verify it is selected.
    Select year using: visible text
    Select month using : value attribute
    Select day using: index number
     */

    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void Task3(){

        WebElement element_year = driver.findElement(By.id("year"));
        Select year = new Select(element_year);
        year.selectByVisibleText("1921");


        WebElement element_month = driver.findElement(By.id("month"));
        Select month = new Select(element_month);
        month.selectByValue("11");

        WebElement element_day = driver.findElement(By.id("day"));
        Select day = new Select(element_day);
        day.selectByIndex(0);

        String expected = "December 1st, 1921";
        String actual = month.getFirstSelectedOption().getText()+ " "+
                        day.getFirstSelectedOption().getText()+ "st, "+
                        year.getFirstSelectedOption().getText();

        System.out.println(actual);

        Assert.assertEquals(expected,actual);
        System.out.println("Assert Passed");

    }
}