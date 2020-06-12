package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdowns_1 {

    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //  TASK 1
        // 1. Maximize the browser

        driver.manage().window().maximize();
        // 2. Find the location of Currency Dropdown and SELECT it.

        Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
     //   driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))

        Thread.sleep(3000);
        // selectByValue:  Search the given value and select it
        //3.  selectByValue of "AED"
        dropdown.selectByValue("AED");

        Thread.sleep(3000);
        // selectByIndex: Use the given index to select item
        // 4. Use the 3. index of item and select it.

        dropdown.selectByIndex(3);
        Thread.sleep(3000);
        // selectByVisibleText(): Search the given text to find and select it
        // 5. Use the visible text ("INR") and select it.

        dropdown.selectByVisibleText("INR");
        Thread.sleep(3000);

        //  TASK 2

        // 1. Refresh the browser
        driver.navigate().refresh();

        // 2. Find the location of "PASSENGERS" dropdown and click on it.
        driver.findElement(By.id("divpaxinfo")).click();

        // 3. Add 2 seconds wait time
        Thread.sleep(2000);

        // 4. Increase Adult passenger numbers to 5 (or other numbers)
            // a) Find the location of plus sign and click 5 times
            // b) Add 2 seconds wait time after each click

        for (int i =1; i<5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(2000);
        }
        // 5. Find the location of "DONE" button and click on it.

        driver.findElement(By.id("btnclosepaxoption")).click();

        // 6. Get the text of total passenger numbers and print it.

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //7. Quit the browser
        driver.quit();
    }
}
