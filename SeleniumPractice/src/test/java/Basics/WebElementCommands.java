package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");

        // Click on the Search button
        driver.findElement(By.linkText("Core Java")).click();

        // getText() :    Returns String
        System.out.print("getText: ");
        System.out.println(driver.findElement(By.className("h2")).getText());

        // getTagName() :  Returns String
        System.out.print("getTagName: ");
        System.out.println(driver.findElement(By.id("myBtn")).getTagName());

        //  REGULAR EXPRESSION FOR XPATH
        //tagName[contains(@attribute  ,  'value')]

        System.out.println(driver.findElement(By.xpath("//h2[contains(@id,'wjiu')]")).getText());

        driver.close();

    }
}
