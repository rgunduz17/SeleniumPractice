package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDynamicDropdowns_2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // 1. Maximize the browser



        // 2. Find the location of "FROM" (Departure City) Dropdowns and click




        // 3. Choose "GOI" as departure city and click



        // 4. Choose "STV" as arrival city and click
        // (No needs to find location of "TO"(Arrival City) Dropdown because it moves automatically there)



        //  5. Refresh your browser



        //  6. Find the location of "FROM" (Departure City) Dropdowns and click



        // 7. Choose "COK" as departure city and click



        // 8. Choose "DEL" as arrival city and click
        // (No needs to find location of "TO"(Arrival City) Dropdown because it moves automatically there)

    }
}
