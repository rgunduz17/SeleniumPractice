package SeleniumTopics.WarmUps;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Practice3 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/");

      //  driver.findElement(By.xpath("//*[@id='navbar-collapse']/nav/ul/li[9]")).click();

      //  driver.findElement(By.xpath("//nav[@role='navigation']/ul/li[9]")).click();
      //  driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[1]/following-sibling::li[8]")).click();

        driver.findElement(By.partialLinkText("Guide")).click();

        //li[@class='classroomlink hidden-xs hide']/following-sibling::li[3]
         }
}
