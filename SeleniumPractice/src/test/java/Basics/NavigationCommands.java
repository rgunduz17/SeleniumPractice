package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //Click on the Link Text using click() command
        //driver.findElement(By.linkText("This is a Link")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div/p/a")).click();

        //Go back to Home Page
        driver.navigate().back();

        //Go forward to Registration page
        driver.navigate().forward();

        // Go back to Home page
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //Refresh browser
        driver.navigate().refresh();

        //Closing browser
        driver.close();

    }
}
