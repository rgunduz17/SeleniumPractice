package SeleniumTopics.MultipleWindows;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
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


        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        // Find the location of "About, Store, Gmail, Images" and open them in new tab

        driver.findElement(By.linkText("About")).sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));
        driver.findElement(By.linkText("Store")).sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));
        driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));
        driver.findElement(By.linkText("Images")).sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));



        // Use collections to save all windows and use getWindowHandles()

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());


        // Use iterator to save the tabs

        Iterator<String> iterator = windows.iterator();

        String parent = iterator.next();
        String child1 = iterator.next();
        String child2 = iterator.next();
        String child3 = iterator.next();
        String child4 = iterator.next();


        // Switch between Windows

        driver.switchTo().window(child1);

        driver.switchTo().window(windows.get(1));
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(child2);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(child3);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(child4);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        // Switch to (Parent) Window.
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
