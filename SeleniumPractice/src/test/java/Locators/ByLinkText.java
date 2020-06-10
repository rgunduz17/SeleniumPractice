package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        // 1. Inspect the page source


        // 2. Maximize the window


        // 3. Find the LinkText of "AmazonBasics" and click


        // 4. Navigate your browser back


        // 5. Find the LinkText of  "Free Shipping" and click


        // 6. Refresh your browser


        // 7. Close the tab



    }
}
