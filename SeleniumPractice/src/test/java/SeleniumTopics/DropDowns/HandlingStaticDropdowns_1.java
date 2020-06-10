package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticDropdowns_1 {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //  TASK 1
        // 1. Maximize the browser


        // 2. Find the location of Currency Dropdown and SELECT it.



        // selectByValue:  Search the given value and select it
        //3.  selectByValue of "AED"



        // selectByIndex: Use the given index to select item
        // 4. Use the 3. index of item and select it.



        // selectByVisibleText(): Search the given text to find and select it
        // 5. Use the visible text ("INR") and select it.




        //  TASK 2

        // 1. Refresh the browser


        // 2. Find the location of "PASSENGERS" dropdown and click on it.


        // 3. Add 2 seconds wait time


        // 4. Increase Adult passenger numbers to 5 (or other numbers)
            // a) Find the location of plus sign and click 5 times
            // b) Add 2 seconds wait time after each click



        // 5. Find the location of "DONE" button and click on it.



        // 6. Get the text of total passenger numbers and print it.



        //7. Quit the browser

    }
}
