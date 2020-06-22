package SeleniumTopics.WarmUps;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice2 {
    // All pages in new window
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int linksCount = allLinks.size();

        for (int i = 0; i<linksCount; i++){
            allLinks.get(i).sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN)); // Mac users
         //   allLinks.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN)); // Window users
        }

        driver.quit();
    }
}
