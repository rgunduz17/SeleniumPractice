package SeleniumTopics.DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDynamicDropdowns_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // 1. Maximize the browser

        driver.manage().window().maximize();

        // 2. Find the location of "FROM" (Departure City) Dropdowns and click

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();



        // 3. Choose "GOI" as departure city and click

        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[1]/a")).click();

        // 4. Choose "STV" as arrival city and click
        // (No needs to find location of "TO"(Arrival City) Dropdown because it moves automatically there)
        Thread.sleep(2000);
//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//
//        driver.findElement(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(4) > li:nth-child(2) > a")).click();

        driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[4]/li[2]/a")).click();

        //  5. Refresh your browser




        //  6. Find the location of "FROM" (Departure City) Dropdowns and click



        // 7. Choose "COK" as departure city and click



        // 8. Choose "DEL" as arrival city and click
        // (No needs to find location of "TO"(Arrival City) Dropdown because it moves automatically there)

    }
}
