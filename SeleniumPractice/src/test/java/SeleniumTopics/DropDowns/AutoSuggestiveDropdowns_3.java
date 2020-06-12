package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        // 1. Maximize the browser

        driver.manage().window().maximize();
        // 2. Delete all the cookies
        driver.manage().deleteAllCookies();

        // 3. Create a WebElement and assign it to find location of (FROM) "Departure City"
        WebElement source = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
//
        // 4. By using WebElement click on Departure City
        source.click();

        // 5. Create another WebElement and assign it to find input box.

        WebElement source2 =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));

        // 6. By using WebElement, send keys and type "MUMB"
        source2.sendKeys("MUMB");

        // 7. Add 2 seconds wait time
        Thread.sleep(1000);

        // 8. By using WebElement, send keys and press ARROW_DOWN

        source2.sendKeys(Keys.ARROW_DOWN);
        // 9. By using WebElement, send keys and press ENTER

        source2.sendKeys(Keys.ENTER);

        // 10. Create a WebElement and assign it to find location of (TO) "Arrival City"

        WebElement source3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));

        // 11. By using WebElement click on Arrival City
        source3.click();

        // 12. By using WebElement, send keys and type "DEL"
        source3.sendKeys("DEL");

        // 13. Add 2 seconds wait time
        Thread.sleep(2000);

        // 14. By using WebElement, send keys and press ARROW_DOWN
        source3.sendKeys(Keys.ARROW_DOWN);

        // 15. By using WebElement, send keys and press ENTER
        source3.sendKeys(Keys.ENTER);

        // 16. Quit from browser
        driver.quit();
    }
}
