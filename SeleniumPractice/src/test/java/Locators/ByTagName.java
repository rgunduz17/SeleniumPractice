package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ByTagName {

    // SELENIUM INTERVIEW QUESTION

    // How many links are there in given website ?
    //  (For example: How many links are there in main page of Amazon.com ?)

    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // 1. Inspect the page source


        // 2. Maximize your browser


        // 3. Fullscreen your browser


        // 2. Find the links tagName


        // 3. Find the all elements by using tagName and assign them to List (or ArrayList)



        // 4. Print total number of links





        // 5. Print all text of the links from main page



        // 6. Add wait time (5 sec)


        // 7. Close the tab
    }
}
