package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

    // Every object may NOT have ID, className, name ===> Xpath and CSS preferred

    // Alpha numeric ID may vary on every refresh of the browser

    // ClassName should not have spaces- Compound classes cannot be accepted

    // For the same values, Selenium starts scanning from TOP LEFT and find the given value

    // In Current websites, all ID values MUST BE UNIQUE.

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("http://facebook.com");

        // 1.Inspect the elements

        // 2.Find the id of email input box, type random email (Sendkey)


        // 3.Find the id of password input box, type random password (Sendkey)


        // 4.Find the id of Log in Button then click.


        // 5. Close the tab

    }
}
