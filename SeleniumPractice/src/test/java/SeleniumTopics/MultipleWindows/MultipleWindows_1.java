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
        driver.findElement(By.linkText("Multiple Windows")).click();

        // 2. Click on "click here" link ==> opens child window
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();

        // 3. Return the parent window name as a String (need to use getWindowHandle();  )

        String parent = driver.getWindowHandle();

        Thread.sleep(3000);
        // 4. switchTo() parent window

        driver.switchTo().window(parent);
        Thread.sleep(3000);
        // 5. Quit from driver

        driver.quit();





    }
}
