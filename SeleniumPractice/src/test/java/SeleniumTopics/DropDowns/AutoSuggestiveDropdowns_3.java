package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns_3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        // 1. Maximize the browser


        // 2. Delete all the cookies


        // 3. Create a WebElement and assign it to find location of (FROM) "Departure City"


        // 4. By using WebElement click on Departure City


        // 5. Create another WebElement and assign it to find input box.


        // 6. By using WebElement, send keys and type "MUMB"


        // 7. Add 2 seconds wait time


        // 8. By using WebElement, send keys and press ARROW_DOWN


        // 9. By using WebElement, send keys and press ENTER



        // 10. Create a WebElement and assign it to find location of (TO) "Arrival City"


        // 11. By using WebElement click on Arrival City



        // 12. By using WebElement, send keys and type "DEL"



        // 13. Add 2 seconds wait time



        // 14. By using WebElement, send keys and press ARROW_DOWN


        // 15. By using WebElement, send keys and press ENTER



        // 16. Quit from browser
    }
}
