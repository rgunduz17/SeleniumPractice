package SeleniumTopics.MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleWindows_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://accounts.google.com");

        // 1. Find the location of Help, Privacy, Terms and click on them


   //   driver.findElement(By.xpath("//a[contains(text(),'Help']"));

      driver.findElement(By.linkText("Help")).click();
      driver.findElement(By.linkText("Privacy")).click();
      driver.findElement(By.linkText("Terms")).click();


        // 2. Use collections to save windows (Set or ArrayList)
//
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
//
//
        // 3. Use iterator to switch windows
//
        Iterator<String> iterator = windows.iterator();
//
       // 4. Assign parent and child windows to String by using iterator.next();

        String parent = iterator.next();
        String child1 = iterator.next();
        String child2 = iterator.next();
        String child3 = iterator.next();
//
 // 5. Switch to Child1, getTitle and print it, close the child1 window
       Thread.sleep(3000);
     //  driver.switchTo().window(child1);
       driver.switchTo().window(windows.get(1));
        System.out.println("Child1: "+driver.getTitle());
        driver.close();
//
//
//
//        // 6. Switch to Child2, getTitle and print it, close the child2 window
        Thread.sleep(3000);
       // driver.switchTo().window(child2);
      driver.switchTo().window(windows.get(2));
        System.out.println("Child2: "+driver.getTitle());
        driver.close();
//
//
//
//
//
//        // 7. Switch to Child3, getTitle and print it, close the child3 window
//
        Thread.sleep(3000);
     //   driver.switchTo().window(child3);
      driver.switchTo().window(windows.get(3));
        System.out.println("Child3: "+driver.getTitle());
        driver.close();
//
//
//        // 8. Switch to parent, getTitle and print it, close the parent window
//
        Thread.sleep(3000);
    //    driver.switchTo().window(parent);
      driver.switchTo().window(windows.get(0));
        System.out.println("Parent: "+driver.getTitle());
        driver.close();
    }
}
