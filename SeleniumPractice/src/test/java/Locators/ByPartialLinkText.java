package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        // 1. Inspect the page source


        // 2. Maximize the window
        driver.manage().window().maximize();

        // 3. Use the PartialLinkText of "Service" from "Costumer Service" and click

        driver.findElement(By.partialLinkText("Service")).click();
        // 4. Navigate your browser back
        driver.navigate().back();

        // 5. Use the PartialLinkText of "Services" from "Sell your Services on Amazon" and click

        driver.findElement(By.partialLinkText("Services")).click();

        // 6. Navigate your browser back


        // 7. Use the PartialLinkText of "Sel" from "Sell" and click


        // 8. Quit from your browser

    }
}
