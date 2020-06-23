package SeleniumTopics.DropDowns;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Task4 {
    /*
    TC #4: Selecting value from multiple select dropdown
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Select all the options from multiple select dropdown.
    4.Print out all selected values.
    5.Deselect all values.
     */

    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void Task4(){
        WebElement element = driver.findElement(By.xpath("//*[@name='Languages']"));
        Select multiple = new Select(element);

        multiple.selectByIndex(0);
        multiple.selectByIndex(1);
        multiple.selectByIndex(2);
        multiple.selectByIndex(3);
        multiple.selectByIndex(4);
        multiple.selectByIndex(5);

        // 1. Way: To get all options without selecting them
        List<WebElement> allList = multiple.getOptions();
        int listSize= allList.size();

        for(int i=0; i<listSize; i++){
            String allOptions = multiple.getOptions().get(i).getText();
            System.out.println(allOptions);
        }
        System.out.println("===================================");

        // 2. Way: to get all selected options

        List<WebElement>  allList2 = multiple.getAllSelectedOptions();
        int listSize2= allList2.size();

        for(int i =0; i<listSize2; i++){
            String allSelectedOptions = multiple.getAllSelectedOptions().get(i).getText();
            System.out.println(allSelectedOptions);
        }

        multiple.deselectAll();
        driver.quit();
    }
}