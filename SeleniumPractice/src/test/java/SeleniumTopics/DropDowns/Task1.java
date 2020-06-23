package SeleniumTopics.DropDowns;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {

    /*
    TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Verify “Simple dropdown” default selected value is correct
    Expected: “Please select an option”
    4.Verify“State selection” default selected value is correct
    Expected: “Select a State
     */

    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void Task1(){

        WebElement element = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        Select simpleDropdown = new Select(element);
        String expected_simpleDropdown = "Please select an option";
        String actual_simpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expected_simpleDropdown, actual_simpleDropdown);
        System.out.println("Assert Passed");

        WebElement element2= driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select stateDropdown = new Select(element2);
        String expected_stateDropdown = "Select a State";
        String actual_stateDropdown = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expected_stateDropdown, actual_stateDropdown);
        System.out.println("Assert2 Passed");


        driver.quit();


    }

}
