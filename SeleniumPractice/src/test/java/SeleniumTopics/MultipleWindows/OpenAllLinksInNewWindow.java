package SeleniumTopics.MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenAllLinksInNewWindow {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.apple.com/");


        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("number of links:" + links.size());

//         To open all links (in given page) in a new tab / window
        for (int i = 0; i < links.size(); i++) {
            if (!(links.get(i).getText().isEmpty())) {
                System.out.println(links.get(i).getAttribute("href"));
                links.get(i).sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));
                Thread.sleep(1000);

            }
        }

    }
}

////
//        for(int i=0;i<links.size();i++)
//        {
//            if(!(links.get(i).getText().isEmpty()))
//            {
//                System.out.println(links.get(i).getAttribute("href"));
//                links.get(i).click();
//                driver.navigate().back();
//                Thread.sleep(3000);
//                links=driver.findElements(By.tagName("a"));
//            }
//        }




