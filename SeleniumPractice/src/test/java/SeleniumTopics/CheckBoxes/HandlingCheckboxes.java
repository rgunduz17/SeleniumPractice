package SeleniumTopics.CheckBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingCheckboxes {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


        //  Put an Implicit wait, this means that
        //     any search for elements on the page could take the time
        //      the implicit wait is set for before throwing exception



        // Select Option1 Checkbox and click on it
        // Select Option2 Checkbox and click on it
        // Select Option3 Checkbox and click on it




        // Validate Option3 checkboxes is Selected
        //      if true print "Checkbox is toggled On"
        //      if false print "Checkbox is toggled Off"



        // Deselect Option1 Checkbox and click on it
        // Deselect Option2 Checkbox and click on it
        // Deselect Option3 Checkbox and click on it



        // Validate all checkboxes are NOT Selected
        //      if true print "Checkboxes are toggled Off"
        //      if false print "Checkboxes are toggled On"



        // Quit from browser







    }
}
