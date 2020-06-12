package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ByTagName {

    // SELENIUM INTERVIEW QUESTION

    // How many links are there in given website ?
    //  (For example: How many links are there in main page of Amazon.com ?)

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // 1. Inspect the page source


        // 2. Maximize your browser
       driver.manage().window().maximize();

        // 3. Fullscreen your browser

      //  driver.manage().window().fullscreen();

        // 2. Find the links tagName

        // a tag

        // 3. Find the all elements by using tagName and assign them to List (or ArrayList)

        List <WebElement> list = driver.findElements(By.tagName("a"));

     //   ArrayList <WebElement> list2 = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));


        // 4. Print total number of links

        System.out.println("Number of links: " + list.size());



        // 5. Print all text of the links from main page

        for(int i=0; i<list.size(); i++){

            System.out.println("Links in this page: "+ list.get(i).getText());
        }


        // 6. Add wait time (5 sec)
        Thread.sleep(5000);

        // 7. Close the tab
        driver.close();
    }
}
