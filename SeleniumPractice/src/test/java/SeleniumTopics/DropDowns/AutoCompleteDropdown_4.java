package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown_4 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");

        // 1. Maximize the browser




        // 2. Create a WebElement assign it to find location of AutoComplete input box



        // 3. By using WebElement, click on type box



        // 4. By using WebElement, send keys and type "ta"


        // 5. By using WebElement, send keys and press DOWN three times


        // 6. By using WebElement, send keys and press ENTER







    }
}
