package SeleniumTopics.MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenALinkInANewWindow {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/");

        // Mac Users

        String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND,Keys.RETURN);
        driver.findElement(By.linkText("A/B Testing")).sendKeys(selectLinkOpeninNewTab);

        // Windows Users
     //   String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); // ENTER
     //  driver.findElement(By.linkText("A/B Testing")).sendKeys(selectLinkOpeninNewTab);



        // Short way
       driver.findElement(By.linkText("A/B Testing")).sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN));





        driver.findElement(By.linkText("Add/Remove Elements")).sendKeys(selectLinkOpeninNewTab);

        driver.findElement(By.linkText("A/B Testing")).sendKeys(Keys.chord(Keys.COMMAND,"2"));








    }
}
