package SeleniumTopics.MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/");

        // 1. Click on "Multiple windows"


        // 2. Click on "click here" link ==> opens child window


        // 3. Return the parent window name as a String (need to use getWindowHandle();  )



        // 4. switchTo() parent window



        // 5. Quit from driver





    }
}
