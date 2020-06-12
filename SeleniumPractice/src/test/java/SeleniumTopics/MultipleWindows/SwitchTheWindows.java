package SeleniumTopics.MultipleWindows;

import com.sun.java.swing.plaf.windows.resources.windows;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchTheWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.google.com");

//  Put an Implicit wait, this means that
//      any search for elements on the page could take the time
//      the implicit wait is set for before throwing exception





        // Find the location of "About, Store, Gmail, Images" and open them in new tab





        // Use collections to save all windows and use getWindowHandles()


        // Use iterator to save the tabs




        // Switch between Windows



        // Switch to (Parent) Window.

    }
}
