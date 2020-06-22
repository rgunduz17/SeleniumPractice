package SeleniumTopics.WarmUps;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice1 {
    // All pages in same window
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int linksCount = allLinks.size();
        System.out.println("Total link numbers: "+ linksCount);

        String [] links = new String[linksCount];
        for (int i = 0; i<linksCount; i++){
            links[i]= allLinks.get(i).getAttribute("href");
            System.out.println("Number of links: #"+ (i+1) +" "+ allLinks.get(i).getAttribute("href"));

        }

        for(int i = 0; i<linksCount; i++){
          //  driver.navigate().to(links[i]);
            driver.get(links[i]);
            Thread.sleep(3000);
        }
        driver.quit();

    }
}
