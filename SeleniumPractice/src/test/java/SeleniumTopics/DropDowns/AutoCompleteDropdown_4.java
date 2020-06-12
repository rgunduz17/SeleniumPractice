package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown_4 {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");

        // 1. Maximize the browser

        driver.manage().window().maximize();


        // 2. Create a WebElement assign it to find location of AutoComplete input box
        WebElement element = driver.findElement(By.id("myInput"));


        // 3. By using WebElement, click on type box

        element.click();

        // 4. By using WebElement, send keys and type "ta"

        element.sendKeys("ta");

        // 5. By using WebElement, send keys and press DOWN three times

        for(int i =0; i <3; i++){
            element.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
        }

        // 6. By using WebElement, send keys and press ENTER

        element.sendKeys(Keys.ENTER);





    }
}
