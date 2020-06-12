package SeleniumTopics.MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://accounts.google.com");

        // 1. Find the location of Help, Privacy, Terms and click on them



        // 2. Use collections to save windows

        Set<String> ids = driver.getWindowHandles();

        // 3. Use iterator to switch windows


        // 4. Assign parent and child windows to String by using iterator.next();



        // 5. Switch to Child1, getTitle and print it, close the child1 window





        // 6. Switch to Child2, getTitle and print it, close the child2 window





        // 7. Switch to Child3, getTitle and print it, close the child3 window




        // 8. Switch to parent, getTitle and print it, close the parent window


    }
}
