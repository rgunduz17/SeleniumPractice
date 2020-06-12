package SeleniumTopics.MultipleWindows;

import com.sun.java.swing.plaf.windows.resources.windows;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows_2 {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/");

        // 1. Click on "Multiple windows"


        // 2. Click on "click here" link ==> opens child window



        // 3. Return the number of windows opened by WebDriver and will return Set of Strings



        // 4. Use iterator to iterate the windows



        // 5. Assign parent window as a String by using iterator



        // 6. Assign child window as a String by using iterator


        // 7. switchTo() parent window



        // 8. Get page title and print it


        // 8. switchTo() child window



        // 10. Get page title and print it



        // 11. Quit from browser
    }
}
