package SeleniumTopics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com");



        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();

    }
}
