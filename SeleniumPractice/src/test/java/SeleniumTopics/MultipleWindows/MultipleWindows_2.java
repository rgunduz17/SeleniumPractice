package SeleniumTopics.MultipleWindows;


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
        driver.findElement(By.linkText("Multiple Windows")).click();

        // 2. Click on "click here" link ==> opens child window

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();

        // 3. Return the number of windows opened by WebDriver and will return Set of Strings

        Set <String> windows = driver.getWindowHandles();

      //  ArrayList <String> windows =new ArrayList<> (driver.getWindowHandles());


        // 4. Use iterator to iterate the windows

        Iterator<String> iterator = windows.iterator();

        // 5. Assign parent window as a String by using iterator

        String parent = iterator.next();


        // 6. Assign child window as a String by using iterator
        String child = iterator.next();

        // 7. switchTo() parent window
        Thread.sleep(4000);
        driver.switchTo().window(parent);

        // 8. Get page title and print it
        Thread.sleep(4000);

        System.out.println(driver.getTitle());
        Thread.sleep(4000);

        // 8. switchTo() child window

        driver.switchTo().window(child);

        Thread.sleep(4000);
        // 10. Get page title and print it
        System.out.println(driver.getTitle());


        // 11. Quit from browser
    }
}
